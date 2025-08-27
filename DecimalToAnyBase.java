import java.util.Scanner;
 class DecimalToAnyBase {
  public static void main(String[] args) {
    System.out.println("Welcome! Let's see, how convert a decimal number into binary");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        System.out.print("Enter the base value: ");
        int b = input.nextInt();
        convert(n, b);

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

  public static void convert(int a, int base) {
    int org = a; // To preserve Original value of 'a'
    int resNum = 0; // result or resultant number i.e our final answer.
    int power = 0; // number of times, the unit digit from 'a' is extracted.
    while (a > 0) {
      int rem = a % base;
      a /= base;
      resNum += rem * Math.pow(10, power);
      power++;
    }
    System.out.println("The binary eqvivalant of " + org + " is " + resNum);
  }
}