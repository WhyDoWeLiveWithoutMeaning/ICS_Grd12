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
        if (value == BLANK || value == X || value == O)
            this.value = value;
        else
            this.value = BLANK;
    }

    public int getValue(){
        return this.value;
    }

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
