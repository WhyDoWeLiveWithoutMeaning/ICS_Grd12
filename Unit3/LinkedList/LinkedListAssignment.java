package Unit3.LinkedList;

import java.util.LinkedList;

public class LinkedListAssignment {

    public static void main(String[] args){

        LinkedList<String> fired = new LinkedList<String>();

        LinkedList<String> employees = new LinkedList<String>();

        employees.add("John");
        employees.add("Jane");
        employees.add("Jack");
        employees.add("Jill");
        employees.add("Joe");
        employees.add("Jenny");
        employees.add("Juan");
        employees.add("Jennifer");
        employees.add("Jingle");
        employees.add("Jangle");

        System.out.println(employees);

        int increment = employees.size()-1;
        for (int i = 0; i < increment; i++) {

            int index = (increment%employees.size())-1;
            if (index < 0) {
                index = employees.size()-1;
            }

            fired.add(employees.get(index));
            employees.remove(index);

            System.out.println("Fired: " + fired);
            System.out.println("Remaining: " + employees);

            System.out.println();

        }
        
        System.out.println("Winner: " + employees.get(0));

        
    }
    
}