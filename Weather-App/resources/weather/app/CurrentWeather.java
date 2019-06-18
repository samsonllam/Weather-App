/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import com.github.prominence.openweathermap.api.OpenWeatherMapManager;
import com.github.prominence.openweathermap.api.WeatherRequester;
import com.github.prominence.openweathermap.api.constants.Accuracy;
import com.github.prominence.openweathermap.api.constants.Language;
import com.github.prominence.openweathermap.api.constants.Unit;
import com.github.prominence.openweathermap.api.model.response.Weather;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static weather.app.WeatherApp.*;
import static weather.app.WeatherHolder.*;
/**
 *
 * @author Kamil
 */
public class CurrentWeather {
    
    public CurrentWeather(){
        OpenWeatherMapManager openWeatherManager = new OpenWeatherMapManager(myApi);
        WeatherRequester weatherRequester = openWeatherManager.getWeatherRequester();
        
        Weather weatherResponse = weatherRequester
        .setLanguage(Language.ENGLISH)
        .setUnitSystem(Unit.METRIC_SYSTEM)
        .setAccuracy(Accuracy.ACCURATE)
        .getByCityName(myLocation);
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        
        float temperatureFloat = weatherResponse.getTemperature();
        temperature = df.format(temperatureFloat);
        
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("EEEEEEEE, MMM, dd", java.util.Locale.ENGLISH);
        dateNow = dateFormat.format(date).toString();
        location = weatherResponse.getCityName().toString();
        
        description = weatherResponse.getWeatherDescription().toString();
    }
}
