package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CalenderData
{

    private dbManager db;

    private List<Calender> CalenderList = new ArrayList();
     SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");    // getting date format
    SimpleDateFormat timeForm = new SimpleDateFormat("HH:mm:ss");      // getting time format

    public CalenderData() throws SQLException
    {
        db = new dbManager();
        getAllCalender();
    }

     //Fetches Details about the Appointment from the database 
    public void getCalenderList(String sql) throws SQLException  // throws SQLException  - error throwing for SQL connections.
    {
        ResultSet rs = db.query(sql);
        CalenderList.clear();
        while (rs.next())
        {
            Calender u = new Calender();
           
            u.setEvent(rs.getString("EventTitle"));
            u.setDate(dateForm.format(rs.getDate("DateOfEvent")));
            u.setTime(timeForm.format(rs.getTime("TimeOfEvent")));

            CalenderList.add(u);
        }
    }

    public void getAllCalender() throws SQLException        // selects all Appointments
    {
        getCalenderList("SELECT * FROM tblCalender ORDER BY DATEOFEVENT");
    }

    public void getAllCalender(String eventTitle) throws SQLException    // selects all Appointments with inputed event Title
    {
        getCalenderList("SELECT * FROM tblCalender WHERE EventTitle LIKE '%" + eventTitle + "%'");   // one SQL statement
    }

    public void getAllCalenderD(String dateOfEvent) throws SQLException   // selects all Appointments with inputed date of the event
    {
        getCalenderList("SELECT * FROM tblCalender WHERE DATEOFEVENT LIKE '%" + dateOfEvent + "%'");
    }

    public void getAllCalenderT(String timeOfEvent) throws SQLException   // selects all Appointments with inputed time of the event
    {
        getCalenderList("SELECT * FROM tblCalender WHERE TIMEOFEVENT = " + timeOfEvent);
    }

    public Calender getCalender(String eventTitle)     //finding an Appointments by the event title
    {
        Calender u = new Calender();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < CalenderList.size())
        {
            u = CalenderList.get(counter);
            if (u.getEvent().equalsIgnoreCase(eventTitle))
            {
                found = true;
            }
            counter++;
        }
        return u;
    }
 

    
    //adding appointment to data base" + dateEvent +"
    public void addCalender2(String event, String dateEvent, String timeEvent) throws SQLException, ParseException   // adding new items.
    {
        
        if (db.update("INSERT INTO tblCalender(EventTitle, DATEOFEVENT, TIMEOFEVENT) VALUES('" + event + "',#" + dateEvent + "#,#" +timeEvent+"#)") > 0)
        {
            getAllCalender();
            JOptionPane.showMessageDialog(null, "Appointment successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Appointment NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // editing Calender in data base
    public void editCalender(String event, String dateEvent, String timeEvent) throws SQLException     // updating Appointments's details.
    {
        if (db.update("UPDATE tblCalender SET EventTitle = '" + event + "', DATEOFEVENT = #" + dateEvent + "#, TIMEOFEVENT = #" + timeEvent + "# WHERE EventTitle = '" + event + "'") > 0)
        {
            getAllCalender();
            JOptionPane.showMessageDialog(null, "Appointment successfully edited", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Appointment NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // deleting Calender in data base
    public void deleteCalender(String eventTitle) throws SQLException      //removes Appointments entirely
    {
        if (db.update("DELETE * FROM tblCalender WHERE EVENTTITLE = '" + eventTitle + "'") > 0)
        {
            getAllCalender();
            JOptionPane.showMessageDialog(null, "Appointment successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Appointment NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // methods for populating combo boxes and Jtables:
    public void populateJTable(javax.swing.JTable CalenderTable, int rowSelect)
    {
        DefaultTableModel model = (DefaultTableModel) CalenderTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < CalenderList.size(); i++)
        {
            Data.Calender u = CalenderList.get(i);         // goes through each Event in the list and sorts all values for each row (1 user = 1 row)

            Object[] rowData =
            {
               u.getEvent(), u.getDateEvent(), u.getTimeEvent()
            };
            model.addRow(rowData);
        }

        CalenderTable.setModel(model);

        if (CalenderTable.getRowCount() > 0)
        {
            CalenderTable.setRowSelectionInterval(rowSelect, rowSelect);
        }
    }



}
