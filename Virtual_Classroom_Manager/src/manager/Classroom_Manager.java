package manager;
import classroom.Classroom;
import student.Student;
import assignment.Assignment;
import java.util.ArrayList;

public class Classroom_Manager {
    private static Classroom_Manager ins;
    
    private ArrayList<Classroom> classrooms;

    private Classroom_Manager() {
        
        classrooms = new ArrayList<>();
    }
    

    public static Classroom_Manager getInstance() {
        if (ins == null) {
            ins = new Classroom_Manager();
        }
        
        return ins;
        
    }
    
    
    

    public void add_Classroom(String className) {
        classrooms.add(new Classroom(className));
        System.out.println("Classroom '" + className + "' created!");
    }

    public void addStudent(String student_Id, String className) {
        Classroom classroom = find_Classroom(className);
        if (classroom != null) {
            classroom.addStudent(student_Id);
        } else {
            System.out.println("Classroom '" + className + "' is not found!");
        }
        
    }

    
    
    
    public void schedule_Assignment(String className, String info) {
        Classroom classroom = find_Classroom(className);
        if (classroom != null) {
            classroom.schedule_Assignment(info);
        } 
        else {
            System.out.println("Classroom '" + className + "' is not found!");
        }
    }

    public void submit_Assignment(String student_Id, String className, String info) {
        Classroom classroom = find_Classroom(className);
        if (classroom != null) {
            classroom.submit_Assignment(student_Id, info);
        } 
        
        else {
            System.out.println("Classroom '" + className + "' is not found!");
        }
        
        
    }

    

    private Classroom find_Classroom(String className) {
        for (Classroom classroom : classrooms) {
            if (classroom.getClassName().equals(className)) {
                return classroom;
            }
            
            
        }
        return null;
    }
    
    public void listStudents(String className) {
        Classroom classroom = find_Classroom(className);
        if (classroom != null) {
            classroom.listStudents();
        } 
        else {
            System.out.println("Classroom '" + className + "' is not found!");
        }
        
       
        
    }
    
    
    
    
}