package GUI;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class EmployeeReports extends javax.swing.JFrame
{

    private Data.ReportsData rp;

    private String username;
    private String name;
    private int userLevel;
    private String password;

    private SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/yyyy");            // getting date format

    public EmployeeReports(String username, int userLevel) throws SQLException
    {
        initComponents();
        this.username = username;
        this.name = name;
        this.userLevel = userLevel;
        this.password = password;
        lblUsername.setText(username);
        lblEmployeeLevel.setText("" + userLevel);

        rp = new Data.ReportsData();

        Date date = new Date();
        dcStartDate.setMaxSelectableDate(date);
        dcEndDate.setMaxSelectableDate(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlBg = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblReports = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        lblEmployeeLevel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserlevelHead = new javax.swing.JLabel();
        lblUsernameHead = new javax.swing.JLabel();
        pnlDisplay = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        spDisplay = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        pnlOptions = new javax.swing.JPanel();
        btnAllTimeTop5Employees = new javax.swing.JButton();
        btnAllTimeLowest5Employees = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAllTimeTop5EmployeesPieChart = new javax.swing.JButton();
        btnAllTimeTop5EmployeesBarGraph = new javax.swing.JButton();
        pnlDateRangeOptions = new javax.swing.JPanel();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        dcStartDate = new com.toedter.calendar.JDateChooser();
        dcEndDate = new com.toedter.calendar.JDateChooser();
        btnDateRangeTop5Employees = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

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
        btnBack.setToolTipText("Return to the Employee Menu");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackActionPerformed(evt);
            }
        });

        lblReports.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        lblReports.setForeground(new java.awt.Color(66, 103, 178));
        lblReports.setText("Employee Reports:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JP_Consulting-removebg-preview (1).png"))); // NOI18N

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

        lblEmployeeLevel.setText("lblUserlevel");

        lblUsername.setText("lblUsername");

        lblUserlevelHead.setText("User Level:");

        lblUsernameHead.setText("Username:");

        pnlDisplay.setBackground(new java.awt.Color(255, 255, 255));
        pnlDisplay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("Clear the text area");
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printer-ico30x30.png"))); // NOI18N
        btnPrint.setToolTipText("Print out the reports in the text area");
        btnPrint.setBorder(null);
        btnPrint.setBorderPainted(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPrintActionPerformed(evt);
            }
        });

        txaDisplay.setEditable(false);
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txaDisplay.setRows(5);
        spDisplay.setViewportView(txaDisplay);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DISPLAY");

        javax.swing.GroupLayout pnlDisplayLayout = new javax.swing.GroupLayout(pnlDisplay);
        pnlDisplay.setLayout(pnlDisplayLayout);
        pnlDisplayLayout.setHorizontalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addGroup(pnlDisplayLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDisplayLayout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDisplayLayout.setVerticalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplayLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(spDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDisplayLayout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDisplayLayout.createSequentialGroup()
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pnlOptions.setBackground(new java.awt.Color(255, 255, 255));
        pnlOptions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnAllTimeTop5Employees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAllTimeTop5Employees.setText("All-Time Top 5 Employees");
        btnAllTimeTop5Employees.setToolTipText("Lists the top 5 employees by number of payments initiated");
        btnAllTimeTop5Employees.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAllTimeTop5EmployeesActionPerformed(evt);
            }
        });

        btnAllTimeLowest5Employees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAllTimeLowest5Employees.setText("All-Time Lowest 5 Employees");
        btnAllTimeLowest5Employees.setToolTipText("Lists the lowest 5 employees by number of payments initiated");
        btnAllTimeLowest5Employees.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAllTimeLowest5EmployeesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("OPTIONS");

        btnAllTimeTop5EmployeesPieChart.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAllTimeTop5EmployeesPieChart.setText("Pie-Chart All-Time Top 5 Employees");
        btnAllTimeTop5EmployeesPieChart.setToolTipText("Displays Pie Chart of Top 5 Employees of all time");
        btnAllTimeTop5EmployeesPieChart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAllTimeTop5EmployeesPieChartActionPerformed(evt);
            }
        });

        btnAllTimeTop5EmployeesBarGraph.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAllTimeTop5EmployeesBarGraph.setText("Bar-Graph All-Time Top 5 Employees");
        btnAllTimeTop5EmployeesBarGraph.setToolTipText("Display Bar graph of Top 5 Employees of all time");
        btnAllTimeTop5EmployeesBarGraph.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAllTimeTop5EmployeesBarGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOptionsLayout = new javax.swing.GroupLayout(pnlOptions);
        pnlOptions.setLayout(pnlOptionsLayout);
        pnlOptionsLayout.setHorizontalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOptionsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAllTimeTop5EmployeesBarGraph, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addComponent(btnAllTimeTop5EmployeesPieChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllTimeTop5Employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllTimeLowest5Employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOptionsLayout.setVerticalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnAllTimeTop5Employees)
                .addGap(18, 18, 18)
                .addComponent(btnAllTimeLowest5Employees)
                .addGap(18, 18, 18)
                .addComponent(btnAllTimeTop5EmployeesBarGraph)
                .addGap(18, 18, 18)
                .addComponent(btnAllTimeTop5EmployeesPieChart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDateRangeOptions.setBackground(new java.awt.Color(255, 255, 255));
        pnlDateRangeOptions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblStartDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStartDate.setText("Start Date:");

        lblEndDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndDate.setText("End Date:");

        dcStartDate.setDateFormatString("dd/MM/yyyy");

        dcEndDate.setDateFormatString("dd/MM/yyyy");

        btnDateRangeTop5Employees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDateRangeTop5Employees.setText("Date Range Top 5 Employees");
        btnDateRangeTop5Employees.setToolTipText("Display list, bar graphand pie chart of top 5 employees between a date range by payments initiated");
        btnDateRangeTop5Employees.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDateRangeTop5EmployeesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("DATE RANGE OPTIONS");

        javax.swing.GroupLayout pnlDateRangeOptionsLayout = new javax.swing.GroupLayout(pnlDateRangeOptions);
        pnlDateRangeOptions.setLayout(pnlDateRangeOptionsLayout);
        pnlDateRangeOptionsLayout.setHorizontalGroup(
            pnlDateRangeOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDateRangeOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDateRangeOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDateRangeOptionsLayout.createSequentialGroup()
                        .addComponent(lblEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDateRangeOptionsLayout.createSequentialGroup()
                        .addComponent(lblStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDateRangeTop5Employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDateRangeOptionsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDateRangeOptionsLayout.setVerticalGroup(
            pnlDateRangeOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDateRangeOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(pnlDateRangeOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStartDate)
                    .addComponent(dcStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pnlDateRangeOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEndDate)
                    .addComponent(dcEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnDateRangeTop5Employees)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsernameHead)
                            .addComponent(lblUserlevelHead))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeeLevel)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblReports)
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addComponent(pnlDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(pnlOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlDateRangeOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblReports)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDateRangeOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBgLayout.createSequentialGroup()
                            .addComponent(lblUsernameHead)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblUserlevelHead))
                        .addGroup(pnlBgLayout.createSequentialGroup()
                            .addComponent(lblUsername)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblEmployeeLevel))))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        new Help("EmployeeReportsHelp.txt","HelpVideo.mp4").setVisible(true);//opens help screen
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        txaDisplay.setText(""); //clears the txaDisplay
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPrintActionPerformed
    {//GEN-HEADEREND:event_btnPrintActionPerformed
        try       //  printing from the display text area
        {
            if (txaDisplay.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Nothing to print!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else
            {
                txaDisplay.print();
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnAllTimeTop5EmployeesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAllTimeTop5EmployeesActionPerformed
    {//GEN-HEADEREND:event_btnAllTimeTop5EmployeesActionPerformed
        try
        {
            txaDisplay.append(rp.getTop5Employees2());     // displays all time top 5 employees in txaDisplay
            txaDisplay.append("\n");
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAllTimeTop5EmployeesActionPerformed

    private void btnAllTimeLowest5EmployeesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAllTimeLowest5EmployeesActionPerformed
    {//GEN-HEADEREND:event_btnAllTimeLowest5EmployeesActionPerformed
        try
        {
            txaDisplay.append(rp.getLowest5Employees1());     // displays all time lowest 5 employees in txaDisplay
            txaDisplay.append("\n");
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAllTimeLowest5EmployeesActionPerformed

    private void btnAllTimeTop5EmployeesPieChartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAllTimeTop5EmployeesPieChartActionPerformed
    {//GEN-HEADEREND:event_btnAllTimeTop5EmployeesPieChartActionPerformed
        try// displays all time lowest 5 employees as a pie chart
        {
            rp.getTop5EmployeesPieChart(); 
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAllTimeTop5EmployeesPieChartActionPerformed

    private void btnAllTimeTop5EmployeesBarGraphActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAllTimeTop5EmployeesBarGraphActionPerformed
    {//GEN-HEADEREND:event_btnAllTimeTop5EmployeesBarGraphActionPerformed
        try// displays all time lowest 5 employees as a bar graph
        {
            rp.getTop5EmployeesBarGraph();
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAllTimeTop5EmployeesBarGraphActionPerformed

    private void btnDateRangeTop5EmployeesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDateRangeTop5EmployeesActionPerformed
    {//GEN-HEADEREND:event_btnDateRangeTop5EmployeesActionPerformed
        try// displays all time lowest 5 employees in txaDisplay, as a pie chart and as a bar graph
        {
            rp.getDateRangeTop5EmployeesBarGraph( dateForm.format(dcStartDate.getDate()),  dateForm.format(dcEndDate.getDate()));
            rp.getDateRangeTop5EmployeesPieChart( dateForm.format(dcStartDate.getDate()), dateForm.format(dcEndDate.getDate()));
            txaDisplay.append(rp.getDateRangeTop5Employees( dateForm.format(dcStartDate.getDate()),dateForm.format(dcEndDate.getDate())));
            txaDisplay.append("\n");
            System.out.println("Done");
        } catch (SQLException e)
        {
            e.toString();
        }
    }//GEN-LAST:event_btnDateRangeTop5EmployeesActionPerformed

    public static void main(String args[]) throws SQLException
    {

        new EmployeeReports("JLP", 4).setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllTimeLowest5Employees;
    private javax.swing.JButton btnAllTimeTop5Employees;
    private javax.swing.JButton btnAllTimeTop5EmployeesBarGraph;
    private javax.swing.JButton btnAllTimeTop5EmployeesPieChart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDateRangeTop5Employees;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnPrint;
    private com.toedter.calendar.JDateChooser dcEndDate;
    private com.toedter.calendar.JDateChooser dcStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblEmployeeLevel;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblReports;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblUserlevelHead;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameHead;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlDateRangeOptions;
    private javax.swing.JPanel pnlDisplay;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JScrollPane spDisplay;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
