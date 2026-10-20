package GUI;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Card extends javax.swing.JFrame
{

    private Data.PaymentLogData cl;
    
   

    private String username;
    private String name;
    private int userLevel;
    private int welcomeCount = 1;
    private String password;
    private DecimalFormat df;
    private double totalPrice = 0.00;
    private SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");            // getting date format
    private SimpleDateFormat timeForm = new SimpleDateFormat("HH:mm:ss");           // getting time format

    public Card(String username, int userLevel) throws SQLException
    {
        initComponents();
        this.username = username;
        this.name = name;
        this.userLevel = userLevel;
        this.password = password;
       

        cl = new Data.PaymentLogData();
        

       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        lblCardNum = new javax.swing.JLabel();
        lblCardDets = new javax.swing.JLabel();
        lblCVC = new javax.swing.JLabel();
        lblExD = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        txfCVC = new javax.swing.JTextField();
        txfExD = new javax.swing.JTextField();
        txfCardNum = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txfNameOnCard = new javax.swing.JTextField();
        lblUsernameHead = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmployeeLevel = new javax.swing.JLabel();
        lblUserLevelHead = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBg.setBackground(new java.awt.Color(66, 103, 178));
        pnlBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblCardNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCardNum.setForeground(new java.awt.Color(255, 255, 255));
        lblCardNum.setText("Card Number");

        lblCardDets.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblCardDets.setForeground(new java.awt.Color(255, 255, 255));
        lblCardDets.setText("Card Details");

        lblCVC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCVC.setForeground(new java.awt.Color(255, 255, 255));
        lblCVC.setText("CVC");

        lblExD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblExD.setForeground(new java.awt.Color(255, 255, 255));
        lblExD.setText("Expiry Date");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name on Card");

        btnPay.setBackground(new java.awt.Color(255, 255, 255));
        btnPay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPay.setText("Pay");
        btnPay.setToolTipText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPayActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(66, 103, 178));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbtn_3.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Return to the main menu");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackActionPerformed(evt);
            }
        });

        lblUsernameHead.setText("Username:");

        lblUsername.setText("lblUsername");

        lblEmployeeLevel.setText("lblUserlevel");

        lblUserLevelHead.setText("User Level:");

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(lblCardDets, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblCardNum)
                            .addComponent(lblExD)
                            .addComponent(lblCVC))
                        .addGap(108, 108, 108)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPay)
                            .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txfExD)
                                .addComponent(txfCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfCardNum)
                                .addComponent(txfNameOnCard, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevelHead)
                            .addComponent(lblUsernameHead))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblEmployeeLevel))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCardDets)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txfNameOnCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCardNum)
                            .addComponent(txfCardNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExD)
                            .addComponent(txfExD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCVC))
                    .addComponent(txfCVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPay)
                .addGap(18, 18, 18)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsernameHead)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserLevelHead)
                    .addComponent(lblEmployeeLevel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
       this.dispose();//Closes this screen
        try
        {
            new PaymentOptions(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens payment options Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPayActionPerformed
    {//GEN-HEADEREND:event_btnPayActionPerformed
       this.dispose();//Closes this screen
        try
        {
            new Checkout(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens checkout Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnPayActionPerformed

   
    public static void main(String args[]) throws SQLException
    {
                new Card("KLD",  4).setVisible(true);
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPay;
    private javax.swing.JLabel lblCVC;
    private javax.swing.JLabel lblCardDets;
    private javax.swing.JLabel lblCardNum;
    private javax.swing.JLabel lblEmployeeLevel;
    private javax.swing.JLabel lblExD;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblUserLevelHead;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameHead;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JTextField txfCVC;
    private javax.swing.JTextField txfCardNum;
    private javax.swing.JTextField txfExD;
    private javax.swing.JTextField txfNameOnCard;
    // End of variables declaration//GEN-END:variables
}
