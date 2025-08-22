import java.util.Scanner;

class CompoundInterest {
public static void main(String[] args) {
    System.out.println("Welcome, Now lets calculate compund interest");
    String userInput;

    try(Scanner input = new Scanner (System.in)){
        do{
            System.out.print("Tell me the principal amount in ₹ ");
            double p = input.nextDouble();

            System.out.print("Tell me the rate of interest ");
            float r = input.nextFloat();

            System.out.print("Now, tell me the time in years ");
            float t = input.nextFloat();

            double ans = compoundInterest(p, r, t);
            System.out.printf("your compund interest is ₹ %.2f\n", ans);

            while(true){
                System.out.print("Do you want to continue? Press Y/N: ");
                userInput = input.next();
                if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")){
                    break; 
                 } else {
                        System.out.println("oh! its an invalid input,\nPlease try agin");
                    }
                }
        } while(userInput.equalsIgnoreCase("y"));
        input.close();
    }
}
    public static double compoundInterest(double p, float r, float t){
        return p * (1 + r/100) * t;
    }
}