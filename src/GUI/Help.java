package GUI;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Help extends javax.swing.JFrame
{
    //Declaration of Global variables
    String videoname;
    public Help(String filename, String videoname) //Parameterised constructor to initiate the class variables
    {
        initComponents();
        
        this.videoname = videoname;
        
        try
        {
            Scanner inputStream = new Scanner(new FileInputStream(filename)); //Connects to Textfile
            while (inputStream.hasNextLine()) //Checks if theres another line in the textfile
            {
                txaDisplay.append(inputStream.nextLine() + "\n"); //Displays the next line in the text area
            }
            inputStream.close(); //Disconnects from Textfile
        } catch (Exception e)
        {
            System.out.println(e.toString()); //Displays any errors
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        lblHelp = new javax.swing.JLabel();
        spDisplay = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        btnPlayVid = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnClose.setBackground(new java.awt.Color(66, 103, 178));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitbtn_30x30.png"))); // NOI18N
        btnClose.setToolTipText("Close the help menu");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        lblHelp.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblHelp.setForeground(new java.awt.Color(66, 103, 178));
        lblHelp.setText("Help:");

        txaDisplay.setEditable(false);
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaDisplay.setRows(5);
        spDisplay.setViewportView(txaDisplay);

        btnPlayVid.setBackground(new java.awt.Color(255, 255, 255));
        btnPlayVid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPlayVid.setForeground(new java.awt.Color(66, 103, 178));
        btnPlayVid.setText("Play Video");
        btnPlayVid.setToolTipText("Plays Help Video");
        btnPlayVid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 103, 178)));
        btnPlayVid.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPlayVidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278)
                        .addComponent(lblHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPlayVid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHelp))
                .addGap(18, 18, 18)
                .addComponent(spDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPlayVid, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
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
        this.dispose();  // closes help menu
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnPlayVidActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPlayVidActionPerformed
    {//GEN-HEADEREND:event_btnPlayVidActionPerformed
        try //plays a help video
        {
            Desktop.getDesktop().open(new File(videoname));

        } catch (Exception e)
        {

            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnPlayVidActionPerformed

    public static void main(String args[])
    {

        new Help("", "").setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPlayVid;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JScrollPane spDisplay;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
