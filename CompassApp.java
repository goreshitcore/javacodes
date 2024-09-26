
public class CompassApp {
	
	enum Compass {
		NORTH,SOUTH,EAST,WEST;
	}

	public static void main(String[] args) {
		for (Compass c : Compass.values()) {
			System.out.println(c);
		}
		
	}

}
