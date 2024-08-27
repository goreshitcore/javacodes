
public class Dog {
	private String name;
	private int age;
	//constructor method
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//get method
	public String GetName() {
		return name;
	}
	public int GetAge() {
		return age;
	}
	//method int inPersonYears to return the age of a dog in person years
	public int inPersonYears() {
		return age * 7;
	}

	public static void main(String[] args) {
		//new dog instance with input
		Dog dog = new Dog("Fido", 5);
		//print out instance
		System.out.println("name = " +dog.GetName());
		System.out.println("age = " +dog.GetAge());
		System.out.println("InPersonYears = " +dog.inPersonYears());
		
	}
	

}
