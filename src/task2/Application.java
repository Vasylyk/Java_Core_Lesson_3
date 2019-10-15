package task2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть радіус кругу...");
        Circle circle = new Circle(sc.nextDouble());
        System.out.println("Площа кругу = "+circle.S());
        System.out.println("Периметр кругу = "+circle.C());
    }
}
