package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ReportsData
{

    private dbManager db;

    public String getTop5Employees2() throws SQLException
    {
        db = new dbManager();

        ResultSet rs = db.query("SELECT TOP 5 tblEmployees.nameOfEmployee, COUNT(tblPayments.username) FROM tblPayments, tblEmployees WHERE tblPayments.username = tblEmployees.username GROUP BY tblEmployees.nameOfEmployee ORDER BY COUNT(tblPayments.username) DESC");
        String output = String.format("%-50s%-15s%n", "Employee:", "Payments Initiated:");
        output += "=================================================================\n";

        while (rs.next())
        {
            output += String.format("%-50s%-15d%n", rs.getString("tblEmployees.nameOfEmployee"), rs.getInt(2));
        }

        return output;
    }

    // returns a formatted string of the lowest 5 Employees
    public String getLowest5Employees1() throws SQLException
    {
        db = new dbManager();

        ResultSet rs = db.query("SELECT TOP 5 tblEmployees.nameOfEmployee, COUNT(tblPayments.username) FROM tblPayments, tblEmployees WHERE tblPayments.username = tblEmployees.username GROUP BY tblEmployees.nameOfEmployee ORDER BY COUNT(tblPayments.username) ASC");
        String output = String.format("%-50s%-15s%n", "Employee:", "Payments Initiated:");
        output += "=================================================================\n";

        while (rs.next())
        {
            output += String.format("%-50s%-15d%n", rs.getString("tblEmployees.nameOfEmployee"), rs.getInt(2));
        }

        return output;
    }

    // creates pie chart of top 5 employees
    public void getTop5EmployeesPieChart() throws SQLException
    {
        db = new dbManager();
        String[] categoryLabels = new String[5];
        int[] values = new int[5];

        ResultSet rs = db.query("SELECT TOP 5 tblEmployees.nameOfEmployee, COUNT(tblPayments.username) FROM tblPayments, tblEmployees WHERE tblPayments.username = tblEmployees.username GROUP BY tblEmployees.nameOfEmployee ORDER BY COUNT(tblPayments.username) DESC");
        int count = 0;
        while (rs.next())
        {
            categoryLabels[count] = rs.getString("tblEmployees.NAMEOFEmployee");
            values[count] = rs.getInt(2);
            count++;
        }

        DefaultPieDataset data = new DefaultPieDataset();

        for (int i = 0; i < count; i++)
        {
            data.setValue(categoryLabels[i], values[i]);
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Top 5 Employees by Payments Initiated", data, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Top 5 Employees by Payments Initiated", pieChart);
        graphFrame.pack();
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);
        graphFrame.setResizable(false);
    }

    // creates bar graph of top 5 employees
    public void getTop5EmployeesBarGraph() throws SQLException
    {
        db = new dbManager();

        String[] categoryLabels = new String[5];
        int[] values = new int[5];

        ResultSet rs = db.query("SELECT TOP 5 tblEmployees.nameOfEmployee, COUNT(tblPayments.username) FROM tblPayments, tblEmployees WHERE tblPayments.username = tblEmployees.username GROUP BY tblEmployees.nameOfEmployee ORDER BY COUNT(tblPayments.username) DESC");
        int count = 0;
        while (rs.next())
        {
            categoryLabels[count] = rs.getString("tblEmployees.NAMEOFEmployee");
            values[count] = rs.getInt(2);
            count++;
        }

        DefaultCategoryDataset data = new DefaultCategoryDataset();

        for (int j = 0; j < count; j++)
        {
            data.addValue(values[j], "Payments Initiated", categoryLabels[j]);
        }

        JFreeChart barChart = ChartFactory.createBarChart("Top 5 Employees by Payments Initiated", "Name of Employee", "Sales Made", data, PlotOrientation.VERTICAL, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Top 5 Employees by Payments Initiated", barChart);
        graphFrame.pack();
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);
        graphFrame.setResizable(false);
    }

    // creates bar graph of top 5 employees in a date range
    public void getDateRangeTop5EmployeesBarGraph(String sDate, String eDate) throws SQLException
    {
        db = new dbManager();

        String[] categoryLabels = new String[5];
        int[] values = new int[5];
        //"SELECT TOP 5 USERS.USERNAME, COUNT(SALES.USERNAME) AS [Sales Made] FROM SALES, USERS WHERE SALES.USERNAME = USERS.USERNAME AND DATEOFSALE >= #" + sDate + "# AND DATEOFSALE <= #" + eDate + "# GROUP BY USERS.USERNAME ORDER BY COUNT(SALES.USERNAME) DESC"

        ResultSet rs = db.query("SELECT TOP 5 TBLEMPLOYEES.NAMEOFEmployee, COUNT(tblPayments.USERNAME) AS [Payments Initiated] FROM tblPayments, tblEmployees WHERE tblPayments.USERNAME = tblEmployees.USERNAME AND DATEOFPayment >= #" + sDate + "# AND DATEOFPayment <= #" + eDate + "# GROUP BY tblEmployees.USERNAME ORDER BY COUNT(tblPayments.USERNAME) DESC");
        int count = 0;
        while (rs.next())
        {
            categoryLabels[count] = rs.getString("tblEmployees.NAMEOFEmployee");
            values[count] = rs.getInt(2);
            count++;
        }

        DefaultCategoryDataset data = new DefaultCategoryDataset();

        for (int j = 0; j < count; j++)
        {
            data.addValue(values[j], "Payments Initiated", categoryLabels[j]);
        }

        JFreeChart barChart = ChartFactory.createBarChart("Top 5 Employees by Payments Initiated from " + sDate.substring(3, 5) + "/" + sDate.substring(0, 2) + "/" + sDate.substring(6) + " to " + eDate.substring(3, 5) + "/" + eDate.substring(0, 2) + "/" + eDate.substring(6), "Username", "Payments Initiated", data, PlotOrientation.VERTICAL, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Top 5 Employees by Payments Initiated from " + sDate.substring(3, 5) + "/" + sDate.substring(0, 2) + "/" + sDate.substring(6) + " to " + eDate.substring(3, 5) + "/" + eDate.substring(0, 2) + "/" + eDate.substring(6), barChart);
        graphFrame.pack();
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);
        graphFrame.setResizable(false);
    }

    // creates pie chart of top 5 employees in a date range
    public void getDateRangeTop5EmployeesPieChart(String sDate, String eDate) throws SQLException
    {
        db = new dbManager();
        String[] categoryLabels = new String[5];
        int[] values = new int[5];

        ResultSet rs = db.query("SELECT TOP 5 TBLEMPLOYEES.NAMEOFEmployee, COUNT(tblPayments.USERNAME) AS [Payments Initiated] FROM tblPayments, tblEmployees WHERE tblPayments.USERNAME = tblEmployees.USERNAME AND DATEOFPayment >= #" + sDate + "# AND DATEOFPayment <= #" + eDate + "# GROUP BY tblEmployees.USERNAME ORDER BY COUNT(tblPayments.USERNAME) DESC");
        int count = 0;
        while (rs.next())
        {
            categoryLabels[count] = rs.getString("tblEmployees.NAMEOFEmployee");
            values[count] = rs.getInt(2);
            count++;
        }

        DefaultPieDataset data = new DefaultPieDataset();

        for (int i = 0; i < count; i++)
        {
            data.setValue(categoryLabels[i], values[i]);
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Top 5 Employees by Payments Initiated from " + sDate.substring(3, 5) + "/" + sDate.substring(0, 2) + "/" + sDate.substring(6) + " to " + eDate.substring(3, 5) + "/" + eDate.substring(0, 2) + "/" + eDate.substring(6), data, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Top 5 Employees by Payments Initiated from " + sDate.substring(3, 5) + "/" + sDate.substring(0, 2) + "/" + sDate.substring(6) + " to " + eDate.substring(3, 5) + "/" + eDate.substring(0, 2) + "/" + eDate.substring(6), pieChart);
        graphFrame.pack();
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);
        graphFrame.setResizable(false);
    }

    // returns formatted of top 5 employees in a date range
    public String getDateRangeTop5Employees(String sDate, String eDate) throws SQLException
    {
        db = new dbManager();

        ResultSet rs = db.query("SELECT TOP 5 TBLEMPLOYEES.NAMEOFEmployee, COUNT(tblPayments.USERNAME) AS [Payments Initiated] FROM tblPayments, tblEmployees WHERE tblPayments.USERNAME = tblEmployees.USERNAME AND DATEOFPayment >= #" + sDate + "# AND DATEOFPayment <= #" + eDate + "# GROUP BY tblEmployees.USERNAME ORDER BY COUNT(tblPayments.USERNAME) DESC");
        String output = String.format("%-50s%-15s%n", "Name of Employees:", "Payments Initiated:");
        output += "=================================================================\n";

        while (rs.next())
        {
            output += String.format("%-50s%-15d%n", rs.getString("tblEmployees.NAMEOFEmployee"), rs.getInt(2));
        }

        return output;
    }


}
