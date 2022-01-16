package Unit3.HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class HashSetAssignment {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int elements = in.nextInt();

        HashSet<String> list = new HashSet<String>(size);

        int added = 0;
        while(added < elements) {
            String element = random3Letters();
            if (list.add(element)) {
                added++;
            } 
        }

        for(int i = 0; i < size; i++) {
            Iterator<String> iterate = list.iterator();

            while(iterate.hasNext()) {
                String t = iterate.next();
                if(t.hashCode()%size == i) {
                    System.out.print(t+ " ");
                }
            }
            System.out.println();
        }
    }
    

    private static String random3Letters(){
        String str = "";
        for (int i = 0; i < 3; i++) {
            str += (char)((int)(Math.random()*26)+65);
        }
        return str;
    }
}
