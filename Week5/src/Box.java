public class Box {
    private int height;
    private int width;
    private int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public boolean fits(Box box) {
        return height > box.height && width > box.width && depth > box.depth;
    }

    @Override
    public String toString() {
        return "height = " + height + "\nwidth = " + width + "\ndepth = " + depth;
    }

    public static void main(String[] args) {
        Box box1 = new Box(11, 21, 31);
        System.out.println(box1.toString());
        Box box2 = new Box(21, 31, 41);
        System.out.println(box2.toString());
        Box box3 = new Box(31, 41, 51);
        System.out.println(box3.toString());
        System.out.println("fits = " + box1.fits(box2) && box2.fits(box3));
    }
}
