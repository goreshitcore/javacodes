public class MobilePhone {
    private String brand;
    private double screenSize;
    private int batteryLife;

    public MobilePhone(String brand, double screenSize, int batteryLife) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    public int checkBatteryLife() {
        return 100 - batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", 6.2, 80);
        MobilePhone phone2 = new MobilePhone("Apple", 6.5, 65);
   
        System.out.println("Phone 1:");
        System.out.println("Brand: " + phone1.getBrand());
        System.out.println("Screen Size: " + phone1.getScreenSize());
        System.out.println("Battery Life: " + phone1.getBatteryLife() + "%");
        System.out.println("Used Battery Percentage: " + phone1.checkBatteryLife() + "%");

        System.out.println("\nPhone 2:");
        System.out.println("Brand: " + phone2.getBrand());
        System.out.println("Screen Size: " + phone2.getScreenSize());
        System.out.println("Battery Life: " + phone2.getBatteryLife() + "%");
        System.out.println("Used Battery Percentage: " + phone2.checkBatteryLife() + "%");
    }
}