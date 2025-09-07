import java.util.Scanner;

class Factorial {
  public static void main(String[] args) {
    System.out.println("Welcome, let's calculate the factorial of a number");
    String userInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        long ans = printingFactorial(n);
        System.out.println("The factorial of " + n + " is " + ans);

        while (true) {
          System.out.print("Do you want to continue? Y/N: ");
          userInput = input.next();
          if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! it's an invlaid input,\nPlease try again");
          }
        }
      } while (userInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static long printingFactorial(int a) {
    long fact = 1;
    for (int i = 1; i <= a; i++) {
      fact *= i;
    }
    return fact;
  }
}
