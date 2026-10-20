package Data;

public class Clients
{

    private String clientRef;
    private String clientName;
    private String dateOfAss;
    private String dateFinalRepReceived;
    private String repOnHand;
    private String repStartedBy;
    private String OccupationPreAcc;
    private boolean invoicePaid;
    private boolean ReportSent;
    private String clientEmail;

    public Clients(String clientRef, String clientName, String dateOfAss, String dateFinalRepReceived, String repOnHand, String repStartedBy, String OccupationPreAcc, boolean invoicePaid, boolean ReportSent, String clientEmail)
    {
        this.clientRef = clientRef;
        this.clientName = clientName;
        this.dateOfAss = dateOfAss;
        this.dateFinalRepReceived = dateFinalRepReceived;
        this.repOnHand = repOnHand;
        this.repStartedBy = repStartedBy;
        this.OccupationPreAcc = OccupationPreAcc;
        this.invoicePaid = invoicePaid;
        this.ReportSent = ReportSent;
        this.clientEmail = clientEmail;
    }

    

    public Clients()
    {

    }

    public String getClientRef()
    {
        return clientRef;
    }

    public String getClientName()
    {
        return clientName;
    }

    public String getDateOfAss()
    {
        return dateOfAss;
    }

    public String getDateFinalRepReceived()
    {
        return dateFinalRepReceived;
    }

    public String getRepOnHand()
    {
        return repOnHand;
    }

    public String getRepStartedBy()
    {
        return repStartedBy;
    }

    public String getOccupationPreAcc()
    {
        return OccupationPreAcc;
    }

    public boolean isInvoicePaid()
    {
        return invoicePaid;
    }

    public boolean isReportSent()
    {
        return ReportSent;
    }

    public String getClientEmail()
    {
        return clientEmail;
    }

    public void setClientRef(String clientRef)
    {
        this.clientRef = clientRef;
    }

    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    public void setDateOfAss(String dateOfAss)
    {
        this.dateOfAss = dateOfAss;
    }

    public void setDateFinalRepReceived(String dateFinalRepReceived)
    {
        this.dateFinalRepReceived = dateFinalRepReceived;
    }

    public void setRepOnHand(String repOnHand)
    {
        this.repOnHand = repOnHand;
    }

    public void setRepStartedBy(String repStartedBy)
    {
        this.repStartedBy = repStartedBy;
    }

    public void setOccupationPreAcc(String OccupationPreAcc)
    {
        this.OccupationPreAcc = OccupationPreAcc;
    }

    public void setInvoicePaid(boolean invoicePaid)
    {
        this.invoicePaid = invoicePaid;
    }

    public void setReportSent(boolean ReportSent)
    {
        this.ReportSent = ReportSent;
    }

    public void setClientEmail(String clientEmail)
    {
        this.clientEmail = clientEmail;
    }

    @Override
    public String toString()
    {
        return "Clients{" + "clientRef=" + clientRef + ", clientName=" + clientName + ", dateOfAss=" + dateOfAss + ", dateFinalRepReceived=" + dateFinalRepReceived + ", repOnHand=" + repOnHand + ", repStartedBy=" + repStartedBy + ", OccupationPreAcc=" + OccupationPreAcc + ", invoicePaid=" + invoicePaid + ", ReportSent=" + ReportSent + ", clientEmail=" + clientEmail + '}';
    }

    
   

}
