package GUI;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame
{
    //Declaration of Global variables
     Data.EmployeesData ed;
    

    public Login() throws SQLException//Parameterised constructor to initiate the class variables
    {
        initComponents();
        
        ed = new Data.EmployeesData();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        btnHelp = new javax.swing.JButton();
        cbShowPassword = new javax.swing.JCheckBox();
        txfUsername = new javax.swing.JTextField();
        txfPassword = new javax.swing.JPasswordField();
        lblLoginScreen = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(188, 42, 141));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 103, 178), 2));

        btnHelp.setBackground(new java.awt.Color(255, 255, 255));
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/helpbtn_7_3.png"))); // NOI18N
        btnHelp.setToolTipText("Help");
        btnHelp.setBorder(null);
        btnHelp.setBorderPainted(false);
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        cbShowPassword.setText("Show Password");
        cbShowPassword.setToolTipText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbShowPasswordActionPerformed(evt);
            }
        });

        lblLoginScreen.setFont(new java.awt.Font("Tahoma", 3, 25)); // NOI18N
        lblLoginScreen.setForeground(new java.awt.Color(66, 103, 178));
        lblLoginScreen.setText("Login:");

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPassword.setText("Password:");

        btnLogin.setBackground(new java.awt.Color(66, 103, 178));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Enter");
        btnLogin.setToolTipText("Login to the program");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoginActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitbtn_30x30.png"))); // NOI18N
        btnClose.setToolTipText("Exit Entire Program");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
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
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLoginScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(lblPassword)
                                .addGap(6, 6, 6))
                            .addComponent(lblUsername))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfUsername)
                            .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbShowPassword)
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginScreen)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblUsername))
                        .addGap(28, 28, 28)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txfPassword)
                            .addComponent(cbShowPassword))
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLoginActionPerformed
    {//GEN-HEADEREND:event_btnLoginActionPerformed
         Data.Employees e = ed.getEmployee(txfUsername.getText().trim()); //Makes an object of the Employees class
        
        if (e.getUsername().equalsIgnoreCase(txfUsername.getText().trim())) //Checks if the username exists in the database
        {
            if (e.getPassword().equalsIgnoreCase(txfPassword.getText().trim())) //Checks if password matches the username from the data in the database
            {
                if (e.isActivityStatus()) // Checks if the employee the username is for is enabled for the system
                {
                    this.dispose(); //Closes this screen
                    new MainMenu(txfUsername.getText().trim(), Integer.parseInt(e.getEmployeeLevel())).setVisible(true); //Opens the Main Menu
                } else
                {
                    JOptionPane.showMessageDialog(null, "Employee Status is currently Disabled", "Employee Disabled", JOptionPane.ERROR_MESSAGE); //Displays error message if employee is disabled
                    txfPassword.setText("");
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Password Invalid", "ERROR - Password Invalid", JOptionPane.ERROR_MESSAGE);//Displays error message if the password is incorrect
                txfPassword.setText("");
                txfPassword.requestFocus();
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Username Invalid", "ERROR - Username Invalid", JOptionPane.ERROR_MESSAGE);//Displays error message if username doesn't exist in the database
            txfUsername.requestFocus();
            txfPassword.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
         System.exit(0);
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbShowPasswordActionPerformed
    {//GEN-HEADEREND:event_cbShowPasswordActionPerformed
        if (cbShowPassword.isSelected())       // allows user to toggle between being able to see password and not being able to
        {
            txfPassword.setEchoChar((char) 0);
        } else
        {
            txfPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new Help("LoginHelp.txt","HelpVideo.mp4").setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    public static void main(String args[]) throws SQLException 
    {
        new Login().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLoginScreen;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPasswordField txfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
