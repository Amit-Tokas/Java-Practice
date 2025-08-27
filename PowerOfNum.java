import java.util.Scanner;

class PowerOfNum {
  public static void main(String[] args) {
    System.out.println("Welcome! let's see how reverse all the digits oa given number");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        System.out.print("Please enter a number up to which you want to calculate the power: ");
        int p = input.nextInt();
        power(n, p);

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

  public static double power(int a, int p) {
    int res = 1; // result or resultant number i.e our final answer.
    for (int i = 0; i < p; i++) {
      res = res * a;
    }
    System.out.println("The power of " + a + " upto " + p + " is " + res);
    return res;
  }
}
