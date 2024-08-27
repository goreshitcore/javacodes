public class Box {
    private int height;
    private int width;
    private int depth;
//constructor
    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
//get 
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }

    public boolean fits(Box box) {
        return this.height > box.height && this.width > box.width && this.depth > box.depth;
    }

    public boolean fits(Box box1, Box box2) {
        return this.fits(box1) && box1.fits(box2);
    }

    public static void main(String[] args) {
        Box box1 = new Box(11, 21, 31);
        System.out.println(box1.toString());

        Box box2 = new Box(21, 31, 41);
        System.out.println(box2.toString());

        Box box3 = new Box(31, 41, 51);
        System.out.println(box3.toString());

        System.out.println("Does box1 fit box2 and box3? " + box1.fits(box2, box3));
    }
}