package DMOJ.MOCK22CCC.P1;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        while(n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            b = b%2;
            while(a > 1 && b > 0){
                a -= 2;
                b--;
            }
            while (c > 0 && a > 0){
                a--;
                c--;
            }
            while(a > 0 && b > 0 && c > 0){
                a--;
                b--;
                c--;
            }
            a = a%2;
            
            if (a + b + c == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
