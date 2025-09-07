import java.util.Scanner;

class DigitSum {
  public static void main(String[] args) {
    System.out.println("Welcome, let's calculate the sum oof numbers in a digit");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please tell me number: ");
        int num = input.nextInt();
        int ans = sumOfDigit(num);
        System.out.println("The sum of all the digits in " + num + " is " + ans);
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

  public static int sumOfDigit(int a) {
    int sum = 0;
    while (a > 0) {
      sum += a % 10;
      a /=10;
    }
    return sum;
  }
}
