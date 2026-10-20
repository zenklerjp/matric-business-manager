package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClientsData
{

    private dbManager db;

    private List<Clients> ClientList = new ArrayList();

    public ClientsData() throws SQLException
    {
        db = new dbManager();
        getAllClients();//Runs the getAllClients method whenever an object of the class is created
    }
    
     private SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");            // getting date format

    //Fetches Details about the client from the database 
    public void getClientList(String sql) throws SQLException  // throws SQLException  - error throwing for SQL connections.
    {
        ResultSet rs = db.query(sql);
        ClientList.clear();
        while (rs.next())
        {
            Clients u = new Clients();
            u.setClientRef(rs.getString("ClientReferenceNumber"));
            u.setClientName(rs.getString("ClientName"));           // "" must be spelt correctly according to database.
            u.setDateOfAss (dateForm.format(rs.getDate("DateOfAssessment")));
            u.setDateFinalRepReceived(dateForm.format(rs.getDate("DateFinalReportReceived")));
            u.setRepOnHand(rs.getString("ReportsOnHand"));
            u.setRepStartedBy(rs.getString("ReportStartedBy"));
            u.setOccupationPreAcc(rs.getString("OccupationPreAccident"));
            u.setInvoicePaid(rs.getBoolean("InvoicePaid"));
            u.setReportSent(rs.getBoolean("ReportSent"));
            u.setClientEmail(rs.getString("ClientEmailAddress"));

            ClientList.add(u);
        }
    }

    public boolean checkClients(String clientRef) throws SQLException //Checks if a Given Client has any Payments attached to them in the database
    {
        boolean check = false;
        ResultSet rs = db.query("SELECT * FROM TBLCLIENTS WHERE ClientREFERENCENumber = '" + clientRef + "'");
        if (rs.next())
        {
            check = true;
        }
        return check;
    }

    public void getAllClients() throws SQLException        // selects all Clients
    {
        getClientList("SELECT * FROM tblClients ORDER BY ClIENTNAME");
    }

    public void getAllClientsCR(String clientRef) throws SQLException    // selects all Clients with inputed client referecne
    {
        getClientList("SELECT * FROM tblClients WHERE CLIENTREFERENCENumber LIKE '%" + clientRef + "%'");   // one SQL statement
    }

    public void getAllClientsN(String clientName) throws SQLException   // selects all Clients with inputed client name
    {
        getClientList("SELECT * FROM tblClients WHERE CLIENTNAME LIKE '%" + clientName + "%'");
    }

    public void getAllClientsR(String repStartedBy) throws SQLException   // selects all Clients with inputed data of who the report was started by
    {
        getClientList("SELECT * FROM tblClients WHERE REPORTSTARTEDBY LIKE '%" + repStartedBy + "%'");
    }

    public void getAllClientsDOA(String dateOfAss) throws SQLException   // selects all Clients with inputed dateofassessment
    {
        getClientList("SELECT * FROM tblClients WHERE dateOfAssessment LIKE '%" + dateOfAss + "%'");
    }

    public Clients getClient(String clientRef)     //finding a Client by referenceNumber
    {
        Clients u = new Clients();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < ClientList.size())
        {
            u = ClientList.get(counter);
            if (u.getClientRef().equalsIgnoreCase(clientRef))
            {
                found = true;
            }
            counter++;
        }
        return u;
    }

    //adding Clients to database
    public void addClient(String clientRef, String clientName, String dateOfAss, String dateFinalRepReceived, String repOnHand, String repStartedBy, String occPreAcc, boolean invoicePaid, boolean reportSent, String clientEmail) throws SQLException   // adding new clients.
    {
        if (db.update("INSERT INTO tblClients(ClientReferenceNumber, CLIENTNAME, DATEOFASSESSMENT, DateFinalReportReceived, ReportsOnHand, ReportStartedBy, OccupationPreAccident, InvoicePaid, ReportSent, ClientEmailAddress) VALUES('" + clientRef + "','" + clientName + "',#" + dateOfAss + "#,#" + dateFinalRepReceived + "#,'" + repOnHand + "','" + repStartedBy + "','" + occPreAcc + "'," + invoicePaid + "," + reportSent + ",'" + clientEmail + "')") > 0)
        {
            getAllClients();
            JOptionPane.showMessageDialog(null, "Client successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Client NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // editing Clients in data base
    public void editClient(String clientRef, String clientName, String dateOfAss, String dateFinalRepReceived, String repOnHand, String repStartedBy, String occPreAcc, boolean invoicePaid, boolean reportSent, String clientEmail) throws SQLException     // updating clients's details.
    {

        if (db.update("Update tblClients Set ClientReferenceNumber = '" + clientRef + "', ClientName = '" + clientName + "', DATEOFASSESSMENT = #" + dateOfAss + "#, DATEFINALREPORTRECEIVED = #" + dateFinalRepReceived + "#, ReportsOnHand = '" + repOnHand + "', ReportStartedBy = '" + repStartedBy + "', OccupationPreAccident = '" + occPreAcc + "', InvoicePaid = " + invoicePaid + ", ReportSent = " + reportSent + ", ClientEmailAddress = '" + clientEmail + "' Where ClientReferenceNumber = '" + clientRef + "'") > 0)
        {
            getAllClients();
            JOptionPane.showMessageDialog(null, "Client successfully edited", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Client NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

// deleting Clients in data base
    public void deleteClient(String clientRefDel) throws SQLException      //removes Client entirely
    {
        if (db.update("DELETE * FROM tblClients WHERE ClientReference = '" + clientRefDel + "'") > 0)
        {
            getAllClients();
            JOptionPane.showMessageDialog(null, "Client successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Client NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // methods for populating combo boxes and Jtables:
    public void populateJTable(javax.swing.JTable ClientTable, int rowSelect)
    {
        DefaultTableModel model = (DefaultTableModel) ClientTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < ClientList.size(); i++)
        {
            Data.Clients u = ClientList.get(i);         // goes through each Client in the list and sorts all values for each row (1 user = 1 row)

            Object[] rowData =
            {
                u.getClientRef(), u.getClientName(), u.getDateOfAss(), u.getDateFinalRepReceived(), u.getRepOnHand(), u.getRepStartedBy(), u.getOccupationPreAcc(), u.isInvoicePaid(), u.isReportSent(), u.getClientEmail()
            };
            model.addRow(rowData);
        }

        ClientTable.setModel(model);

        if (ClientTable.getRowCount() > 0)
        {
            ClientTable.setRowSelectionInterval(rowSelect, rowSelect);
        }
    }

}
