package classroom;
import student.Student;
import java.util.ArrayList;


public class Classroom {
    
    private String className;
    private ArrayList<Student> students;
    private ArrayList<String> assignments;

    public Classroom(String className) {
        
        
        this.className = className;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void addStudent(String student_Id) {
        students.add(new Student(student_Id));
        
        System.out.println("Student '" + student_Id + "' is added to the classroom '" + className + "'!");
    }

    public void schedule_Assignment(String info) {
        assignments.add(info);
        
        System.out.println("Assignment assigned for classroom '" + className + "' is: " + info);
    }

    public void submit_Assignment(String student_Id, String info) {
        
        System.out.println("Assignment '" + info + "' has been submitted by student '" + student_Id + "' in classroom '" + className + "'!");
    }
    
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled in classroom '" + className + "'.");
        } 
        else {
            System.out.println("Students in classroom '" + className + "':");
            
            for (Student student : students) {
                
                System.out.println("*" + student.getStudentId());
            }
            
        }
        
        
    }

    
    
}
