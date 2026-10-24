package mk.ukim.finki.aud.aud3.ex3.solved;

/** A student waiting in the service queue, with the required service time. */
public class Student
{
    public String index;
    public int minutes;

    /**
     * Creates a student entry.
     *
     * @param index the student's index number
     * @param minutes the time needed to serve the student, in minutes
     */
    public Student(String index, int minutes)
    {
        this.index = index;
        this.minutes = minutes;
    }
}
