package GUI;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class SplashScreen extends javax.swing.JFrame
{
    static int perc = 0;

    public SplashScreen()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jpBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pbLoading = new javax.swing.JProgressBar();
        lblLoadPercentage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("JP CONSULTING");
        setBackground(new java.awt.Color(66, 103, 178));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));

        jpBackground.setBackground(new java.awt.Color(255, 255, 255));
        jpBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jpBackground.setForeground(new java.awt.Color(66, 103, 178));

        jLabel1.setBackground(new java.awt.Color(137, 143, 156));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loading igf.gif"))); // NOI18N

        pbLoading.setForeground(new java.awt.Color(108, 186, 14));

        lblLoadPercentage.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblLoadPercentage.setText("0%");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLoadPercentage)
                .addGap(377, 377, 377))
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoadPercentage)
                .addGap(265, 265, 265))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {
        //runs a pseudo loading screen
        
        final SplashScreen s = new SplashScreen();
        s.setLocationRelativeTo(null);
        s.setVisible(true);

        final Timer t = new Timer();

        TimerTask tt = new TimerTask()
        {
            public void run()
            {
                perc++;
                if (perc < 101)
                {
                    s.pbLoading.setValue(perc);
                    s.lblLoadPercentage.setText(perc + " %");
                } else
                {
                    try
                    {
                        t.cancel();
                        s.dispose();
                        new Login().setVisible(true);
                    } catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

            }
        };
        t.scheduleAtFixedRate(tt, 0, 25);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JLabel lblLoadPercentage;
    private javax.swing.JProgressBar pbLoading;
    // End of variables declaration//GEN-END:variables
}
