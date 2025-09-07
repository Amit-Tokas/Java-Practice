import java.util.Scanner;

class ArmstrongNum {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        boolean ans = isArmStrong(n);
        System.out
            .println("The number n = " + n + " is " + (ans ? "an Armstrong number." : "not an Armstrong number."));

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

  public static boolean isArmStrong(int n) {
    int org = n;
    int res = 0;
    while (n>0){
      int digit = n%10;
      res = res + (int)Math.pow(digit, 3);
      n /=10;
    }
    return false;
  }
}