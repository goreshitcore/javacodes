
public class intarray {

	
	static int sum(int[] array) {
	    int sum = 0;
	    //enhanced for loop pg 10 
	    for (int num : array) {
	        if (num > 0) {
	            sum += num;
	        }
	    }
	    return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(new int[]{10,4,5,6,7}));
		System.out.println(sum(new int[]{}));
		System.out.println(sum(new int[]{-10,-4,-5,-6,-7}));
	}
	
}
