package mk.ukim.finki.aud.aud6.ex2.solved;

/** A lecture offer with its date, starting time, place, and fee. */
public class Lecture
{
    private String date;
    private String time;
    private String place;
    private int fee;

    public Lecture(String date, String time, String place, int fee)
    {
        this.date = date;
        this.time = time;
        this.place = place;
        this.fee = fee;
    }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getPlace() { return place; }
    public void setPlace(String place) { this.place = place; }
    public int getFee() { return fee; }
    public void setFee(int fee) { this.fee = fee; }

    @Override
    public String toString()
    {
        return time + " " + place + " " + fee;
    }
}
