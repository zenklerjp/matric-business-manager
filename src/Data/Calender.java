package Data;

public class Calender
{

    private String event;
    private String dateEvent;
    private String timeEvent;

    public Calender(String event, String dateEvent, String timeEvent)
    {

        this.event = event;
        this.dateEvent = dateEvent;
        this.timeEvent = timeEvent;
    }

    public Calender()
    {

    }

    public String getEvent()
    {
        return event;
    }

    public String getDateEvent()
    {
        return dateEvent;
    }

    public String getTimeEvent()
    {
        return timeEvent;
    }

    public void setEvent(String event)
    {
        this.event = event;
    }

    public void setDate(String dateEvent)
    {
        this.dateEvent = dateEvent;
    }

    public void setTime(String timeEvent)
    {
        this.timeEvent = timeEvent;
    }

    @Override
    public String toString()
    {
        return "Calender{" + "event=" + event + ", dateEvent=" + dateEvent + ", timeEvent=" + timeEvent + '}';
    }

}
