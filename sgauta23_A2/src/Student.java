public class Student extends Person {
    private int studentNumber; private String degree; private double GPA;
    public Student(String name, String email, int age, int studentNumber, String degree) {
        super(name, email, age);
        this.studentNumber = studentNumber;
        this.degree = degree;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
