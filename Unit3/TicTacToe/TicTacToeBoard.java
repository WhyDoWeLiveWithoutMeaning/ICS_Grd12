package Unit3.TicTacToe;

/**
 * This class represents a Tic Tac Toe board.
 * @author Eric Beaulne
 */

public class TicTacToeBoard {

    // instance variable
    private TicTacToeSpace[][] spaces;

    // Constructor
    public TicTacToeBoard() {
        this.spaces = new TicTacToeSpace[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.spaces[i][j] = new TicTacToeSpace();
            }
        }
    }

    // Constructor
    public TicTacToeBoard(int[][] board) {
        this();
        if(board.length == 3 && board[0].length == 3 && isValid(board) || board != null) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    this.spaces[i][j].setValue(board[i][j]);
                }
            }
        }
    }

    // Constructor
    public TicTacToeBoard(TicTacToeSpace[][] arr){
        this.spaces = arr;
    }

    // Constructor
    public TicTacToeBoard(TicTacToeBoard board){
        this();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.spaces[i][j] = new TicTacToeSpace(board.spaces[i][j].getValue());
            }
        }
    }
    
    /**
     * This function checks if the board is winning for either X or O
     * @return true if the board is winning for either X or O
     */
    public boolean isWin(){

        // Check rows
        for(int i = 0; i < this.spaces.length; i++){
            int t = 0;
            for(int j = 0; j < this.spaces[i].length; j++){
                if (this.spaces[i][j].getValue() == TicTacToeSpace.X)
                    t++;
                else if (this.spaces[i][j].getValue() == TicTacToeSpace.O)
                    t--;
            }
            if (Math.abs(t) == 3)
                return true;
        }

        // Check Columns
        for(int i = 0; i < this.spaces.length; i++){
            int t = 0;
            for(int j = 0; j < this.spaces[i].length; j++){
                if (this.spaces[j][i].getValue() == TicTacToeSpace.X)
                    t++;
                else if (this.spaces[j][i].getValue() == TicTacToeSpace.O)
                    t--;
            }
            if (Math.abs(t) == 3)
                return true;
        }

        //Check Diagonals
        int t = 0;
        for(int i = 0; i < this.spaces.length; i++){
            if (this.spaces[i][i].getValue() == TicTacToeSpace.X)
                t++;
            else if (this.spaces[i][i].getValue() == TicTacToeSpace.O)
                t--;
        }
        if (Math.abs(t) == 3)
            return true;

        t = 0;
        for(int i = 0; i < this.spaces.length; i++){
            if (this.spaces[i][this.spaces.length-1-i].getValue() == TicTacToeSpace.X)
                t++;
            else if (this.spaces[i][this.spaces.length-1-i].getValue() == TicTacToeSpace.O)
                t--;
        }
        if (Math.abs(t) == 3)
            return true;
        return false;
    }

    /**
     * This function checks if the board is full and neither X nor O has won
     * @return true if the board is full and neither X nor O has won
     */
    public boolean isDraw(){
        for(int i = 0; i < this.spaces.length; i++){
            for(int j = 0; j < this.spaces[i].length; j++){
                if (this.spaces[i][j].getValue() == TicTacToeSpace.BLANK)
                    return false;
            }
        }
        if (isWin())
            return false;
        return true;
    }

    /**
     * This function checks if the board is blank
     * @return true if the board is blank
     */
    public boolean isBlank(){
        int blank = 0;
        for(int i = 0; i < this.spaces.length; i++){
            for(int j = 0; j < this.spaces[i].length; j++){
                if (this.spaces[i][j].getValue() == TicTacToeSpace.BLANK)
                    blank++;

            }
        }
        if (blank == 9){
            return true;
        } else {
            return false;
        }
    }

    /**
     * This function gets the value of the space at the given row and column
     * @return the space at the given row and column
     */
    public TicTacToeSpace getSpace(int i, int j){
        return this.spaces[i][j];
    }

    /**
     * This function sets the value of the space at the given row and column
     * @param i the row of the space
     * @param j the column of the space
     * @param value the value of the space
     * @return true if the space was set successfully
     */
    public boolean setSpace(int i, int j, int value){
        if ((value == TicTacToeSpace.BLANK || value == TicTacToeSpace.X || value == TicTacToeSpace.O) && i >= 0 && i < 3 && j >= 0 && j < 3){
            this.spaces[i][j].setValue(value);
            return true;
        } else {
            return false;
        }
    }

    /**
     * This function resets the board to blank
     */
    public void clear(){
        for(int i = 0; i < this.spaces.length; i++){
            for(int j = 0; j < this.spaces[i].length; j++){
                this.spaces[i][j].setValue(TicTacToeSpace.BLANK);
            }
        }
    }

    @Override
    public String toString(){
        String s = "";
        for (int e = 0; e < (8*this.spaces.length)+1; e++) s+="-";
        s += "\n";
        for (int i = 0; i < this.spaces.length; i++){
            s += "|";
            for (int j = 0; j < this.spaces[i].length; j++){
                s += this.spaces[i][j] + "\t|";
            }
            s += "\n";
            for (int e = 0; e < (8*this.spaces[i].length)+1; e++) s += "-";
            s += "\n";
        }
        return s;
    }

    /**
     * This function checks if the board is a valid board
     * @return true if the board is a valid board
     */
    private static boolean isValid(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != TicTacToeSpace.BLANK && board[i][j] != TicTacToeSpace.X && board[i][j] != TicTacToeSpace.O)
                    return false;
            }
        }
        return true;
    }
}
