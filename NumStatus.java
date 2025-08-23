import java.util.Scanner;

class NumStatus{
    public static void main(String[] args) {
        System.out.println("Welcome, Now lets check the status of an entred number");
        String continueInput;

        try(Scanner input = new Scanner(System.in)){
            do{
                System.out.print("Please enter a number: ");
                int num = input.nextInt();
                numChecker(num);

                while(true){
                    System.out.print("Do you want to continue? Press Y/N: ");
                    continueInput = input.next();
                    if(continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")){
                        break;
                    } else {
                        System.out.println("oh! its an invalid number,\nPlease try again");
                    }
                }
            } while(continueInput.equalsIgnoreCase("y"));
            System.out.println("Thank you for using this app");
        }
    }
    public static void numChecker(int a){
         String result = a > 0 ? "Positive Number" : (a < 0 ? "Negative number" : "Equal to zero ");
         System.out.println(result);
    } 
}