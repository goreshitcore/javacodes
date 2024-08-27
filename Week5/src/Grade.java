
import java.lang.reflect.*;

public class Grade {
	private int percentage;
	
	//constructor if input parameter does not store a value
	// in the range of 0 - 100 then initialize this.percentage to 0
	public Grade(int percentage) {
		if (percentage > 0 && percentage < 100) {
			this.percentage = percentage;
			
		} else {
				this.percentage = 0;
			}
		}
	
	//get method for percentage
	public int GetPercentage() {
		return percentage;
		
	}
	public static void main(String[] args) {
		Grade grade = new Grade(75);
		System.out.println(grade.GetPercentage());
	}

}
