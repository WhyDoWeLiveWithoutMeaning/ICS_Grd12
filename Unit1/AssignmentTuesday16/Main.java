package Unit1.AssignmentTuesday16;

import java.time.LocalDate;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        p3();
    }

    //Using Local Date
    public static void p1(){
        System.out.print("Which month were you born? (1-12): ");
        int month = in.nextInt();

        LocalDate days = LocalDate.of(2019, month, 1);
        System.out.printf("There are %d days in the month of %s\n", days.lengthOfMonth(), days.getMonth().toString());
    }

    // Without LocalDate, With Switch
    public static void p12(){
        System.out.print("Which month were you born? (1-12): ");
        int month = in.nextInt();

        switch(month){
            case 1: month = 30;
            case 2: month = 28;
            case 3: month = 30;
            case 4: month = 31;
            case 5: month = 30;
            case 6: month = 31;
            case 7: month = 30;
            case 8: month = 31;
            case 9: month = 30;
            case 10: month = 31;
            case 11: month = 30;
            case 12: month = 31;
        }

        System.out.println(month);
    }

    // With BigInteger
    public static void p2(){
        System.out.print("Enter a number from 1-20: ");
        int number = in.nextInt();
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= number; i++){
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.printf("The factorial of %d is %d\n", number, factorial);
    }

    // Without BigInteger
    public static void p22(){
        System.out.print("Enter a number from 1-20: ");
        int number = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.printf("The factorial of %d is %d\n", number, factorial);
    }

    public static void p3(){
        System.out.print("Enter a number: ");
        int a = in.nextInt();

        System.out.print("Enter a number: ");
        int b = in.nextInt();

        System.out.printf("The GCD of %d and %d is %d", a, b, gcd2(a, b));
    }


    // Method 1 Using Recursion
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    // Method 2 Without Recrusion
    public static int gcd2(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        while (max % min != 0){
            min = max;
            max = min % max;
        }
        return min;
    }

    public static void p4(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        for (int i : arr){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
