package Q_05;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in degrees Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Display the result
        System.out.println("\nTemperature in degrees Celsius: " + celsius);

        scanner.close();
    }

}
