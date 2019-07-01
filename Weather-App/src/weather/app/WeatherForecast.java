/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import com.github.prominence.openweathermap.api.HourlyForecastRequester;
import com.github.prominence.openweathermap.api.OpenWeatherMapManager;
import com.github.prominence.openweathermap.api.WeatherRequester;
import com.github.prominence.openweathermap.api.constants.Accuracy;
import com.github.prominence.openweathermap.api.constants.Language;
import com.github.prominence.openweathermap.api.constants.Unit;
import com.github.prominence.openweathermap.api.model.Clouds;
import com.github.prominence.openweathermap.api.model.Rain;
import com.github.prominence.openweathermap.api.model.Snow;
import com.github.prominence.openweathermap.api.model.Wind;
import com.github.prominence.openweathermap.api.model.response.HourlyForecast;
import com.github.prominence.openweathermap.api.model.response.Weather;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static weather.app.WeatherApp.*;

/**
 *
 * @author Kamil
 */
public class WeatherForecast {

    static int tomorrowForecastNumber, dayAfterTomorrowForecastNumber;

    public static void getCurrentWeather() {
        System.out.print("--> Importing weather forecast. ");
        OpenWeatherMapManager openWeatherManager = new OpenWeatherMapManager(api);
        WeatherRequester weatherRequester = openWeatherManager.getWeatherRequester();

        Weather weatherResponse = weatherRequester
                .setLanguage(Language.ENGLISH)
                .setUnitSystem(Unit.METRIC_SYSTEM)
                .setAccuracy(Accuracy.ACCURATE)
                .getByCityName(location);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(0);

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("EEEEEEEE, MMM, dd", java.util.Locale.ENGLISH);
        currentDate = dateFormat.format(date);
        
        location = weatherResponse.getCityName();
        
        float temporaryTemperature = weatherResponse.getTemperature();
        currentTemperature = df.format(temporaryTemperature);

        //location = weatherResponse.getCityName().toString();
        currentDescription = weatherResponse.getWeatherDescription();
        System.out.println("--> IMPORTED CURRENT");        
    }

    public static void getTomorrowWeather() {
        System.out.print("--> Importing weather forecast. ");
        Calendar calendar = Calendar.getInstance();
        DateFormat nextDayFormat = new SimpleDateFormat("EEE", java.util.Locale.ENGLISH);

        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        nextDay = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];

        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String currentHourString = sdf.format(calendar.getTime());
        int currentHour = Integer.parseInt(currentHourString);

        // <editor-fold defaultstate="collapsed" desc=" Selecting the right weather from the whole forecast ">
        switch (currentHour) {
            case 0:
                tomorrowForecastNumber = 12;
                dayOrNight = "night";
                break;
            case 1:
                tomorrowForecastNumber = 12;
                dayOrNight = "night";
                break;
            case 2:
                tomorrowForecastNumber = 11;
                dayOrNight = "night";
                break;
            case 3:
                tomorrowForecastNumber = 11;
                dayOrNight = "night";
                break;
            case 4:
                tomorrowForecastNumber = 11;
                dayOrNight = "night";
                break;
            case 5:
                tomorrowForecastNumber = 10;
                dayOrNight = "night";
                break;
            case 6:
                tomorrowForecastNumber = 10;
                dayOrNight = "night";
                break;
            case 7:
                tomorrowForecastNumber = 10;
                dayOrNight = "day";
                break;
            case 8:
                tomorrowForecastNumber = 9;
                dayOrNight = "day";
                break;
            case 9:
                tomorrowForecastNumber = 9;
                dayOrNight = "day";
                break;
            case 10:
                tomorrowForecastNumber = 9;
                dayOrNight = "day";
                break;
            case 11:
                tomorrowForecastNumber = 8;
                dayOrNight = "day";
                break;
            case 12:
                tomorrowForecastNumber = 8;
                dayOrNight = "day";
                break;
            case 13:
                tomorrowForecastNumber = 8;
                dayOrNight = "day";
                break;
            case 14:
                tomorrowForecastNumber = 7;
                dayOrNight = "day";
                break;
            case 15:
                tomorrowForecastNumber = 7;
                dayOrNight = "day";
                break;
            case 16:
                tomorrowForecastNumber = 7;
                dayOrNight = "day";
                break;
            case 17:
                tomorrowForecastNumber = 6;
                dayOrNight = "day";
                break;
            case 18:
                tomorrowForecastNumber = 6;
                dayOrNight = "day";
                break;
            case 19:
                tomorrowForecastNumber = 6;
                dayOrNight = "day";
                break;
            case 20:
                tomorrowForecastNumber = 5;
                dayOrNight = "day";
                break;
            case 21:
                tomorrowForecastNumber = 5;
                dayOrNight = "night";
                break;
            case 22:
                tomorrowForecastNumber = 5;
                dayOrNight = "night";
                break;
            case 23:
                tomorrowForecastNumber = 4;
                dayOrNight = "night";
                break;
        }
        // </editor-fold>

        OpenWeatherMapManager openWeatherManager = new OpenWeatherMapManager(api);
        HourlyForecastRequester forecastRequester = openWeatherManager.getHourlyForecastRequester();

        HourlyForecast forecastResponse = forecastRequester
                .setLanguage(Language.ENGLISH)
                .setUnitSystem(Unit.METRIC_SYSTEM)
                .setAccuracy(Accuracy.ACCURATE)
                .getByCityName(location);

        List<HourlyForecast.Forecast> s = forecastResponse.getForecasts();
        String al = String.valueOf(s);

        /* tomorrow weather description */
        HourlyForecast.Forecast nextForecast = s.get(tomorrowForecastNumber);
        String nextDayForecast = String.valueOf(nextForecast);
        String[] condFromString = nextDayForecast.split(";");
        nextDayDescription = condFromString[1];
        nextDayDescription = nextDayDescription.substring(10);

        /* tomorrow weather temperature */
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(0);
        String nextDayTemperature1 = String.valueOf(nextForecast);
        String[] temporaryNextDayTemperature = nextDayTemperature1.split(";");
        nextDayTemperature = temporaryNextDayTemperature[2].substring(14);
        nextDayTemperature = nextDayTemperature.replace(" ℃", "");
        float tempe = Float.valueOf(nextDayTemperature);
        nextDayTemperature = df.format(tempe);
        System.out.println("--> IMPORTED TOMORROW");
    }

    public static void getDayAfterTomorrowWeather() {
        System.out.print("--> Importing weather forecast. ");
        Calendar calendar = Calendar.getInstance();
        DateFormat nextDayFormat = new SimpleDateFormat("EEE", java.util.Locale.ENGLISH);

        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        calendar.add(Calendar.DATE, 1);
        dayAfterTomorrow = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];

        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String currentHourString = sdf.format(calendar.getTime());
        int currentHour = Integer.parseInt(currentHourString);

        // <editor-fold defaultstate="collapsed" desc=" Selecting the right weather from the whole forecast ">

        switch (currentHour) {
            case 0:
                dayAfterTomorrowForecastNumber = 20;
                dayOrNight = "night";
                break;
            case 1:
                dayAfterTomorrowForecastNumber = 20;
                dayOrNight = "night";
                break;
            case 2:
                dayAfterTomorrowForecastNumber = 19;
                dayOrNight = "night";
                break;
            case 3:
                dayAfterTomorrowForecastNumber = 19;
                dayOrNight = "night";
                break;
            case 4:
                dayAfterTomorrowForecastNumber = 19;
                dayOrNight = "night";
                break;
            case 5:
                dayAfterTomorrowForecastNumber = 18;
                dayOrNight = "night";
                break;
            case 6:
                dayAfterTomorrowForecastNumber = 18;
                dayOrNight = "night";
                break;
            case 7:
                dayAfterTomorrowForecastNumber = 18;
                dayOrNight = "day";
                break;
            case 8:
                dayAfterTomorrowForecastNumber = 17;
                dayOrNight = "day";
                break;
            case 9:
                dayAfterTomorrowForecastNumber = 17;
                dayOrNight = "day";
                break;
            case 10:
                dayAfterTomorrowForecastNumber = 17;
                dayOrNight = "day";
                break;
            case 11:
                dayAfterTomorrowForecastNumber = 16;
                dayOrNight = "day";
                break;
            case 12:
                dayAfterTomorrowForecastNumber = 16;
                dayOrNight = "day";
                break;
            case 13:
                dayAfterTomorrowForecastNumber = 16;
                dayOrNight = "day";
                break;
            case 14:
                dayAfterTomorrowForecastNumber = 15;
                dayOrNight = "day";
                break;
            case 15:
                dayAfterTomorrowForecastNumber = 15;
                dayOrNight = "day";
                break;
            case 16:
                dayAfterTomorrowForecastNumber = 15;
                dayOrNight = "day";
                break;
            case 17:
                dayAfterTomorrowForecastNumber = 14;
                dayOrNight = "day";
                break;
            case 18:
                dayAfterTomorrowForecastNumber = 14;
                dayOrNight = "day";
                break;
            case 19:
                dayAfterTomorrowForecastNumber = 14;
                dayOrNight = "day";
                break;
            case 20:
                dayAfterTomorrowForecastNumber = 13;
                dayOrNight = "day";
                break;
            case 21:
                dayAfterTomorrowForecastNumber = 13;
                dayOrNight = "night";
                break;
            case 22:
                dayAfterTomorrowForecastNumber = 13;
                dayOrNight = "night";
                break;
            case 23:
                dayAfterTomorrowForecastNumber = 12;
                dayOrNight = "night";
                break;
        }
        // </editor-fold>

        OpenWeatherMapManager openWeatherManager = new OpenWeatherMapManager(api);
        HourlyForecastRequester forecastRequester = openWeatherManager.getHourlyForecastRequester();

        HourlyForecast forecastResponse = forecastRequester
                .setLanguage(Language.ENGLISH)
                .setUnitSystem(Unit.METRIC_SYSTEM)
                .setAccuracy(Accuracy.ACCURATE)
                .getByCityName(location);

        List<HourlyForecast.Forecast> s = forecastResponse.getForecasts();
        String al = String.valueOf(s);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(0);

        /* dayAfterTomorrow weather description */
        HourlyForecast.Forecast tomorrow = s.get(dayAfterTomorrowForecastNumber);
        String tomorrowForecast = String.valueOf(tomorrow);
        String[] condFromString2 = tomorrowForecast.split(";");
        dayAfterTomorrowDescription = condFromString2[1];
        dayAfterTomorrowDescription = dayAfterTomorrowDescription.substring(10);

        /* day after tomorrow weather temp */
        String dayAfterTomorrow1 = String.valueOf(tomorrow);
        String[] temporaryDayAfterTomorrowTempe = tomorrowForecast.split(";");
        dayAfterTomorrowTemperature = temporaryDayAfterTomorrowTempe[2].substring(14);
        dayAfterTomorrowTemperature = dayAfterTomorrowTemperature.replace(" ℃", "");
        float tempee = Float.valueOf(dayAfterTomorrowTemperature);
        dayAfterTomorrowTemperature = df.format(tempee);
        System.out.println("--> IMPORTED DAYAFTERTOMORROW");
    }

    public static void getCurrentWeatherDetails() {
        OpenWeatherMapManager openWeatherManager = new OpenWeatherMapManager(api);
        WeatherRequester weatherRequester = openWeatherManager.getWeatherRequester();

        Weather weatherResponse = weatherRequester
                .setLanguage(Language.ENGLISH)
                .setUnitSystem(Unit.METRIC_SYSTEM)
                .setAccuracy(Accuracy.ACCURATE)
                .getByCityName(location);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(0);

        String clouds = weatherResponse.getClouds().toString().substring(12);
        byte humidity = weatherResponse.getHumidityPercentage();
        short pressure = weatherResponse.getPressure();
        Rain rain = weatherResponse.getRain();
        Snow snow = weatherResponse.getSnow();
        Wind wind = weatherResponse.getWind();
        
        WeatherDetailsUI wdUI = new WeatherDetailsUI(clouds, humidity, pressure, rain, snow, wind);
        wdUI.setVisible(true);
    }
    
    public WeatherForecast() {

    }
}
