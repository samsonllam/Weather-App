package weather.app;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Kamil
 */
public class WeatherUI extends javax.swing.JFrame {

    int mouseX;
    int mouseY;
    /**
     * Creates new form WeatherUI
     */
    public WeatherUI() {
        initComponents();
        setLocation(810, 315);
        setSize(300, 518);
        setTitle("WeatherApp");
        setDefaultCloseOperation(3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nextDayImage1 = new javax.swing.JLabel();
        nextDayCondLabel1 = new javax.swing.JLabel();
        nextDayLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nextDayCondLabel = new javax.swing.JLabel();
        nextDayLabel = new javax.swing.JLabel();
        nextDayImage = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gifLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholder.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 10, 20, 20);

        nextDayImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nextDayImage1);
        nextDayImage1.setBounds(160, 400, 130, 40);

        nextDayCondLabel1.setFont(new java.awt.Font("Arial Nova", 0, 10)); // NOI18N
        nextDayCondLabel1.setForeground(new java.awt.Color(102, 102, 102));
        nextDayCondLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayCondLabel1.setText("cond");
        getContentPane().add(nextDayCondLabel1);
        nextDayCondLabel1.setBounds(160, 450, 130, 20);

        nextDayLabel1.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        nextDayLabel1.setForeground(new java.awt.Color(102, 102, 102));
        nextDayLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayLabel1.setText("day");
        getContentPane().add(nextDayLabel1);
        nextDayLabel1.setBounds(160, 370, 130, 20);

        jSeparator1.setForeground(new java.awt.Color(234, 235, 237));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(150, 370, 50, 100);

        nextDayCondLabel.setFont(new java.awt.Font("Arial Nova", 0, 10)); // NOI18N
        nextDayCondLabel.setForeground(new java.awt.Color(102, 102, 102));
        nextDayCondLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayCondLabel.setText("cond");
        getContentPane().add(nextDayCondLabel);
        nextDayCondLabel.setBounds(10, 450, 130, 20);

        nextDayLabel.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        nextDayLabel.setForeground(new java.awt.Color(102, 102, 102));
        nextDayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextDayLabel.setText("day");
        getContentPane().add(nextDayLabel);
        nextDayLabel.setBounds(10, 370, 130, 20);

        nextDayImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nextDayImage);
        nextDayImage.setBounds(10, 400, 130, 40);

        temperatureLabel.setBackground(new java.awt.Color(255, 255, 255));
        temperatureLabel.setFont(new java.awt.Font("Arial Nova Cond Light", 0, 44)); // NOI18N
        temperatureLabel.setForeground(new java.awt.Color(255, 255, 255));
        temperatureLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        temperatureLabel.setText("temp");
        getContentPane().add(temperatureLabel);
        temperatureLabel.setBounds(120, 100, 130, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu (1).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 20, 20);

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close(1).png"))); // NOI18N
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
        closeLabel.setBounds(270, 10, 16, 20);

        descriptionLabel.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descriptionLabel.setText("condition");
        getContentPane().add(descriptionLabel);
        descriptionLabel.setBounds(120, 140, 180, 15);

        dateLabel.setBackground(new java.awt.Color(51, 51, 51));
        dateLabel.setFont(new java.awt.Font("Arial Nova Cond", 0, 12)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(51, 153, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateLabel.setText("date");
        getContentPane().add(dateLabel);
        dateLabel.setBounds(120, 160, 170, 15);

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(imageLabel);
        imageLabel.setBounds(30, 90, 80, 80);

        locationLabel.setFont(new java.awt.Font("Arial Nova Cond", 0, 14)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(51, 153, 255));
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        locationLabel.setText("location");
        getContentPane().add(locationLabel);
        locationLabel.setBounds(60, 10, 200, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        jLabel1.setText("X Close");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
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

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered
        Icon hoverIcon = new ImageIcon("src/images/close(2).png");
        closeLabel.setIcon(hoverIcon);
    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited
        Icon icon = new ImageIcon("src/images/close(1).png");
        closeLabel.setIcon(icon);
    }//GEN-LAST:event_closeLabelMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int cordsX = evt.getXOnScreen();
        int cordsY = evt.getYOnScreen();
        
        this.setLocation( cordsX-mouseX, cordsY-mouseY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLabel;
    public static javax.swing.JLabel dateLabel;
    public static javax.swing.JLabel descriptionLabel;
    public static javax.swing.JLabel gifLabel;
    public static javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel locationLabel;
    public static javax.swing.JLabel nextDayCondLabel;
    public static javax.swing.JLabel nextDayCondLabel1;
    public static javax.swing.JLabel nextDayImage;
    public static javax.swing.JLabel nextDayImage1;
    public static javax.swing.JLabel nextDayLabel;
    public static javax.swing.JLabel nextDayLabel1;
    public static javax.swing.JLabel temperatureLabel;
    // End of variables declaration//GEN-END:variables
}
