import java.util.Scanner;

class CountDigitsOfNum {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        int res = count(n);
        System.out.println("The number of digits in " + n + " are " + res);

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

  public static int count(int n) {
    if (n == 0) {
    return 1;
    }
    int c = 0;
    while (n > 0) {
      n /= 10;
      c++;
    }
    return c;
  }
}