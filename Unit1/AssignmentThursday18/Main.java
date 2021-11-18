package Unit1.AssignmentThursday18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Collect Element Inputs
        System.out.print("Enter the number of carbon atoms: ");
        int carbon = in.nextInt();

        System.out.print("Enter the number of hydrogen atoms: ");
        int hydrogen = in.nextInt();

        System.out.print("Enter the number of oxygen atoms: ");
        int oxygen = in.nextInt();

        // Calculate the number of H2O molecules
        int h2 = hydrogen / 2;
        int h2o = 0;
        while (oxygen > 0 && h2 > 0) {
            oxygen--;
            h2--;
            h2o++;
        }
        hydrogen -= ((hydrogen/2) - h2) * 2;

        // Calculate the number of CO2 molecules
        int o2 = oxygen/2;
        int co2 = 0;
        while (carbon > 0 && o2 > 0) {
            carbon--;
            o2--;
            co2++;
        }
        oxygen -= ((oxygen/2) - o2) * 2;

        // Calculate the number of CH4 molecules
        int h4 = hydrogen/4;
        int ch4 = 0;
        while (carbon > 0 && h4 > 0) {
            carbon--;
            h4--;
            ch4++;
        }
        hydrogen -= ((hydrogen/4) - h4) * 4;

        //Output the number of each molecule
        System.out.println("The number of H2O molecules is: " + h2o);
        System.out.println("The number of CO2 molecules is: " + co2);
        System.out.println("The number of CH4 molecules is: " + ch4);
    }
}
