import java.util.Scanner;

class BitwiseNotUsing2Nums {
  public static void main(String[] args) {
    System.out.println("Welcome! Now let see the operation of bitwise NOT operation using two variables");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter your first number: ");
        int n1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int n2 = input.nextInt();
        int ans = bitwiseNor(n1, n2);
        System.out.printf("The bitwise NOR of n1 = %d and n2 = %d is %d\n", n1, n2, ans);
        while (true) {
          System.out.print("Do you want to continue? Press Y/N: ");
          continueInput = input.next();
          if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! its an invalid input,\nPlease try again");
          }
        }
      } while (continueInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static int bitwiseNor(int a, int b) {
    return ~(a | b);
  }
}