import java.util.Scanner;

class BitwiseCompliment {
  public static void main(String[] args) {
    System.out.println("Welcome! Let's see, how bitwise compliment works");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        int ans = bitwiseNor(n);
        System.out.println("The bitwise NOR of n = " + n + " is " + ans);

        while (true) {
          System.out.print("Do you want to continue? Press Y/N: ");
          continueInput = input.next();
          if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! its an invalid input,\nPlease try again");
          }
        }
      } while (continueInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static int bitwiseNor(int a) {
    return ~a;
  }
}