package Unit1.AssignmentTuesday16;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        p3();
    }

    public static void p1(){
        System.out.print("Which month were you born? (1-12): ");
        int name = in.nextInt();

        LocalDate days = LocalDate.of(2019, name, 1);
        System.out.printf("There are %d days in the month of %s\n", days.lengthOfMonth(), days.getMonth().toString());
    }

    public static void p2(){
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

        System.out.printf("The GCD of %d and %d is %d", a, b, gcd(a, b));
    }

    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
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
