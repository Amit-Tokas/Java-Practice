import java.util.Scanner;

public class BitwiseLeftShift {
  public static void main(String[] args) {
    System.out.println("Welcome! showcasing bitwise left-shift operation");
    String continueInput;

    try(Scanner input = new Scanner(System.in)){
      do {
        System.out.print("Please tell me a number: ");
        int a = input.nextInt();
        leftShift(a);

        while(true){
          System.out.print("Do you want to continue? Press Y/N: ");
          continueInput = input.next();
          if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")){
            break; 
          } else {
            System.out.println("Oh! it's an invalid input,\nPlease try again");
          }
        }
      } while(continueInput.equalsIgnoreCase("y"));
      System.out.println("Thank you for using this app");
    }
  }
    public static void leftShift(int a){
      int ans = a << 1;
      System.out.printf("The result is %d\n", ans);
    }
  }
