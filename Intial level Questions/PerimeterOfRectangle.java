import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Perimeter of Rectangle Program!");
        String continueInput;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the length of the rectangle: ");
            double length = input.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = input.nextDouble();
            double perimeter = 2 * (length + width);
            System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);

            while (true) {
                System.out.print("Do you want to calculate another perimeter? (Y/N): ");
                continueInput = input.next();
                if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            }
        } while (continueInput.equalsIgnoreCase("yes"));
        System.out.println("Thank you for using the Perimeter of Rectangle Program. Goodbye!");
        input.close();
    }
}