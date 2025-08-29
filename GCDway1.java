import java.util.Scanner;

class GCDway1 {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String userInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter your 1st number: ");
        int n1 = input.nextInt();
        System.out.print("Now, Please enter your 2nd number: ");
        int n2 = input.nextInt();
        gcd(n1, n2);

        while (true) {
          System.out.print("Do you want to continue? Y/N: ");
          userInput = input.next();
          if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! it's an invalid input,\nPlease try again.");
          }
        }
      } while (userInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static void gcd(int a, int b) {
    int min = (a <= b) ? a : b;
    while (min > 0) {
      if (a % min == 0 && b % min == 0) {
        System.out.println("The GCD is: " + min);
        return;
      }
      min--;
    }
    int max = (a < b) ? b : a;
    System.out.printf("The GCD of a = %d, and of b = %d%n is: ", a, b, max);
  }
}