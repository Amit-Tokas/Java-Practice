 import java.util.Scanner;
 class GreatestNumber {
public static void main(String[] args) {
    System.out.println("Welcome, let's check the greatest number among three numbers");
  String continueInput;
  try (Scanner input = new Scanner(System.in)) {
    do {
      System.out.print("Please enter first number: ");
      int num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Please enter third number: ");
        int num3 = input.nextInt();
        findGreatest(num1, num2, num3);
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
    
    public static void findGreatest(int a, int b, int c) {
        if(a == b && b == c) {
            System.out.println("All numbers are equal");
            return;
        }
        else if(a >= b && a >= c) {
            System.out.println("The greatest number is: " + a);
            return;
        } else if(b >= a && b >= c) {
            System.out.println("The greatest number is: " + b);
            return;
        } else {
            System.out.println("The greatest number is: " + c);
            return;
        }
    }
}
