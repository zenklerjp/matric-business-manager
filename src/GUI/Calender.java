package GUI;

import Data.CalenderData;
import Data.Validation;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Calender extends javax.swing.JFrame
{

    //Declaration of Global variables
    private Data.Validation v = new Validation();
    private Data.CalenderData pd;

    private String username;
    private int employeeLevel;

    SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");    // getting date format
    SimpleDateFormat timeForm = new SimpleDateFormat("HH:mm:ss");      // getting time format

    public Calender(String username, int employeeLevel) throws SQLException, ParseException
    {
        initComponents();

        this.username = username;
        this.employeeLevel = employeeLevel;

        lblUsername.setText(username);    //Gets and displays Username and Employee Level from previous screen
        lblUserlevel.setText("" + employeeLevel);

        pd = new CalenderData();

        pd.populateJTable(tblAppointments, 0); //Populates the Calender table

        populateDetails(); //Runs the populateDetails method to populate components on details panel
        
        dcDateOfAppointment.setMaxSelectableDate(new Date());     //Sets the max date for the date of birth date chooser to today 
        dcDateOfAppointment.getDateEditor().setEnabled(false);    //Disables the Date Editor

    }

    private void populateDetails() throws ParseException //Displays values from selected row in table into the text fields and check box
    {

        txfEventTitle.setText((String) tblAppointments.getValueAt(tblAppointments.getSelectedRow(), 0)); //Sets text of Event Title text field to the value of the first record in the selected row of the Patients table
        txfTime.setText("" + tblAppointments.getValueAt(tblAppointments.getSelectedRow(), 2)); //Sets text of Tiime of event text field to the value of the second record in the selected row of the Patients table

        dcDateOfAppointment.setDate(dateForm.parse("" + tblAppointments.getValueAt(tblAppointments.getSelectedRow(), 1))); //Sets date of Date of event date date chooser to the value of the eighth record in the selected row of the Patients table

    }

    private void navigation(boolean enabled)//Allows to enable or disable the table panel components 
    {
        tblAppointments.setEnabled(enabled);
        btnFirst.setEnabled(enabled);
        btnNext.setEnabled(enabled);
        btnPrevious.setEnabled(enabled);
        btnLast.setEnabled(enabled);
    }

    private void options(boolean enabled)//Allows to enable or disable the options panel components 
    {
        btnAdd.setEnabled(enabled);
        btnEdit.setEnabled(enabled);
        btnDelete.setEnabled(enabled);
    }

    public void details(boolean enabled)//Allows to enable or disable the details panel components 
    {

        txfEventTitle.setEnabled(enabled);
        txfTime.setEnabled(enabled);

        dcDateOfAppointment.setEnabled(enabled);
        dcDateOfAppointment.getDateEditor().setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblCalender = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        lblUserlevel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUsernameHead = new javax.swing.JLabel();
        lblUserLevelHead = new javax.swing.JLabel();
        pnlUserDetails = new javax.swing.JPanel();
        lblItemsHeading = new javax.swing.JLabel();
        dcDateOfAppointment = new com.toedter.calendar.JDateChooser();
        lblStartDate = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSaveNew = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblUsernameD1 = new javax.swing.JLabel();
        txfTime = new javax.swing.JTextField();
        lblUsernameD2 = new javax.swing.JLabel();
        txfEventTitle = new javax.swing.JTextField();
        pnlUserNav = new javax.swing.JPanel();
        spUsers = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
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

        lblCalender.setBackground(new java.awt.Color(255, 255, 255));
        lblCalender.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblCalender.setForeground(new java.awt.Color(66, 103, 178));
        lblCalender.setText("Calender:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

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

        lblUserlevel.setText("lblUserlevel");

        lblUsername.setText("lblUsername");

        lblUsernameHead.setText("Username:");

        lblUserLevelHead.setText("User Level:");

        pnlUserDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlUserDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblItemsHeading.setBackground(new java.awt.Color(255, 255, 255));
        lblItemsHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItemsHeading.setText("Appointment Options:");

        dcDateOfAppointment.setDateFormatString("dd/MM/yyyy");
        dcDateOfAppointment.setEnabled(false);

        lblStartDate.setText("Date:");

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("Add a new appointment to the system");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnSaveNew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSaveNew.setText("Save New");
        btnSaveNew.setToolTipText("Save new appointment to the system");
        btnSaveNew.setEnabled(false);
        btnSaveNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveNewActionPerformed(evt);
            }
        });

        btnSaveEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSaveEdit.setText("Save Edit");
        btnSaveEdit.setToolTipText("Save edits done on an appointment");
        btnSaveEdit.setEnabled(false);
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveEditActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setToolTipText("Edit an appointment on the system");
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Delete an appointment from the system");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("Cancels edition or addition");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelActionPerformed(evt);
            }
        });

        lblUsernameD1.setText("Time");

        txfTime.setEnabled(false);

        lblUsernameD2.setText("Event Title:");

        txfEventTitle.setEnabled(false);

        javax.swing.GroupLayout pnlUserDetailsLayout = new javax.swing.GroupLayout(pnlUserDetails);
        pnlUserDetails.setLayout(pnlUserDetailsLayout);
        pnlUserDetailsLayout.setHorizontalGroup(
            pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addComponent(lblItemsHeading)
                        .addGap(0, 247, Short.MAX_VALUE))
                    .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaveNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(btnSaveEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUsernameD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStartDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsernameD2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcDateOfAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfTime)
                            .addComponent(txfEventTitle))))
                .addContainerGap())
        );
        pnlUserDetailsLayout.setVerticalGroup(
            pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItemsHeading)
                .addGap(74, 74, 74)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsernameD2)
                    .addComponent(txfEventTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStartDate)
                    .addComponent(dcDateOfAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsernameD1)
                    .addComponent(txfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSaveNew))
                .addGap(26, 26, 26)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSaveEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(71, 71, 71))
        );

        pnlUserNav.setBackground(new java.awt.Color(255, 255, 255));
        pnlUserNav.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Event Title", "Date", "Time"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblAppointments.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblAppointmentsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblAppointmentsMouseReleased(evt);
            }
        });
        tblAppointments.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                tblAppointmentsKeyReleased(evt);
            }
        });
        spUsers.setViewportView(tblAppointments);

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFirst.setText("First");
        btnFirst.setToolTipText("Selects first row in table");
        btnFirst.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLast.setText("Last");
        btnLast.setToolTipText("Selects last row in table");
        btnLast.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLastActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.setToolTipText("Selects previous row in table");
        btnPrevious.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setText("Next");
        btnNext.setToolTipText("Selects next row in table");
        btnNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Appointments:");

        javax.swing.GroupLayout pnlUserNavLayout = new javax.swing.GroupLayout(pnlUserNav);
        pnlUserNav.setLayout(pnlUserNavLayout);
        pnlUserNavLayout.setHorizontalGroup(
            pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserNavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserNavLayout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnPrevious)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(spUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnlUserNavLayout.setVerticalGroup(
            pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserNavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(spUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCalender)
                        .addGap(307, 307, 307)
                        .addComponent(jLabel1))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevelHead)
                            .addComponent(lblUsernameHead))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblUserlevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(pnlUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlUserNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCalender))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlUserNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsernameHead)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserLevelHead)
                            .addComponent(lblUserlevel)))
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        this.dispose();//Closes this screen
        new MainMenu(lblUsername.getText().trim(), Integer.parseInt(lblUserlevel.getText().trim())).setVisible(true);//opens Main Menu and sends through Username and Employee Level
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new Help("CalenderHelp.txt", "HelpVideo.mp4").setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed

        options(false);
        details(true);

        btnCancel.setEnabled(true);
        btnSaveNew.setEnabled(true);
        btnEdit.setEnabled(false);

        txfEventTitle.setText("");
        dcDateOfAppointment.setDate(null);
        txfTime.setText("");

        txfEventTitle.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        navigation(false);

        options(false);

        details(true);

        btnSaveEdit.setEnabled(true);
        btnCancel.setEnabled(true);

        txfEventTitle.requestFocus();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        try
        {
            String eventTitle = txfEventTitle.getText().trim();
            //Asks user if they want to delete appointment
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete event " + eventTitle, "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == 0)
            {

                pd.deleteCalender(eventTitle);
                pd.populateJTable(tblAppointments, 0);
                populateDetails();

            }
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any errors
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveNewActionPerformed
    {//GEN-HEADEREND:event_btnSaveNewActionPerformed
        try //checks if all inputted values are valid for the addition
        {
            if (v.vStringAZ09spaceDash(txfEventTitle.getText().trim(), "Only Letters (A to Z), Digits (0 - 9), Space/s and Dash/es are allowed", "Event Title must have a Value"))//Checks if inputted value has a vlaue and is a letter, number space or dash
            {
                if (dcDateOfAppointment.getDate() != null)//checks that there is an inputted date
                {
                    if (v.vTimeString(txfTime.getText().trim(), ""))//checks that txfTime has an inoutted value
                    {

                        //Gets and stores all inputed data
                        String newDateOfApppointment = dateForm.format(dcDateOfAppointment.getDate()); //Formats the date value from the Date of event date chooser to the Simple Date Format
                        String newEventTitle = txfEventTitle.getText().trim();
                        String newEventTime = txfTime.getText().trim();

                        Data.Calender c = pd.getCalender(newEventTitle);

                        if (!c.getEvent().equalsIgnoreCase(newEventTitle))//Checks if the Event already exists in database
                        {
                            pd.addCalender2(newEventTitle, newDateOfApppointment, newEventTime //runs addCalender Method
                            );
                            pd.getAllCalender();
                            pd.populateJTable(tblAppointments, 0);//populates table with updates values
                            populateDetails();
                            //Reenables the navigation, search and options panel and disables the details panel
                            navigation(true);

                            options(true);
                            details(false);
                            //Redisabled the Save New and Cancel buttons and reenables Back button
                            btnSaveNew.setEnabled(false);
                            btnCancel.setEnabled(false);
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Event Title already exists in Database", "ERROR - Username Exists", JOptionPane.ERROR_MESSAGE);
                        }

                    } else
                    {
                        txfTime.setText(""); //If the data inputted in the time text field is invalid an error message will display
                        txfTime.requestFocus();

                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Date of Appointment must have a value"); //If the Date of Appointment date chooser has no value, an error message will display
                }
            } else
            {
                txfEventTitle.setText(""); //If the data inputted in the event title text field is invalid an error message will display
                txfEventTitle.requestFocus();
            }

        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any errors
            System.out.println("error");
        }
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveEditActionPerformed
    {//GEN-HEADEREND:event_btnSaveEditActionPerformed
        try
        {
            String eventTitle = txfEventTitle.getText().trim();
            String eventTime = txfTime.getText().trim();

            String eventDate = dateForm.format(dcDateOfAppointment.getDate());

            Data.Calender c = pd.getCalender(eventTitle);

                        
                            pd.editCalender(eventTitle, eventDate, eventTime //runs addCalender Method
                            );
                            pd.getAllCalender();
                            pd.populateJTable(tblAppointments, 0);//populates table with updates values
                            populateDetails();
                            //Reenables the navigation, search and options panel and disables the details panel
                            navigation(true);

                            options(true);
                            details(false);
                            //Redisabled the Save New and Cancel buttons and reenables Back button
                            btnSaveNew.setEnabled(false);
                            btnSaveEdit.setEnabled(false);
                            btnCancel.setEnabled(false);
                        
        } catch (Exception e)
        {
            System.out.println(e.toString());
            System.out.println("error");
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        navigation(true);

        options(true);
        details(false);

        btnSaveNew.setEnabled(false);
        btnCancel.setEnabled(false);
        btnSaveEdit.setEnabled(false);

        try
        {
            populateDetails();
        } catch (ParseException ex)
        {
            Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblAppointmentsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblAppointmentsMouseClicked
    {//GEN-HEADEREND:event_tblAppointmentsMouseClicked
        if (tblAppointments.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblAppointmentsMouseClicked

    private void tblAppointmentsMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblAppointmentsMouseReleased
    {//GEN-HEADEREND:event_tblAppointmentsMouseReleased
        if (tblAppointments.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblAppointmentsMouseReleased

    private void tblAppointmentsKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tblAppointmentsKeyReleased
    {//GEN-HEADEREND:event_tblAppointmentsKeyReleased
        if (tblAppointments.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblAppointmentsKeyReleased

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFirstActionPerformed
    {//GEN-HEADEREND:event_btnFirstActionPerformed
        if (tblAppointments.getSelectedRow() == 0)
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST User", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            tblAppointments.setRowSelectionInterval(0, 0);  //select the row
            tblAppointments.scrollRectToVisible(tblAppointments.getCellRect(0, 0, true)); //move the vertical scroll
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLastActionPerformed
    {//GEN-HEADEREND:event_btnLastActionPerformed
        if (tblAppointments.getSelectedRow() == tblAppointments.getRowCount() - 1)
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST User", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            tblAppointments.setRowSelectionInterval(tblAppointments.getRowCount() - 1, tblAppointments.getRowCount() - 1);     // select the row
            tblAppointments.scrollRectToVisible(tblAppointments.getCellRect(tblAppointments.getRowCount() - 1, 0, true));      // move the vertical scroll
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        if (tblAppointments.getSelectedRow() - 1 > -1)
        {
            tblAppointments.setRowSelectionInterval(tblAppointments.getSelectedRow() - 1, tblAppointments.getSelectedRow() - 1);      // select the row
            tblAppointments.scrollRectToVisible(tblAppointments.getCellRect(tblAppointments.getSelectedRow() - 1, 0, true));          // move the vertical scroll
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST User", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        if (tblAppointments.getSelectedRow() + 1 < tblAppointments.getRowCount())
        {
            tblAppointments.setRowSelectionInterval(tblAppointments.getSelectedRow() + 1, tblAppointments.getSelectedRow() + 1); //select the row
            tblAppointments.scrollRectToVisible(tblAppointments.getCellRect(tblAppointments.getSelectedRow() + 1, 0, true)); //move the vertical scroll
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST User", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    public static void main(String args[]) throws SQLException, ParseException
    {

        new Calender("JLP", 4).setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSaveEdit;
    private javax.swing.JButton btnSaveNew;
    private com.toedter.calendar.JDateChooser dcDateOfAppointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCalender;
    private javax.swing.JLabel lblItemsHeading;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblUserLevelHead;
    private javax.swing.JLabel lblUserlevel;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameD1;
    private javax.swing.JLabel lblUsernameD2;
    private javax.swing.JLabel lblUsernameHead;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlUserDetails;
    private javax.swing.JPanel pnlUserNav;
    private javax.swing.JScrollPane spUsers;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JTextField txfEventTitle;
    private javax.swing.JTextField txfTime;
    // End of variables declaration//GEN-END:variables
}
