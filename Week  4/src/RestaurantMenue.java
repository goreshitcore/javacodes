public class RestaurantMenue {
    private String itemName;
    private double price;
    private String category;

    public RestaurantMenue(String itemName, double price, String category) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }

    public double priceForTwo() {
        return price * 2;
    }

    public static void main(String[] args) {
        RestaurantMenue menu1 = new RestaurantMenue("Grilled Salmon", 16.99, "Main");
        RestaurantMenue menu2 = new RestaurantMenue("Chocolate Cake", 6.49, "Dessert");

        System.out.println("Item Name = " + menu1.itemName);
        System.out.println("Price = " + menu1.price);
        System.out.println("Category = " + menu1.category);
        System.out.println("Price for Two Persons = " + menu1.priceForTwo());       
        System.out.println("Item Name = " + menu2.itemName);
        System.out.println("Price = " + menu2.price);
        System.out.println("Category = " + menu2.category);
        System.out.println("Price for Two Persons = " + menu2.priceForTwo());
        

        
      
    }
}