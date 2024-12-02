import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a temperature in Celsius: ");
    double celsius = scanner.nextDouble();
    double fahrenheit = celsiusToFahrenheit(celsius);
    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    scanner.close();
  }
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9.0/5) + 32;
  }
}