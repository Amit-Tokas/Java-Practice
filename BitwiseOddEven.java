import java.util.Scanner;

class BitwisOddEven {
  public static void main(String[] args) {
    System.out.println("Welcome! Now let's check if an entered number is 'Odd' or 'Even' using bitwise operation");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter your first number: ");
        int n = input.nextInt();
        String ans = oddEven(n);
        System.out.printf("The number n = %d is an %s\n", n, ans);
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

  public static String oddEven(int a) {
    return ((a & 1) == 0) ? " an even number" : " an odd number";
  }
}