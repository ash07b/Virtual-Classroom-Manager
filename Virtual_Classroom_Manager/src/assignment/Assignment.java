package assignment;
public class Assignment {
    private String details;
    
    private boolean submitted;

    public Assignment(String details) {
        this.details = details;
        this.submitted = false;
    }

    public String getDetails() {
        return details;
    }

    public void submit(String student_Id) {
        if (!submitted) {
            submitted = true;
            System.out.println("Assignment has been submitted by student '" + student_Id + "'.");
        } 
        
        else {
            System.out.println("Assignment is already submitted!");
        }
        
        
    }
    
}

