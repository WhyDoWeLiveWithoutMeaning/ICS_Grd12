package Unit3.TicTacToe;

public class TicTacToeSpace {

    // CONSTANTS
    public static final int BLANK = 0;
    public static final int X = 1;
    public static final int O = 2;
    
    // INSTANCE VARIABLES
    private int value;

    // Constructor
    public TicTacToeSpace() {
        this.value = BLANK;
    }

    // Constructor
    public TicTacToeSpace(int value) {
        if (value == BLANK || value == X || value == O)
            this.value = value;
        else
            this.value = BLANK;
    }

    /**
     * This function returns the value of the space
     * @return the value of the space
     */
    public int getValue(){
        return this.value;
    }

    /**
     * This function sets the value of the space
     * @param value the value to set the space to
     */
    public void setValue(int value){
        if (value == BLANK || value == X || value == O)
            this.value = value;
    }
    
    @Override
    public String toString(){
        if (value == BLANK)
            return "·";
        else if (value == X)
            return "X";
        else
            return "O";
    }
}
