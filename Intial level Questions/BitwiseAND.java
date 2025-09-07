import java.util.Scanner;

class BitwiseAND {
  public static void main(String[] args) {
    System.out.println("Welcome now let's see, how 'Bitwise AND works");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter first number: ");
        int a = input.nextInt();
        System.out.print("Please enter second number: ");
        int b = input.nextInt();
        int ans = a & b;
        System.out.println("The Bitwise AND of a = " + a + " and b = " + b + " is " + ans);
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
}