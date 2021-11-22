package DMOJ.MOCK21CCC.P1;

import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int n = in.nextInt();

        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        // int a = arr[0];
        // int d = arr[1] - a;
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}