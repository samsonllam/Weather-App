package weather.app;

import static weather.app.WeatherHolder.*;
import static weather.app.WeatherUI.*;

/**
 *
 * @author Kamil
 */
public class WeatherApp{
    
    public static String myLocation = "Sierpc";
    public static String myApi = "3c3f9bbe0fc53397db130c66d0e813ea";
    
    public static void main(String[] args) {
        
        WeatherUI wUI = new WeatherUI();
        CurrentWeather cW = new CurrentWeather();
        NextDaysWeather ndw = new NextDaysWeather();
        WeatherImage wI = new WeatherImage();
        wUI.setVisible(true);
        
        /* Display weather conditions */
        temperatureLabel.setText(temperature + "°");
        dateLabel.setText(dateNow);
        locationLabel.setText(location);
        descriptionLabel.setText(description);
        nextDayCondLabel.setText(NextDayWeatherCond);
        nextDayLabel.setText(nextDay);
        
        nextDayCondLabel1.setText(dayAfterTomorrowCond);
        nextDayLabel1.setText(dayAfterTomorrow);
    }
    
}
