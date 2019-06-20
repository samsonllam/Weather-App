package weather.app;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import static oracle.jrockit.jfr.events.Bits.intValue;
import static weather.app.Data.*;
import static weather.app.ThemeColor.placeholder;
import static weather.app.ThemeColor.textColor;
import static weather.app.WeatherForecast.*;
import static weather.app.WeatherUI.*;

/**
 *
 * @author Kamil
 */
public class WeatherApp {

    public static String location;
    public static String api;
    public static String theme;
    
    public static String currentTemperature;
    public static String currentDate;
    public static String currentDescription;
    public static String dayOrNight;
    
    public static String nextDay;
    public static String nextDayTemperature;
    public static String nextDayDescription;
    
    public static String dayAfterTomorrow;
    public static String dayAfterTomorrowTemperature;
    public static String dayAfterTomorrowDescription;
    
    public static int screenHeight;
    public static int screenWidth;

    public static void main(String[] args) throws InterruptedException {
        try {
            /* Screen size which is used to center apps frame */
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            screenHeight = intValue(screenSize.getHeight());
            screenWidth = intValue(screenSize.getWidth());
            
            getData();
            ThemeColor tc = new ThemeColor(theme);
            getCurrentWeather();
            getTomorrowWeather();
            getDayAfterTomorrowWeather();
            
            WeatherUI wUI = new WeatherUI();
            WeatherImage wI = new WeatherImage();
            displayWeather();
            wUI.setVisible(true);
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(WeatherApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(WeatherApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void displayWeather(){
        temperatureLabel.setText(currentTemperature + "°");
        dateLabel.setText(currentDate);
        dateLabel.setForeground(textColor);
        locationLabel.setText(location);
        locationLabel.setForeground(textColor);
        descriptionLabel.setText(currentDescription);
        nextDayCondLabel.setText(nextDayDescription);
        nextDayLabel.setText(nextDay);
        nextDayTempLabel.setText(nextDayTemperature + "°");
        dayAfterTomorrowTempLabel.setText(dayAfterTomorrowTemperature + "°");
        nextDayCondLabel1.setText(dayAfterTomorrowDescription);
        nextDayLabel1.setText(dayAfterTomorrow);
        placeholderLabel.setIcon(placeholder);
        //settingsLabel.setForeground(textColor);
    }
    
    public static void playMusic(String weather) {
        
        switch(weather){
            case "rain": { new MP3Player(new File("rain.mp3")).play(); break; }
            case "thunder": { new MP3Player(new File("thunder.mp3")).play(); break; }
            case "jingle": { new MP3Player(new File("jingle.mp3")).play(); break; }
        }
    }
}
