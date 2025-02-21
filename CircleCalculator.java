import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompt for Radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        //Calculate Area
        double area = Math.PI * Math.pow(radius, 2);

        //Calculate Circumference
        double circumference = 2 * Math.PI * radius;

        //Print result
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        input.close();

    }
}