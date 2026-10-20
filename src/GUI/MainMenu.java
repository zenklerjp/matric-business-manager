package GUI;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame
{

    public MainMenu(String username, int employeeLevel) //Parameterised constructor to generate the components for the JFrame
    {
        initComponents();

        lblUsername.setText(username);    //Gets and displays Username and Employee Level from login
        lblEmployeeLevel.setText("" + employeeLevel);
        if (employeeLevel < 3) //Checks if Employee has employee management and payment privileges and disables employee managemnt and payments button if true
        {
            btnEmployeeMenu.setEnabled(false);
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnEmployeeMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCalender = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblUsernameHead = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmployeeLevel = new javax.swing.JLabel();
        lblUserlevelHead = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        btnPayments = new javax.swing.JButton();
        btnClientManagement = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 103, 178), 2));

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

        btnEmployeeMenu.setBackground(new java.awt.Color(66, 103, 178));
        btnEmployeeMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmployeeMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployeeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recruitment.png"))); // NOI18N
        btnEmployeeMenu.setText("Employee Menu");
        btnEmployeeMenu.setToolTipText("Click button to access Employee Menu screen");
        btnEmployeeMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEmployeeMenuActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

        btnCalender.setBackground(new java.awt.Color(66, 103, 178));
        btnCalender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalender.setForeground(new java.awt.Color(255, 255, 255));
        btnCalender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/timetable (1).png"))); // NOI18N
        btnCalender.setText("Calender");
        btnCalender.setToolTipText("Click button to access calender screen");
        btnCalender.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCalenderActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setToolTipText("Logout and return to login screen");
        btnLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLogoutActionPerformed(evt);
            }
        });

        lblUsernameHead.setText("Username:");

        lblUsername.setText("lblUsername");

        lblEmployeeLevel.setText("lblUserlevel");

        lblUserlevelHead.setText("Employee Level:");

        btnHelp.setBackground(new java.awt.Color(255, 255, 255));
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

        btnPayments.setBackground(new java.awt.Color(66, 103, 178));
        btnPayments.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPayments.setForeground(new java.awt.Color(255, 255, 255));
        btnPayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cashless-payment (1).png"))); // NOI18N
        btnPayments.setText("Payment Menu");
        btnPayments.setToolTipText("Click button to access payment menu screen");
        btnPayments.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPaymentsActionPerformed(evt);
            }
        });

        btnClientManagement.setBackground(new java.awt.Color(66, 103, 178));
        btnClientManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClientManagement.setForeground(new java.awt.Color(255, 255, 255));
        btnClientManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/client (1).png"))); // NOI18N
        btnClientManagement.setText("Client Management");
        btnClientManagement.setToolTipText("Click button to access client management screen");
        btnClientManagement.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClientManagementActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 103, 178));
        jLabel2.setText("Main Menu:");

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserlevelHead)
                            .addComponent(lblUsernameHead))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblEmployeeLevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(0, 587, Short.MAX_VALUE))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEmployeeMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClientManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPayments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEmployeeMenu)
                            .addComponent(btnPayments))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalender)
                            .addComponent(btnClientManagement))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsernameHead)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserlevelHead)
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

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        System.exit(0); //closes the whole application
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed
        try //logs the user out and they have to log in again from the login screen
        {
            this.dispose();
            new Login().setVisible(true);
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new Help("MainMenuHelp.txt","HelpVideo.mp4").setVisible(true); //opens help screen
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnEmployeeMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEmployeeMenuActionPerformed
    {//GEN-HEADEREND:event_btnEmployeeMenuActionPerformed
        this.dispose();//Closes this screen
        try
        {
            new EmployeeMenu(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens employee menu Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnEmployeeMenuActionPerformed

    private void btnPaymentsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPaymentsActionPerformed
    {//GEN-HEADEREND:event_btnPaymentsActionPerformed
        this.dispose();//Closes Main Menu
        try
        {
            new PaymentMenu(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens payments menu Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnPaymentsActionPerformed

    private void btnClientManagementActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClientManagementActionPerformed
    {//GEN-HEADEREND:event_btnClientManagementActionPerformed
        this.dispose();//Closes Main Menu
        try
        {
            new ClientManagement(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens client managaemnt Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnClientManagementActionPerformed

    private void btnCalenderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCalenderActionPerformed
    {//GEN-HEADEREND:event_btnCalenderActionPerformed
        this.dispose();//Closes Main Menu
        try
        {
            new Calender(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens calender Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnCalenderActionPerformed

    public static void main(String args[])
    {

        new MainMenu("JLP", 4).setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalender;
    private javax.swing.JButton btnClientManagement;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEmployeeMenu;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPayments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEmployeeLevel;
    private javax.swing.JLabel lblUserlevelHead;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameHead;
    private javax.swing.JPanel pnlBg;
    // End of variables declaration//GEN-END:variables
}
