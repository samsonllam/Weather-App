package weather.app;

import com.github.prominence.openweathermap.api.exception.DataNotFoundException;
import com.github.prominence.openweathermap.api.exception.InvalidAuthTokenException;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import static oracle.jrockit.jfr.events.Bits.intValue;
import static sun.audio.AudioPlayer.player;
import static weather.app.Data.*;
import static weather.app.ThemeColor.placeholder;
import static weather.app.ThemeColor.textColor;
import static weather.app.WeatherForecast.*;
import static weather.app.WeatherUI.*;
import static weather.app.SettingsUI.jTextField1;
import static weather.app.SettingsUI.jTextField3;

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
    
    public static void main(String[] args) throws InterruptedException, ParserConfigurationException, TransformerException, IOException {
        try {
            /* Screen size which is used to center apps frame */
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            screenHeight = intValue(screenSize.getHeight());
            screenWidth = intValue(screenSize.getWidth());
            
            checkForXMLFile();
            getData();
            ThemeColor tc = new ThemeColor(theme);
            getCurrentWeather();
            getTomorrowWeather();
            getDayAfterTomorrowWeather();
            
            WeatherUI wUI = new WeatherUI();
            WeatherImage wI = new WeatherImage();
            displayWeather();
            wUI.setVisible(true);
        
        }catch(DataNotFoundException ex){
            System.out.print("--> ERROR");
            System.out.println("\n" + "\u001B[31m" + "[ERROR]: Data for provided parameters wasn't found. Please, check your location.");
            SettingsUI sp = new SettingsUI();
            jTextField1.setForeground(Color.red);
            sp.setVisible(true);
        } catch (InvalidAuthTokenException ex) {
            System.out.print("--> ERROR");
            System.out.println("\n" + "\u001B[31m" + "[ERROR]: Api key is incorrect. Please, check your api.");
            SettingsUI sp = new SettingsUI();
            jTextField3.setForeground(Color.red);
            sp.setVisible(true);
        }
    }

    public static void displayWeather(){
        temperatureLabel.setText(currentTemperature + "°");
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
            case "rain": { new MP3Player(new File("resources/weather_sounds/rain.mp3")).play(); break; }
            case "thunder": { new MP3Player(new File("resources/weather_sounds/thunder.mp3")).play(); break; }
            case "jingle": { new MP3Player(new File("resources/weather_sounds/jingle.mp3")).play(); break; }
        }
    }

    public WeatherApp() {

    }
}
