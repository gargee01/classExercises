import java.util.*;

public class Circle {
    public static void main(String[] args) {

        int radius;
        double area, circumference;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        radius = sc.nextInt();
        circumference = 2 * (Math.PI) * radius;
        System.out.println("Circumference of circle is " + circumference);
        area = (Math.PI) * radius * radius;
        System.out.print("area of circle is " + area);
        sc.close();
    }
}