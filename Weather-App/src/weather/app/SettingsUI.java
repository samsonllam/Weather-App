/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import com.github.prominence.openweathermap.api.exception.DataNotFoundException;
import com.github.prominence.openweathermap.api.exception.InvalidAuthTokenException;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.MatteBorder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import static weather.app.Data.writeData;
import static weather.app.WeatherApp.*;
import static weather.app.ThemeColor.*;
import static weather.app.WeatherForecast.getCurrentWeather;
import static weather.app.WeatherForecast.getDayAfterTomorrowWeather;
import static weather.app.WeatherForecast.getTomorrowWeather;
import static weather.app.WeatherUI.cordsX;
import static weather.app.WeatherUI.cordsY;
import static weather.app.WeatherUI.mouseX;
import static weather.app.WeatherUI.mouseY;

/**
 *
 * @author Kamil
 */
public class SettingsUI extends javax.swing.JFrame {
   
    Color textfieldline = new Color(234,235,237);
    
    /**
     * Creates new form SettingsPage
     */
    public SettingsUI() {
        initComponents();
        int positionY = (screenHeight - 518)/2;
        int positionX = (screenWidth - 300)/2;
        setLocation( positionX , positionY );
        setSize(300, 518);
        setTitle("WeatherApp");
        setDefaultCloseOperation(3);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        
        jTextField1.setText(location);
        jTextField1.setBorder(new MatteBorder(0, 0, 1, 0, textfieldline));
        jTextField3.setText(api);
        jTextField3.setBorder(new MatteBorder(0, 0, 1, 0, textfieldline));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/weather_icons/app_icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsApplyChangesLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        orangeThemeColorLabel = new javax.swing.JLabel();
        greenThemeColorLabel = new javax.swing.JLabel();
        lightblueThemeColorLabel = new javax.swing.JLabel();
        redThemeColorLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        darkThemeColorLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        colorPanelSettings = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        settingsApplyChangesLabel.setBackground(new java.awt.Color(255, 255, 255));
        settingsApplyChangesLabel.setFont(new java.awt.Font("Arial Nova", 0, 10)); // NOI18N
        settingsApplyChangesLabel.setForeground(new java.awt.Color(153, 153, 153));
        settingsApplyChangesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsApplyChangesLabel.setText("Apply changes");
        settingsApplyChangesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsApplyChangesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsApplyChangesLabelMouseClicked(evt);
            }
        });
        getContentPane().add(settingsApplyChangesLabel);
        settingsApplyChangesLabel.setBounds(20, 450, 260, 30);

        jSeparator1.setForeground(new java.awt.Color(234, 235, 237));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 230, 260, 10);

        orangeThemeColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orangeThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_orange.png"))); // NOI18N
        orangeThemeColorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orangeThemeColorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orangeThemeColorLabelMouseClicked(evt);
            }
        });
        getContentPane().add(orangeThemeColorLabel);
        orangeThemeColorLabel.setBounds(180, 300, 40, 40);

        greenThemeColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greenThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_green.png"))); // NOI18N
        greenThemeColorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        greenThemeColorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                greenThemeColorLabelMouseClicked(evt);
            }
        });
        getContentPane().add(greenThemeColorLabel);
        greenThemeColorLabel.setBounds(130, 300, 40, 40);

        lightblueThemeColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lightblueThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_blue.png"))); // NOI18N
        lightblueThemeColorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lightblueThemeColorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lightblueThemeColorLabelMouseClicked(evt);
            }
        });
        getContentPane().add(lightblueThemeColorLabel);
        lightblueThemeColorLabel.setBounds(80, 300, 40, 40);

        redThemeColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        redThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_red.png"))); // NOI18N
        redThemeColorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redThemeColorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redThemeColorLabelMouseClicked(evt);
            }
        });
        getContentPane().add(redThemeColorLabel);
        redThemeColorLabel.setBounds(230, 300, 40, 40);

        jSeparator3.setForeground(new java.awt.Color(234, 235, 237));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 360, 260, 10);

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setText("type your api here");
        jTextField3.setBorder(null);
        jTextField3.setCaretColor(new java.awt.Color(153, 153, 153));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(90, 180, 190, 20);

        jLabel10.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Select your theme color: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 260, 150, 15);

        jLabel4.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Api: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 60, 20);

        darkThemeColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        darkThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_dark.png"))); // NOI18N
        darkThemeColorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        darkThemeColorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darkThemeColorLabelMouseClicked(evt);
            }
        });
        getContentPane().add(darkThemeColorLabel);
        darkThemeColorLabel.setBounds(30, 300, 40, 40);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("type your city here");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 150, 190, 20);

        jLabel3.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Location: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 150, 60, 20);

        settingsLabel.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        settingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        settingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsLabel.setText("Settings");
        getContentPane().add(settingsLabel);
        settingsLabel.setBounds(10, 10, 280, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 10, 20, 20);

        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_button.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLabelMouseExited(evt);
            }
        });
        getContentPane().add(closeLabel);
        closeLabel.setBounds(270, 10, 20, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/settings_background.png"))); // NOI18N
        jLabel1.setText("X Close");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 510);

        colorPanelSettings.setBackground(backgroundColor);

        javax.swing.GroupLayout colorPanelSettingsLayout = new javax.swing.GroupLayout(colorPanelSettings);
        colorPanelSettings.setLayout(colorPanelSettingsLayout);
        colorPanelSettingsLayout.setHorizontalGroup(
            colorPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        colorPanelSettingsLayout.setVerticalGroup(
            colorPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(colorPanelSettings);
        colorPanelSettings.setBounds(0, 0, 330, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        cordsX = evt.getXOnScreen();
        cordsY = evt.getYOnScreen();

        this.setLocation( cordsX-mouseX, cordsY-mouseY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        dispose();
    }//GEN-LAST:event_closeLabelMouseClicked

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_button_hover.png")));
    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_button.png")));
    }//GEN-LAST:event_closeLabelMouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize_hover.png")));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png")));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void greenThemeColorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenThemeColorLabelMouseClicked
        ThemeColor tc = new ThemeColor("green");
        greenThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_green_click.png")));
        lightblueThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_blue.png")));
        orangeThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_orange.png")));
        redThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_red.png")));
        darkThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_dark.png")));
    }//GEN-LAST:event_greenThemeColorLabelMouseClicked

    private void lightblueThemeColorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lightblueThemeColorLabelMouseClicked
        ThemeColor tc = new ThemeColor("lightblue");
        greenThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_green.png")));
        lightblueThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_lightblue_click.png")));
        orangeThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_orange.png")));
        redThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_red.png")));
        darkThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_dark.png")));
    }//GEN-LAST:event_lightblueThemeColorLabelMouseClicked

    private void orangeThemeColorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orangeThemeColorLabelMouseClicked
        ThemeColor tc = new ThemeColor("orange");
        greenThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_green.png")));
        lightblueThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_blue.png")));
        orangeThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_orange_click.png")));
        redThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_red.png")));
        darkThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_dark.png")));
    }//GEN-LAST:event_orangeThemeColorLabelMouseClicked

    private void redThemeColorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redThemeColorLabelMouseClicked
        ThemeColor tc = new ThemeColor("red");
        greenThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_green.png")));
        lightblueThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_blue.png")));
        orangeThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_orange.png")));
        redThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_red_click.png")));
        darkThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_dark.png")));
    }//GEN-LAST:event_redThemeColorLabelMouseClicked

    private void darkThemeColorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darkThemeColorLabelMouseClicked
        ThemeColor tc = new ThemeColor("dark");
        greenThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_green.png")));
        lightblueThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_blue.png")));
        orangeThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_orange.png")));
        redThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_red.png")));
        darkThemeColorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme_color_dark_click.png")));
    }//GEN-LAST:event_darkThemeColorLabelMouseClicked

    private void settingsApplyChangesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsApplyChangesLabelMouseClicked
        try {                                                       
            java.awt.Window win[] = java.awt.Window.getWindows();
            for (Window win1 : win) {
                win1.dispose();
            }
            
            /* CHANGE LOCATION WITH TEXTFIELD */
            location = jTextField1.getText();
            api = jTextField3.getText();
            
            try {
                writeData(location,api,theme);
            } catch (TransformerException | ParserConfigurationException ex) {
                Logger.getLogger(SettingsUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            getCurrentWeather();
            getTomorrowWeather();
            getDayAfterTomorrowWeather();
            WeatherUI wUI = new WeatherUI();
            WeatherImage wI = new WeatherImage();
            displayWeather();
            wUI.setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SettingsUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(DataNotFoundException ex){
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
    }//GEN-LAST:event_settingsApplyChangesLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SettingsUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLabel;
    public static javax.swing.JPanel colorPanelSettings;
    private javax.swing.JLabel darkThemeColorLabel;
    private javax.swing.JLabel greenThemeColorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lightblueThemeColorLabel;
    private javax.swing.JLabel orangeThemeColorLabel;
    private javax.swing.JLabel redThemeColorLabel;
    private javax.swing.JLabel settingsApplyChangesLabel;
    public static javax.swing.JLabel settingsLabel;
    // End of variables declaration//GEN-END:variables
}