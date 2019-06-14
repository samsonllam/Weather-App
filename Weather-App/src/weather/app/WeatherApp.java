package weather.app;

import static weather.app.WeatherHolder.*;
import static weather.app.WeatherUI.dateLabel;
import static weather.app.WeatherUI.descriptionLabel;
import static weather.app.WeatherUI.temperatureLabel;
import static weather.app.WeatherUI.locationLabel;

/**
 *
 * @author Kamil
 */
public class WeatherApp{
     
    public static void main(String[] args) {
        new WeatherUI();
        new CurrentWeather();
        
        temperatureLabel.setText(temperature + "°");
        dateLabel.setText(dateNow);
        locationLabel.setText(location);
        System.out.println(clouds + " " + rain + "" + snow);
        descriptionLabel.setText(description);
    }
    
}
