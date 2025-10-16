import java.io.Serializable;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String courseCode;
    private String title;
    
    // Default constructor
    public Course() {
    }
    
    // Parameterized constructor
    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
    }
    
    // Getters
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getTitle() {
        return title;
    }
    
    // Setters
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}