package calculator;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args)
    {
        char ch;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter One of the Symbol(+, -, /, *) :");
            char symbol = sc.next().charAt(0);
            System.out.print("Enter the 2nd number: ");
            int b = sc.nextInt();
            Calculator m = new Calculator();
            m.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            ch = sc.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
    }


}
