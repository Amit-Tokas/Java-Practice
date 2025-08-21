import java.util.Scanner;

class Swap2NumsUsingThirdVariable {
    public static void main(String[] args) {
        System.out.println("Welcome, Now Let see how to swap 2 numbers without using the third variable");
        String continueInput;

        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.print("Please enter your first number: ");
                int n1 = input.nextInt();

                System.out.print("Now, Please enter your second number: ");
                int n2 = input.nextInt();
                swap(n1, n2);

                while (true) {
                    System.out.print("Do you want to conitnue? Press Y/N: ");
                    continueInput = input.next();

                    if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("Oh! it's invalid input");
                    }
                }
            } while (continueInput.equalsIgnoreCase("y"));
            System.out.println("Thank you for using the swap program!");
        }
    }

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Number swapped successfully \nThe new value of a = " + a + " \nand the new value of b =" + b);
    }
}