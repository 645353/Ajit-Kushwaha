// Name: Ajit Kushwaha
// Student ID: S2400273

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S2400273", "Ajit Kushwaha", "ajit.kushwaha@example.com");
        Student student2 = new Student("S2400274", "Asha Sharma", "asha.sharma@example.com");
        Student student3 = new Student("S2400275", "Bikash Rai", "bikash.rai@example.com");

        // Create courses
        Course course1 = new Course("ITS206", "Software Construction and Design", 2);
        Course course2 = new Course("ITS207", "Database Systems", 2);

        // Create enrolments
        List<Enrolment> enrolments = new ArrayList<>();
        enrolments.add(new Enrolment(student1, course1, LocalDate.now().toString()));
        enrolments.add(new Enrolment(student2, course1, LocalDate.now().toString()));
        enrolments.add(new Enrolment(student3, course1, LocalDate.now().toString())); // triggers waitlist
        enrolments.add(new Enrolment(student1, course2, LocalDate.now().toString()));
        enrolments.add(new Enrolment(student2, course2, LocalDate.now().toString()));

        System.out.println("===== STUDENT ENROLMENT SYSTEM =====\n");

        System.out.println("Student Information");
        System.out.println("----------------------------------------------");
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
        System.out.println();
        student3.displayStudentInfo();
        System.out.println("\n");

        System.out.println("Course Details");
        System.out.println("----------------------------------------------");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println("\n");

        System.out.println("Creating Enrolments");
        System.out.println("----------------------------------------------");
        for (Enrolment enrolment : enrolments) {
            enrolment.createEnrolment();
        }

        System.out.println("All Enrolment Information");
        System.out.println("----------------------------------------------");
        for (Enrolment enrolment : enrolments) {
            enrolment.displayEnrolmentDetails();
        }

        System.out.println("Final Course Summary");
        System.out.println("----------------------------------------------");
        course1.displayCourseDetails();
        System.out.println("Waitlist for " + course1.getCourseCode() + ": " + course1.getWaitlistedStudents());
        System.out.println();
        course2.displayCourseDetails();
        System.out.println("Waitlist for " + course2.getCourseCode() + ": " + course2.getWaitlistedStudents());
    }
}
