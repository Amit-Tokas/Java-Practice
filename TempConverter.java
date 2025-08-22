import java.util.Scanner;

class TempConverter {
    public static void main(String[] args) {
        System.out.println("Welcome, Now let's see how to converter temperature");
        String continueInput;

        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.print("Tell me the temperture in Fahrenheit: ");
                float f = input.nextFloat();
                float ans = temConvert(f);
                System.out.printf("The temperture in celsius is %.2f\n", ans);

                while (true) {
                    System.out.print("Do you want to continue? Press Y/N: ");
                    continueInput = input.next();
                    if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("oh! its an invalid input,\nPlease try again");
                    }
                }
            } while (continueInput.equalsIgnoreCase("y"));
            System.out.println("Thank you for using this app");
        }
    }
    public static float temConvert(float f) {
        return (f - 32) * 5 / 9;
    }
}
