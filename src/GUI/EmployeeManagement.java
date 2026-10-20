package GUI;

import Data.Validation;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmployeeManagement extends javax.swing.JFrame
{
//Declaration of Global variables

    private Data.EmployeesData ud;

    private Data.Validation v = new Data.Validation();

    private String username;
    private String password;

    private int employeeLevel;

    SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");    // getting date format
    SimpleDateFormat dateForm2 = new SimpleDateFormat("yyyy/MM/dd");    // getting date format

    public EmployeeManagement(String username, int employeeLevel) throws SQLException, ParseException //Parameterised constructor to generate the components for the JFrame
    {
        initComponents();

        this.username = username;
        this.password = password;

        this.employeeLevel = employeeLevel;

        lblUsername.setText(username);
        lblEmployeeLevel.setText("" + employeeLevel);

        ud = new Data.EmployeesData();
        ud.populateJTable(tblEmployees, 0);
        ud.populateJComboBox(cmbEmployeeLevel);

        dcDateOfEmployment.setMaxSelectableDate(new Date());     //Sets the max date for the date of birth date chooser to today 
        dcDateOfEmployment.getDateEditor().setEnabled(false);    //Disables the Date Editor

        populateDetails();

        spUsers.setWheelScrollingEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        lblEmployees = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblUsernameHead = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmployeeLevel = new javax.swing.JLabel();
        lblUserLevelHead = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pnlUserNav = new javax.swing.JPanel();
        spUsers = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        txfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbAll = new javax.swing.JRadioButton();
        rbUsername = new javax.swing.JRadioButton();
        rbName = new javax.swing.JRadioButton();
        rbEmployeeLevel = new javax.swing.JRadioButton();
        lblItemsHeading3 = new javax.swing.JLabel();
        btnResetTable = new javax.swing.JButton();
        pnlUserDetails = new javax.swing.JPanel();
        lblUsernameD = new javax.swing.JLabel();
        lblNameD = new javax.swing.JLabel();
        lblUserLevelD = new javax.swing.JLabel();
        lblPositionD = new javax.swing.JLabel();
        lblActivityStatusD = new javax.swing.JLabel();
        lblPasswordD = new javax.swing.JLabel();
        txfEmail = new javax.swing.JTextField();
        txfPassword = new javax.swing.JTextField();
        txfUsername = new javax.swing.JTextField();
        cbActivityStatus = new javax.swing.JCheckBox();
        lblItemsHeading = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txfPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txfLeave = new javax.swing.JTextField();
        lblPositionD1 = new javax.swing.JLabel();
        txfNameOfEmployee = new javax.swing.JTextField();
        lblPositionD2 = new javax.swing.JLabel();
        lblPositionD3 = new javax.swing.JLabel();
        dcDateOfEmployment = new com.toedter.calendar.JDateChooser();
        cmbEmployeeLevel = new javax.swing.JComboBox<>();
        txfPosition = new javax.swing.JTextField();
        txfIDNumber = new javax.swing.JTextField();
        pnlOptions = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblItemsHeading1 = new javax.swing.JLabel();
        btnSaveNew = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblEmployees.setBackground(new java.awt.Color(255, 255, 255));
        lblEmployees.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblEmployees.setForeground(new java.awt.Color(66, 103, 178));
        lblEmployees.setText("Employee Management:");

        btnBack.setBackground(new java.awt.Color(66, 103, 178));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbtn_3.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Return to the employee menu");
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

        lblEmployeeLevel.setText("lblUserLevel");

        lblUserLevelHead.setText("User Level:");

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

        pnlUserNav.setBackground(new java.awt.Color(255, 255, 255));
        pnlUserNav.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Username", "Password", "Name of Employee", "Employee Level", "Position", "DateOfEmployment", "ID Number", "Leave/Sick Days", "Email Address", "Phone Number", "Activity Status"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false, false
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
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblEmployeesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblEmployeesMouseReleased(evt);
            }
        });
        tblEmployees.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                tblEmployeesKeyReleased(evt);
            }
        });
        spUsers.setViewportView(tblEmployees);

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
        jLabel4.setText("Employee List");

        javax.swing.GroupLayout pnlUserNavLayout = new javax.swing.GroupLayout(pnlUserNav);
        pnlUserNav.setLayout(pnlUserNavLayout);
        pnlUserNavLayout.setHorizontalGroup(
            pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserNavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spUsers)
                    .addGroup(pnlUserNavLayout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserNavLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlUserNavLayout.setVerticalGroup(
            pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserNavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(spUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap())
        );

        pnlSearch.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setToolTipText("Search for selected radio button option");
        btnSearch.setEnabled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchActionPerformed(evt);
            }
        });

        rbAll.setBackground(new java.awt.Color(255, 255, 255));
        rbAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAll.setSelected(true);
        rbAll.setText("All");
        rbAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbAllActionPerformed(evt);
            }
        });

        rbUsername.setBackground(new java.awt.Color(255, 255, 255));
        rbUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbUsername.setText("Username");
        rbUsername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbUsernameActionPerformed(evt);
            }
        });

        rbName.setBackground(new java.awt.Color(255, 255, 255));
        rbName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbName.setText("Name");
        rbName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbNameActionPerformed(evt);
            }
        });

        rbEmployeeLevel.setBackground(new java.awt.Color(255, 255, 255));
        rbEmployeeLevel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbEmployeeLevel.setText("Employee Level");
        rbEmployeeLevel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbEmployeeLevelActionPerformed(evt);
            }
        });

        lblItemsHeading3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItemsHeading3.setText("SEARCH");

        btnResetTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnResetTable.setText("Reset");
        btnResetTable.setToolTipText("Reset table to show all employee data");
        btnResetTable.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnResetTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfSearch)
                            .addGroup(pnlSearchLayout.createSequentialGroup()
                                .addComponent(rbAll)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlSearchLayout.createSequentialGroup()
                                .addComponent(lblItemsHeading3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResetTable)))
                        .addContainerGap())
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbName)
                            .addComponent(rbEmployeeLevel)
                            .addComponent(rbUsername))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemsHeading3)
                    .addComponent(btnResetTable))
                .addGap(22, 22, 22)
                .addComponent(rbAll)
                .addGap(18, 18, 18)
                .addComponent(rbName)
                .addGap(18, 18, 18)
                .addComponent(rbEmployeeLevel)
                .addGap(18, 18, 18)
                .addComponent(rbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );

        pnlUserDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlUserDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblUsernameD.setText("Username:");

        lblNameD.setText("Password:");

        lblUserLevelD.setText("Name of Employee:");

        lblPositionD.setText("Employee Level:");

        lblActivityStatusD.setText("Activity Status:");

        lblPasswordD.setText("Email Address:");

        txfEmail.setEnabled(false);

        txfPassword.setEnabled(false);

        txfUsername.setEnabled(false);

        cbActivityStatus.setEnabled(false);

        lblItemsHeading.setBackground(new java.awt.Color(255, 255, 255));
        lblItemsHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItemsHeading.setText("Employee DETAILS");

        lblEmail.setText("Phone Number:");

        txfPhone.setEnabled(false);

        lblPhone.setText("Leave/Sick Days:");

        txfLeave.setEnabled(false);

        lblPositionD1.setText("Position:");

        txfNameOfEmployee.setBackground(new java.awt.Color(240, 240, 240));
        txfNameOfEmployee.setEnabled(false);

        lblPositionD2.setText("Date Of Employement:");

        lblPositionD3.setText("ID Number:");

        dcDateOfEmployment.setEnabled(false);
        dcDateOfEmployment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cmbEmployeeLevel.setEnabled(false);
        cmbEmployeeLevel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbEmployeeLevelActionPerformed(evt);
            }
        });

        txfPosition.setEditable(false);
        txfPosition.setEnabled(false);

        txfIDNumber.setEnabled(false);

        javax.swing.GroupLayout pnlUserDetailsLayout = new javax.swing.GroupLayout(pnlUserDetails);
        pnlUserDetails.setLayout(pnlUserDetailsLayout);
        pnlUserDetailsLayout.setHorizontalGroup(
            pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblItemsHeading)
                            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                .addComponent(lblUsernameD)
                                .addGap(71, 71, 71)
                                .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(lblNameD)))
                        .addGap(18, 18, 18)
                        .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasswordD)
                            .addComponent(lblEmail)
                            .addComponent(lblPhone))
                        .addGap(41, 41, 41)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                .addComponent(txfLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblActivityStatusD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbActivityStatus)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txfPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPositionD)
                            .addComponent(lblPositionD2)
                            .addComponent(lblPositionD3)
                            .addComponent(lblUserLevelD))
                        .addGap(14, 14, 14)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfNameOfEmployee, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetailsLayout.createSequentialGroup()
                                .addComponent(cmbEmployeeLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(44, 44, 44)
                                .addComponent(lblPositionD1)
                                .addGap(18, 18, 18)
                                .addComponent(txfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dcDateOfEmployment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfIDNumber))))
                .addContainerGap())
        );
        pnlUserDetailsLayout.setVerticalGroup(
            pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblItemsHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsernameD)
                    .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameD)
                    .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserLevelD)
                    .addComponent(txfNameOfEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositionD1)
                    .addComponent(lblPositionD)
                    .addComponent(cmbEmployeeLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPositionD2)
                    .addComponent(dcDateOfEmployment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPositionD3)
                    .addComponent(txfIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordD))
                .addGap(12, 12, 12)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbActivityStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActivityStatusD)
                    .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPhone)
                        .addComponent(txfLeave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOptions.setBackground(new java.awt.Color(255, 255, 255));
        pnlOptions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("Add a new employee to the system");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setToolTipText("Edit a employee on the system");
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Delete an employee from the system");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        lblItemsHeading1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItemsHeading1.setText("OPTIONS");

        btnSaveNew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSaveNew.setText("Save New");
        btnSaveNew.setToolTipText("Save new Employee to the system");
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
        btnSaveEdit.setToolTipText("Save edits done on Employee");
        btnSaveEdit.setEnabled(false);
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveEditActionPerformed(evt);
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

        javax.swing.GroupLayout pnlOptionsLayout = new javax.swing.GroupLayout(pnlOptions);
        pnlOptions.setLayout(pnlOptionsLayout);
        pnlOptionsLayout.setHorizontalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblItemsHeading1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSaveNew, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveEdit)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOptionsLayout.setVerticalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItemsHeading1)
                .addGap(27, 27, 27)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlBgLayout.createSequentialGroup()
                            .addComponent(lblEmployees)
                            .addGap(201, 201, 201)
                            .addComponent(jLabel3))
                        .addComponent(pnlUserNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(lblUserLevelHead)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmployeeLevel))
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(lblUsernameHead)
                                .addGap(20, 20, 20)
                                .addComponent(lblUsername))
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(pnlUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBgLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(846, Short.MAX_VALUE)))
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmployees)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlUserNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlUserDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsernameHead)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserLevelHead)
                            .addComponent(lblEmployeeLevel)))
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBgLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(614, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void populateDetails() throws ParseException //Displays values from selected row in table into the text fields and check box
    {
        txfUsername.setText("" + tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 0));
        txfPassword.setText("" + tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 1));
        txfNameOfEmployee.setText("" + tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 2));
        cmbEmployeeLevel.setSelectedItem(tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 3));

        txfPosition.setText("" + tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 4));
        dcDateOfEmployment.setDate(dateForm.parse((String)tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 5)));
        txfIDNumber.setText("" + tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 6));
        txfLeave.setText("" + tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 7));
        txfEmail.setText("" + tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 8));
        txfPhone.setText("" + tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 9));

        if (((boolean) tblEmployees.getValueAt(tblEmployees.getSelectedRow(), 10)) == true)
        {
            cbActivityStatus.setSelected(true);
            cbActivityStatus.setText("Enabled");
        } else
        {
            cbActivityStatus.setEnabled(false);
            cbActivityStatus.setText("Disabled");
        }

    }

    private void navigation(boolean enabled) //Allows to enable or disable the table panel components 
    {
        tblEmployees.setEnabled(enabled);
        btnFirst.setEnabled(enabled);
        btnNext.setEnabled(enabled);
        btnPrevious.setEnabled(enabled);
        btnLast.setEnabled(enabled);
    }

    private void search(boolean enabled) //Allows to enable or disable the search panel components 
    {
        rbAll.setEnabled(enabled);
        rbUsername.setEnabled(enabled);
        rbEmployeeLevel.setEnabled(enabled);
        rbName.setEnabled(enabled);
        if (rbUsername.isSelected() || rbEmployeeLevel.isSelected()) //checks if certain radio buttons are selected and sets the enabledness of the Search button to the rest of the search panel
        {
            btnSearch.setEnabled(enabled);
        }
    }

    private void options(boolean enabled) // Allows to enable or disable the options panel components 
    {
        btnAdd.setEnabled(enabled);
        btnEdit.setEnabled(enabled);
        btnDelete.setEnabled(enabled);
    }

    public void details(boolean enabled) //Allows to enable or disable the details panel components 
    {
        txfLeave.setEnabled(enabled);
        cmbEmployeeLevel.setEnabled(enabled);
        txfPosition.setEnabled(enabled);
        txfUsername.setEnabled(enabled);
        txfEmail.setEnabled(enabled);
        txfPassword.setEnabled(enabled);
        txfNameOfEmployee.setEnabled(enabled);
        txfPhone.setEnabled(enabled);
        dcDateOfEmployment.setEnabled(enabled);
        dcDateOfEmployment.getDateEditor().setEnabled(false);

        txfIDNumber.setEnabled(enabled);
        cbActivityStatus.setEnabled(enabled);

    }

    private void searchPopulate() throws ParseException //populates table and text fields by what has been searched
    {
        ud.populateJTable(tblEmployees, 0);

        if (tblEmployees.getRowCount() == 0)//if there are no values for the search set the text field to nothing and display an error
        {
            //Set the values of the Details' panel's componets (text fields, date choooser, combo box and check box) to nothing
            txfUsername.setText("");
            txfEmail.setText("");
            txfPassword.setText("");
            txfNameOfEmployee.setText("");
            txfPhone.setText("");

            txfLeave.setText("");
            dcDateOfEmployment.setDate(null);
            txfIDNumber.setText("");
            cbActivityStatus.setSelected(false);

            JOptionPane.showMessageDialog(null, "No Employees were found", "Search Failed", JOptionPane.INFORMATION_MESSAGE);
            txfSearch.setText("");
            txfSearch.requestFocus();
        } else
        {
            populateDetails();
        }
    }


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        this.dispose();//Closes this screen
        try
        {
            new EmployeeMenu(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens employee menu Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new Help("EmployeeManagementHelp.txt", "HelpVideo.mp4").setVisible(true);//opens help scren
    }//GEN-LAST:event_btnHelpActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblEmployeesMouseClicked
    {//GEN-HEADEREND:event_tblEmployeesMouseClicked
        if (tblEmployees.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void tblEmployeesMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblEmployeesMouseReleased
    {//GEN-HEADEREND:event_tblEmployeesMouseReleased
        if (tblEmployees.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblEmployeesMouseReleased

    private void tblEmployeesKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tblEmployeesKeyReleased
    {//GEN-HEADEREND:event_tblEmployeesKeyReleased
        if (tblEmployees.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblEmployeesKeyReleased

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFirstActionPerformed
    {//GEN-HEADEREND:event_btnFirstActionPerformed
        if (tblEmployees.getSelectedRow() == 0)//selects the first row in the table
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST User", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            try
            {
                tblEmployees.setRowSelectionInterval(0, 0);  //select the row
                tblEmployees.scrollRectToVisible(tblEmployees.getCellRect(0, 0, true)); //move the vertical scroll
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLastActionPerformed
    {//GEN-HEADEREND:event_btnLastActionPerformed
        try//selects the last row in the table
        {
            tblEmployees.setRowSelectionInterval((tblEmployees.getRowCount() - 1), (tblEmployees.getRowCount() - 1)); //Moves/Selects to last cell
            tblEmployees.scrollRectToVisible(tblEmployees.getCellRect((tblEmployees.getRowCount() - 1), 0, true)); //Moves scroll bar to the bottom
            populateDetails();
        } catch (ParseException ex)
        {
            System.out.println(ex.toString());//Displays any errors
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        try//selects the previous row in the table
        {
            if ((tblEmployees.getSelectedRow() - 1) > -1)
            {
                tblEmployees.setRowSelectionInterval((tblEmployees.getSelectedRow() - 1), (tblEmployees.getSelectedRow() - 1)); //Moves/Selects to previous cell
                tblEmployees.scrollRectToVisible(tblEmployees.getCellRect((tblEmployees.getSelectedRow() - 1), 0, true)); //Moves scroll bar in proportion to cell change
                populateDetails();
            } else
            {
                JOptionPane.showMessageDialog(null, "Currently displaying First patient", "ERROR - Invalid Interval", JOptionPane.ERROR_MESSAGE); //If the first cell was already selected, displays an error message stating that it is the first cell
            }
        } catch (ParseException ex)
        {
            System.out.println(ex.toString());//Displays any errors
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        try//selects the new row in the table
        {
            if ((tblEmployees.getSelectedRow() + 1) < tblEmployees.getRowCount())
            {
                tblEmployees.setRowSelectionInterval((tblEmployees.getSelectedRow() + 1), (tblEmployees.getSelectedRow() + 1)); //Moves/Selects to previous cell
                tblEmployees.scrollRectToVisible(tblEmployees.getCellRect((tblEmployees.getSelectedRow() + 1), 0, true)); //Moves scroll bar in proportion to cell change
                populateDetails();
            } else
            {
                JOptionPane.showMessageDialog(null, "Currently displaying Last Patient", "ERROR - Invalid Interval", JOptionPane.ERROR_MESSAGE);//If the last cell was already selected, displays an error message stating that it is the last cell
            }
        } catch (ParseException ex)
        {
            System.out.println(ex.toString());//Displays any errors
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        try
        {
            if (rbUsername.isSelected())                   // search for username
            {
                ud.getAllEmployees(txfSearch.getText().trim());
                searchPopulate();
            } else
            {
                if (rbName.isSelected())                   // search for name of employee
                {
                    ud.getAllEmployeesN(txfSearch.getText().trim());
                    searchPopulate();
                } else
                {
                    if (rbEmployeeLevel.isSelected() && v.vInteger(txfSearch.getText().trim(), "Invalid User Level.  User Level must be an Integer"))// search for user level - only allowed to input int
                    {
                        if (Integer.parseInt(txfSearch.getText().trim()) > 0 && Integer.parseInt(txfSearch.getText().trim()) <= 4)  // makes sure entered int is either 1 or 2 or 3 or 4 ONLY
                        {
                            ud.getAllEmployeesEL(txfSearch.getText().trim());
                            searchPopulate();
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "User Level can only be an integer from 1 to 4!", "ERROR", JOptionPane.ERROR_MESSAGE);
                            txfSearch.setText("");
                            txfSearch.requestFocus();
                        }
                    } else
                    {
                        txfSearch.setText("");
                        txfSearch.requestFocus();
                    }
                }
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rbAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbAllActionPerformed
    {//GEN-HEADEREND:event_rbAllActionPerformed
        try
        {
            rbName.setSelected(false);
            rbEmployeeLevel.setSelected(false);
            rbUsername.setSelected(false);

            txfSearch.setEnabled(false);
            btnSearch.setEnabled(false);
            txfSearch.setText("");
            ud.getAllEmployees();
            ud.populateJTable(tblEmployees, 0);
            populateDetails();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_rbAllActionPerformed

    private void rbUsernameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbUsernameActionPerformed
    {//GEN-HEADEREND:event_rbUsernameActionPerformed
        rbName.setSelected(false);
        rbEmployeeLevel.setSelected(false);
        rbAll.setSelected(false);

        txfSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbUsernameActionPerformed

    private void rbNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbNameActionPerformed
    {//GEN-HEADEREND:event_rbNameActionPerformed
        rbAll.setSelected(false);
        rbEmployeeLevel.setSelected(false);
        rbUsername.setSelected(false);

        txfSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbNameActionPerformed

    private void rbEmployeeLevelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbEmployeeLevelActionPerformed
    {//GEN-HEADEREND:event_rbEmployeeLevelActionPerformed
        rbName.setSelected(false);
        rbAll.setSelected(false);
        rbUsername.setSelected(false);

        txfSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbEmployeeLevelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        //Disables table, option and search panels and enables details panel
        navigation(false);
        options(false);
        search(false);
        details(true);

        //Enables Save New and Cancel buttons and disables Consultations and Back buttons
        btnSaveNew.setEnabled(true);
        btnCancel.setEnabled(true);

        btnBack.setEnabled(false);
        //Sets all Details panel components' values to nothing

        txfUsername.setText("");
        txfPassword.setText("");
        txfNameOfEmployee.setText("");
        cmbEmployeeLevel.setSelectedIndex(-1);
        txfPosition.setText("");
        dcDateOfEmployment.setDate(null);

        txfIDNumber.setText("");
        txfLeave.setText("");
        txfEmail.setText("");
        txfPhone.setText("");
        cbActivityStatus.setSelected(false);

        txfUsername.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        //Disables table, option and search panels and enables details panel
        navigation(false);
        options(false);
        search(false);
        details(true);
        //Enables Save Edit and Cancel buttons and disables Consultations and Back buttons
        btnSaveEdit.setEnabled(true);
        btnCancel.setEnabled(true);

        btnBack.setEnabled(false);

        txfUsername.requestFocus();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        try
        {
            String username = txfUsername.getText().trim();
            //Asks user if they want to delete patient
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete Patient " + username + ": " + txfUsername.getText().trim(), "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == 0)
            {

                ud.deleteEmployee(username); //If the patient has no consultations then the patient is deleted
                ud.populateJTable(tblEmployees, 0);
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
            if (v.vStringAZ09spaceDash(txfUsername.getText().trim(), "Username must have a Value", "Only Letters (A to Z), Digits (0 - 9), Space/s and Dash/es are allowed")) //Checks if the username text field, contains a value and is a letter space of dash
            {
                if (v.vString09(txfPassword.getText().trim(), "Password must have a Value", "Only Digits are allowed")) //Checks if the First Name text field, contains a value and is a digit
                {
                    if (v.vStringAZspace(txfNameOfEmployee.getText().trim(), "Name of employee must have a Value", "")) //Checks if the name OF employee text field, contains a value and is a letter or space
                    {
                        if (cmbEmployeeLevel.getSelectedItem() != null) //Checks if the EmployeeLevel combo box has a value) 
                        {
                            if (v.vString09range(txfIDNumber.getText().trim(), "ID Number must only consist of digits", "ID Number must have a value", "", 13)) //Checks if the IDNUMBER text field, contains a value and is 13 digits long
                            {

                                if (dcDateOfEmployment.getDate() != null) //Checks if the Date of Birth date chooser has a value
                                {
                                    if (v.vString09range(txfPhone.getText().trim(), "Phone Number must only consist of digits", "Phone number must have a value", "", 10)) //Checks if the Phone Number text field, contains a value 
                                    {

                                        if (v.vEmail(txfEmail.getText().trim(), "Client Email must have a Value")) //Checks if the Email text field, contains a value 
                                        {

                                            if (v.vString09(txfLeave.getText().trim(), "", ""))
                                            {
                                                //Adds new Client to database
                                                String newUsername = txfUsername.getText().trim();    //Gets and stores all inputted data
                                                String newPassword = txfPassword.getText().trim();
                                                String newDateOfEmployment = dateForm.format(dcDateOfEmployment.getDate()); //Formats the date value from the Date of Birth date chooser to the format 'dd/MM/yyyy'

                                                String newNameOfEmployee = txfNameOfEmployee.getText().trim();
                                                String newEmpLevel = "" + cmbEmployeeLevel.getSelectedItem();
                                                String newPosition = txfPosition.getText().trim();
                                                String newIDNumber = txfIDNumber.getText().trim();
                                                String newEmail = txfEmail.getText().trim();
                                                String newPhone = txfPhone.getText().trim();
                                                String newLeave = txfLeave.getText().trim();
                                                System.out.println( newLeave);

                                                boolean newActivityStatus = cbActivityStatus.isSelected();

                                                Data.Employees e = ud.getEmployee(newUsername); //Makes an object of the Clients class

                                                if (!e.getUsername().equalsIgnoreCase(newUsername))//Checks if the username already exists in database
                                                {
                                                    ud.addEmployee2(newUsername, newPassword, newNameOfEmployee, newEmpLevel, newPosition, newDateOfEmployment, //Runs addEmployee to add the new employee to the database
                                                            newIDNumber, newLeave, newEmail, newPhone, newActivityStatus);
                                                    ud.getAllEmployees();
                                                    ud.populateJTable(tblEmployees, 0); //Populates table with updates values
                                                    populateDetails();
                                                    //Reenables the navigation, search and options panel and disables the details panel
                                                    navigation(true);
                                                    search(true);
                                                    options(true);
                                                    details(false);
                                                    //Redisabled the Save New and Cancel buttons and reenables the Consultations and Back button
                                                    btnSaveNew.setEnabled(false);
                                                    btnCancel.setEnabled(false);

                                                    btnBack.setEnabled(true);
                                                } else
                                                {
                                                    JOptionPane.showMessageDialog(null, "Employee already exists in Database", "ERROR - Patient Exists", JOptionPane.ERROR_MESSAGE); //Displays error message if Employee already exists in database
                                                }

                                            } else
                                            {
                                                txfLeave.setText(""); //If the data inputted in the leave/sick days text field is invalid an error message will display
                                                txfLeave.requestFocus();
                                            }

                                        } else
                                        {
                                            txfEmail.setText(""); //If the data inputted in the email text field is invalid an error message will display
                                            txfEmail.requestFocus();
                                        }

                                    } else
                                    {
                                        txfPhone.setText(""); //If the data inputted in the phone number text field is invalid an error message will display
                                        txfPhone.requestFocus();
                                    }
                                } else
                                {
                                    JOptionPane.showMessageDialog(null, "Date of Employment must have a value"); //If the Date of Employment date chooser has no value, an error message will display
                                }

                            } else
                            {
                                txfIDNumber.setText(""); //If the data inputted in the IDNumber text field is invalid an error message will display
                                txfIDNumber.requestFocus();
                            }
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "EmployeeLevel must have a value"); //If the EmployeeLevel combo box has no value, an error message will display
                        }
                    } else
                    {
                        txfNameOfEmployee.setText(""); //If the data inputted in the name of employee text field is invalid an error message will display
                        txfNameOfEmployee.requestFocus();
                    }
                } else
                {
                    txfPassword.setText(""); //If the data inputted in the password text field is invalid an error message will display
                    txfPassword.requestFocus();
                }
            } else
            {
                txfUsername.setText(""); //If the data inputted in the username text field is invalid an error message will display
                txfUsername.requestFocus();
            }

        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any errors
        }

     

    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveEditActionPerformed
    {//GEN-HEADEREND:event_btnSaveEditActionPerformed
        try //checks if all inputted values are valid for the addition
        {
            if (v.vStringAZ09spaceDash(txfUsername.getText().trim(), "Username must have a Value", "Only Letters (A to Z), Digits (0 - 9), Space/s and Dash/es are allowed")) //Checks if the username text field, contains a value and is a letter space of dash
            {
                if (v.vString09(txfPassword.getText().trim(), "Password must have a Value", "Only Digits are allowed")) //Checks if the First Name text field, contains a value and is a digit
                {
                    if (v.vStringAZspace(txfNameOfEmployee.getText().trim(), "Name of employee must have a Value", "")) //Checks if the name OF employee text field, contains a value and is a letter or space
                    {
                        if (cmbEmployeeLevel.getSelectedItem() != null) //Checks if the EmployeeLevel combo box has a value) 
                        {
                            if (v.vString09range(txfIDNumber.getText().trim(), "ID Number must only consist of digits", "ID Number must have a value", "", 13)) //Checks if the IDNUMBER text field, contains a value and is 13 digits long
                            {

//                                if (dcDateOfEmployment.getDate() != null) //Checks if the Date of Birth date chooser has a value
//                                {
                                    if (v.vString09range(txfPhone.getText().trim(), "Phone Number must only consist of digits", "Phone number must have a value", "", 10)) //Checks if the Phone Number text field, contains a value 
                                    {

                                        if (v.vEmail(txfEmail.getText().trim(), "Client Email must have a Value")) //Checks if the Email text field, contains a value 
                                        {

                                            if (v.vString09(txfLeave.getText().trim(), "", ""))
                                            {
                                                //Adds new Client to database
                                                String updatedUsername = txfUsername.getText().trim();    //Gets and stores all inputted data
                                                String updatedPassword = txfPassword.getText().trim();
                                               String updatedDateOfEmployment = dateForm.format(dcDateOfEmployment.getDate()); //Formats the date value from the Date of employment date chooser to the format 'yyyy-MM-dd'
                                                

                                                String updatedNameOfEmployee = txfNameOfEmployee.getText().trim();
                                                String updatedEmpLevel = "" + cmbEmployeeLevel.getSelectedItem();
                                                String updatedPosition = txfPosition.getText().trim();
                                                String updatedIDNumber = txfIDNumber.getText().trim();
                                                String updatedEmail = txfEmail.getText().trim();
                                                String updatedPhone = txfPhone.getText().trim();
                                                String updatedLeave = txfLeave.getText().trim();
                                                System.out.println( updatedDateOfEmployment);

                                                boolean updatedActivityStatus = cbActivityStatus.isSelected();

                                                Data.Employees e = ud.getEmployee(updatedUsername); //Makes an object of the Employees class

                                                ud.editEmployee(updatedUsername, updatedPassword, updatedNameOfEmployee, updatedEmpLevel, updatedPosition,updatedDateOfEmployment,  //Runs editEmployee to add the new edited employee to the database
                                                        updatedIDNumber, updatedLeave, updatedEmail, updatedPhone, updatedActivityStatus);
                                                ud.getAllEmployees();
                                                ud.populateJTable2(tblEmployees); //Populates table with updates values
                                                populateDetails();
                                                //Reenables the navigation, search and options panel and disables the details panel
                                                navigation(true);
                                                search(true);
                                                options(true);
                                                details(false);
                                                //Redisabled the Save edit and Cancel buttons and reenables the Consultations and Back button
                                                btnSaveEdit.setEnabled(false);
                                                btnCancel.setEnabled(false);

                                                btnBack.setEnabled(true);

                                            } else
                                            {
                                                txfLeave.setText(""); //If the data inputted in the Leave/sick days text field is invalid an error message will display
                                                txfLeave.requestFocus();
                                            }

                                        } else
                                        {
                                            txfEmail.setText(""); //If the data inputted in the email text field is invalid an error message will display
                                            txfEmail.requestFocus();
                                        }

                                    } else
                                    {
                                        txfPhone.setText(""); //If the data inputted in the phone number text field is invalid an error message will display
                                        txfPhone.requestFocus();
                                    }
                                

                            } else
                            {
                                txfIDNumber.setText(""); //If the data inputted in the IDNumber text field is invalid an error message will display
                                txfIDNumber.requestFocus();
                            }
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "EmployeeLevel must have a value"); //If the EmployeeLevel combo box has no value, an error message will display
                        }
                    } else
                    {
                        txfNameOfEmployee.setText(""); //If the data inputted in the name of employee text field is invalid an error message will display
                        txfNameOfEmployee.requestFocus();
                    }
                } else
                {
                    txfPassword.setText(""); //If the data inputted in the password text field is invalid an error message will display
                    txfPassword.requestFocus();
                }
            } else
            {
                txfUsername.setText(""); //If the data inputted in the username text field is invalid an error message will display
                txfUsername.requestFocus();
            }

        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any errors
            
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        //Enables table, option and search panels and disables details panel
        navigation(true);
        options(true);
        search(true);
        details(false);
        //Disables Save New, Save Edit and Cancel buttons and enables Consultations and Back buttons
        btnSaveNew.setEnabled(false);
        btnSaveEdit.setEnabled(false);
        btnCancel.setEnabled(false);

        btnBack.setEnabled(true);

        try
        {
            populateDetails();
        } catch (ParseException ex)
        {
            System.out.println(ex.toString());//Displays any errors
        }

    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbEmployeeLevelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbEmployeeLevelActionPerformed
    {//GEN-HEADEREND:event_cmbEmployeeLevelActionPerformed
        if (cmbEmployeeLevel.getSelectedIndex() == 0)           // allocates position according to user level
        {
            txfPosition.setText("Floor Staff");
        } else
        {
            if (cmbEmployeeLevel.getSelectedIndex() == 1)
            {
                txfPosition.setText("Team Leader");
            } else
            {
                if (cmbEmployeeLevel.getSelectedIndex() == 2)
                {
                    txfPosition.setText("Manager");
                } else
                {
                    txfPosition.setText("Owner");
                }
            }
        }
    }//GEN-LAST:event_cmbEmployeeLevelActionPerformed

    private void btnResetTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResetTableActionPerformed
    {//GEN-HEADEREND:event_btnResetTableActionPerformed
        try//resets the table to dispay original data
        {
            ud.getAllEmployees();
            ud.populateJTable(tblEmployees, 0);
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnResetTableActionPerformed

    public static void main(String args[]) throws SQLException, ParseException //Displays Employee Management screen
    {

        new EmployeeManagement("JLP", 4).setVisible(true);

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
    private javax.swing.JButton btnResetTable;
    private javax.swing.JButton btnSaveEdit;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox cbActivityStatus;
    private javax.swing.JComboBox<String> cmbEmployeeLevel;
    private com.toedter.calendar.JDateChooser dcDateOfEmployment;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblActivityStatusD;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeLevel;
    private javax.swing.JLabel lblEmployees;
    private javax.swing.JLabel lblItemsHeading;
    private javax.swing.JLabel lblItemsHeading1;
    private javax.swing.JLabel lblItemsHeading3;
    private javax.swing.JLabel lblNameD;
    private javax.swing.JLabel lblPasswordD;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPositionD;
    private javax.swing.JLabel lblPositionD1;
    private javax.swing.JLabel lblPositionD2;
    private javax.swing.JLabel lblPositionD3;
    private javax.swing.JLabel lblUserLevelD;
    private javax.swing.JLabel lblUserLevelHead;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameD;
    private javax.swing.JLabel lblUsernameHead;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlUserDetails;
    private javax.swing.JPanel pnlUserNav;
    private javax.swing.JRadioButton rbAll;
    private javax.swing.JRadioButton rbEmployeeLevel;
    private javax.swing.JRadioButton rbName;
    private javax.swing.JRadioButton rbUsername;
    private javax.swing.JScrollPane spUsers;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfIDNumber;
    private javax.swing.JTextField txfLeave;
    private javax.swing.JTextField txfNameOfEmployee;
    private javax.swing.JTextField txfPassword;
    private javax.swing.JTextField txfPhone;
    private javax.swing.JTextField txfPosition;
    private javax.swing.JTextField txfSearch;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
