package manager;

import java.util.Scanner;

public class Virtual_Classroom_Application {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Classroom_Manager classroomManager = Classroom_Manager.getInstance();

        System.out.println("Welcome to the Virtual Classroom Manager!!!");

        while (true) {
            
            System.out.print("Enter command (add_Classroom <class_name>, addStudent <student_id> <class_name>, schedule_Assignment <class_name> <info>, submit_Assignment <student_id> <class_name> <info>, listStudents <class_name>, exit): ");
            String command = scanner.nextLine();

            String[] parts = command.split(" ", 4); 

            if (parts.length == 2 && parts[0].equals("add_Classroom")) {
                String className = parts[1]; 
                
                classroomManager.add_Classroom(className);
                
            } 
            
            else if (parts.length == 3 && parts[0].equals("addStudent")) {
                String student_Id = parts[1]; 
                String className = parts[2]; 
                classroomManager.addStudent(student_Id, className);
                
            } 
            else if (parts.length == 3 && parts[0].equals("schedule_Assignment")) {
                String className = parts[1];
                String info = parts[2]; 
                classroomManager.schedule_Assignment(className, info);
            } 
            
            
            
            else if (parts.length == 4 && parts[0].equals("submit_Assignment")) {
                String student_Id = parts[1]; 
                String className = parts[2]; 
                String info = parts[3]; 
                classroomManager.submit_Assignment(student_Id, className, info);
            } 
            else if (parts.length == 2 && parts[0].equals("listStudents")) {
                String className = parts[1]; // Get the classroom name
                classroomManager.listStudents(className);
            }
            else if (command.equals("exit")) {
                System.out.println("Saved!");
                break;
                
            } 
            
            else {
                System.out.println("Invalid command! Please try again!");
            }
            
        }

        scanner.close();
        
        
    }
    
    
}
