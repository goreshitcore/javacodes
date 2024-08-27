
public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
	//get method
	
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    // Set method for name
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "name = " + name + "\nscore = " + score;
    }
	public static void main(String[] args) {

	    // Create a Student instance
        Student student = new Student("Holly Day", 88);
        
        
        //Student student = new Student("Justin Case", 10);
        //System.out.println(student.getName());
       // System.out.println(student.getScore());
        
        
        // Print the return value of the toString() method
        System.out.println(student.toString());		
		
		
	}

}
