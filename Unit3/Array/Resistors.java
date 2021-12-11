package Unit3.Array;

public class Resistors {

    public static double getSerialResistance(Resistor[] resistors) {
        if (resistors.length == 0) return 0;
        double sum = 0;
        for (Resistor resistor : resistors) {
            sum += resistor.getResistance();
        }
        return sum;
    }
    
    public static double getParallelResistance(Resistor[] resistors) {
        if (resistors.length == 0) return 0;
        double product = 0;
        for (Resistor resistor : resistors) {
            product += (1.0 / (double) resistor.getResistance());
        }
        return 1.0 / product;
    }
}
