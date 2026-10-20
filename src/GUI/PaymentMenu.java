package GUI;

import Data.Validation;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentMenu extends javax.swing.JFrame
{
//Declaration of Global variables

    private Data.Validation v = new Validation();
    private Data.EmployeesData ed;
    private String username;
    private int employeeLevel;

    public PaymentMenu(String username, int employeeLevel) throws SQLException, ParseException //Parameterised constructor to generate the components for the JFrame
    {
        initComponents();

        this.username = username;
        this.employeeLevel = employeeLevel;

        lblUsername.setText(username);    //Gets and displays Username and Employee Level from previous screen
        lblEmployeeLevel.setText("" + employeeLevel);
        
        if (employeeLevel < 3) //Checks if Employee has employee management and payment privileges and disables employee managemnt and payments button if true
        {
            btnPaymentHistory.setEnabled(false);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblEmployees = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        lblEmployeeLevel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUsernameHead = new javax.swing.JLabel();
        lblUserLevelHead = new javax.swing.JLabel();
        btnPaymentHistory = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnBack.setBackground(new java.awt.Color(66, 103, 178));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
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

        lblEmployees.setBackground(new java.awt.Color(255, 255, 255));
        lblEmployees.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblEmployees.setForeground(new java.awt.Color(66, 103, 178));
        lblEmployees.setText("Payment Menu:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cashless-payment (1).png"))); // NOI18N

        btnHelp.setBackground(new java.awt.Color(66, 103, 178));
        btnHelp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/helpbtn_7_3.png"))); // NOI18N
        btnHelp.setToolTipText("Display the help menu");
        btnHelp.setBorder(null);
        btnHelp.setBorderPainted(false);
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        lblEmployeeLevel.setText("lblUserLevel");

        lblUsername.setText("lblUsername");

        lblUsernameHead.setText("Username:");

        lblUserLevelHead.setText("User Level:");

        btnPaymentHistory.setBackground(new java.awt.Color(66, 103, 178));
        btnPaymentHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPaymentHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnPaymentHistory.setText("Payment History");
        btnPaymentHistory.setToolTipText("Click button to access payment history screen");
        btnPaymentHistory.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPaymentHistoryActionPerformed(evt);
            }
        });

        btnCheckout.setBackground(new java.awt.Color(66, 103, 178));
        btnCheckout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("Checkout");
        btnCheckout.setToolTipText("Click button to access checkout screen");
        btnCheckout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCheckoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(lblUserLevelHead)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmployeeLevel))
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(lblUsernameHead)
                                .addGap(20, 20, 20)
                                .addComponent(lblUsername)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPaymentHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(lblEmployees)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel1)))))
                .addContainerGap())
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblEmployees)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnPaymentHistory)
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckout)))
                .addGap(44, 44, 44)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsernameHead)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserLevelHead)
                            .addComponent(lblEmployeeLevel))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        this.dispose();//Closes Main Menu
        try
        {
            new MainMenu(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens Main Menu Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new Help("PaymentMenuHelp.txt","HelpVideo.mp4").setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnPaymentHistoryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPaymentHistoryActionPerformed
    {//GEN-HEADEREND:event_btnPaymentHistoryActionPerformed
        this.dispose();//Closes Main Menu
        try
        {
            new PaymentHistory(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens PaymentHistory Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnPaymentHistoryActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCheckoutActionPerformed
    {//GEN-HEADEREND:event_btnCheckoutActionPerformed
       this.dispose();//Closes Main Menu
        try
        {
            new Checkout(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens Checkout Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnCheckoutActionPerformed

    public static void main(String args[]) throws SQLException, ParseException
    {

        new PaymentMenu("JLP", 4).setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnPaymentHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblEmployeeLevel;
    private javax.swing.JLabel lblEmployees;
    private javax.swing.JLabel lblUserLevelHead;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameHead;
    private javax.swing.JPanel pnlBg;
    // End of variables declaration//GEN-END:variables
}
