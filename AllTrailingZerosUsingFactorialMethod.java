import java.util.Scanner;

class AllTrailingZerosUsingFactorilaMethod {
  public static void main(String[] args) {
    System.out.println("Welcome");
    String userInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        double ans = trailingZeros(n);
        System.out.println("The number of zeros are " + ans);

        while (true) {
          System.out.print("Do you want to continue? Y/N: ");
          userInput = input.next();
          if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! it's an invlaid input,\nPlease try again");
          }
        }
      } while (userInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static double trailingZeros(int a) {
    double res = 0;
    for (int i = 5; i <= a; i = i * i) {
      res = res + a / i;
    }
    return res;
  }
}