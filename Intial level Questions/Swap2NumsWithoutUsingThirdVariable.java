import java.util.Scanner;

class Swap2NumsWithoutUsingThirdVariable {
    public static void main(String[] args) {
        System.out.println("Welcome to number swapping station");
        String continueInput;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Tell me your first number: ");
            int a = input.nextInt();

            System.out.print("ok now, tell me your second number: ");
            int b = input.nextInt();
            swap(a, b);

            while(true){
                System.out.print("Do you want to contiue? Press Y/N: ");
                continueInput = input.next();
                if(continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")){
                    break;
                } else {
                    System.out.println("oh! its an invalid input,\nPleas try again");
                }
            }
        }while(continueInput.equalsIgnoreCase("y"));
        input.close();
        System.out.println("Thank you for using this app");
    }
    public static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Congratulation, numbers are swapped successfuly");
        System.out.printf("The new value of a = %d\n and the new vlaue of b = %d\n",a, b);
    }
}