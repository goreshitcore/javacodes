
public class StudentApplication {
	String fname;
	String lname;
	int ID;

	//constructor
    public StudentApplication(String fname, String lname, int ID) {
        this.fname = fname;
        this.lname = lname;
        this.ID = ID;
    }	
	
	//get method
    public String getfname() {
        return this.fname = fname;
    }
    public String getlname() {
        return this.lname = lname;
    }
	
	//set method
    public void setfname(String fname) {
        this.fname = fname;
    }	
    
    public void setlname(String lname) {
        this.lname = lname;
    }	
    
    public void setID(int ID) {
        this.ID = ID;
    }	
	
    //string to string
    
    
	
	public static void main(String[] args) {
		Student astudent = new Student("Pammi", "Dutta", 229103);
		System.out.println(astudent.toString());
	}
}
