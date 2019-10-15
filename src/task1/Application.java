package task1;

public class Application {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Площа прямокутника r1 = "+r1.area());
        System.out.println("Периметр прямокутника r1 = "+r1.perim());

        System.out.println();

        Rectangle r2 = new Rectangle(11,15);
        System.out.println("Площа прямокутника r2 = "+r2.area());
        System.out.println("Периметр прямокутника r2 = "+r2.perim());
    }
}
