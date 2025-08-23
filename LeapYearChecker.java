import java.util.Scanner;

class LeapYearChecker {
  public static void main(String[] args) {
    System.out.println("Welcome, Now let check, if an entred year is a leap year or not");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a year to check: ");
        int y = input.nextInt();
        boolean isLeapYear = yearChecker(y);
        if (isLeapYear){
          System.out.println(y + " is a leap year");
        } else {
        System.out.println(y + " is not a Leap Year");
        }
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
  public static boolean yearChecker(int y) {
    return (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0));
  }
}