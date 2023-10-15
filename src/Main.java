import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number:");
        int input_number = scanner.nextInt();
        int sum = 0;
        while (input_number > 0) {
            sum += input_number % 10;
            input_number /= 10;
        }
        System.out.println("The sum of digits is: " + sum);


    }
}