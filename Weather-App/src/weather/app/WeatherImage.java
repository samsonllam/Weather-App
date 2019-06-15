/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import static weather.app.WeatherHolder.*;
import static weather.app.WeatherUI.gifLabel;
import static weather.app.WeatherUI.imageLabel;
import static weather.app.WeatherUI.nextDayImage;
import static weather.app.WeatherUI.nextDayImage1;

/**
 *
 * @author Kamil
 */
public class WeatherImage {
    
    public WeatherImage(){        
        Icon sunIcon = new ImageIcon("src/images/sun.png");
        Icon thunderIcon = new ImageIcon("src/images/thunderstorm.png");
        Icon rainIcon = new ImageIcon("src/images/rain.png");
        Icon drizzleIcon = new ImageIcon("src/images/drizzle.png");
        Icon snowIcon = new ImageIcon("src/images/snow.png");
        Icon fewCloudsIcon = new ImageIcon("src/images/few_clouds.png");
        Icon scatteredCloudsIcon = new ImageIcon("src/images/scattered_clouds.png");
        Icon brokenCloudsImage = new ImageIcon("src/images/broken_clouds.png");
        Icon mistIcon = new ImageIcon("src/images/mist.png");
        ImageIcon raindropGif = new ImageIcon("src/images/raindrop.gif");
        
        /* Current day weather image */
        switch(description){
            /* Thunderstorm */
            case "thunderstorm with light rain": imageLabel.setIcon(thunderIcon); break;
            case "thunderstorm with rain": imageLabel.setIcon(thunderIcon); break;
            case "thunderstorm with heavy rain": imageLabel.setIcon(thunderIcon); break;
            case "light thunderstorm": imageLabel.setIcon(thunderIcon); break;
            case "thunderstorm": imageLabel.setIcon(thunderIcon); break;
            case "heavy thunderstorm": imageLabel.setIcon(thunderIcon); break;
            case "ragged thunderstorm": imageLabel.setIcon(thunderIcon); break;
            case "thunderstorm with light drizzle": imageLabel.setIcon(thunderIcon); break;
            case "thunderstorm with drizzle": imageLabel.setIcon(thunderIcon); break;
            case "thunderstorm with heavy drizzle": imageLabel.setIcon(thunderIcon); break;
            
            /* Drizzle */
            case "light intensity drizzle": imageLabel.setIcon(drizzleIcon); break;
            case "drizzle": imageLabel.setIcon(drizzleIcon); break;
            case "heavy intensity drizzle": imageLabel.setIcon(drizzleIcon); break;
            case "light intensity drizzle rain": imageLabel.setIcon(drizzleIcon); break;
            case "drizzle rain": imageLabel.setIcon(drizzleIcon); break;
            case "heavy intensity drizzle rain": imageLabel.setIcon(drizzleIcon); break;
            case "shower rain and drizzle": imageLabel.setIcon(drizzleIcon); break;
            case "heavy shower rain and drizzle": imageLabel.setIcon(drizzleIcon); break;
            case "shower drizzle": imageLabel.setIcon(drizzleIcon); break;
            
            /* Snow */
            case "light snow": imageLabel.setIcon(snowIcon); break;
            case "Snow": imageLabel.setIcon(snowIcon); break;
            case "Heavy snow": imageLabel.setIcon(snowIcon); break;
            case "Sleet": imageLabel.setIcon(snowIcon); break;
            case "Light shower sleet": imageLabel.setIcon(snowIcon); break;
            case "Shower sleet": imageLabel.setIcon(snowIcon); break;
            case "Light rain and snow": imageLabel.setIcon(snowIcon); break;
            case "Rain and snow": imageLabel.setIcon(snowIcon); break;
            case "Light shower snow": imageLabel.setIcon(snowIcon); break;
            case "Shower snow": imageLabel.setIcon(snowIcon); break;
            case "Heavy shower snow": imageLabel.setIcon(snowIcon); break;
            
            /* Rain */
            case "light rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "moderate rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "heavy intensity rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "very heavy rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "extreme rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "freezing rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "light intensity shower rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "shower rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "heavy intensity shower rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            case "ragged shower rain": imageLabel.setIcon(rainIcon); gifLabel.setIcon(raindropGif); break;
            
            /* Clear */ 
            case "clear sky": imageLabel.setIcon(sunIcon); break;
            
            /* Clouds */
            case "few clouds": imageLabel.setIcon(fewCloudsIcon); break;
            case "scattered clouds": imageLabel.setIcon(scatteredCloudsIcon); break;
            case "broken clouds": imageLabel.setIcon(brokenCloudsImage); break;
            case "overcast clouds": imageLabel.setIcon(brokenCloudsImage); break;
            
            /* Atmosphere */
            case "mist": imageLabel.setIcon(mistIcon); break;
            case "Smoke": imageLabel.setIcon(mistIcon); break;
            case "Haze": imageLabel.setIcon(mistIcon); break;
            case "sand/ dust whirls": imageLabel.setIcon(mistIcon); break;
            case "fog": imageLabel.setIcon(mistIcon); break;
            case "sand": imageLabel.setIcon(mistIcon); break;
            case "dust": imageLabel.setIcon(mistIcon); break;
            case "volcanic ash": imageLabel.setIcon(mistIcon); break;
            case "squalls": imageLabel.setIcon(mistIcon); break;
            case "tornado": imageLabel.setIcon(mistIcon); break;
        }
        
        Icon sunIconBlack = new ImageIcon("src/images/sun_black.png");
        Icon thunderIconBlack = new ImageIcon("src/images/thunderstorm_black.png");
        Icon rainIconBlack = new ImageIcon("src/images/rain_black.png");
        Icon drizzleIconBlack = new ImageIcon("src/images/drizzle_black.png");
        Icon snowIconBlack = new ImageIcon("src/images/snow_black.png");
        Icon fewCloudsIconBlack = new ImageIcon("src/images/few_clouds_black.png");
        Icon scatteredCloudsIconBlack = new ImageIcon("src/images/scattered_clouds_black.png");
        Icon brokenCloudsImageBlack = new ImageIcon("src/images/broken_clouds_black.png");
        Icon mistIconBlack = new ImageIcon("src/images/mist_black.png");
        
        /* Tomorrow weather image */
        switch(NextDayWeatherCond){
            /* Thunderstorm */
            case "thunderstorm with light rain": nextDayImage.setIcon(thunderIconBlack); break;
            case "thunderstorm with rain": nextDayImage.setIcon(thunderIconBlack); break;
            case "thunderstorm with heavy rain": nextDayImage.setIcon(thunderIconBlack); break;
            case "light thunderstorm": nextDayImage.setIcon(thunderIconBlack); break;
            case "thunderstorm": nextDayImage.setIcon(thunderIconBlack); break;
            case "heavy thunderstorm": nextDayImage.setIcon(thunderIconBlack); break;
            case "ragged thunderstorm": nextDayImage.setIcon(thunderIconBlack); break;
            case "thunderstorm with light drizzle": nextDayImage.setIcon(thunderIconBlack); break;
            case "thunderstorm with drizzle": nextDayImage.setIcon(thunderIconBlack); break;
            case "thunderstorm with heavy drizzle": nextDayImage.setIcon(thunderIconBlack); break;
            
            /* Drizzle */
            case "light intensity drizzle": nextDayImage.setIcon(drizzleIconBlack); break;
            case "drizzle": nextDayImage.setIcon(drizzleIconBlack); break;
            case "heavy intensity drizzle": nextDayImage.setIcon(drizzleIconBlack); break;
            case "light intensity drizzle rain": nextDayImage.setIcon(drizzleIconBlack); break;
            case "drizzle rain": nextDayImage.setIcon(drizzleIconBlack); break;
            case "heavy intensity drizzle rain": nextDayImage.setIcon(drizzleIconBlack); break;
            case "shower rain and drizzle": nextDayImage.setIcon(drizzleIconBlack); break;
            case "heavy shower rain and drizzle": nextDayImage.setIcon(drizzleIconBlack); break;
            case "shower drizzle": nextDayImage.setIcon(drizzleIconBlack); break;
            
            /* Snow */
            case "light snow": nextDayImage.setIcon(snowIconBlack); break;
            case "Snow": nextDayImage.setIcon(snowIconBlack); break;
            case "Heavy snow": nextDayImage.setIcon(snowIconBlack); break;
            case "Sleet": nextDayImage.setIcon(snowIconBlack); break;
            case "Light shower sleet": nextDayImage.setIcon(snowIconBlack); break;
            case "Shower sleet": nextDayImage.setIcon(snowIconBlack); break;
            case "Light rain and snow": nextDayImage.setIcon(snowIconBlack); break;
            case "Rain and snow": nextDayImage.setIcon(snowIconBlack); break;
            case "Light shower snow": nextDayImage.setIcon(snowIconBlack); break;
            case "Shower snow": nextDayImage.setIcon(snowIconBlack); break;
            case "Heavy shower snow": nextDayImage.setIcon(snowIconBlack); break;
            
            /* Rain */
            case "light rain": nextDayImage.setIcon(rainIconBlack); break;
            case "moderate rain": nextDayImage.setIcon(rainIconBlack); break;
            case "heavy intensity rain": nextDayImage.setIcon(rainIconBlack); break;
            case "very heavy rain": nextDayImage.setIcon(rainIconBlack); break;
            case "extreme rain": nextDayImage.setIcon(rainIconBlack); break;
            case "freezing rain": nextDayImage.setIcon(rainIconBlack); break;
            case "light intensity shower rain": nextDayImage.setIcon(rainIconBlack); break;
            case "shower rain": nextDayImage.setIcon(rainIconBlack); break;
            case "heavy intensity shower rain": nextDayImage.setIcon(rainIconBlack); break;
            case "ragged shower rain": nextDayImage.setIcon(rainIconBlack); break;
            
            /* Clear */ 
            case "clear sky": nextDayImage.setIcon(sunIconBlack); break;
            
            /* Clouds */
            case "few clouds": nextDayImage.setIcon(fewCloudsIconBlack); break;
            case "scattered clouds": nextDayImage.setIcon(scatteredCloudsIconBlack); break;
            case "broken clouds": nextDayImage.setIcon(brokenCloudsImageBlack); break;
            case "overcast clouds": nextDayImage.setIcon(brokenCloudsImageBlack); break;
            
            /* Atmosphere */
            case "mist": nextDayImage.setIcon(mistIconBlack); break;
            case "Smoke": nextDayImage.setIcon(mistIconBlack); break;
            case "Haze": nextDayImage.setIcon(mistIconBlack); break;
            case "sand/ dust whirls": nextDayImage.setIcon(mistIconBlack); break;
            case "fog": nextDayImage.setIcon(mistIconBlack); break;
            case "sand": nextDayImage.setIcon(mistIconBlack); break;
            case "dust": nextDayImage.setIcon(mistIconBlack); break;
            case "volcanic ash": nextDayImage.setIcon(mistIconBlack); break;
            case "squalls": nextDayImage.setIcon(mistIconBlack); break;
            case "tornado": nextDayImage.setIcon(mistIconBlack); break;
        }
        
        /* Day after tomorrow weather image */
        switch(dayAfterTomorrowCond){
            /* Thunderstorm */
            case "thunderstorm with light rain": nextDayImage1.setIcon(thunderIconBlack); break;
            case "thunderstorm with rain": nextDayImage1.setIcon(thunderIconBlack); break;
            case "thunderstorm with heavy rain": nextDayImage1.setIcon(thunderIconBlack); break;
            case "light thunderstorm": nextDayImage1.setIcon(thunderIconBlack); break;
            case "thunderstorm": nextDayImage1.setIcon(thunderIconBlack); break;
            case "heavy thunderstorm": nextDayImage1.setIcon(thunderIconBlack); break;
            case "ragged thunderstorm": nextDayImage1.setIcon(thunderIconBlack); break;
            case "thunderstorm with light drizzle": nextDayImage1.setIcon(thunderIconBlack); break;
            case "thunderstorm with drizzle": nextDayImage1.setIcon(thunderIconBlack); break;
            case "thunderstorm with heavy drizzle": nextDayImage1.setIcon(thunderIconBlack); break;
            
            /* Drizzle */
            case "light intensity drizzle": nextDayImage1.setIcon(drizzleIconBlack); break;
            case "drizzle": nextDayImage1.setIcon(drizzleIconBlack); break;
            case "heavy intensity drizzle": nextDayImage1.setIcon(drizzleIconBlack); break;
            case "light intensity drizzle rain": nextDayImage1.setIcon(drizzleIconBlack); break;
            case "drizzle rain": nextDayImage1.setIcon(drizzleIconBlack); break;
            case "heavy intensity drizzle rain": nextDayImage1.setIcon(drizzleIconBlack); break;
            case "shower rain and drizzle": nextDayImage1.setIcon(drizzleIconBlack); break;
            case "heavy shower rain and drizzle": nextDayImage1.setIcon(drizzleIconBlack); break;
            case "shower drizzle": nextDayImage1.setIcon(drizzleIconBlack); break;
            
            /* Snow */
            case "light snow": nextDayImage1.setIcon(snowIconBlack); break;
            case "Snow": nextDayImage1.setIcon(snowIconBlack); break;
            case "Heavy snow": nextDayImage1.setIcon(snowIconBlack); break;
            case "Sleet": nextDayImage1.setIcon(snowIconBlack); break;
            case "Light shower sleet": nextDayImage1.setIcon(snowIconBlack); break;
            case "Shower sleet": nextDayImage1.setIcon(snowIconBlack); break;
            case "Light rain and snow": nextDayImage1.setIcon(snowIconBlack); break;
            case "Rain and snow": nextDayImage1.setIcon(snowIconBlack); break;
            case "Light shower snow": nextDayImage1.setIcon(snowIconBlack); break;
            case "Shower snow": nextDayImage1.setIcon(snowIconBlack); break;
            case "Heavy shower snow": nextDayImage1.setIcon(snowIconBlack); break;
            
            /* Rain */
            case "light rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "moderate rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "heavy intensity rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "very heavy rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "extreme rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "freezing rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "light intensity shower rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "shower rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "heavy intensity shower rain": nextDayImage1.setIcon(rainIconBlack); break;
            case "ragged shower rain": nextDayImage1.setIcon(rainIconBlack); break;
            
            /* Clear */ 
            case "clear sky": nextDayImage1.setIcon(sunIconBlack); break;
            
            /* Clouds */
            case "few clouds": nextDayImage1.setIcon(fewCloudsIconBlack); break;
            case "scattered clouds": nextDayImage1.setIcon(scatteredCloudsIconBlack); break;
            case "broken clouds": nextDayImage1.setIcon(brokenCloudsImageBlack); break;
            case "overcast clouds": nextDayImage1.setIcon(brokenCloudsImageBlack); break;
            
            /* Atmosphere */
            case "mist": nextDayImage1.setIcon(mistIconBlack); break;
            case "Smoke": nextDayImage1.setIcon(mistIconBlack); break;
            case "Haze": nextDayImage1.setIcon(mistIconBlack); break;
            case "sand/ dust whirls": nextDayImage1.setIcon(mistIconBlack); break;
            case "fog": nextDayImage1.setIcon(mistIconBlack); break;
            case "sand": nextDayImage1.setIcon(mistIconBlack); break;
            case "dust": nextDayImage1.setIcon(mistIconBlack); break;
            case "volcanic ash": nextDayImage1.setIcon(mistIconBlack); break;
            case "squalls": nextDayImage1.setIcon(mistIconBlack); break;
            case "tornado": nextDayImage1.setIcon(mistIconBlack); break;
        }
    }
    
}
