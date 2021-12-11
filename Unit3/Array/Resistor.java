package Unit3.Array;

public class Resistor {
    private int resistance;

    public Resistor() {
        this.resistance = 220;
    }

    public Resistor(int resistance) {
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

    @Override
    public String toString() {
        return this.resistance + " ohms";
    }
}
