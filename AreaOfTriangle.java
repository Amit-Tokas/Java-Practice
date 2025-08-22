import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome, Now let's learn how to calculate the area");
        String userInput;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter the base of triangle: ");
            double b = input.nextDouble();

            System.out.print("Please enter the height of triangle");
            double h = input.nextDouble();
            double ans = area(b, h);
            System.out.printf("The area of the triangle with base b = %.2f and height h = %.2f is %.2f\n", b, h, ans);

            while (true) {
                System.out.print("Do you want to continue? Press Y/N: ");
                userInput = input.next();
                if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("oh! its an invalid input,\nPlease try again");
                }
            }
        } while (userInput.equalsIgnoreCase("y"));
        input.close();
        System.out.println("Thank you for using this app");
    }

    public static double area(double b, double h) {
        return 1.0 / 2 * (b * h);
    }
}