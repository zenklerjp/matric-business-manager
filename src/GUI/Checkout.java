package GUI;

import java.awt.print.PrinterException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Checkout extends javax.swing.JFrame
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

    public Checkout(String username, int userLevel) throws SQLException
    {
        initComponents();
        this.username = username;
        this.name = name;
        this.userLevel = userLevel;
        this.password = password;
        lblUsername.setText(username);
        lblEmployeeLevel.setText("" + userLevel);

        cl = new Data.PaymentLogData();

        df = new DecimalFormat("0.00");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        pnlBg = new javax.swing.JPanel();
        lblUsernameHead = new javax.swing.JLabel();
        pnlCheckout = new javax.swing.JPanel();
        lblDisplay = new javax.swing.JLabel();
        btnConfirmPurchase = new javax.swing.JButton();
        btnCancelPurchase = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        txfFee = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfClientRef = new javax.swing.JTextField();
        lblBase = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();
        lblUserLevelHead = new javax.swing.JLabel();
        lblEmployeeLevel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        txaDisplay.setColumns(20);
        txaDisplay.setRows(5);
        jScrollPane1.setViewportView(txaDisplay);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Checkout");
        setUndecorated(true);
        setResizable(false);

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlBg.setFocusTraversalPolicyProvider(true);

        lblUsernameHead.setText("Username:");

        pnlCheckout.setBackground(new java.awt.Color(255, 255, 255));
        pnlCheckout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDisplay.setText("CHECKOUT DISPLAY");

        btnConfirmPurchase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConfirmPurchase.setText("Proceed to Checkout");
        btnConfirmPurchase.setToolTipText("Confirms payment");
        btnConfirmPurchase.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConfirmPurchaseActionPerformed(evt);
            }
        });

        btnCancelPurchase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelPurchase.setText("Cancel Purchase");
        btnCancelPurchase.setToolTipText("Cancels Payment");
        btnCancelPurchase.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelPurchaseActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printer-ico30x30.png"))); // NOI18N
        btnPrint.setToolTipText("Prints the Payment Bill");
        btnPrint.setBorder(null);
        btnPrint.setBorderPainted(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Enter the Service Fee:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Enter Client Reference:");

        lblBase.setText("*Base Consultation fee = R500");

        lblR.setText("R");

        javax.swing.GroupLayout pnlCheckoutLayout = new javax.swing.GroupLayout(pnlCheckout);
        pnlCheckout.setLayout(pnlCheckoutLayout);
        pnlCheckoutLayout.setHorizontalGroup(
            pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCheckoutLayout.createSequentialGroup()
                        .addGroup(pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDisplay)
                            .addGroup(pnlCheckoutLayout.createSequentialGroup()
                                .addComponent(btnConfirmPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCheckoutLayout.createSequentialGroup()
                        .addGroup(pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(pnlCheckoutLayout.createSequentialGroup()
                                .addGroup(pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCheckoutLayout.createSequentialGroup()
                                        .addComponent(lblR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfFee))
                                    .addComponent(txfClientRef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(lblBase)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCheckoutLayout.setVerticalGroup(
            pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisplay)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBase)
                    .addComponent(lblR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfClientRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConfirmPurchase)
                        .addComponent(btnCancelPurchase))
                    .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUserLevelHead.setText("User Level:");

        lblEmployeeLevel.setText("lblUserlevel");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

        lblUsername.setText("lblUsername");

        btnBack.setBackground(new java.awt.Color(66, 103, 178));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbtn_3.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Return to the payment menu");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(66, 103, 178));
        btnHelp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/helpbtn_7_3.png"))); // NOI18N
        btnHelp.setToolTipText("Display Help Menu");
        btnHelp.setBorder(null);
        btnHelp.setBorderPainted(false);
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 103, 178));
        jLabel2.setText("Checkout:");

        jLabel3.setText("Tip: Print Slip before confirming purchase");

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3)
                            .addComponent(pnlCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevelHead)
                            .addComponent(lblUsernameHead))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblEmployeeLevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(pnlCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsernameHead)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserLevelHead)
                            .addComponent(lblEmployeeLevel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new Help("CheckoutHelp.txt", "HelpVideo.mp4").setVisible(true);//opens help screen
    }//GEN-LAST:event_btnHelpActionPerformed
// returns you to the payment menu  
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        this.dispose();//Closes Main Menu
        try
        {
            new PaymentMenu(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens payment menu Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelPurchaseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelPurchaseActionPerformed
    {//GEN-HEADEREND:event_btnCancelPurchaseActionPerformed

        txfFee.setText("0");// resets grand total price back to 0
        txfClientRef.setText("");//cleaars the client reference number

    }//GEN-LAST:event_btnCancelPurchaseActionPerformed

    private void btnConfirmPurchaseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConfirmPurchaseActionPerformed
    {//GEN-HEADEREND:event_btnConfirmPurchaseActionPerformed

        if (txfFee.getText() == "")
        {
            JOptionPane.showMessageDialog(null, "No Fee Inputted");
        } else
        {
            if (txfClientRef.getText() == "")
            {
                JOptionPane.showMessageDialog(null, "No Client Reference Inputted");

            } else
            {

                try
                {

                    cl.newLog(txfClientRef.getText().trim(), username, Double.parseDouble(txfFee.getText().trim()));

                    new PaymentOptions(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens payment options Frame and sends through Username and Employee Level
                    JOptionPane.showMessageDialog(null, "Payment Successful");

                    txfFee.setText("");// resets txfFee total to 0.0 again
                    txfClientRef.setText("");

                } catch (SQLException ex)
                {
                    Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "PayMENT Failed, Please Try Agin");
                }

            }
        }


    }//GEN-LAST:event_btnConfirmPurchaseActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPrintActionPerformed
    {//GEN-HEADEREND:event_btnPrintActionPerformed
//allows user to print the checkout bill
        LocalDateTime date = LocalDateTime.now();

        txaDisplay.setText(txfFee.getText() + "\n" + txfClientRef.getText() + "\n" + date);

        try
        {
            txaDisplay.print();
        } catch (PrinterException ex)
        {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new Checkout("JLP", 4).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelPurchase;
    private javax.swing.JButton btnConfirmPurchase;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblEmployeeLevel;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblUserLevelHead;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameHead;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlCheckout;
    private javax.swing.JTextArea txaDisplay;
    private javax.swing.JTextField txfClientRef;
    private javax.swing.JTextField txfFee;
    // End of variables declaration//GEN-END:variables
}
