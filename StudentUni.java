import java.util.ArrayList;
// import Array list for course list 
public class StudentUni {
    private String studentID;
    private String name;
    private int age;
    private String department;
    private ArrayList<String> courses; //list of enrolled courses
    private double gpa;

// constractor to initialize values 
 StudentUni(String studentID, String name, int age, String department){
    this.studentID = studentID;
    this.name = name;
    this.age = age;
    this.department = department;
    this.courses = new ArrayList<>();// Initialize an empty course list  
    this.gpa= 0.0; //default gpa
 }
 //method to enroll in a course
 public void enrollCourses(String course){
    courses.add(course);;
    System.out.println(name + " has enrolled in " + course);

 }
 //method to drop a course
 public void dropCourse(String course){
   if(courses.contains(course)){
    courses.remove(course);
    System.out.println(name +"has dropped " +course);

   }else{
    System.out.println("Course not found in the student course");
    
   }
 }
 // Method to view enrolled courses
 public void viewCourses(){
    System.out.println(name + " is enrolled in: " + courses);
 }
 // Method to update GPA
 public void updateGPA(double newGPA){
    this.gpa = newGPA;
    System.out.println(name + "'s GPA has been updated to " + gpa);
 }
 // Method to display student details
 public void displayStudentDetails(){
    System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Enrolled Courses: " + courses);
        System.out.println("GPA: " + gpa);
 }



    public static void main(String[] args) {
        
        StudentUni student1 = new StudentUni("00023", "Jalal", 21, "Software Engineering");

        student1.enrollCourses("java programing");
        student1.enrollCourses("java Script");

        student1.viewCourses();

        student1.updateGPA(3.3);

        System.out.println("\nStudent Details:");
        student1.displayStudentDetails();

        student1.dropCourse("Java Script");

        student1.viewCourses();
    }
}
