package Unit3.Array;

public class ResistorTest {

    public static void main(String[] args) {

        Resistor[] r = {new Resistor(110), new Resistor(220), new Resistor(330), new Resistor(460)};

        for (Resistor r1 : r) {
            System.out.print(r1 + " - ");
        }

        System.out.println();

        System.out.println("Resistance in Series: " + Resistors.getSerialResistance(r));
        System.out.println("Resistance in Parallel: " + Resistors.getParallelResistance(r));
    }
    
}
