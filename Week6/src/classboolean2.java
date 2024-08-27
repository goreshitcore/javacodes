public class classboolean2 {


static boolean found(boolean[] array) {
	for (boolean b: array) {
		if (!b) {
			return false;
		}
	}
	return true;
	
}

public static void main(String[] args) {
	System.out.println(found(new boolean[]{true,true,true})); // prints: true
	System.out.println(found(new boolean[]{true,false,true})); // prints: false
	System.out.println(found(new boolean[]{true,true,true,true})); // prints: true
	
}
}
