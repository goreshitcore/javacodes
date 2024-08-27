public class Visa {
    String name;
    int kind;

    public Visa(String name, int kind) {
        this.name = name;
        this.kind = kind;
    }

    public String description() {
        switch (kind) {
            case 1: return "Permanent";
            case 2: return "Temporary";
            default: return "Other";
        }
    }

    public static void main(String[] args) {
        Visa visa1 = new Visa("John", 1);
        Visa visa2 = new Visa("June", 2);

        System.out.println("name = " + visa1.name);
        System.out.println("kind = " + visa1.kind);
        System.out.println("description = " + visa1.description());
        System.out.println("name = " + visa2.name);
        System.out.println("kind = " + visa2.kind);
        System.out.println("description = " + visa2.description());
    }
}