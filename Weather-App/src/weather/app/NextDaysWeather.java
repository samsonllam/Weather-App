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
import java.text.DecimalFormat;
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
    
    int getTom, getTom2;
    
    public NextDaysWeather() {
        
        /* Get next day */
        Calendar calendar = Calendar.getInstance();
        DateFormat nextDayFormat = new SimpleDateFormat("EEE", java.util.Locale.ENGLISH);
        
        String[] days = new String[] { "mon", "tue", "wed", "thu", "fri", "sat", "sun" };
        nextDay = days[calendar.get(Calendar.DAY_OF_WEEK)-1];
        calendar.add(Calendar.DATE, 1);
        dayAfterTomorrow = days[calendar.get(Calendar.DAY_OF_WEEK)-1];
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String currentHourString = sdf.format(calendar.getTime());
        int currentHour = Integer.parseInt(currentHourString);
        
        switch(currentHour){
            case 0: getTom = 12; getTom2 = 20; dayOrNight = "night"; break;
            case 1: getTom = 12; getTom2 = 20; dayOrNight = "night"; break;
            case 2: getTom = 11; getTom2 = 19; dayOrNight = "night"; break;
            case 3: getTom = 11; getTom2 = 19; dayOrNight = "night"; break;
            case 4: getTom = 11; getTom2 = 19; dayOrNight = "night"; break;
            case 5: getTom = 10; getTom2 = 18; dayOrNight = "night"; break;
            case 6: getTom = 10; getTom2 = 18; dayOrNight = "night"; break;
            case 7: getTom = 10; getTom2 = 18; dayOrNight = "day"; break;
            case 8: getTom = 9; getTom2 = 17; dayOrNight = "day"; break;
            case 9: getTom = 9; getTom2 = 17; dayOrNight = "day"; break;
            case 10: getTom = 9; getTom2 = 17; dayOrNight = "day"; break;
            case 11: getTom = 8; getTom2 = 16; dayOrNight = "day"; break;
            case 12: getTom = 8; getTom2 = 16; dayOrNight = "day"; break;
            case 13: getTom = 8; getTom2 = 16; dayOrNight = "day"; break;
            case 14: getTom = 7; getTom2 = 15; dayOrNight = "day"; break;
            case 15: getTom = 7; getTom2 = 15; dayOrNight = "day"; break;
            case 16: getTom = 7; getTom2 = 15; dayOrNight = "day"; break;
            case 17: getTom = 6; getTom2 = 14; dayOrNight = "day"; break;
            case 18: getTom = 6; getTom2 = 14; dayOrNight = "day"; break;
            case 19: getTom = 6; getTom2 = 14; dayOrNight = "day"; break;
            case 20: getTom = 5; getTom2 = 13; dayOrNight = "day"; break;
            case 21: getTom = 5; getTom2 = 13; dayOrNight = "night"; break;
            case 22: getTom = 5; getTom2 = 13; dayOrNight = "night";break;
            case 23: getTom = 4; getTom2 = 12; dayOrNight = "night";break;
        }
        
        System.out.println("hour: " + currentHour);
        System.out.println("day or night: " + dayOrNight);
        
        /* Next day weather */
        OpenWeatherMapManager openWeatherManager = new OpenWeatherMapManager(myApi);
        HourlyForecastRequester forecastRequester = openWeatherManager.getHourlyForecastRequester();

        HourlyForecast forecastResponse = forecastRequester
                .setLanguage(Language.ENGLISH)
                .setUnitSystem(Unit.METRIC_SYSTEM)
                .setAccuracy(Accuracy.ACCURATE)
                .getByCityName(myLocation);

        List<HourlyForecast.Forecast> s = forecastResponse.getForecasts();
        String al = String.valueOf(s);
        
        /* tomorrow weather description */
        HourlyForecast.Forecast nextForecast = s.get(getTom);
        String nextDayForecast = String.valueOf(nextForecast);
        System.out.println(nextDayForecast);
        String[] condFromString = nextDayForecast.toString().split(";");
        NextDayWeatherCond = condFromString[1];
        NextDayWeatherCond = NextDayWeatherCond.substring(10);
        
        /* dayAfterTomorrow weather description */
        HourlyForecast.Forecast tomorrow = s.get(getTom2);
        String tomorrowForecast = String.valueOf(tomorrow);
        System.out.println(tomorrow);
        String[] condFromString2 = tomorrowForecast.toString().split(";");
        dayAfterTomorrowCond = condFromString2[1];
        dayAfterTomorrowCond = dayAfterTomorrowCond.substring(10);
        
        /* tomorrow weather temp */
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        String nextDayTemperature1 = String.valueOf(nextForecast);
        String[] nextDayTemperature = nextDayForecast.toString().split(";");
        nextDayTemp = nextDayTemperature[2].substring(14);
        nextDayTemp = nextDayTemp.replace(" ℃","");
        float tempe = Float.valueOf(nextDayTemp);
        nextDayTemp = df.format(tempe);
        
        /* day after tomorrow weather temp */ 
        String dayAfterTomorrow1 = String.valueOf(tomorrow);
        String[] dayAfterTomorrowTempe = tomorrowForecast.toString().split(";");
        dayAfterTomorrowTemp = dayAfterTomorrowTempe[2].substring(14);
        dayAfterTomorrowTemp = dayAfterTomorrowTemp.replace(" ℃","");
        float tempee = Float.valueOf(dayAfterTomorrowTemp);
        dayAfterTomorrowTemp = df.format(tempee);
    }
}

