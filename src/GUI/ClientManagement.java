package GUI;

import java.text.ParseException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Data.ClientsData;
import Data.Validation;

public class ClientManagement extends javax.swing.JFrame
{

    //Declaration of Global variables
    private Data.ClientsData cd;

    private Data.Validation v = new Data.Validation();

    private String username;
    private int employeeLevel;
    private String password;

    private SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");            // getting date format
    private SimpleDateFormat dateForm2 = new SimpleDateFormat("yyyy/MM/dd");            // getting date format

    public ClientManagement(String username, int employeeLevel) throws SQLException, ParseException
    {
        initComponents();

        this.username = username;

        this.employeeLevel = employeeLevel;
        this.password = password;

        lblUsername.setText(username);
        lblUserLevel.setText("" + employeeLevel);

        cd = new ClientsData();
        cd.populateJTable(tblClients, 0);

        dcDateOfAssessment.setMaxSelectableDate(new Date());     //Sets the max date for the date of birth date chooser to today 
        dcDateOfAssessment.getDateEditor().setEnabled(false);    //Disables the Date Editor
        dcDateFinalRepReceived.setMaxSelectableDate(new Date());     //Sets the max date for the date of birth date chooser to today 
        dcDateFinalRepReceived.getDateEditor().setEnabled(false);    //Disables the Date Editor

        populateDetails();

        spUsers.setWheelScrollingEnabled(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        lblClientManagement = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblUsernameHead = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserLevel = new javax.swing.JLabel();
        lblUserLevelHead = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        pnlUserNav = new javax.swing.JPanel();
        spUsers = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblClientListHeader = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        txfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbAll = new javax.swing.JRadioButton();
        rbReportStartedBy = new javax.swing.JRadioButton();
        rbClientRef = new javax.swing.JRadioButton();
        rbClientName = new javax.swing.JRadioButton();
        lblItemsHeading3 = new javax.swing.JLabel();
        btnResetTable = new javax.swing.JButton();
        pnlUserDetails = new javax.swing.JPanel();
        lblUsernameD = new javax.swing.JLabel();
        lblNameD = new javax.swing.JLabel();
        lblUserLevelD = new javax.swing.JLabel();
        lblPositionD = new javax.swing.JLabel();
        lblActivityStatusD = new javax.swing.JLabel();
        lblPasswordD = new javax.swing.JLabel();
        txfRepsOnHand = new javax.swing.JTextField();
        txfClientName = new javax.swing.JTextField();
        txfClientReference = new javax.swing.JTextField();
        cbInvoice = new javax.swing.JCheckBox();
        lblItemsHeading = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txfRepStartedBy = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txfOccupationPreAcc = new javax.swing.JTextField();
        cbReportSent = new javax.swing.JCheckBox();
        lblActivityStatusD1 = new javax.swing.JLabel();
        lblPasswordD1 = new javax.swing.JLabel();
        txfEmail = new javax.swing.JTextField();
        dcDateOfAssessment = new com.toedter.calendar.JDateChooser();
        dcDateFinalRepReceived = new com.toedter.calendar.JDateChooser();
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

        lblClientManagement.setBackground(new java.awt.Color(255, 255, 255));
        lblClientManagement.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblClientManagement.setForeground(new java.awt.Color(66, 103, 178));
        lblClientManagement.setText("Client Management:");

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

        lblUsernameHead.setText("Username:");

        lblUsername.setText("lblUsername");

        lblUserLevel.setText("lblUserLevel");

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

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

        pnlUserNav.setBackground(new java.awt.Color(255, 255, 255));
        pnlUserNav.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Client Reference", "Client Name", "Date of Assessment", "Date Final Report Received", "Reports on Hand", "Report Started By", "Occupation Pre Accident", "InvoicePaid", "ReportSent", "Client Email Address"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false
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
        tblClients.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblClientsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblClientsMouseReleased(evt);
            }
        });
        tblClients.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                tblClientsKeyReleased(evt);
            }
        });
        spUsers.setViewportView(tblClients);

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

        lblClientListHeader.setBackground(new java.awt.Color(255, 255, 255));
        lblClientListHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClientListHeader.setText("Client List");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserNavLayout.createSequentialGroup()
                        .addComponent(lblClientListHeader)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlUserNavLayout.setVerticalGroup(
            pnlUserNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserNavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClientListHeader)
                .addGap(18, 18, 18)
                .addComponent(spUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
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

        rbReportStartedBy.setBackground(new java.awt.Color(255, 255, 255));
        rbReportStartedBy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbReportStartedBy.setText("Report Started By");
        rbReportStartedBy.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbReportStartedByActionPerformed(evt);
            }
        });

        rbClientRef.setBackground(new java.awt.Color(255, 255, 255));
        rbClientRef.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbClientRef.setText("Client Reference");
        rbClientRef.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbClientRefActionPerformed(evt);
            }
        });

        rbClientName.setBackground(new java.awt.Color(255, 255, 255));
        rbClientName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbClientName.setText("Client Name");
        rbClientName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbClientNameActionPerformed(evt);
            }
        });

        lblItemsHeading3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItemsHeading3.setText("SEARCH");

        btnResetTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnResetTable.setText("Reset");
        btnResetTable.setToolTipText("Reset table to show all sale history");
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
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfSearch)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAll)
                            .addComponent(rbClientRef)
                            .addComponent(rbReportStartedBy)
                            .addComponent(rbClientName))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(lblItemsHeading3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(btnResetTable)))
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblItemsHeading3)
                    .addComponent(btnResetTable))
                .addGap(27, 27, 27)
                .addComponent(rbAll)
                .addGap(18, 18, 18)
                .addComponent(rbClientRef)
                .addGap(18, 18, 18)
                .addComponent(rbClientName)
                .addGap(18, 18, 18)
                .addComponent(rbReportStartedBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(12, 12, 12))
        );

        pnlUserDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlUserDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblUsernameD.setText("Client Reference:");

        lblNameD.setText("Client Name:");

        lblUserLevelD.setText("Date of Assessment:");

        lblPositionD.setText("Date Final Report Received:");

        lblActivityStatusD.setText("Invoice Paid:");

        lblPasswordD.setText("Reports on Hand:");

        txfRepsOnHand.setEnabled(false);

        txfClientName.setEnabled(false);

        txfClientReference.setEnabled(false);

        cbInvoice.setEnabled(false);

        lblItemsHeading.setBackground(new java.awt.Color(255, 255, 255));
        lblItemsHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItemsHeading.setText("Client DETAILS");

        lblEmail.setText("Report Started By:");

        txfRepStartedBy.setEnabled(false);

        lblPhone.setText("Occupation Pre Accident:");

        txfOccupationPreAcc.setEnabled(false);

        cbReportSent.setEnabled(false);

        lblActivityStatusD1.setText("Report Sent:");

        lblPasswordD1.setText("Client Email Address:");

        txfEmail.setEnabled(false);

        dcDateOfAssessment.setEnabled(false);
        dcDateOfAssessment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        dcDateFinalRepReceived.setEnabled(false);
        dcDateFinalRepReceived.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlUserDetailsLayout = new javax.swing.GroupLayout(pnlUserDetails);
        pnlUserDetails.setLayout(pnlUserDetailsLayout);
        pnlUserDetailsLayout.setHorizontalGroup(
            pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsernameD)
                    .addComponent(lblNameD)
                    .addComponent(lblPositionD)
                    .addComponent(lblPasswordD)
                    .addComponent(lblEmail)
                    .addComponent(lblPhone)
                    .addComponent(lblItemsHeading)
                    .addComponent(lblActivityStatusD)
                    .addComponent(lblPasswordD1)
                    .addComponent(lblUserLevelD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcDateOfAssessment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfEmail)
                    .addComponent(txfOccupationPreAcc)
                    .addComponent(txfRepStartedBy)
                    .addComponent(txfRepsOnHand)
                    .addComponent(txfClientName)
                    .addComponent(dcDateFinalRepReceived, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addComponent(cbInvoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(lblActivityStatusD1)
                        .addGap(69, 69, 69)
                        .addComponent(cbReportSent)
                        .addGap(26, 26, 26))
                    .addComponent(txfClientReference))
                .addContainerGap())
        );
        pnlUserDetailsLayout.setVerticalGroup(
            pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblItemsHeading)
                .addGap(18, 18, 18)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsernameD)
                            .addComponent(txfClientReference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNameD)
                            .addComponent(txfClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevelD)
                            .addComponent(dcDateOfAssessment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(lblPositionD))
                    .addComponent(dcDateFinalRepReceived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbInvoice)
                    .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPasswordD)
                            .addComponent(txfRepsOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txfRepStartedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txfOccupationPreAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                    .addComponent(lblActivityStatusD)
                                    .addGap(7, 7, 7))
                                .addComponent(cbReportSent))
                            .addComponent(lblActivityStatusD1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordD1)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pnlOptions.setBackground(new java.awt.Color(255, 255, 255));
        pnlOptions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("Add a new client to the system");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setToolTipText("Edit a client on the system");
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Delete a client from the system");
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
        btnSaveNew.setToolTipText("Save new client to the system");
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
        btnSaveEdit.setToolTipText("Save edits done on client");
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
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlOptionsLayout.createSequentialGroup()
                        .addComponent(lblItemsHeading1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSaveNew, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOptionsLayout.setVerticalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOptionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblItemsHeading1)
                .addGap(27, 27, 27)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveNew)
                .addGap(45, 45, 45)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveEdit)
                .addGap(30, 30, 30)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblClientManagement)
                        .addGap(294, 294, 294)
                        .addComponent(lblLogo))
                    .addComponent(pnlUserNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(lblUserLevelHead)
                                .addGap(18, 18, 18)
                                .addComponent(lblUserLevel))
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(lblUsernameHead)
                                .addGap(20, 20, 20)
                                .addComponent(lblUsername)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addComponent(pnlUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBgLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1034, Short.MAX_VALUE)))
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClientManagement))
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlUserNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlOptions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblUsernameHead))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevel)
                            .addComponent(lblUserLevelHead)))
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBgLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(665, Short.MAX_VALUE)))
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

    private void populateDetails() throws ParseException //Displays values from selected row in table into the text fields and check box
    {

        txfClientReference.setText((String) tblClients.getValueAt(tblClients.getSelectedRow(), 0));
        txfClientName.setText((String) tblClients.getValueAt(tblClients.getSelectedRow(), 1));
        dcDateOfAssessment.setDate(dateForm.parse((String) tblClients.getValueAt(tblClients.getSelectedRow(), 2)));
        dcDateFinalRepReceived.setDate(dateForm.parse((String) tblClients.getValueAt(tblClients.getSelectedRow(), 3)));
        txfRepsOnHand.setText((String) tblClients.getValueAt(tblClients.getSelectedRow(), 4));
        txfRepStartedBy.setText((String) tblClients.getValueAt(tblClients.getSelectedRow(), 5));
        txfOccupationPreAcc.setText((String) tblClients.getValueAt(tblClients.getSelectedRow(), 6));

        txfEmail.setText((String) tblClients.getValueAt(tblClients.getSelectedRow(), 9));

        cbInvoice.setSelected((boolean) tblClients.getValueAt(tblClients.getSelectedRow(), 7));
        cbReportSent.setSelected((boolean) tblClients.getValueAt(tblClients.getSelectedRow(), 8));

    }

    private void navigation(boolean enabled) //Allows to enable or disable the table panel components 
    {
        tblClients.setEnabled(enabled);
        btnFirst.setEnabled(enabled);
        btnNext.setEnabled(enabled);
        btnPrevious.setEnabled(enabled);
        btnLast.setEnabled(enabled);
    }

    private void search(boolean enabled) //Allows to enable or disable the search panel components 
    {
        rbAll.setEnabled(enabled);
        rbClientRef.setEnabled(enabled);
        rbClientName.setEnabled(enabled);
        rbReportStartedBy.setEnabled(enabled);
        if (rbReportStartedBy.isSelected() || rbClientName.isSelected() || rbClientRef.isSelected()) //checks if certain radio buttons are selected and sets the enabledness of the Search button to the rest of the search panel
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
        txfClientReference.setEnabled(enabled);
        txfClientReference.setEnabled(enabled);
        txfClientName.setEnabled(enabled);
        txfRepsOnHand.setEnabled(enabled);
        txfEmail.setEnabled(enabled);
        txfRepStartedBy.setEnabled(enabled);
        txfOccupationPreAcc.setEnabled(enabled);

        dcDateOfAssessment.setEnabled(enabled);
        dcDateOfAssessment.getDateEditor().setEnabled(false);
        dcDateFinalRepReceived.setEnabled(enabled);
        dcDateFinalRepReceived.getDateEditor().setEnabled(false);

        cbInvoice.setEnabled(enabled);
        cbReportSent.setEnabled(enabled);

    }

    private void searchPopulate() throws ParseException //populates table and text fields by what has been searched
    {
        cd.populateJTable(tblClients, 0);

        if (tblClients.getRowCount() == 0)//if there are no values for the search set the text field to nothing and display an error
        {
            //Set the values of the Details' panel's componets (text fields, date choooser, combo box and check box) to nothing
            txfClientReference.setText("");
            txfClientReference.setText("");
            txfEmail.setText("");
            txfClientName.setText("");
            txfRepsOnHand.setText("");
            txfRepStartedBy.setText("");

            txfOccupationPreAcc.setText("");
            dcDateOfAssessment.setDate(null);
            dcDateFinalRepReceived.setDate(null);

            cbInvoice.setSelected(false);
            cbReportSent.setSelected(false);

            JOptionPane.showMessageDialog(null, "No Clients were found", "Search Failed", JOptionPane.INFORMATION_MESSAGE);
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
        new MainMenu(lblUsername.getText().trim(), Integer.parseInt(lblUserLevel.getText().trim())).setVisible(true);//opens Main Menu and sends through Username and Employee Level
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new Help("ClientManagementHelp.txt", "HelpVideo.mp4").setVisible(true); //Opens Help Screen
    }//GEN-LAST:event_btnHelpActionPerformed

    private void tblClientsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblClientsMouseClicked
    {//GEN-HEADEREND:event_tblClientsMouseClicked
        if (tblClients.isEnabled()) //Runs populateDetails method with data from the selected row
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                System.out.println(ex.toString());//Displays any errors
            }
        }
    }//GEN-LAST:event_tblClientsMouseClicked

    private void tblClientsMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblClientsMouseReleased
    {//GEN-HEADEREND:event_tblClientsMouseReleased
        if (tblClients.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblClientsMouseReleased

    private void tblClientsKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tblClientsKeyReleased
    {//GEN-HEADEREND:event_tblClientsKeyReleased
        if (tblClients.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblClientsKeyReleased

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFirstActionPerformed
    {//GEN-HEADEREND:event_btnFirstActionPerformed
        try//selects the first row in the table and displays the details in the details panel
        {
            tblClients.setRowSelectionInterval(0, 0); //Moves/Selects to first cell
            tblClients.scrollRectToVisible(tblClients.getCellRect(0, 0, true)); //Moves scroll bar to the top
            populateDetails();
        } catch (ParseException ex)
        {
            System.out.println(ex.toString());//Displays any errors
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLastActionPerformed
    {//GEN-HEADEREND:event_btnLastActionPerformed
        try//selects the last row in the table and displays the details in the details panel
        {
            tblClients.setRowSelectionInterval((tblClients.getRowCount() - 1), (tblClients.getRowCount() - 1)); //Moves/Selects to last cell
            tblClients.scrollRectToVisible(tblClients.getCellRect((tblClients.getRowCount() - 1), 0, true)); //Moves scroll bar to the bottom
            populateDetails();
        } catch (ParseException ex)
        {
            System.out.println(ex.toString());//Displays any errors
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        try//selects the previous row in the table and displays the details in the details panel
        {
            if ((tblClients.getSelectedRow() - 1) > -1)
            {
                tblClients.setRowSelectionInterval((tblClients.getSelectedRow() - 1), (tblClients.getSelectedRow() - 1)); //Moves/Selects to previous cell
                tblClients.scrollRectToVisible(tblClients.getCellRect((tblClients.getSelectedRow() - 1), 0, true)); //Moves scroll bar in proportion to cell change
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
        try//selects the next row in the table and displays the details in the details panel
        {
            if ((tblClients.getSelectedRow() + 1) < tblClients.getRowCount())
            {
                tblClients.setRowSelectionInterval((tblClients.getSelectedRow() + 1), (tblClients.getSelectedRow() + 1)); //Moves/Selects to previous cell
                tblClients.scrollRectToVisible(tblClients.getCellRect((tblClients.getSelectedRow() + 1), 0, true)); //Moves scroll bar in proportion to cell change
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
            if (rbClientRef.isSelected())//Checks if client reference number radio button is selected and if so gets all clietns with that client reference number
            {
                cd.getAllClientsCR(txfSearch.getText().trim()); //Returns all Clients with the given Client Reference
                searchPopulate();

            } else
            {
                if (rbClientName.isSelected())//Checks if Client Name radio button is selected and if so gets all Clients with that Name
                {
                    cd.getAllClientsN(txfSearch.getText().trim().substring(0, txfSearch.getText().trim().lastIndexOf(" "))); //Returns all clients with the given name
                    searchPopulate();
                } else
                {
                    if (rbReportStartedBy.isSelected())//Checks if reportstartedby radio button is selected and if so gets all clients with that report started by value
                    {
                        cd.getAllClientsR(txfSearch.getText().trim()); //Returns all clients with the selected report satrted by value
                        searchPopulate();
                    }
                }
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any errors
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rbAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbAllActionPerformed
    {//GEN-HEADEREND:event_rbAllActionPerformed
        try
        {
            txfSearch.setEnabled(false);    //Disables all Search Functions except radio buttons

            rbClientRef.setEnabled(false);
            rbClientName.setEnabled(false);
            rbReportStartedBy.setEnabled(false);

            btnSearch.setEnabled(false);
            txfSearch.setText("");
            cd.getAllClients();
            cd.populateJTable(tblClients, 0);    //runs the populateDetails method
            populateDetails();
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any errors
        }
    }//GEN-LAST:event_rbAllActionPerformed

    private void rbReportStartedByActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbReportStartedByActionPerformed
    {//GEN-HEADEREND:event_rbReportStartedByActionPerformed

        rbClientRef.setSelected(false);
        rbClientName.setSelected(false);
        rbAll.setSelected(false);

        txfSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbReportStartedByActionPerformed

    private void rbClientRefActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbClientRefActionPerformed
    {//GEN-HEADEREND:event_rbClientRefActionPerformed
        rbAll.setSelected(false);
        rbClientName.setSelected(false);
        rbReportStartedBy.setSelected(false);
        txfSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbClientRefActionPerformed

    private void rbClientNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbClientNameActionPerformed
    {//GEN-HEADEREND:event_rbClientNameActionPerformed

        rbClientRef.setSelected(false);
        rbAll.setSelected(false);
        rbReportStartedBy.setSelected(false);

        txfSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbClientNameActionPerformed

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
        txfClientReference.setText("");
        txfClientName.setText("");
        dcDateOfAssessment.setDate(null);
        dcDateFinalRepReceived.setDate(null);
        txfRepsOnHand.setText("");
        txfRepStartedBy.setText("");
        txfOccupationPreAcc.setText("");
        txfEmail.setText("");
        cbInvoice.setText("");
        cbReportSent.setText("");

        txfClientReference.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        //Disables table, option and search panels and enables details panel
        navigation(false);
        search(false);
        options(false);
        details(true);

        txfClientReference.setEnabled(false);

        //Enables Save Edit and Cancel buttons and disables Consultations and Back buttons
        btnSaveEdit.setEnabled(true);
        btnCancel.setEnabled(true);
        btnBack.setEnabled(false);

        txfClientReference.requestFocus();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        try//allows user to delete a client from the tbale and database
        {
            String enterP = JOptionPane.showInputDialog(null, "DELETE ACTION CANNOT BE UNDONE!\nPlease enter your password to delete user:", "ENTER PASSWORD", JOptionPane.WARNING_MESSAGE).trim();
            if (enterP.equals(password))
            {
                String clientRefDel = (String) tblClients.getValueAt(tblClients.getSelectedRow(), 1);
                boolean exists = cd.checkClients(clientRefDel);  // checks if selected client has any paymnets made

                if (exists == false)
                {
                    cd.deleteClient(clientRefDel);
                    cd.populateJTable(tblClients, 0);
                    populateDetails();
                } else
                {
                    JOptionPane.showMessageDialog(null, "Cannot delete client! client has made paymnets!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Incorrect password! client NOT deleted.", "INCORRECT PASSWORD", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e)
        {
            e.toString();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveNewActionPerformed
    {//GEN-HEADEREND:event_btnSaveNewActionPerformed
        try //checks if all inputted values are valid for the addition
        {
            if (v.vStringAZ09spaceDash(txfClientReference.getText().trim(), "Client Reference must have a Value", "Only Letters (A to Z), Digits (0 - 9), Space/s and Dash/es are allowed")) //Checks if theclient reference number text field, contains a value and is only letters,spaces and dashes
            {
                if (v.vStringAZspace(txfClientName.getText().trim(), "Client Name must have a Value", "Only Letters (A to Z) and Space/s are allowed")) ////checks if the client name text field, contains a value and is only letters,spaces
                {
                    if (v.vStringAZspace(txfRepsOnHand.getText().trim(), "Reports On Hand must have a Value", "Reports On Hand must include all the reports available")) //Checks if the reports available text field, contains a value and is only letters,spaces and dashes
                    {
                        if (v.vStringAZspace(txfRepStartedBy.getText().trim(), "Only Letters (A to Z) and Space/s are allowed", "Report Started By must have a Value")) //checks if the report started by text field, contains a value and is only letters,spaces
                        {
                            if (v.vStringAZspace(txfOccupationPreAcc.getText().trim(), "Occupation Pre Accident must have a Value", "Occupation Pre Accident must include the clients occupation before their accident")) //Checks if the Occupation pre accident text field, contains a value and is only letters,spaces and dashes
                            {

                                if (dcDateOfAssessment.getDate() != null) //Checks if the Date of Birth date chooser has a value
                                {
                                    if (dcDateFinalRepReceived.getDate() != null) //Checks if the Date of Birth date chooser has a value
                                    {
                                        if (cbInvoice.isSelected()) //Checks whether the Medical Aid check box is selected to see if the Medical Aid No. text field must be validated and added to the database
                                        {
                                            if (v.vEmail(txfEmail.getText().trim(), "Client Email must have a Value")) //Checks if the Email text field, contains a value 
                                            {
                                                //Adds new Client to database
                                                String newClientRef = txfClientReference.getText().trim();    //Gets and stores all inputted data
                                                String newClientName = txfClientName.getText().trim();
                                                String newDateOfAssessment = dateForm.format(dcDateOfAssessment.getDate()); //Formats the date value from the Date of Birth date chooser to the format 'yyyy-MM-dd'
                                                String newDateFinalRepReceived = dateForm.format(dcDateFinalRepReceived.getDate()); //Formats the date value from the Date of Birth date chooser to the format 'yyyy-MM-dd'

                                                String newReportsOnHand = txfRepsOnHand.getText().trim();
                                                String newReportStartedBy = txfRepStartedBy.getText().trim();
                                                String newOccupationPreAcc = txfOccupationPreAcc.getText().trim();

                                                boolean newInvoice = cbInvoice.isSelected();
                                                boolean newReportSent = cbReportSent.isSelected();
                                                String newEmail = txfEmail.getText().trim();

                                                Data.Clients c = cd.getClient(newClientRef); //Makes an object of the Clients class

                                                cd.addClient(newClientRef, newClientName, newDateOfAssessment, newDateFinalRepReceived, newReportsOnHand, newReportStartedBy, //Runs addClient Method to add the new Client to the database
                                                        newOccupationPreAcc, newInvoice, newReportSent, newEmail);
                                                cd.getAllClients();
                                                cd.populateJTable(tblClients, 0); //Populates table with updates values
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
                                                txfEmail.setText(""); //If the data inputted in the eMAIL text field is invalid an error message will display
                                                txfEmail.requestFocus();
                                            }
                                        }
                                    } else
                                    {
                                        JOptionPane.showMessageDialog(null, "Date of Assessment must have a value"); //If the Date of Assesment date chooser has no value, an error message will display
                                    }
                                } else
                                {
                                    JOptionPane.showMessageDialog(null, "Date Final Report Received must have a value"); //If the Date Final Report Received date chooser has no value, an error message will display
                                }

                            } else
                            {
                                txfOccupationPreAcc.setText(""); //If the data inputted in the Occupation pre accident text field is invalid an error message will display
                                txfOccupationPreAcc.requestFocus();
                            }
                        } else
                        {
                            txfRepStartedBy.setText(""); //If the data inputted in the report started by text field is invalid an error message will display 
                            txfRepStartedBy.requestFocus();
                        }
                    } else
                    {
                        txfRepsOnHand.setText(""); //If the data inputted in the reports on hand text field is invalid an error message will display
                        txfRepsOnHand.requestFocus();
                    }
                } else
                {
                    txfClientName.setText(""); //If the data inputted in the client Name text field is invalid an error message will display
                    txfClientName.requestFocus();
                }
            } else
            {
                txfClientReference.setText(""); //If the data inputted in the client reference number text field is invalid an error message will display
                txfClientReference.requestFocus();
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
            if (v.vStringAZ09spaceDash(txfClientReference.getText().trim(), "Client Reference must consist of Digits and Letters", "Client Reference must have a Value")) //Checks if theclient reference number text field, contains a value and is only letters,spaces and dashes
            {
                if (v.vStringAZspace(txfClientName.getText().trim(), "", "Client Name must have a Value")) ////checks if the client name text field, contains a value and is only letters,spaces
                {
                    if (v.vStringAZspaceDash(txfRepsOnHand.getText().trim(), "Reports On Hand must include all the reports available", "Only Letters (A to Z), Space/s and Dash/es are allowed")) //Checks if the reports available text field, contains a value and is only letters,spaces and dashes
                    {
                        if (v.vStringAZspace(txfRepStartedBy.getText().trim(), "Report Started by must Only consist of Letters for a persons full Name", "")) //checks if the report started by text field, contains a value and is only letters,spaces
                        {
                            if (v.vStringAZspaceDash(txfOccupationPreAcc.getText().trim(), "Occupation Pre Accident must include the clients occupation before their accident", "")) //Checks if the Occupation pre accident text field, contains a value and is only letters,spaces and dashes
                            {

                                if (dcDateOfAssessment.getDate() != null) //Checks if the Date of Assessment date chooser has a value
                                {
                                    if (dcDateFinalRepReceived.getDate() != null) //Checks if the Date FinalRepReceived date chooser has a value
                                    {

                                        if (v.vEmail(txfEmail.getText().trim(), "Client Email must have a Value")) //Checks if the Email text field, contains a value 
                                        {
                                            //Adds new Client to database
                                            String updatedClientRef = txfClientReference.getText().trim();    //Gets and stores all inputted data
                                            String updatedClientName = txfClientName.getText().trim();
                                            String updatedDateOfAssessment = dateForm.format(dcDateOfAssessment.getDate()); //Formats the date value from the Date of Birth date chooser to the format 'dd/mm/yyyy'
                                            String updatedDateFinalRepReceived = dateForm.format(dcDateFinalRepReceived.getDate()); //Formats the date value from the Date of Birth date chooser to the format 'dd/mm/yyyy'

                                            String updatedReportsOnHand = txfRepsOnHand.getText().trim();
                                            String updatedReportStartedBy = txfRepStartedBy.getText().trim();
                                            String updatedOccupationPreAcc = txfOccupationPreAcc.getText().trim();

                                            boolean updatedInvoice = cbInvoice.isSelected();
                                            boolean updatedReportSent = cbReportSent.isSelected();
                                            String updatedEmail = txfEmail.getText().trim();

                                            Data.Clients c = cd.getClient(updatedClientRef); //Makes an object of the Clients class

                                            cd.editClient(updatedClientRef, updatedClientName, updatedDateOfAssessment, updatedDateFinalRepReceived, updatedReportsOnHand, updatedReportStartedBy, //Runs editClient to edit the new client to the database
                                                    updatedOccupationPreAcc, updatedInvoice, updatedReportSent, updatedEmail);
                                            cd.getAllClients();
                                            cd.populateJTable(tblClients, 0); //Populates table with updates values
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
                                            txfEmail.setText(""); //If the data inputted in the eMAIL text field is invalid an error message will display
                                            txfEmail.requestFocus();
                                        }

                                    } else
                                    {
                                        JOptionPane.showMessageDialog(null, "Date of Assessment must have a value"); //If the Date of Assessmnet date chooser has no value, an error message will display
                                    }
                                } else
                                {
                                    JOptionPane.showMessageDialog(null, "Date Final Report Received must have a value"); //If the Date Final Report Received date chooser has no value, an error message will display
                                }

                            } else
                            {
                                txfOccupationPreAcc.setText(""); //If the data inputted in the occupation pre accidenttext field is invalid an error message will display
                                txfOccupationPreAcc.requestFocus();
                            }
                        } else
                        {
                            txfRepStartedBy.setText(""); //If the data inputted in the report started by text field is invalid an error message will display 
                            txfRepStartedBy.requestFocus();
                        }
                    } else
                    {
                        txfRepsOnHand.setText(""); //If the data inputted in the reports on hand text field is invalid an error message will display
                        txfRepsOnHand.requestFocus();
                    }
                } else
                {
                    txfClientName.setText(""); //If the data inputted in the client Name text field is invalid an error message will display
                    txfClientName.requestFocus();
                }
            } else
            {
                txfClientReference.setText(""); //If the data inputted in the client reference text field is invalid an error message will display
                txfClientReference.requestFocus();
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

    private void btnResetTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResetTableActionPerformed
    {//GEN-HEADEREND:event_btnResetTableActionPerformed
        try//resets the table to dispay original data 
        {
            cd.getAllClients();
            cd.populateJTable(tblClients, 0);
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnResetTableActionPerformed

    public static void main(String args[]) throws SQLException, ParseException
    {

        new ClientManagement("JLP", 4).setVisible(true);

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
    private javax.swing.JCheckBox cbInvoice;
    private javax.swing.JCheckBox cbReportSent;
    private com.toedter.calendar.JDateChooser dcDateFinalRepReceived;
    private com.toedter.calendar.JDateChooser dcDateOfAssessment;
    private javax.swing.JLabel lblActivityStatusD;
    private javax.swing.JLabel lblActivityStatusD1;
    private javax.swing.JLabel lblClientListHeader;
    private javax.swing.JLabel lblClientManagement;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblItemsHeading;
    private javax.swing.JLabel lblItemsHeading1;
    private javax.swing.JLabel lblItemsHeading3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNameD;
    private javax.swing.JLabel lblPasswordD;
    private javax.swing.JLabel lblPasswordD1;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPositionD;
    private javax.swing.JLabel lblUserLevel;
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
    private javax.swing.JRadioButton rbClientName;
    private javax.swing.JRadioButton rbClientRef;
    private javax.swing.JRadioButton rbReportStartedBy;
    private javax.swing.JScrollPane spUsers;
    private javax.swing.JTable tblClients;
    private javax.swing.JTextField txfClientName;
    private javax.swing.JTextField txfClientReference;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfOccupationPreAcc;
    private javax.swing.JTextField txfRepStartedBy;
    private javax.swing.JTextField txfRepsOnHand;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
