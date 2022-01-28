package Unit3.Utils;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

/**
 * This is my lottery ticket program
 * @author Eric Beaulne
 */

public class LotteryTicket {

    public static void main(String[] args){

        // Initialize the scanner
        Scanner in = new Scanner(System.in);

        // Take in user input
        System.out.print("How many tickets do you want?: ");
        int ticketsAmount = in.nextInt();
        System.out.print("How many numbers do you want per ticket?: ");
        int numbers = in.nextInt();
        System.out.print("What is the lowest number: ");
        int low = in.nextInt();
        System.out.print("What is the highest number: ");
        int high = in.nextInt();

        // For the amount of tickets create a HashSet
        // and then add the numbers to the HashSet
        // and then convert the HashSet to an array
        // sort the array and print it
        for (int i = 0; i < ticketsAmount; i++) {
            HashSet<Integer> ticket = new HashSet<Integer>();
            int added = 0;
            while(added < numbers) {
                int number = (int)(Math.random()*(high-low+1))+low;
                if(ticket.add(number)) {
                    added++;
                }
            }
            Integer[] arr = ticket.toArray(new Integer[ticket.size()]);
            Arrays.sort(arr);
            System.out.print("Ticket " + (i+1) + ": ");
            for(int j : arr){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
