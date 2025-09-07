import java.util.Scanner;

class AllDivisorsOfANum {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String userInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        divisor(n);

        while (true) {
          System.out.print("Do you want to continue? Y/N: ");
          userInput = input.next();
          if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! it's an invalid input,\nPlease try again.");
          }
        }
      } while (userInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static void divisor(int a) {
    int c = 1;
    while (c <= (int) Math.sqrt(a)) {
      if (a % c == 0) {
        System.out.println(c + " is a divsor of " + a);
        int othrNum = a / c;
        if (othrNum != c) {
          System.out.println(othrNum + " is a divisor of " + a);
        }
      } else {

      }
      c++;
    }
  }
}