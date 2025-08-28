import java.util.Scanner;

class Prime {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    String userInput = "";

    try (Scanner input = new Scanner(System.in)) {
      do {
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans ? "is a prime number" : "is not a prime number");
        while (true) {
          System.out.print("Do you want to continue? Y/N: ");
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

  public static boolean isPrime(int a) {
    if ( a < 2){
      return false;
    }
    int c = 2;
    while (c <= (int)Math.sqrt(a)){  // or while (c * c <= a)
      if(a % c == 0){
        return false;
      }
      c++;
    }
    return true;
  }
}