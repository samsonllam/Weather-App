/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import com.github.prominence.openweathermap.api.HourlyForecastRequester;
import com.github.prominence.openweathermap.api.OpenWeatherMapManager;
import com.github.prominence.openweathermap.api.constants.Accuracy;
import com.github.prominence.openweathermap.api.constants.Language;
import com.github.prominence.openweathermap.api.constants.Unit;
import com.github.prominence.openweathermap.api.model.response.HourlyForecast;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static weather.app.WeatherHolder.*;
import java.util.List;
import static weather.app.WeatherApp.*;

/**
 *
 * @author Kamil
 */
public class NextDaysWeather {
    
    public NextDaysWeather() {
        
        /* Get next day */
        Calendar calendar = Calendar.getInstance();
        DateFormat nextDayFormat = new SimpleDateFormat("EEE", java.util.Locale.ENGLISH);
        
        String[] days = new String[] { "mon", "tue", "wed", "thu", "fri", "sat", "sun" };
        nextDay = days[calendar.get(Calendar.DAY_OF_WEEK)-1];
        calendar.add(Calendar.DATE, 1);
        dayAfterTomorrow = days[calendar.get(Calendar.DAY_OF_WEEK)-1];
        
        /* Next day weather */

        OpenWeatherMapManager openWeatherManager = new OpenWeatherMapManager(myApi);
        HourlyForecastRequester forecastRequester = openWeatherManager.getHourlyForecastRequester();

        HourlyForecast forecastResponse = forecastRequester
                .setLanguage(Language.ENGLISH)
                .setUnitSystem(Unit.METRIC_SYSTEM)
                .setAccuracy(Accuracy.ACCURATE)
                .getByCityName(myLocation);

        List<HourlyForecast.Forecast> s = forecastResponse.getForecasts();
        
        /* tomorrow */
        HourlyForecast.Forecast nextForecast = s.get(8);
        String nextDayForecast = String.valueOf(nextForecast);
        String str = nextDayForecast.toString();
        String[] arrOfStr = str.split(";");
        NextDayWeatherCond = arrOfStr[1];
        NextDayWeatherCond = NextDayWeatherCond.substring(10);
        
        /* dayAfterTomorrow */
        HourlyForecast.Forecast tomorrow = s.get(16);
        String tomorrowForecast = String.valueOf(tomorrow);
        String stri = tomorrowForecast.toString();
        String[] arrOfStr2 = stri.split(";");
        dayAfterTomorrowCond = arrOfStr2[1];
        dayAfterTomorrowCond = dayAfterTomorrowCond.substring(10);
    }
}

