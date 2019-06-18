package weather.app;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import static oracle.jrockit.jfr.events.Bits.intValue;
import static weather.app.WeatherHolder.*;
import static weather.app.WeatherUI.*;

/**
 *
 * @author Kamil
 */
public class WeatherApp {

    public static String myLocation = "Plock, pl";
    public static String myApi = "3c3f9bbe0fc53397db130c66d0e813ea";
    public static int screenHeight;
    public static int screenWidth;

    public static void main(String[] args) throws InterruptedException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenHeight = intValue(screenSize.getHeight());
        screenWidth = intValue(screenSize.getWidth());

        
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

        nextDayTempLabel.setText(nextDayTemp + "°");
        dayAfterTomorrowTempLabel.setText(dayAfterTomorrowTemp + "°");
    }

    public static void playMusic(String weather) {
        switch(weather){
            case "rain": { new MP3Player(new File("rain.mp3")).play(); break; }
            case "thunder": { new MP3Player(new File("thunder.mp3")).play(); break; }
            case "jingle": { new MP3Player(new File("jingle.mp3")).play(); break; }
        }
    }
}
