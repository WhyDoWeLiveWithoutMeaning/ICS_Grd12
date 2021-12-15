package Unit3.TicTacToe;

public class TicTacToeSpace {

    public static final int BLANK = 0;
    public static final int X = 1;
    public static final int O = 2;
    
    private int value;

    public TicTacToeSpace() {
        value = BLANK;
    }

    public TicTacToeSpace(int value) {
        if (value == 0 || value == 1 || value == 2)
            this.value = value;
        else
            this.value = BLANK;
    }

    

    
    
}
