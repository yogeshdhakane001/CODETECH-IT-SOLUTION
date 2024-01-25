/* Basic_calculator */

import java.util.Scanner;
class Test
{
    public static void main(String[] args)
    {
        int operator, n1,n2;
        System.out.println("  1 - Addition \n  2 - Subtract \n  3 - Multiply \n  4 - Divide \n  5 - Modulo ");
        System.out.println("Choose Operation");
        Scanner sc = new Scanner(System.in); 
        operator = sc.nextInt();

        System.out.println("Enter the First Number : ");
        n1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        n2 = sc.nextInt();

        int result = 0;
        switch (operator) 
        {
            case 1:
                result = n1 + n2;
                break;
            
            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                result = n1 / n2;
                break;

            case 5:
                result = n1 % n2;
                break;

            default: 
                System.out.println("Enter operator is not valid");
        }
        System.out.println("Result is =" + result);
    }
}