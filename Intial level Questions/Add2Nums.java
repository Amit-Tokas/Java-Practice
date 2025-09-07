import java.util.Scanner;

class Add2Nums{
    public static void main(String[] args) {
        System.out.println("Welcome to the Add2Nums program!");
        String continueInput;

        try (Scanner input = new Scanner(System.in)) {

            do {
                System.out.print("Please enter your first number: ");
                int num1 = input.nextInt();
                System.out.print("Please enter your second number: ");
                int num2 = input.nextInt();
                int result = add(num1, num2);
                System.out.println("The sum is: " + result);

                while (true) {
                    System.out.print("Do you want to continue? Press Y/N: ");
                    continueInput = input.next();
                    if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter Y or N.");
                    }
                }
            } while (continueInput.equalsIgnoreCase("y"));
            System.out.println("Thank you for using the Add2Nums program!");
    }
    }
 public static int add(int a, int b){
        return a + b;
    }
}