public class Car {
    String factory;
    String model;
    int year;
    String colour;

    public Car(String factory, String model, int year, String colour) {
        this.factory = factory;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public int carAge() {
        return 2024 - year;
    }

    public static void main(String[] args) {
        Car myCar = new Car("BMW", "X5", 2021, "Black");

        System.out.println("Factory = " + myCar.factory);
        System.out.println("Model = " + myCar.model);
        System.out.println("Year = " + myCar.year);
        System.out.println("Colour = " + myCar.colour);
        System.out.println("Age = " + myCar.carAge());
    }
}