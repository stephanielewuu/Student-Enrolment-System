import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String studentNumber;
    private String name;
    
    // Default constructor
    public Student() {
    }
    
    // Parameterized constructor
    public Student(String studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }
    
    // Getters
    public String getStudentNumber() {
        return studentNumber;
    }
    
    public String getName() {
        return name;
    }
    
    // Setters
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}