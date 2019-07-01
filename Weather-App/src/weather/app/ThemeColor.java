/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static weather.app.WeatherApp.theme;

/**
 *
 * @author Kamil
 */
public class ThemeColor {

    public static Color backgroundColor;
    public static Color textColor;
    public static Icon placeholder;
    public static Icon mountains;

    public ThemeColor(String themeName) {
        switch (themeName) {
            case "lightblue": {
                theme = "lightblue";
                backgroundColor = new Color(0, 167, 225);
                textColor = new Color(255, 255, 255);
                placeholder = new ImageIcon(getClass().getResource("/images/placeholder.png"));
                mountains = new ImageIcon(getClass().getResource("/backgrounds/mountains_brown.png"));
                break;
            }
            case "dark": {
                theme = "dark";
                backgroundColor = new Color(46, 80, 119);
                textColor = new Color(255, 255, 255);
                placeholder = new ImageIcon(getClass().getResource("/images/placeholder.png"));
                mountains = new ImageIcon(getClass().getResource("/backgrounds/mountains_brown.png"));
                break;
            }
            case "green": {
                theme = "green";
                backgroundColor = new Color(115, 165, 128);
                textColor = new Color(255, 255, 255);
                placeholder = new ImageIcon(getClass().getResource("/images/placeholder.png"));
                mountains = new ImageIcon(getClass().getResource("/backgrounds/mountains_brown.png"));
                break;
            }
            case "red": {
                theme = "red";
                backgroundColor = new Color(221, 97, 74);
                textColor = new Color(255, 255, 255);
                placeholder = new ImageIcon(getClass().getResource("/images/placeholder.png"));
                mountains = new ImageIcon(getClass().getResource("/backgrounds/mountains_brown.png"));
                break;
            }
            case "orange": {
                theme = "orange";
                backgroundColor = new Color(255, 163, 52);
                textColor = new Color(255, 255, 255);
                placeholder = new ImageIcon(getClass().getResource("/images/placeholder.png"));
                mountains = new ImageIcon(getClass().getResource("/backgrounds/mountains_brown.png"));
                break;
            }
        }
    }
}
