import java.util.Scanner;

class AllArithmeticOperations {
    public static void main(String[] amit){
        System.out.println("Welcome, let perform all the arithmetic operations");
        String continueInput; 

        try(Scanner input = new Scanner(System.in)){
            do{
                System.out.print("Please enter your 1st number: ");
                int num1 = input.nextInt();

                System.out.print("ok, Now Please enter your 2nd number: ");
                int num2 = input.nextInt();

                float ans1 = add(num1, num2);
                System.out.println("The addion of " + num1 + " and " + num2 + " is: " + ans1);
                float ans2 = subtract(num1, num2);
                System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + ans2);
                float ans3 = multi(num1, num2);
                System.out.println("The Multiplicaton of " + num1 + " and " + num2 + " is: " + ans3);
                float ans4 = divide(num1, num2);
                System.out.println("The division of " + num1 + " and " + num2 + " is: " + ans4);
                float ans5 = remainder(num1, num2);
                System.out.println("The remainder of " + num1 + " and " + num2 + " is: " + ans5);
            
             while(true){
                System.out.print("Do you want to continue? Press Y/N: ");
                continueInput = input.next();
                if(continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")){
                    break;
                } else {
                    System.out.println("Oh! it's an invalid input,\nPlease try again");
                }
             }
            } while(continueInput.equalsIgnoreCase("y"));
            System.out.println("Thank you for using this app");
        }
    }

    public static float add(int a, int b) {
        return a + b;
    }

    public static float subtract(int a, int b) {
        return a - b;
    }

    public static float multi(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return a / b;
    }

    public static float remainder(int a, int b) {
        return a % b;
    }
}