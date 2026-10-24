package mk.ukim.finki.aud.aud3.ex3.solved;

import mk.ukim.finki.dataStructures.queue.ArrayQueue;

public class Main
{
    public static void main(String[] args)
    {
        runExample("Case 1: All students can be served", new Student[] {
                new Student("231001", 60),
                new Student("231002", 90),
                new Student("231003", 30)
        });

        runExample("Case 2: Some students cannot be served", new Student[] {
                new Student("231001", 60),
                new Student("231002", 90),
                new Student("231003", 45),
                new Student("231004", 10)
        });
    }

    private static void runExample(String description, Student[] students)
    {
        System.out.println(description);
        System.out.println("Students before processing:");
        ArrayQueue<Student> studentsQueue = new ArrayQueue<>(students.length);
        int totalMinutes = 0;
        for (Student student : students)
        {
            System.out.println(student.index + " - " + student.minutes + " minutes");
            totalMinutes += student.minutes;
            studentsQueue.enqueue(student);
        }
        System.out.println("Total required service time: " + totalMinutes + " minutes");

        StudentServiceQueue exercise = new StudentServiceQueue();
        Student student = exercise.iterateStudentsQueue(studentsQueue);
        if (studentsQueue.isEmpty())
        {
            System.out.println("All students were served.");
        }
        else if (student == null)
        {
            System.out.println("TODO: Implement iterateStudentsQueue to see the service results.");
        }
        else
        {
            System.out.println("First unserved student: " + student.index);
            System.out.println("Number of unserved students: " + studentsQueue.size());
        }
        System.out.println();
    }
}
