import java.util.Scanner;

//class CPN {
//    static boolean isPrime(int num) {
//
//        if (num <= 1) {
//            return false;
//        }
//        for (
//                int i = 2;
//                i <= num / 2; i++) {
//            if ((num % i) == 0)
//                return false;
//        }
//        return true;
//    }
//}
//

public class Main {
    public static void main(String[] args) {

//Exercise hw5#1 -Input 5 numbers ;Show the value and the index of the highest number.

//        Scanner scanner = new Scanner(System.in);
//        int max = 0;
//        int index = 0;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("please enter number:");
//            int input_number = scanner.nextInt();
//            if (input_number > max) {
//                max = input_number;
//                index = i;
//            }
//        }
//        System.out.println("The highest number is: " + max + " and the index is: " + index);


//Exercise hw5#2 -Input natural number ; Show sum of its digits
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter number:");
//        int input_number = scanner.nextInt();
//        int sum = 0;
//        while (input_number > 0) {
//            sum += input_number % 10;
//            input_number /= 10;
//        }
//        System.out.println("The sum of digits is: " + sum);

//Exercise hw5#3 - Input two natural positive numbers x and y ; Show the x^y without using “^”

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter number:x for calculate x^y:");
//        int x = scanner.nextInt();
//        System.out.println("please enter number:y for calculate x^y:");
//        int y = scanner.nextInt();
//        int powerxy = 1;
//        for (int i = 0; i < y; i++) {
//            powerxy *= x;
//        }
//        System.out.println("The power of " + x + " to " + y + " is: " + powerxy);


//Exercise hw5#4 - Input number till you will get negative number ; For each positive number show sum of its digits

//        Scanner scanner = new Scanner(System.in);
//        int x = 0;
//        int sumpos = 0;
//        while (x >= 0) {
//            System.out.println("please enter number:");
//            x = scanner.nextInt();
//            if (x > 0) {
//                sumpos += x;
//            }
//        }
//        System.out.println("The sum of positive numbers is: " + sumpos);

//Exercise hw5#5 - Input number till you will get prime number; Print all not prime numbers

//        Scanner scanner = new Scanner(System.in);
//        Boolean isPrime = false;
//
//        while (isPrime == false) {
//            System.out.println("please enter number:");
//            int input_number = scanner.nextInt();
//            isPrime = CPN.isPrime(input_number);
//            if (isPrime == true) {
//                System.out.println("The number " + input_number + " is prime");
//                break;
//            } else {
//                System.out.println("The number " + input_number + " is not prime");
//            }
//        }

//Exercise hw5#6

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter number:");
//        int input_number = scanner.nextInt();
//        int k=1;
//        for (int i = input_number; i >= 1; i--) {
//            for (int j=k; j <= input_number; j++) {
//                System.out.print(j + ",");
//            }
//            System.out.println();
//            k++;
//        }

//Exercise hw5#7 - Input two natural positive numbers x and y ; print rectangle of x*y with # and ~

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number:x for print rectangle of X*Y:");
        int x = scanner.nextInt();
        System.out.println("please enter number:y for print rectangle of X*Y:");
        int y = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++)
                if (i == 0 || i == x - 1 || j == 0 || j == y - 1) {
                    System.out.print("#");
                } else {
                    System.out.print("~");
                }
            System.out.println();
        }





    }
}