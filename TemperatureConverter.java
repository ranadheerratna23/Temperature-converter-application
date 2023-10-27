import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter App");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1/2/3/4/5/6): ");

        int choice = scanner.nextInt();
        double inputTemperature, outputTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = scanner.nextDouble();
                outputTemperature = celsiusToFahrenheit(inputTemperature);
                System.out.println("Temperature in Fahrenheit: " + outputTemperature);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = scanner.nextDouble();
                outputTemperature = fahrenheitToCelsius(inputTemperature);
                System.out.println("Temperature in Celsius: " + outputTemperature);
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = scanner.nextDouble();
                outputTemperature = celsiusToKelvin(inputTemperature);
                System.out.println("Temperature in Kelvin: " + outputTemperature);
                break;
            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemperature = scanner.nextDouble();
                outputTemperature = kelvinToCelsius(inputTemperature);
                System.out.println("Temperature in Celsius: " + outputTemperature);
                break;
            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = scanner.nextDouble();
                outputTemperature = fahrenheitToKelvin(inputTemperature);
                System.out.println("Temperature in Kelvin: " + outputTemperature);
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemperature = scanner.nextDouble();
                outputTemperature = kelvinToFahrenheit(inputTemperature);
                System.out.println("Temperature in Fahrenheit: " + outputTemperature);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, 3, 4, 5, or 6.");
                break;
        }

        scanner.close();
    }

    // Temperature conversion functions
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
