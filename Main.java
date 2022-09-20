import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//2.10
        int x = 2;
        int y = 3;
        System.out.printf("x = %d%n", x);// x = 2
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));// Value of 2 + 2 is 4
        System.out.printf("x =%n");// x =
        System.out.printf("%d = %d%n", (x + y), (y + x));// 5 = 5
//2.11
        /*p = i + j + k + 7; //the right answers
        int value = input.nextInt();*/
//2.12
        /*int a = 4,x = 2;
        int k, c, j;
        k = a * x * x * x + 7;
        j = (a * x) * x * x + 7;
        c = a * (x * x * x) + 7;
        System.out.print(k + "=" + j + "=" + c + "\nStatements a,d,e are correct");*/
//2.13
        /*int i, o, p;
        i = 7 + 3 * 6 / 2 - 1;//The order is:3,1,2,4
        o = 2 % 2 + 2 * 2 - 2 / 2;//The order is:1,4,2,5,3
        p = (3 * 9 * (3 + (9 * 3 / (3))));//The order is: 5,4,3,1,2
        System.out.println(i + "," + o + "," + p);*/
//2.14
        /*int num1 = 1, num2 = 2, num3 = 3, num4 = 4;

        System.out.println("Part (a)");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

        System.out.println("Part (b)");
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        System.out.print(num3 + " ");
        System.out.print(num4 + "\n");

        System.out.println("Part (c)");
        System.out.printf("%d %d %d %d", num1, num2, num3, num4);*/
//2.15
       /* Scanner input = new Scanner(System.in);

        int num_1, num_2, sum, product, difference, quotient;
        System.out.print("Enter first integer: ");
        num_1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num_2 = input.nextInt();

        sum = num_1 + num_2;
        product = num_1 * num_2;
        difference = num_1 - num_2;
        quotient = num_1 / num_2;

        System.out.printf("Sum is %d\n",sum);
        System.out.printf("Product is %d\n",product);
        System.out.printf("Difference is %d\n",difference);
        System.out.printf("Quotient is %d\n",quotient);*/
//2.16
        /*Scanner input = new Scanner(System.in);
        int num_3,num_4;

        System.out.print("Enter first integer: ");
        num_3 = input.nextInt();

        System.out.print("Enter second integer: ");
        num_4 = input.nextInt();

        if (num_3 > num_4)
            System.out.printf("%d is larger than %d\n",num_3,num_4);

        if (num_3 < num_4)
            System.out.printf("%d is larger than %d\n",num_4,num_3);

        if (num_3 == num_4)
            System.out.println("These numbers are equal");*/
//2.17
        /*Scanner input = new Scanner(System.in);

        int num_5,num_6,num_7,sum2,average,product2,smallest,largest;

        System.out.print("Enter first integer: ");
        num_5 = input.nextInt();

        System.out.print("Enter second integer: ");
        num_6 = input.nextInt();

        System.out.print("Enter third integer: ");
        num_7 = input.nextInt();

        sum2 = num_5 + num_6 + num_7;
        average = (sum2) / 3;
        product2 = num_5 * num_6 * num_7;

        smallest = num_5;
        if (num_6 <= smallest)
            smallest = num_6;

        if (num_7 <= smallest)
            smallest = num_7;

        largest = num_5;
        if (num_6 >= largest)
            largest = num_6;

        if (num_7 >= largest)
            largest = num_7;

        System.out.printf("Sum is %d\n", sum2);
        System.out.printf("Average is %d\n", average);
        System.out.printf("Product is %d\n", product2);
        System.out.printf("Smallest is %d\n", smallest);
        System.out.printf("Largest is %d\n", largest);*/
//2.18
        /*System.out.println ("This Application Displays A Box, An Oval, An Arrow"
                + " And A Diamond Using Asterisks (*)");

        System.out.print ("*********       ***         *          * \n");
        System.out.print ("*       *    *       *     ***        * * \n");
        System.out.print ("*       *   *         *   *****      *   * \n");
        System.out.print ("*       *   *         *     *       *     * \n");
        System.out.print ("*       *   *         *     *      *       * \n");
        System.out.print ("*       *   *         *     *       *     * \n");
        System.out.print ("*       *   *         *     *        *   * \n");
        System.out.print ("*       *    *       *      *         * * \n");
        System.out.print ("*********       ***         *          * \n");*/
//2.19
       /* System.out.printf("*%n**%n***%n****%n*****%n");*/ //*
                                                        //**
                                                        //***
                                                        //****
                                                        //*****
//2.20
       /* System.out.println("*");      //*
        System.out.println("***");    //***
        System.out.println("*****");  //*****
        System.out.println("****");   //****
        System.out.println("**");     //**  */
//2.21
        /*System.out.print("*");     //***************
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");*/
    }
}
