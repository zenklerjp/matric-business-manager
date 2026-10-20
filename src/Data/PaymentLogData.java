package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PaymentLogData
{

    private dbManager db;

    private List<PaymentLog> PaymentLogList = new ArrayList<>();
    SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");            // getting date format
    SimpleDateFormat timeForm = new SimpleDateFormat("HH:mm:ss");      // getting time format

    public PaymentLogData() throws SQLException
    {
        db = new dbManager();
        getAllLogs();
    }

    // gets all payments within inputed date range from database
    public void getAllPaymentsDRange(String sDate, String eDate) throws SQLException
    {
        getPaymentLogList("SELECT * FROM tblPayments WHERE DATEOFPAYMENT >= #" + sDate + "# AND DATEOFPAYMENT <= #" + eDate + "#");
    }

    // gets all payments with inputed date from database
    public void getAllPaymentsD(String date) throws SQLException //********
    {
        getPaymentLogList("SELECT * FROM tblPayments WHERE DATEOFPayment = #" + date + "#");
//        System.out.println("" + date);
    }

    // gets all payments with inputed username from database
    public void getAllPaymentsUsername(String username) throws SQLException
    {
        getPaymentLogList("SELECT * FROM tblPayments WHERE USERNAME ='" + username + "'");
    }

    // returns all payment logs
    public void getAllLogs() throws SQLException
    {
        getPaymentLogList("SELECT * FROM tblPayments ORDER BY PaymentID");
    }

    // returns all payment logs by sale id
    public void getAllLogsPID(String PaymentID) throws SQLException
    {
        getPaymentLogList("SELECT * FROM tblPayments WHERE PaymentID =" + PaymentID);   // one SQL statement
    }

    // returns all payment logs by client reference
    public void getAllPaymentsCR(String cr) throws SQLException
    {
        getPaymentLogList("SELECT * FROM tblPayments WHERE ClientReferenceNumber ='" + cr + "'");   // one SQL statement
    }

    // generates list of all payment logs
    public void getPaymentLogList(String sql) throws SQLException  // throws ...  - prevents errors.
    {
        ResultSet rs = db.query(sql);
        PaymentLogList.clear();
        while (rs.next())
        {
            PaymentLog cl = new PaymentLog();
            cl.setPaymentID(rs.getInt("PaymentID"));
            cl.setClientRef(rs.getString("ClientReferenceNumber"));
            cl.setUsername(rs.getString("Username"));
            cl.setDateOfPayment(dateForm.format(rs.getDate("DateOfPayment")));
            cl.setTimeOfPayment(timeForm.format(rs.getTime("TimeOfPayment")));
            cl.setPriceOfPayment(rs.getDouble("PriceOfPayment"));

            PaymentLogList.add(cl);
        }
    }

    // gets the latest payment id
    public int getMaxPaymentID() throws SQLException
    {

        ResultSet rs = db.query("SELECT MAX(PaymentID) FROM tblPayments");
        int id = 1;
        if (rs.next())
        {
            id = rs.getInt(1);
        }

        return id;
    }

    // new payment log
    public void newLog(String clientRef, String username, Double priceOfPayment) throws SQLException
    {
        if (db.update("INSERT INTO tblPayments( ClientReferenceNumber, Username, PriceOfPayment, DateOfPayment, TimeOfPayment) VALUES('" + clientRef + "', '" + username + "', " + priceOfPayment + ", now(), now())") > 0)
        {
            getAllLogs();
        } else
        {
            JOptionPane.showMessageDialog(null, "Error while confirming payment!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // populating JTable:
    public void populateJTableS(javax.swing.JTable itemTable)
    {
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < PaymentLogList.size(); i++)
        {
            Data.PaymentLog cl = PaymentLogList.get(i);

            Object[] rowData =
            {
                cl.getPaymentID(), cl.getClientRef(), cl.getUsername(), cl.getPriceOfPayment(), cl.getDateOfPayment(), cl.getTimeOfPayment()
            };

            model.addRow(rowData);
        }
        itemTable.setModel(model);
    }

    // populating JTable:
    public void populateJTable(javax.swing.JTable paymentTable, int rowSelect)
    {
        DefaultTableModel model = (DefaultTableModel) paymentTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < PaymentLogList.size(); i++)
        {
            Data.PaymentLog cl = PaymentLogList.get(i);

            Object[] rowData =
            {
                cl.getPaymentID(), cl.getClientRef(), cl.getUsername(), cl.getPriceOfPayment(), cl.getDateOfPayment(), cl.getTimeOfPayment()
            };

            model.addRow(rowData);
        }

        paymentTable.setModel(model);

        if (paymentTable.getRowCount() > 0)
        {
            paymentTable.setRowSelectionInterval(rowSelect, rowSelect);
        }
    }

// editing payment in data base
    public void editPayment(int paymentID, String clientReference, String username, double priceOfPayment, String date, String time) throws SQLException     // updating payment's details.
    {
        if (db.update("UPDATE tblPayments SET PaymentID = " + paymentID + ",ClientReferenceNumber = '" + clientReference + "', Username = '" + username + "', PriceOfPayment = " + priceOfPayment + "," + "DateOfPayment = #" + date + "#, TimeOfPayment = #" + time + "# WHERE PaymentID = " + paymentID + "") > 0)
        {
            getAllLogs();
            JOptionPane.showMessageDialog(null, "Payment successfully edited", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Payment NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // deleting payment in data base
    public void deletePayment(int paymentDel) throws SQLException      //removes payment entirely
    {
        if (db.update("DELETE * FROM tblPayments WHERE PaymentID = '" + paymentDel + "'") > 0)
        {
            getAllLogs();
            JOptionPane.showMessageDialog(null, "Payment successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Payment NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void populateJComboBox(javax.swing.JComboBox paymentTypeComboBox) //populates the patientSexComboBox
    {
        paymentTypeComboBox.removeAllItems();
        paymentTypeComboBox.addItem("Cash");
        paymentTypeComboBox.addItem("Card");
        paymentTypeComboBox.addItem("Zapper");
    }

}
