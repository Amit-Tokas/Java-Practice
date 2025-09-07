import java.util.Scanner;

class GradesUsingMarks {
  public static void main(String[] args) {
    System.out.println("Welcome, Let's calculate Grades based on given marks");
    String userInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter the marks: ");
        int m = input.nextInt();
        grades(m);

        while (true) {
          System.out.print("Do you want to continue? Press Y/N: ");
          userInput = input.next();
          if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! its an invalid input,\nPlease try again");
          }
        }
      } while (userInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static void grades(int m) {
    if (m >= 90) {
      System.out.println("Congratulation, you have scored `A` Grade");
    } else if (m >= 75) {
      System.out.println("Very good, you have scored `B` Grade");
    } else if (m >= 60) {
      System.out.println("Good, you have scored `C` Grade");
    } else if (m >= 30) {
      System.out.println("Need to work very hard, As you have scored only `D` Grade");
    } else {
      System.out.println("You are failed , As you have scored `E` Grade");
    }
  }
}