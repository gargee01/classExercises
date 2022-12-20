import java.util.Scanner;
import java.lang.Math;

public class AreaTriangle {
    public static void main(String[] args) {
        double a, b, c;
        double area, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c (three sides of a triangle): ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a + b + c) / 2;
        System.out.println("S: " + s);

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of triangle is: " + area);

        sc.close();
    }
}