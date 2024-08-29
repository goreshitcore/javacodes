import java.util.Random;

public class NumberList {

	private int[] numbers;
	//setting array to 10 
	public NumberList() {
		numbers = new int[10];
	}
	
	//initilise random numbers in the array
	public NumberList(int r) {
		numbers = new int[10];
		Random rand = new Random();
		for ( int i = 0; i < numbers.length; i++ ) {
			numbers[i] = rand.nextInt(r);
		}
	}
	//length of array
	public int size() {
		return numbers.length;
	}
	//returns string of array
	public String toString() {
		return java.util.Arrays.toString(numbers);

	}
	
	//private boolean isValid(int i), returns true if an input index is in the range of the array and false otherwise
	private boolean isValid(int i) {
		return i >= 0 && i < numbers.length;
	}
	/*public void update(int i,int value) update the value at index i of the array.
	Use isValid to determine if i is a valid index. Otherwise, the array is
	unmodified. */
	public void update(int i, int value) {
		if (isValid(i)) {
			numbers[i] = value;
		}
	}
	//public int min() and public int max() return the smallest/largest number in the array
	public int min() {
		if (numbers.length == 0 ) {
			return 0;
		}
		
		int min = numbers[0];
		for ( int i = 0; i < numbers.length; i++ ) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
		
	}
	
	
	public int max() {
		if (numbers.length == 0) {
			return 0;
		}
		
	int max = numbers[0];
	for ( int i = 0; i < numbers.length; i++) {
		if (numbers[i] > max)  {
			max = numbers[i];
		}
	}
	return max;
		
	}
	
	
	//public int nonZero() returns the number of integers that are not zero in the array
	public int nonZero(int[] numbers) {
		int count = 0;
		for ( int i = 0; i <  numbers.length; i++) {
			if (numbers[i] != 0) {
				count++;
			}
		}
		return count;
	}
	
	
	//public double average() returns the average of the numbers in the array
	public double average(int[] array) {
		
		if (array.length == 0) {
			return 0.0;
		}
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			sum += array[i];
				
				
			
		}
		return (double) sum / array.length;			
	}
	
	public static void main(String[] args) {


	}

}
