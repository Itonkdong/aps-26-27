package mk.ukim.finki.aud.aud3.ex3.solved;

import mk.ukim.finki.dataStructures.queue.ArrayQueue;

/**
 * <h2>Exercise 3: Serving Students During Office Hours</h2>
 *
 * <h3>Description</h3>
 * <p>The faculty's student service office works with students from 09:00
 * to 12:00. Given the time needed to serve each student in the queue,
 * determine the first student who will not be served and the number of
 * students left unserved that day.</p>
 *
 * <h3>Expected Behavior</h3>
 * <p>Process students in queue order within the available 180 minutes.
 * Remove fully served students from the queue and leave the first unserved
 * student and everyone behind them in it. A student whose service finishes
 * exactly at 12:00 can be served.</p>
 *
 * <h3>Input and Output</h3>
 * <p>Main runs two hardcoded examples without reading standard input.
 * Before processing each queue, it prints every student's index number and
 * required service time, followed by the total required time. It then reports
 * either that everyone was served or the first unserved student's index and
 * the remaining count.</p>
 *
 * <h3>Example</h3>
 * <pre>
 * Case 1:
 * 231001 60
 * 231002 90
 * 231003 30
 * Total: 180 minutes
 * Expected after implementation: All students were served.
 *
 * Case 2:
 * 231001 60
 * 231002 90
 * 231003 45
 * 231004 10
 * Total: 205 minutes
 * Expected after implementation:
 * First unserved student: 231003
 * Number of unserved students: 2
 * </pre>
 * <p>Until implementation, Main prints a TODO message for a nonempty queue.</p>
 *
 * <h3>Source</h3>
 * <p>One-Dimensional Data Structures, exercise 3
 * (03_Ednodimenzionalni_podatocni_strukturi.pdf, pages 29-31).</p>
 */
public class StudentServiceQueue
{
    /**
     * Removes students who can be fully served within the office hours.
     *
     * @param studentsQueue the students in arrival order
     * @return the first unserved student, or null if everyone was served
     */
    public Student iterateStudentsQueue(ArrayQueue<Student> studentsQueue)
    {
        // TODO: Implement this method; null is a placeholder return value.
        return null;
    }
}
