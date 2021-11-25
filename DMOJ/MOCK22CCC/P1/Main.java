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
            
            if (a+b+c % 2 == 0 || a >= c && (b % 2 == 0 || c == 1)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
