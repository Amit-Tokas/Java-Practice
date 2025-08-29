
// GCD calculation using "Euclidian's Algorithm".
import java.util.Scanner;

class GCDway2 {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String userInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter your 1st number: ");
        int num1 = input.nextInt();

        System.out.print("Now, please enter your second number: ");
        int num2 = input.nextInt();

        gcd(num1, num2);

        while (true) {
          System.out.print("Do you want to continue? Press Y/N: ");
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

  public static void gcd(int a, int b) {
    while (a != 0 && b != 0) {
      if (a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }
    if (a == 0) {
      System.out.println("The gcd is " + b);
    } else {
      System.out.println("The gcd is " + a);
    }
  }
}