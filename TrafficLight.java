
public class TrafficLight {
	
	enum Light {
		RED,YELLOW,GREEN;
	}

	public static void main(String[] args) {
		
		System.out.println(TrafficLight.Light.RED);
		System.out.println(TrafficLight.Light.YELLOW);
		System.out.println(TrafficLight.Light.GREEN);
		
		for ( Light l : Light.values()) {
			System.out.println(l);
		}
	}

}
