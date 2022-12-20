import java.util.*;

public class paintingCalculator {
    public static void main(String[] args) {
        double length, width, height, area, areaToPaint;
        int door, window;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the room:");
        length = sc.nextInt();
        System.out.println("Enter width of the room:");
        width = sc.nextInt();
        System.out.println("Enter height of the room:");
        height = sc.nextInt();

        System.out.println("Enter no of doors in the room:");
        door = sc.nextInt();
        System.out.println("Enter no of window in the room:");
        window = sc.nextInt();

        area = length * width * height;
        areaToPaint = area - ((20 * door) + (15 * window));

        System.out.println("Area to be painted is:" + areaToPaint);

    }
}