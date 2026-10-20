package GUI;

import Data.PaymentLogData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentHistory extends javax.swing.JFrame
{
    
    private Data.PaymentLogData pld;
    private Data.PaymentLog pl;
    
    private Data.Validation v = new Data.Validation();
    
    private String username;
    
    private int userLevel;
    private String password;
    
    private DecimalFormat df;
    private SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/yyyy");            // getting date format
    private SimpleDateFormat dateForm2 = new SimpleDateFormat("yyyy/MM/dd");            // getting date format

    public String masterDelPassword = "JLPCONSULTINGDELETE";
    
    public PaymentHistory(String username, int userLevel) throws SQLException, ParseException
    {
        initComponents();
        this.username = username;
        
        this.userLevel = userLevel;
        this.password = password;
        lblUsername.setText(username);
        lblEmployeeLevel.setText("" + userLevel);
        
        pld = new PaymentLogData();
        
        pld.populateJTable(tblPaymentHistory, 0); //Populates the PaymentHistory table

        Date date = new Date();
        dcSingleDateSearch.setMaxSelectableDate(date);
        dcStartDate.setMaxSelectableDate(date);
        dcEndDate.setMaxSelectableDate(date);
        
        populateDetails(); //Runs the populateDetails method to populate components on details panel
    }
    
    private void populateDetails() throws ParseException //Displays values from selected row in table into the text fields and check box
    {
        
        txfPaymentID.setText("" + tblPaymentHistory.getValueAt(tblPaymentHistory.getSelectedRow(), 0));
        txfClientRef.setText((String) tblPaymentHistory.getValueAt(tblPaymentHistory.getSelectedRow(), 1));
        
        txfPrice.setText("" + tblPaymentHistory.getValueAt(tblPaymentHistory.getSelectedRow(), 3));
        dcDateOfPayment.setDate(dateForm.parse("" + tblPaymentHistory.getValueAt(tblPaymentHistory.getSelectedRow(), 4)));
        txfUsername.setText((String) tblPaymentHistory.getValueAt(tblPaymentHistory.getSelectedRow(), 2));
        
        txfTimePay.setText("" + tblPaymentHistory.getValueAt(tblPaymentHistory.getSelectedRow(), 5));
        
    }
    
    private void navigation(boolean enabled) //Allows to enable or disable the table panel components 
    {
        tblPaymentHistory.setEnabled(enabled);
        btnBack.setEnabled(enabled);
        
    }
    
    private void options(boolean enabled) // Allows to enable or disable the options panel components 
    {
        
        btnEdit.setEnabled(enabled);
        btnDelete.setEnabled(enabled);
    }
    
    public void details(boolean enabled) //Allows to enable or disable the details panel components 
    {
        txfPaymentID.setEnabled(false);
        txfClientRef.setEnabled(enabled);
        
        dcDateOfPayment.setEnabled(enabled);
        dcDateOfPayment.getDateEditor().setEnabled(enabled);
        txfPrice.setEnabled(enabled);
        txfTimePay.setEnabled(enabled);
        txfUsername.setEnabled(enabled);
        
    }

    // populates payment history table with searched for data
    private void searchPopulatePayments()
    {
        pld.populateJTableS(tblPaymentHistory);
        JOptionPane.showMessageDialog(null, "Table Updated");
        
        if (tblPaymentHistory.getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(null, "Sorry no Sales found", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            btnReset.doClick();
        }
    }
    
    private void search(boolean enabled) //Allows to enable or disable the search panel components 
    {
        dcStartDate.setEnabled(enabled);
        dcStartDate.getDateEditor().setEnabled(false);
        dcEndDate.setEnabled(enabled);
        dcEndDate.getDateEditor().setEnabled(false);
        btnSearchByDateRange.setEnabled(enabled);
        dcSingleDateSearch.setEnabled(enabled);
        dcSingleDateSearch.getDateEditor().setEnabled(false);
        btnSearchByDate.setEnabled(enabled);
        btnSearchByClientReference.setEnabled(enabled);
        btnSearchByClientReference.setEnabled(enabled);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        lblUsernameHead = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserLevelHead = new javax.swing.JLabel();
        lblEmployeeLevel = new javax.swing.JLabel();
        pnlSaleHistory = new javax.swing.JPanel();
        spSaleHistory = new javax.swing.JScrollPane();
        tblPaymentHistory = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        pnlSearchDateRange = new javax.swing.JPanel();
        btnSearchByDateRange = new javax.swing.JButton();
        lblStartDate = new javax.swing.JLabel();
        dcStartDate = new com.toedter.calendar.JDateChooser();
        lblEndDate = new javax.swing.JLabel();
        dcEndDate = new com.toedter.calendar.JDateChooser();
        pnlOtherSearchOptions = new javax.swing.JPanel();
        dcSingleDateSearch = new com.toedter.calendar.JDateChooser();
        btnSearchByDate = new javax.swing.JButton();
        btnSearchByClientReference = new javax.swing.JButton();
        btnSearchByUsername = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlOptions3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        lblItemsHeading4 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        pnlUserDetails = new javax.swing.JPanel();
        lblPaymentID = new javax.swing.JLabel();
        lblClientRef = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDateOfPayment = new javax.swing.JLabel();
        lblTimeOfPayment = new javax.swing.JLabel();
        txfTimePay = new javax.swing.JTextField();
        txfClientRef = new javax.swing.JTextField();
        txfPaymentID = new javax.swing.JTextField();
        lblHeading = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txfPrice = new javax.swing.JTextField();
        txfUsername = new javax.swing.JTextField();
        dcDateOfPayment = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUsernameHead.setText("Username:");

        lblUsername.setText("lblUsername");

        lblUserLevelHead.setText("User Level:");

        lblEmployeeLevel.setText("lblUserLevel");

        pnlSaleHistory.setBackground(new java.awt.Color(255, 255, 255));
        pnlSaleHistory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblPaymentHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Payment ID", "Client Reference", "Username", "Price of Payment", "Date of Payment", "Time of Payment"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
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
        tblPaymentHistory.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblPaymentHistoryMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblPaymentHistoryMouseReleased(evt);
            }
        });
        tblPaymentHistory.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                tblPaymentHistoryKeyReleased(evt);
            }
        });
        spSaleHistory.setViewportView(tblPaymentHistory);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setToolTipText("Reset table to show all Payment history");
        btnReset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnResetActionPerformed(evt);
            }
        });

        pnlSearchDateRange.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearchDateRange.setBorder(javax.swing.BorderFactory.createTitledBorder("Date Range Search"));

        btnSearchByDateRange.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearchByDateRange.setText("Search - Date Range");
        btnSearchByDateRange.setToolTipText("Search by date range");
        btnSearchByDateRange.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchByDateRangeActionPerformed(evt);
            }
        });

        lblStartDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStartDate.setText("Start Date:");

        dcStartDate.setDateFormatString("dd/MM/yyyy");

        lblEndDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndDate.setText("End Date:");

        dcEndDate.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout pnlSearchDateRangeLayout = new javax.swing.GroupLayout(pnlSearchDateRange);
        pnlSearchDateRange.setLayout(pnlSearchDateRangeLayout);
        pnlSearchDateRangeLayout.setHorizontalGroup(
            pnlSearchDateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchDateRangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchDateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchByDateRange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSearchDateRangeLayout.createSequentialGroup()
                        .addGroup(pnlSearchDateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSearchDateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(dcStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlSearchDateRangeLayout.setVerticalGroup(
            pnlSearchDateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchDateRangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchDateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartDate))
                .addGap(13, 13, 13)
                .addGroup(pnlSearchDateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndDate)
                    .addComponent(dcEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnSearchByDateRange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOtherSearchOptions.setBackground(new java.awt.Color(255, 255, 255));
        pnlOtherSearchOptions.setBorder(javax.swing.BorderFactory.createTitledBorder("Other Search Options"));

        dcSingleDateSearch.setDateFormatString("dd/MM/yyyy");

        btnSearchByDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearchByDate.setText("Search - Date");
        btnSearchByDate.setToolTipText("Search by date");
        btnSearchByDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchByDateActionPerformed(evt);
            }
        });

        btnSearchByClientReference.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearchByClientReference.setText("Search - Client Reference");
        btnSearchByClientReference.setToolTipText("Search by Client Reference Number");
        btnSearchByClientReference.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchByClientReferenceActionPerformed(evt);
            }
        });

        btnSearchByUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearchByUsername.setText("Search - Username");
        btnSearchByUsername.setToolTipText("Search by username");
        btnSearchByUsername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchByUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOtherSearchOptionsLayout = new javax.swing.GroupLayout(pnlOtherSearchOptions);
        pnlOtherSearchOptions.setLayout(pnlOtherSearchOptionsLayout);
        pnlOtherSearchOptionsLayout.setHorizontalGroup(
            pnlOtherSearchOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOtherSearchOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOtherSearchOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchByUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchByClientReference, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOtherSearchOptionsLayout.createSequentialGroup()
                        .addComponent(dcSingleDateSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchByDate)))
                .addContainerGap())
        );
        pnlOtherSearchOptionsLayout.setVerticalGroup(
            pnlOtherSearchOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOtherSearchOptionsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlOtherSearchOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchByDate)
                    .addComponent(dcSingleDateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSearchByClientReference)
                .addGap(18, 18, 18)
                .addComponent(btnSearchByUsername)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Payment History");

        javax.swing.GroupLayout pnlSaleHistoryLayout = new javax.swing.GroupLayout(pnlSaleHistory);
        pnlSaleHistory.setLayout(pnlSaleHistoryLayout);
        pnlSaleHistoryLayout.setHorizontalGroup(
            pnlSaleHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSaleHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(pnlSaleHistoryLayout.createSequentialGroup()
                        .addGroup(pnlSaleHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSearchDateRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSaleHistoryLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnReset)))
                        .addGap(18, 18, 18)
                        .addComponent(pnlOtherSearchOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spSaleHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSaleHistoryLayout.setVerticalGroup(
            pnlSaleHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spSaleHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSaleHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOtherSearchOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSaleHistoryLayout.createSequentialGroup()
                        .addComponent(pnlSearchDateRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)))
                .addContainerGap())
        );

        btnBack.setBackground(new java.awt.Color(66, 103, 178));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbtn_3.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Return to Payment Menu");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 103, 178));
        jLabel1.setText("Payment Data:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

        pnlOptions3.setBackground(new java.awt.Color(255, 255, 255));
        pnlOptions3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Delete a payment from the system");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        lblItemsHeading4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItemsHeading4.setText("Options");

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("Cancels you addition or edtion");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setToolTipText("Edit a payment on the system");
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        btnSaveEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSaveEdit.setText("Save Edit");
        btnSaveEdit.setToolTipText("Save edits done on payment");
        btnSaveEdit.setEnabled(false);
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOptions3Layout = new javax.swing.GroupLayout(pnlOptions3);
        pnlOptions3.setLayout(pnlOptions3Layout);
        pnlOptions3Layout.setHorizontalGroup(
            pnlOptions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptions3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOptions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOptions3Layout.createSequentialGroup()
                        .addComponent(lblItemsHeading4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlOptions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOptions3Layout.setVerticalGroup(
            pnlOptions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOptions3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItemsHeading4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlOptions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSaveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(pnlOptions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pnlUserDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlUserDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblPaymentID.setText("Payment ID:");

        lblClientRef.setText("Client Reference Number:");

        lblUser.setText("Username:");

        lblDateOfPayment.setText("Date Of Payment:");

        lblTimeOfPayment.setText("Time Of Payment:");

        txfTimePay.setEnabled(false);

        txfClientRef.setEnabled(false);

        txfPaymentID.setEnabled(false);

        lblHeading.setBackground(new java.awt.Color(255, 255, 255));
        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeading.setText("Payment Details");

        lblPrice.setText("Price Of Payment:");

        txfPrice.setEnabled(false);

        txfUsername.setEnabled(false);

        dcDateOfPayment.setEnabled(false);
        dcDateOfPayment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlUserDetailsLayout = new javax.swing.GroupLayout(pnlUserDetails);
        pnlUserDetails.setLayout(pnlUserDetailsLayout);
        pnlUserDetailsLayout.setHorizontalGroup(
            pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPaymentID)
                    .addComponent(lblClientRef)
                    .addComponent(lblUser)
                    .addComponent(lblDateOfPayment)
                    .addComponent(lblTimeOfPayment)
                    .addComponent(lblPrice)
                    .addComponent(lblHeading))
                .addGap(18, 18, 18)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfUsername)
                    .addComponent(txfPrice)
                    .addComponent(txfTimePay)
                    .addComponent(txfPaymentID)
                    .addComponent(dcDateOfPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(txfClientRef, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlUserDetailsLayout.setVerticalGroup(
            pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaymentID)
                    .addComponent(txfPaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClientRef)
                    .addComponent(txfClientRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOfPayment)
                    .addComponent(dcDateOfPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfTimePay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimeOfPayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlSaleHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlUserDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlOptions3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsernameHead)
                            .addComponent(lblUserLevelHead))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeeLevel)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(438, 438, 438)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(371, 371, 371)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlUserDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlOptions3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlSaleHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsernameHead)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeLevel)
                            .addComponent(lblUserLevelHead))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //when mouse is clicked to select a row on the payment history table, the related payment history appears in the details panel
    private void tblPaymentHistoryMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblPaymentHistoryMouseClicked
    {//GEN-HEADEREND:event_tblPaymentHistoryMouseClicked
        if (tblPaymentHistory.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblPaymentHistoryMouseClicked
//when mouse is dragged (held click) to select a row on the payment history table, the related payment history appears in the details panel
    private void tblPaymentHistoryMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblPaymentHistoryMouseReleased
    {//GEN-HEADEREND:event_tblPaymentHistoryMouseReleased
        if (tblPaymentHistory.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblPaymentHistoryMouseReleased
    //when arrow or enter key is clicked to select a row on the payment history table, the related payment history appears in the  details panel
    private void tblPaymentHistoryKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tblPaymentHistoryKeyReleased
    {//GEN-HEADEREND:event_tblPaymentHistoryKeyReleased
        if (tblPaymentHistory.isEnabled())
        {
            try
            {
                populateDetails();
            } catch (ParseException ex)
            {
                Logger.getLogger(Calender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblPaymentHistoryKeyReleased
// resets payment history table with all history
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResetActionPerformed
    {//GEN-HEADEREND:event_btnResetActionPerformed
        try
        {
            dcStartDate.setDate(null);
            dcEndDate.setDate(null);
            dcSingleDateSearch.setDate(null);
            pld.getAllLogs();
            pld.populateJTable(tblPaymentHistory, 0);
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnResetActionPerformed

    //allows user to search between a date range
    private void btnSearchByDateRangeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchByDateRangeActionPerformed
    {//GEN-HEADEREND:event_btnSearchByDateRangeActionPerformed
        try       //note this is for the sale history table
        {
            pld.getAllPaymentsDRange(dateForm.format(dcStartDate.getDate()), dateForm.format(dcEndDate.getDate()));
            searchPopulatePayments();
            System.out.println(dateForm.format(dcStartDate.getDate()));
            System.out.println(dateForm.format(dcEndDate.getDate()));
            
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSearchByDateRangeActionPerformed

    //allows user to search by a date 
    private void btnSearchByDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchByDateActionPerformed
    {//GEN-HEADEREND:event_btnSearchByDateActionPerformed
        try       //note this is for the sale history table
        {
            pld.getAllPaymentsD(dateForm.format(dcSingleDateSearch.getDate()));
            searchPopulatePayments();
            System.out.println(dateForm.format(dcSingleDateSearch.getDate()));
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSearchByDateActionPerformed

    //allows user to search by a client reference number
    private void btnSearchByClientReferenceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchByClientReferenceActionPerformed
    {//GEN-HEADEREND:event_btnSearchByClientReferenceActionPerformed
        try       //note this is for the sale history table
        {
            String clientRef = JOptionPane.showInputDialog(null, "Please enter a Client Reference Number to search for:", "Enter a Client Reference Number", JOptionPane.INFORMATION_MESSAGE).trim();
            pld.getAllPaymentsCR(clientRef);
            searchPopulatePayments();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSearchByClientReferenceActionPerformed
//allows user to search by a username
    private void btnSearchByUsernameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchByUsernameActionPerformed
    {//GEN-HEADEREND:event_btnSearchByUsernameActionPerformed
        try       //note this is for the sale history table
        {
            String username = JOptionPane.showInputDialog(null, "Please enter a Username to search for:", "Enter a Username", JOptionPane.INFORMATION_MESSAGE).trim();
            pld.getAllPaymentsUsername(username);
            searchPopulatePayments();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSearchByUsernameActionPerformed
// returns you to the paymnet menu
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        this.dispose();//Closes Main Menu
        try
        {
            new PaymentMenu(lblUsername.getText().trim(), Integer.parseInt(lblEmployeeLevel.getText().trim())).setVisible(true);//Opens Patietnts Frame and sends through Username and Employee Level
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any caught errors
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new Help("PaymentHistoryHelp.txt", "HelpVideo.mp4").setVisible(true); //displays help screen
    }//GEN-LAST:event_btnHelpActionPerformed

    //deletes a row of data from the table and database
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        try
        {
            String enterP = JOptionPane.showInputDialog(null, "DELETE ACTION CANNOT BE UNDONE!\nPlease enter The MASTER DELETE password to delete Payment Log:", "ENTER PASSWORD", JOptionPane.WARNING_MESSAGE).trim();
            if (enterP.trim().equalsIgnoreCase(masterDelPassword))
            {
                int paymentDel = (int) tblPaymentHistory.getValueAt(tblPaymentHistory.getSelectedRow(), 0);
                
                pld.deletePayment(paymentDel);
                pld.populateJTable(tblPaymentHistory, 0);
                populateDetails();
                
            } else
            {
                JOptionPane.showMessageDialog(null, "Incorrect password! User NOT deleted.", "INCORRECT PASSWORD", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e)
        {
            e.toString();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //resets the details panel
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        navigation(true);
        
        options(true);
        details(false);
        
        btnCancel.setEnabled(false);
        
        try
        {
            populateDetails();
        } catch (ParseException ex)
        {
            Logger.getLogger(PaymentHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCancelActionPerformed

    //allows user to edit details 
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
        txfPrice.setEnabled(false);
        txfPaymentID.setEnabled(false);
        txfUsername.requestFocus();
    }//GEN-LAST:event_btnEditActionPerformed

    //allows user to save their edited data to database and table
    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveEditActionPerformed
    {//GEN-HEADEREND:event_btnSaveEditActionPerformed
        try //checks if all inputted values are valid for the addition
        {
            if (v.vStringAZ09spaceDash(txfClientRef.getText().trim(), "Client Reference must have a Value", "Only Letters (A to Z), Digits (0 - 9), Space/s and Dash/es are allowed")) //Checks if the ID text field, contains a value that consists of only digits and is 13 characters long
            {
                
                if (v.vStringAZspace(txfUsername.getText().trim(), "Username must have a value", "\"Only Letters (A to Z) and Spaces are allowed")) //Checks if the usename text field, contains a value and is a letter or space
                {
                    
                    if (v.vTimeString(txfTimePay.getText().trim(), "")) //Checks if the time payed field, contains a value 
                    {
                        
                        if (dcDateOfPayment.getDate() != null) //Checks if the Date of Birth date chooser has a value
                        {

                            //Adds new edited payment to database
                            int paymentID = Integer.parseInt(txfPaymentID.getText().trim());
                            String updatedUsername = txfUsername.getText().trim();    //Gets and stores all inputted data
                            String updatedClientRef = txfClientRef.getText().trim();
                            String updatedDateOfPayment = dateForm.format(dcDateOfPayment.getDate()); //Formats the date value from the Date of Birth date chooser to the format 'dd/MM/yyyy'

                            String updatedTime = txfTimePay.getText().trim();
                            double price = Double.parseDouble(txfPrice.getText().trim());
                            
                            pld.editPayment(paymentID, updatedClientRef, updatedUsername, price, updatedDateOfPayment, updatedTime);
                            pld.getAllLogs();
                            pld.populateJTable(tblPaymentHistory, 0); //Populates table with updates values
                            populateDetails();
                            //Reenables the navigation, search and options panel and disables the details panel
                            navigation(true);
                            search(true);
                            options(true);
                            details(false);
                            //Redisabled the Save New and Cancel buttons and reenables the Back button
                            
                            btnCancel.setEnabled(false);
                            btnSaveEdit.setEnabled(false);
                            btnBack.setEnabled(true);
                            
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Date of Payment must have a value"); //If the Date of Employment date chooser has no value, an error message will display
                        }
                        
                    } else
                    {
                        txfTimePay.setText(""); //If the data inputted in the time payed text field is invalid an error message will display
                        txfTimePay.requestFocus();
                    }
                    
                } else
                {
                    txfUsername.setText(""); //If the data inputted in the username text field is invalid an error message will display
                    txfUsername.requestFocus();
                }
                
            } else
            {
                txfClientRef.setText(""); //If the data inputted in the client reference number text field is invalid an error message will display
                txfClientRef.requestFocus();
            }
            
        } catch (Exception e)
        {
            System.out.println(e.toString());//Displays any errors
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed
    
    public static void main(String args[]) throws SQLException, ParseException
    {
        new PaymentHistory("JLP", 4).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveEdit;
    private javax.swing.JButton btnSearchByClientReference;
    private javax.swing.JButton btnSearchByDate;
    private javax.swing.JButton btnSearchByDateRange;
    private javax.swing.JButton btnSearchByUsername;
    private com.toedter.calendar.JDateChooser dcDateOfPayment;
    private com.toedter.calendar.JDateChooser dcEndDate;
    private com.toedter.calendar.JDateChooser dcSingleDateSearch;
    private com.toedter.calendar.JDateChooser dcStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClientRef;
    private javax.swing.JLabel lblDateOfPayment;
    private javax.swing.JLabel lblEmployeeLevel;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblItemsHeading4;
    private javax.swing.JLabel lblPaymentID;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTimeOfPayment;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserLevelHead;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameHead;
    private javax.swing.JPanel pnlOptions3;
    private javax.swing.JPanel pnlOtherSearchOptions;
    private javax.swing.JPanel pnlSaleHistory;
    private javax.swing.JPanel pnlSearchDateRange;
    private javax.swing.JPanel pnlUserDetails;
    private javax.swing.JScrollPane spSaleHistory;
    private javax.swing.JTable tblPaymentHistory;
    private javax.swing.JTextField txfClientRef;
    private javax.swing.JTextField txfPaymentID;
    private javax.swing.JTextField txfPrice;
    private javax.swing.JTextField txfTimePay;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
