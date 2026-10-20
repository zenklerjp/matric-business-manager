package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeesData
{

    private dbManager db;

    private List<Employees> EmployeeList = new ArrayList();
    SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");    // getting date format
    

    public EmployeesData() throws SQLException
    {
        db = new dbManager();
        getAllEmployees();  //Runs the getAllEmployees method whenever an object of the class is created
    }

    //Fetches Details about the Employees from the database 
    public void getEmployeeList(String sql) throws SQLException  // throws SQLException  - error throwing for SQL connections.
    {
        ResultSet rs = db.query(sql);
        EmployeeList.clear();
        while (rs.next())
        {
            Employees u = new Employees();
            u.setUsername(rs.getString("Username"));
            u.setPassword(rs.getString("Password"));
            u.setNameOfEmployee(rs.getString("NameOfEmployee"));// "" must be spelt correctly according to database.
            u.setEmployeeLevel(rs.getString("EmployeeLevel"));
            u.setPosition(rs.getString("Position"));
            u.setDateOfEmp(dateForm.format(rs.getDate("DateOfEmployment")));
            u.setIdNum(rs.getString("IDNumber"));
            u.setSickDays(rs.getString("Leave/SickDays"));
            u.setEmail(rs.getString("EmailAddress"));
            u.setPhoneNum(rs.getString("PhoneNumber"));
            u.setActivityStatus(rs.getBoolean("ActivityStatus"));

            EmployeeList.add(u);
        }
    }

    public void getAllEmployees() throws SQLException        // selects all Employees
    {
        getEmployeeList("SELECT * FROM tblEmployees ORDER BY USERNAME");
    }

    public void getAllEmployees(String username) throws SQLException    // selects all Employees with inputed username
    {
        getEmployeeList("SELECT * FROM tblEmployees WHERE USERNAME LIKE '%" + username + "%'");   // one SQL statement
    }

    public void getAllEmployeesN(String nameOfEmployee) throws SQLException   // selects all Employees with inputed name
    {
        getEmployeeList("SELECT * FROM tblEMPLOYEES WHERE NAMEOFEMPLOYEE LIKE '%" + nameOfEmployee + "%'");
    }

    public void getAllEmployeesEL(String employeeLevel) throws SQLException   // selects all employees with inputed employee level
    {
        getEmployeeList("SELECT * FROM tblEMPLOYEES WHERE EmployeeLEVEL = " + employeeLevel);
    }

    public Employees getEmployee(String username)     //finding an employee by username
    {
        Employees u = new Employees();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < EmployeeList.size())
        {
            u = EmployeeList.get(counter);
            if (u.getUsername().equalsIgnoreCase(username))
            {
                found = true;
            }
            counter++;
        }
        return u;
    }

    public int getEmployeePosition(String username) //finding a Employee's position by username
    {
        int position = -1;
        Employees u = new Employees();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < EmployeeList.size())
        {
            u = EmployeeList.get(counter);
            if (u.getUsername().equalsIgnoreCase(username))
            {
                found = true;
                position = counter;
            }
            counter++;
        }
        return position;
    }

    //adding Employees to database
    public void addEmployee2(String username, String password, String nameOfEmployee, String employeeLevel, String position, String dateOfEmp, String IDNumber, String LeaveDays, String email, String phoneNum, boolean activityStatus) throws SQLException   // adding new users.
    {//'" + username + "','" + password + "','" + nameOfEmployee + "'," + employeeLevel + ",'" + position + "',#"+dateOfEmp+"#,'" + IDNumber + "'," +LeaveDays+ ",'" + email + "','" + phoneNum + "')"
        if (db.update("INSERT INTO tblEmployees(Username, Password, NameOfEmployee, EmployeeLevel, Position, DateOfEmployment, IDNumber, Leave/SickDays, EmailAddress, PhoneNumber) VALUES('test','34','jeff',3,'ballsman',#02/02/2022#,'0000000000000',2,'jaden@gmail.com','0837776789',true") > 0)
        {
            getAllEmployees();
            JOptionPane.showMessageDialog(null, "Employee successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Employee NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //", DATEOFEMPLOYMENT= '" + dateOfEmp + 
    
    // editing Employees in data base
    public void editEmployee(String username, String password, String nameOfEmployee, String employeeLevel, String position,String dateEmp,  String IDNumber, String LeaveDays, String email, String phoneNum, boolean activityStatus) throws SQLException     // updating user's details.
    {
        if (db.update("UPDATE tblEmployees SET USERNAME = '" + username + "', PASSWORD = '" + password + "', NAMEOFEMPLOYEE = '" + nameOfEmployee + "',EMPLOYEELEVEL = " + employeeLevel + ", POSITION = '" + position + "',DateOfEmployment = #" +dateEmp + "#,IDNUMBER= '" + IDNumber + "', LEAVE/SICKDAYS= " + LeaveDays + ", EMAILADDRESS= '" + email + "', PHONENUMBER = '" + phoneNum + "', ACTIVITYSTATUS = " + activityStatus + " WHERE USERNAME = '" + username + "'") > 0)
        {
            getAllEmployees();
            JOptionPane.showMessageDialog(null, "Employee successfully edited", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Employee NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // deleting Employee in data base
    public void deleteEmployee(String usernameDel) throws SQLException      //removes Employee entirely
    {
        if (db.update("DELETE * FROM tblEmployees WHERE USERNAME = '" + usernameDel + "'") > 0)
        {
            getAllEmployees();
            JOptionPane.showMessageDialog(null, "Employee successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Employee NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    // populating JTable:
    public void populateJTable(javax.swing.JTable paymentTable, int rowSelect)
    {
        DefaultTableModel model = (DefaultTableModel) paymentTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < EmployeeList.size(); i++)
        {
            Data.Employees e = EmployeeList.get(i);

            Object[] rowData =
            {
                e.getUsername(), e.getPassword(), e.getNameOfEmployee(), e.getEmployeeLevel(), e.getPosition(), e.getDateOfEmp(), e.getIdNum(), e.getSickDays(), e.getEmail(), e.getPhoneNum(), e.isActivityStatus()
            };

            model.addRow(rowData);
        }

        paymentTable.setModel(model);

        if (paymentTable.getRowCount() > 0)
        {
            paymentTable.setRowSelectionInterval(rowSelect, rowSelect);
        }
    }

    //populates jtables with data retrieved from Database
    public void populateJTable2(javax.swing.JTable paymentTable)
    {

        DefaultTableModel model = (DefaultTableModel) paymentTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < EmployeeList.size(); i++)
        {
            Data.Employees e = EmployeeList.get(i);

            Object[] rowData =
            {
                e.getUsername(), e.getPassword(), e.getNameOfEmployee(), e.getEmployeeLevel(), e.getPosition(), e.getDateOfEmp(), e.getIdNum(), e.getSickDays(), e.getEmail(), e.getPhoneNum(), e.isActivityStatus()
            };

            model.addRow(rowData);
        }
        paymentTable.setModel(model);
    }

    //populates jcombobox with data retrieved from Database
    public void populateJComboBox(javax.swing.JComboBox EmployeeLevelCombo)
    {
        EmployeeLevelCombo.removeAllItems();
        int count = 1;
        for (int i = 0; i < 4; i++)          // specified '4' to allow user levels 1 - 4 only
        {
            EmployeeLevelCombo.addItem(count);
            count++;
        }
    }

}
