import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        double temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius:");
        temp = sc.nextInt();

        // celcius to fahrenhite
        temp = 1.8 * (temp + 32);
        System.out.println("Enter temperature in fahrenhite:" + temp);
        sc.close();

    }
}