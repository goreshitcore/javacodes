
public class ScheduleApp {

	//days of week Enum
	enum DaysOfWeek {
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday,
		Sunday,
		
	}
	
	public String whatToDo(DaysOfWeek day) {
		if ( day == DaysOfWeek.Saturday || day == DaysOfWeek.Sunday ) {
			return "party";
		} else {
			return "work";
		}
		
		
	}
	public static void main(String[] args) {

	}

}
