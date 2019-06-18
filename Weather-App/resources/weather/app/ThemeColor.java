/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Kamil
 */
public class ThemeColor {

    public static Color backgroundColor;
    public static Color textColor;
    public static Icon placeholder;

    public ThemeColor(String themeName) {
        switch (themeName) {
            case "lightblue": {
                backgroundColor = new Color(0, 102, 255);
                textColor = new Color(51, 153, 255);
                placeholder = new ImageIcon("src/images/placeholder.png");
                break;
            }
            case "dark": {
                backgroundColor = new Color(29, 26, 49);
                textColor = new Color(249, 134, 134);
                placeholder = new ImageIcon("src/images/placeholder_red.png");
                break;
            }
            case "green": {
                backgroundColor = new Color(0, 204, 51);
                textColor = new Color(0, 242, 60);
                placeholder = new ImageIcon("src/images/placeholder_green.png");
                break;
            }
            case "red": {
                backgroundColor = new Color(255, 51, 51);
                textColor = new Color(249, 134, 134);
                placeholder = new ImageIcon("src/images/placeholder_red.png");
                break;
            }
            case "orange": {
                backgroundColor = new Color(255, 102, 0);
                textColor = new Color(255, 166, 107);
                placeholder = new ImageIcon("src/images/placeholder_orange.png");  
                break;
            }
        }
    }
}
