import java.util.Scanner;

class ExponentiationPower {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        System.out.print("Please enter a number up to which you want to calculate the power: ");
        int p = input.nextInt();
        double res = fast(n, p);
        System.out.println("The power of " + n + " upto " + p + " is " + res);

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

  public static double fast(int num, int power) {
    int res = 1; // result or resultant number i.e our final answer.
    while (power > 0) {
      if (power % 2 != 0) {
        res = res * num;
      }
      power /= 2;
      num = num * num;
    }
    return res;
  }
}