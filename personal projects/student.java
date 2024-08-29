public class Student {
    private String fname;
    private String lname;
    private int ID;

    // Constructor, getters, and setters...

    public Student(String fname, String lname, int ID) {
        this.fname = fname;
        this.lname = lname;
        this.ID = ID;
    }	

	@Override
    public String toString() {
        return  "first name= " + fname + "\nlast name = " + lname + "\nstudent id = " + ID;
    }
}
