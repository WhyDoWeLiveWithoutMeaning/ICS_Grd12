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
            // System.out.printf("1: %b, 2: %b, 3: %b", (a+b+c) % 2 == 0, a >= c, (c == 1 || b % 2 == 0));     
            if ((a+b+c) % 2 == 0 && a >= c && (c == 1 || b % 2 == 0)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
