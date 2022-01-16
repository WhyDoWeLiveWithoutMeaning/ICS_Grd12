package Unit3.Utils;

import java.util.Scanner;
import java.util.HashSet;

public class LotteryTicket {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("How many tickets do you want?: ");
        int ticketsAmount = in.nextInt();
        System.out.print("How many numbers do you want per ticket?: ");
        int numbers = in.nextInt();
        System.out.print("What is the lowest number: ");
        int low = in.nextInt();
        System.out.print("What is the highest number: ");
        int high = in.nextInt();

        for (int i = 0; i < ticketsAmount; i++) {
            HashSet<Integer> ticket = new HashSet<Integer>();
            int added = 0;
            while(added < numbers) {
                int number = (int)(Math.random()*(high-low+1))+low;
                if(ticket.add(number)) {
                    added++;
                }
            }
            System.out.println("Ticket " + (i+1) + ": " + ticket);
        }
    }
}
