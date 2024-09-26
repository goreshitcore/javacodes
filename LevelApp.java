
public class LevelApp {

	enum Level {
		LOW,
		MED,
		HIGH,
		
	}
	
	public String directions(Level level) {
		//switch
		switch(level) {
		case LOW:
			return ("Down");
		case MED:
			return ("Stay");
		case HIGH:
			return ("Up");
		default:
			return "?";
		}
	}
	public static void main(String[] args) {
		 LevelApp la = new LevelApp();
		 System.out.println();
	}

}
