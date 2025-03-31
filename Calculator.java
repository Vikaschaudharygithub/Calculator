import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        boolean continueCalculation = true;

        System.out.println("Welcome to the Java Calculator!");
        
        while (continueCalculation) {
            // Prompt user for operation
            System.out.print("Enter an operation (+, -, *, /, or exit): ");
            operation = scanner.next();
            
            if (operation.equals("exit")) {
                break;
            }

            // Get user input for numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            // Ensure numbers are within the valid range
            if (num1 < -1000 || num1 > 1000 || num2 < -1000 || num2 > 1000) {
                System.out.println("Error: Numbers must be between -1000 and 1000.");
                continue;
            }
            
            int result = 0;
            boolean validOperation = true;
            
            // Perform calculation using switch-case
            switch (operation) {
                case "+":
                    result = (int) (num1 + num2);
                    break;
                case "-":
                    result = (int) (num1 - num2);
                    break;
                case "*":
                    result = (int) (num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("ERROR!");
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = (int) (num1 / num2);
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    validOperation = false;
            }
            
            if (validOperation) {
                System.out.println("The result of " + (int) num1 + " " + operation + " " + (int) num2 + " = " + result);
            }
            
            // Ask user if they want to perform another calculation
            System.out.print("Would you like to perform another operation (yes/no)? ");
            String response = scanner.next();
            
            if (!response.equalsIgnoreCase("yes")) {
                continueCalculation = false;
            }
        }
        
        System.out.println("Thank you for using the Java Calculator! Goodbye!");
        scanner.close();
    }
}
