// Updated Course class
// Name: Ajit Kushwaha
// Student ID: S2400273

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int maximumCapacity;
    private List<Student> enrolledStudents;
    private List<Student> waitlistedStudents;

    public Course(String courseCode, String courseName, int maximumCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maximumCapacity = maximumCapacity;
        this.enrolledStudents = new ArrayList<>();
        this.waitlistedStudents = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public List<Student> getWaitlistedStudents() {
        return waitlistedStudents;
    }

    public boolean isFull() {
        return enrolledStudents.size() >= maximumCapacity;
    }

    public void addEnrolledStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void addWaitlistedStudent(Student student) {
        waitlistedStudents.add(student);
    }

    public void displayCourseDetails() {
        System.out.println("Course Code     : " + courseCode);
        System.out.println("Course Name     : " + courseName);
        System.out.println("Maximum Capacity: " + maximumCapacity);
        System.out.println("Enrolled        : " + enrolledStudents.size());
        System.out.println("Waitlisted      : " + waitlistedStudents.size());
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}
