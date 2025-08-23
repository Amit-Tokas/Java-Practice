import java.util.Scanner;

class BitwiseOR {
  public static void main(String[] args) {
    System.out.println("Welcome now let's see, how 'Bitwise OR works");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter first number: ");
        int a = input.nextInt();
        System.out.print("Please enter second number: ");
        int b = input.nextInt();
        int ans = bitOr(a, b);
        System.out.println("The Bitwise OR of a = " + a + " and b = " + b + " is " + ans);
        while (true) {
          System.out.print("Do you want to continue? Press Y/N: ");
          continueInput = input.next();
          if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("oh! its an invalid input");
          }
        }
      } while (continueInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static int bitOr(int a, int b) {
    return a | b;
  }
}