package weather.app;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import static weather.app.ThemeColor.backgroundColor;
import static weather.app.WeatherApp.screenHeight;
import static weather.app.WeatherApp.screenWidth;

/**
 *
 * @author Kamil
 */
public class WeatherUI extends javax.swing.JFrame {

    public static int cordsX;
    public static int cordsY;
    public static int mouseX;
    public static int mouseY;
    /**
     * Creates new form WeatherUI
     */
    public WeatherUI() {
        initComponents();
        int positionY = (screenHeight - 518)/2;
        int positionX = (screenWidth - 300)/2;
        this.setLocation( positionX , positionY );
        this.setSize(320, 518);
        this.setTitle("WeatherApp");
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0f));
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

        jLabel4 = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();
        dayAfterTomorrowTempLabel = new javax.swing.JLabel();
        nextDayTempLabel = new javax.swing.JLabel();
        placeholderLabel = new javax.swing.JLabel();
        nextDayImage1 = new javax.swing.JLabel();
        nextDayCondLabel1 = new javax.swing.JLabel();
        nextDayLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nextDayCondLabel = new javax.swing.JLabel();
        nextDayLabel = new javax.swing.JLabel();
        nextDayImage = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gifLabel = new javax.swing.JLabel();
        colorPanelMain = new javax.swing.JPanel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseExited(evt);
            }
        });
        getContentPane().add(minimizeLabel);
        minimizeLabel.setBounds(250, 10, 20, 20);

        dayAfterTomorrowTempLabel.setFont(new java.awt.Font("Arial Nova", 0, 10)); // NOI18N
        dayAfterTomorrowTempLabel.setForeground(new java.awt.Color(102, 102, 102));
        dayAfterTomorrowTempLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayAfterTomorrowTempLabel.setText("temp");
        getContentPane().add(dayAfterTomorrowTempLabel);
        dayAfterTomorrowTempLabel.setBounds(190, 470, 70, 13);

        nextDayTempLabel.setFont(new java.awt.Font("Arial Nova", 0, 10)); // NOI18N
        nextDayTempLabel.setForeground(new java.awt.Color(102, 102, 102));
        nextDayTempLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayTempLabel.setText("temp");
        getContentPane().add(nextDayTempLabel);
        nextDayTempLabel.setBounds(50, 470, 50, 13);

        placeholderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeholderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholder.png"))); // NOI18N
        getContentPane().add(placeholderLabel);
        placeholderLabel.setBounds(40, 10, 20, 20);

        nextDayImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nextDayImage1);
        nextDayImage1.setBounds(160, 390, 130, 40);

        nextDayCondLabel1.setFont(new java.awt.Font("Arial Nova", 0, 10)); // NOI18N
        nextDayCondLabel1.setForeground(new java.awt.Color(102, 102, 102));
        nextDayCondLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayCondLabel1.setText("cond");
        getContentPane().add(nextDayCondLabel1);
        nextDayCondLabel1.setBounds(160, 440, 130, 20);

        nextDayLabel1.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        nextDayLabel1.setForeground(new java.awt.Color(102, 102, 102));
        nextDayLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayLabel1.setText("day");
        getContentPane().add(nextDayLabel1);
        nextDayLabel1.setBounds(160, 360, 130, 20);

        jSeparator1.setForeground(new java.awt.Color(234, 235, 237));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(150, 360, 20, 130);

        nextDayCondLabel.setFont(new java.awt.Font("Arial Nova", 0, 10)); // NOI18N
        nextDayCondLabel.setForeground(new java.awt.Color(102, 102, 102));
        nextDayCondLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayCondLabel.setText("cond");
        getContentPane().add(nextDayCondLabel);
        nextDayCondLabel.setBounds(10, 440, 130, 20);

        nextDayLabel.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        nextDayLabel.setForeground(new java.awt.Color(102, 102, 102));
        nextDayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayLabel.setText("day");
        getContentPane().add(nextDayLabel);
        nextDayLabel.setBounds(10, 360, 130, 20);

        nextDayImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nextDayImage);
        nextDayImage.setBounds(10, 390, 130, 40);

        temperatureLabel.setBackground(new java.awt.Color(255, 255, 255));
        temperatureLabel.setFont(new java.awt.Font("Arial Nova Cond Light", 0, 44)); // NOI18N
        temperatureLabel.setForeground(new java.awt.Color(255, 255, 255));
        temperatureLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        temperatureLabel.setText("temp");
        getContentPane().add(temperatureLabel);
        temperatureLabel.setBounds(160, 80, 130, 60);

        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu (1).png"))); // NOI18N
        menuLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLabelMouseClicked(evt);
            }
        });
        getContentPane().add(menuLabel);
        menuLabel.setBounds(10, 10, 20, 20);

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

        descriptionLabel.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descriptionLabel.setText("condition");
        getContentPane().add(descriptionLabel);
        descriptionLabel.setBounds(160, 140, 130, 20);

        dateLabel.setBackground(new java.awt.Color(51, 51, 51));
        dateLabel.setFont(new java.awt.Font("Arial Nova Cond", 0, 12)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(51, 153, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateLabel.setText("date");
        getContentPane().add(dateLabel);
        dateLabel.setBounds(160, 160, 130, 20);

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(imageLabel);
        imageLabel.setBounds(10, 80, 140, 110);

        locationLabel.setFont(new java.awt.Font("Arial Nova Cond", 0, 14)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(51, 153, 255));
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        locationLabel.setText("location");
        getContentPane().add(locationLabel);
        locationLabel.setBounds(60, 10, 200, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/main_background.png"))); // NOI18N
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
        jLabel1.setBounds(0, 0, 300, 518);
        getContentPane().add(gifLabel);
        gifLabel.setBounds(0, 0, 300, 330);

        colorPanelMain.setBackground(backgroundColor);

        javax.swing.GroupLayout colorPanelMainLayout = new javax.swing.GroupLayout(colorPanelMain);
        colorPanelMain.setLayout(colorPanelMainLayout);
        colorPanelMainLayout.setHorizontalGroup(
            colorPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        colorPanelMainLayout.setVerticalGroup(
            colorPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(colorPanelMain);
        colorPanelMain.setBounds(0, 0, 300, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void menuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseClicked
        SettingsPage settings = new SettingsPage();
        settings.setVisible(true);
    }//GEN-LAST:event_menuLabelMouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        cordsX = evt.getXOnScreen();
        cordsY = evt.getYOnScreen();
        
        this.setLocation( cordsX-mouseX, cordsY-mouseY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_button_hover.png")));
    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_button.png")));
    }//GEN-LAST:event_closeLabelMouseExited

    private void minimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseEntered
        minimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize_hover.png")));
    }//GEN-LAST:event_minimizeLabelMouseEntered

    private void minimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseExited
        minimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png")));
    }//GEN-LAST:event_minimizeLabelMouseExited

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WeatherUI().setVisible(true);
        });
    }
    
    public void closeWindow(){
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel closeLabel;
    public static javax.swing.JPanel colorPanelMain;
    public static javax.swing.JLabel dateLabel;
    public static javax.swing.JLabel dayAfterTomorrowTempLabel;
    public static javax.swing.JLabel descriptionLabel;
    public static javax.swing.JLabel gifLabel;
    public static javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel locationLabel;
    private static javax.swing.JLabel menuLabel;
    private static javax.swing.JLabel minimizeLabel;
    public static javax.swing.JLabel nextDayCondLabel;
    public static javax.swing.JLabel nextDayCondLabel1;
    public static javax.swing.JLabel nextDayImage;
    public static javax.swing.JLabel nextDayImage1;
    public static javax.swing.JLabel nextDayLabel;
    public static javax.swing.JLabel nextDayLabel1;
    public static javax.swing.JLabel nextDayTempLabel;
    public static javax.swing.JLabel placeholderLabel;
    public static javax.swing.JLabel temperatureLabel;
    // End of variables declaration//GEN-END:variables
}
