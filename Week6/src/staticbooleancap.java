
public class staticbooleancap {

	static boolean cap(char[] array) {
	    for (char c : array) {
	        if (!Character.isUpperCase(c)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		System.out.println(cap(new char[]{'A','B','C'})); // prints: true
		System.out.println(cap(new char[]{'A','B','C','9'})); // prints: false
		System.out.println(cap(new char[]{'A','B','C','D','x'})); // prints: false
	}

}
