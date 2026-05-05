public class TestEmployee {
    public static void main(String[] args) {
        Manager m = new Manager("Karim", 2000, 500);

        System.out.println(m);
        System.out.println("Total: " + m.totalSalary());
    }
}
