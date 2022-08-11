package week5;


import java.util.Scanner;

    public class Q2 {
        /*2. Re write the student mark sheet programme using if else and while loop.*/


        public static void main(String[] args)
        {
            Marksheet();
        }
        public static void Marksheet()
        {
            Scanner sc = new Scanner(System.in);
            String name;
            int no, maths, sci, eng;
            String result;
            System.out.println("Enter name:");
            name = sc.next();
            System.out.println("Enter Roll No :");
            while(!sc.hasNextInt())
            {
                System.out.println("Invalid Roll Number, Please Enter Valid Roll Number");
                System.out.println("Enter Roll No :");
                sc.next();
            }
            no = sc.nextInt();
            System.out.print("Enter marks of Maths :");
            maths = sc.nextInt();
            while (maths <= 0 || maths > 100)
            {
                System.out.println("Invalid Input, Marks should between 0 to 100");// Line of code/Statement
                System.out.print("Enter marks of Maths :");
                maths = sc.nextInt();
            }
            System.out.print("Enter marks of Science :");
            sci = sc.nextInt();
            while (sci <= 0 || sci > 100)
            {
                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.print("Enter marks of Science :");
                sci = sc.nextInt();
            }
            System.out.print("Enter marks of English :");
            eng = sc.nextInt();
            while (eng <= 0 || eng > 100)
            {
                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.print("Enter marks of English :");
                eng = sc.nextInt();
            }
            int total = maths + sci + eng;
            float p1 = (total * 100) / 300;
            if (p1 >= 35 && p1 <= 100)
            {
                result = "Pass";
            } else
            {
                result = "Fail";
            }
            System.out.println("--------------------------------------------------");
            System.out.println("|                                                |");
            System.out.println("|                   MARKSHEET                    |");
            System.out.println("|                                                |");
            System.out.println("|------------------------------------------------|");
            System.out.println("| Name              :        " + name + "                |");
            System.out.println("| Roll Number       :        " + no + "                  |");
            System.out.println("|------------------------------------------------|");
            System.out.println("| Subject           :       Marks                |");
            System.out.println("|------------------------------------------------|");
            System.out.println("| Maths             :        " + maths + "                  |");
            System.out.println("| Science           :        " + sci + "                  |");
            System.out.println("| English           :        " + eng + "                  |");
            System.out.println("|------------------------------------------------|");
            System.out.println("| Total             :        " + total + "                 |");
            System.out.println("|------------------------------------------------|");
            System.out.println("| Percentage        :       " + p1 + "%                |");
            System.out.println("| Result            :       " + result + "                 |");

            if (p1 >= 80)
            {
                System.out.println("| Grade             :         A+                 |");
            } else if (p1 <= 80 && p1 >= 60)
            {
                System.out.println("| Grade             :         A                  |");
            } else if (p1 <= 60 && p1 >= 50)
            {
                System.out.println("| Grade             :         B                  |");
            } else if (p1 <= 50 && p1 >= 35)
            {
                System.out.println("| Grade             :         C                  |");
            } else
            {
                System.out.println("| Grade             :  Fail                      |");
            }
            System.out.println("-------------------------------------------------");
        }
    }
