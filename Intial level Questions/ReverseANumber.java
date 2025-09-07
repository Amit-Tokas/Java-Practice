import java.util.Scanner;

public class ReverseANumber {
  public static void main(String[] args) {
    System.out.println("Welcome! let's see how reverse all the digits oa given number");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        reverse(n);

        while (true) {
          System.out.print("Do you want to continue? Press Y/N: ");
          continueInput = input.next();
          if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! it's an invalid input,\nPlease try again");
          }
        }
      } while (continueInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static void reverse(int a) {
    int org = a; // To preserve Original value of 'a'
    int revNum = 0; // result or resultant number i.e our final answer.
    while (a > 0) {
      int rem = a % 10;
      revNum = revNum * 10 + rem;
      a /= 10;
    }
    System.out.println("The reversed number of " + org + " is " + revNum);
  }
}