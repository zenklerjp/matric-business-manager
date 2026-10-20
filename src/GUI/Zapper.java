package GUI;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Zapper extends javax.swing.JFrame
{

    private Data.PaymentLogData cl;
    

    private String username;
    private String name;
    private int userLevel;
    
    private String password;
    

    public Zapper(String username, int userLevel) throws SQLException
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        lblUsernameHead = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmployeeLevel = new javax.swing.JLabel();
        lblUserLevelHead = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(66, 103, 178));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/zapper_3_600x600.png"))); // NOI18N

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

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDoneActionPerformed(evt);
            }
        });

        lblUsernameHead.setText("Username:");

        lblUsername.setText("lblUsername");

        lblEmployeeLevel.setText("lblUserlevel");

        lblUserLevelHead.setText("User Level:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevelHead)
                            .addComponent(lblUsernameHead))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblEmployeeLevel))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btnDone)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsernameHead)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserLevelHead)
                    .addComponent(lblEmployeeLevel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
       this.dispose();//Closes Main Menu
        try
        {
            new PaymentOptions(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens Payment Options Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDoneActionPerformed
    {//GEN-HEADEREND:event_btnDoneActionPerformed
       this.dispose();//Closes Main Menu
        try
        {
            new Checkout(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens Checkout Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnDoneActionPerformed

  
    public static void main(String args[])throws SQLException
    {
                new Zapper("JLP",4).setVisible(true);
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmployeeLevel;
    private javax.swing.JLabel lblUserLevelHead;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameHead;
    // End of variables declaration//GEN-END:variables
}
