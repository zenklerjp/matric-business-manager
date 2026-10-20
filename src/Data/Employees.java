package Data;


public class Employees
{
    
    private String username;
    private String password;
    private String nameOfEmployee;
    private String EmployeeLevel;
    private String position;
    private String dateOfEmp;
    private String idNum;
    private String sickDays;
    private String email;
    private String phoneNum;
    private boolean activityStatus;

    public Employees(String username, String password, String nameOfEmployee,String EmployeeLevel, String position, String dateOfEmp, String idNum, String sickDays, String email, String phoneNum, boolean activityStatus)
    {
        this.username = username;
        this.password = password;
        this.nameOfEmployee = nameOfEmployee;
        this.EmployeeLevel = EmployeeLevel;
        this.position = position;
        this.dateOfEmp = dateOfEmp;
        this.idNum = idNum;
        this.sickDays = sickDays;
        this.email = email;
        this.phoneNum = phoneNum;
        this.activityStatus = activityStatus;
    }

    

    public Employees()
    {

    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getNameOfEmployee()
    {
        return nameOfEmployee;
    }

    public String getEmployeeLevel()
    {
        return EmployeeLevel;
    }

    public String getPosition()
    {
        return position;
    }

    public String getDateOfEmp()
    {
        return dateOfEmp;
    }

    public String getIdNum()
    {
        return idNum;
    }

    public String getSickDays()
    {
        return sickDays;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhoneNum()
    {
        return phoneNum;
    }

    public boolean isActivityStatus()
    {
        return activityStatus;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setNameOfEmployee(String nameOfEmployee)
    {
        this.nameOfEmployee = nameOfEmployee;
    }

    public void setEmployeeLevel(String EmployeeLevel)
    {
        this.EmployeeLevel = EmployeeLevel;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void setDateOfEmp(String dateOfEmp)
    {
        this.dateOfEmp = dateOfEmp;
    }

    public void setIdNum(String idNum)
    {
        this.idNum = idNum;
    }

    public void setSickDays(String sickDays)
    {
        this.sickDays = sickDays;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    public void setActivityStatus(boolean activityStatus)
    {
        this.activityStatus = activityStatus;
    }

    @Override
    public String toString()
    {
        return "Employees{" + "username=" + username + ", password=" + password + ", nameOfEmployee=" + nameOfEmployee + ", EmployeeLevel=" + EmployeeLevel + ", position=" + position + ", dateOfEmp=" + dateOfEmp + ", idNum=" + idNum + ", sickDays=" + sickDays + ", email=" + email + ", phoneNum=" + phoneNum + ", activityStatus=" + activityStatus + '}';
    }

    

    

    

    
}
