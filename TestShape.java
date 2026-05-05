public class TestShape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(2);

        System.out.println(r.area());
        System.out.println(c.area());
    }
}
