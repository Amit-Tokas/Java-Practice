import java.util.Scanner;

class OddEvenChecker {

    public static void main(String[] args) {
        System.out.println("Wlcome, Now let's check if an entered number is odd or even");
        String continueInput;
        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.print("Please enter a number: ");
                int n = input.nextInt();

                checkOddEven(n);

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

    public static void checkOddEven(int a) {
        String ans = a % 2 == 0 ? "Its an even number" : "Its an odd number";
        System.out.println(ans);
    }
}
