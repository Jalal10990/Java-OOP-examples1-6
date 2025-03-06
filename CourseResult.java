public class CourseResult {

private String studentName;
private String courseName;
private String grade;

//constructor
CourseResult(String studentName, String courseName, String grade){
this.studentName = studentName;
this.courseName = courseName;
this.grade = grade;
}
//getter method
public String getStudentName(){
    return studentName;
}

public String getcourseName(){
    return courseName;
}
public String getgrade(){
    return grade;
}
//setter methd
public void setStudentName(String studentName){
    this.studentName = studentName;
}
public void setcourseName(String courseName){
    this.courseName = courseName;
}
public void setgrade(String grade){
    this.grade = grade;
}

public void displayResult(){
    System.out.println("Student name: "+ studentName);
    System.out.println("Course name: "+ courseName);
    System.out.println("Grade: "+ grade);
}
    public static void main(String[] args) {
        CourseResult result = new CourseResult("Shah Jalal", "JS", "A+");
    
result.displayResult();    
}
}