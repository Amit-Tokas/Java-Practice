import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome, Now lets learn how calculate the simple interest");
        String userInput;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("The principal amount is ₹ ");
            double p = input.nextDouble();

            System.out.print("The Rate of interest is ");
            float r = input.nextFloat();

            System.out.print("The time in year is ");
            float t = input.nextFloat();

            double ans = simpleInterest(p, r, t);
            System.out.printf("Your Simple interest is ₹ %f\n", ans);

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
    public static double simpleInterest(double p, float r, float t) {
        return (p * r * t) * 1 / 100;
    }
}
