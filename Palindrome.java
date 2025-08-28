import java.util.Scanner;

class Palindrome {
  public static void main(String[] args) {
    System.out.println("Welcome! Let's check if the number is a plaindrome or not");
    String userInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        boolean ans = isPalindrome(n);
        System.out.println(ans ? "Yes, it is a palindrome number" : "No, it is not a plaindrome number");

        while (true) {
          System.out.print("Do you want to continue? Press Y/N: ");
          userInput = input.next();
          if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! it's an invalid input,\nPlease try again.");
          }
        }
      } while (userInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static boolean isPalindrome(int a) {
    int org = a;
    int revNum = 0;
    while (a > 0) {
      int rem = a % 10;
      revNum = revNum * 10 + rem;
      a /= 10;
    }
    return org == revNum;
  }
}
