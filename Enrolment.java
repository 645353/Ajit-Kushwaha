// Updated Enrolment class
// Name: Ajit Kushwaha
// Student ID: S2400273

public class Enrolment {
    private Student student;
    private Course course;
    private String enrolmentDate;
    private String status;

    public Enrolment(Student student, Course course, String enrolmentDate) {
        this.student = student;
        this.course = course;
        this.enrolmentDate = enrolmentDate;
        this.status = "PENDING";
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(String enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void createEnrolment() {
        if (course.isFull()) {
            course.addWaitlistedStudent(student);
            status = "WAITLISTED";
            System.out.println(student.getName() + " could not be enrolled in " + course.getCourseName()
                    + " because the course is full.");
            System.out.println(student.getName() + " has been added to the waitlist.");
        } else {
            course.addEnrolledStudent(student);
            status = "ENROLLED";
            System.out.println(student.getName() + " has been successfully enrolled in " + course.getCourseName() + ".");
        }
        System.out.println();
    }

    public void displayEnrolmentDetails() {
        System.out.println("Student        : " + student.getStudentId() + " - " + student.getName());
        System.out.println("Course         : " + course.getCourseCode() + " - " + course.getCourseName());
        System.out.println("Enrolment Date : " + enrolmentDate);
        System.out.println("Status         : " + status);
        System.out.println("----------------------------------------------");
    }
}
