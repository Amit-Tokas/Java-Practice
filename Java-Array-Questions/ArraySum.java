import java.util.Scanner;

class ArraySum {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please tell me the size of your array: ");
        int size = input.nextInt();
        
        System.out.println("Now, enter the elements in this array");
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
          System.out.println("The array element at " + i + " is: ");
          a[i] = input.nextInt();
        }

        System.out.println("---------------------------");
        System.out.println("The created array looks like");
        for (int j = 0; j < a.length; j++) {
          System.out.println(a[j]);
        }

        sumOfAllElements(a);

        while (true) {
          System.out.print("Do you want to continue? Press Y/N: ");
          continueInput = input.next();
          if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
            break;
          } else {
            System.out.println("Oh! it's an an invalid input,\nPlease try again");
          }
        }
      } while (continueInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }

  public static void sumOfAllElements(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    System.out.printf("The sum of all the elements in this array is %d", sum);
  }
}