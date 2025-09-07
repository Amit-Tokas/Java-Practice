
// To calculate all the number of trailong zeros.
import java.util.Scanner;

class AllTrailingZeros {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String userInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        trailingZeros(n);

        while (true) {
          System.out.print("Do you want to continue? Y/N: ");
          userInput = input.next();
          if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! it's an invalid input,\nPlease try again");
          }
        }
      } while (userInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static void trailingZeros(int a) {
    int count = 0;
    // Count trailing zeros by checking factors of 10 at the end
    while (a > 0 && a % 10 == 0) {
      count++;
      a /= 10;
    }

    System.out.println("Trailing zeros: " + count);
  }
}