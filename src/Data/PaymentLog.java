package Data;

public class PaymentLog
{

    private int paymentID;
    private String clientRef;
    private String username;
    private String dateOfPayment;
    private String timeOfPayment;
    private double priceOfPayment;

    public PaymentLog(int paymentID, String clientRef, String username, String dateOfPayment, String timeOfPayment, double priceOfPayment)
    {
        this.paymentID = paymentID;
        this.clientRef = clientRef;
        this.username = username;
        this.dateOfPayment = dateOfPayment;
        this.timeOfPayment = timeOfPayment;
        this.priceOfPayment = priceOfPayment;

    }

    public PaymentLog()
    {

    }

    public int getPaymentID()
    {
        return paymentID;
    }

    public String getClientRef()
    {
        return clientRef;
    }

    public String getUsername()
    {
        return username;
    }

    public String getDateOfPayment()
    {
        return dateOfPayment;
    }

    public String getTimeOfPayment()
    {
        return timeOfPayment;
    }

    public double getPriceOfPayment()
    {
        return priceOfPayment;
    }

    public void setPaymentID(int paymentID)
    {
        this.paymentID = paymentID;
    }

    public void setClientRef(String clientRef)
    {
        this.clientRef = clientRef;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setDateOfPayment(String dateOfPayment)
    {
        this.dateOfPayment = dateOfPayment;
    }

    public void setTimeOfPayment(String timeOfPayment)
    {
        this.timeOfPayment = timeOfPayment;
    }

    public void setPriceOfPayment(double priceOfPayment)
    {
        this.priceOfPayment = priceOfPayment;
    }

    @Override
    public String toString()
    {
        return "PaymentLog{" + "paymentID=" + paymentID + ", clientRef=" + clientRef + ", username=" + username + ", dateOfPayment=" + dateOfPayment + ", timeOfPayment=" + timeOfPayment + ", priceOfPayment=" + priceOfPayment + '}';
    }

}
