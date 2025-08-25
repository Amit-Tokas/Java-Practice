import java.util.Scanner;
class Table {
  public static void main(String[] args) {
    System.out.println("Welcome! printing table of an entered number");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please tell me number of which want to print the table: ");
        int num = input.nextInt();
        printingTable(num);

        while (true) {
          System.out.print("Do you want to continue? Please press Y/N: ");
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

  public static void printingTable(int a) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(a + " X " + i + " = " + (a * i));
    }
  }
}