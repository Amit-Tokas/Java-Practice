import java.util.Scanner;

class OddSum {
  public static void main(String[] args) {
    System.out.println("Welcome! printing the sum of all odd numbers");
    String continueInput;

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please tell me a number: ");
        int num = input.nextInt();
        int ans = sumOfOddNums(num);
        System.out.println("The sum of all odd numbers up to " + num + " is " + ans);

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
      System.out.println("Thank you using this app");
    }
  }

  public static int sumOfOddNums(int n){
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }
}

/*This approch can also be used.
public static int sumOfOddNums(int n) {
  int sum = 0;
  for (int i = 1; i <= n; i += 2) {
    sum += i;
  }
  return sum;
}*/
