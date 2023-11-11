import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
            int n1, n2;

        System.out.println("Enter first Number");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Enter Second Number");
        n2 = sc.nextInt();

        System.out.println("Choose an operation.");
        System.out.println(" 1 for Multiplication");
        System.out.println(" 2 for Addition.");
        System.out.println("3 for Substraction.");
        System.out.println(" 4 for division");

        Scanner op = new Scanner(System.in);
        int choice = op.nextInt();
        int result = 0;
        switch (choice)
        {

            case 1: result =  n1 * n2; break;
            case 2: result =  n1 + n2; break;
            case 3: result =  n1 - n2; break;
            case 4: result =  n1 / n2; break;

            default:
                System.out.println("Invalid Entry");
        }
        System.out.println("Result is " + result);
    }
}