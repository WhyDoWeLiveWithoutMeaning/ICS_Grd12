package Unit3.TicTacToe;

public class TicTacToeBoard {

    private TicTacToeSpace[][] spaces;

    public TicTacToeBoard() {
        this.spaces = new TicTacToeSpace[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.spaces[i][j] = new TicTacToeSpace();
            }
        }
    }

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

    public TicTacToeBoard(TicTacToeSpace[][] arr){
        this.spaces = arr;
    }

    public TicTacToeBoard(TicTacToeBoard board){
        this();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.spaces[i][j] = new TicTacToeSpace(board.spaces[i][j].getValue());
            }
        }
    }
    
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

    public TicTacToeSpace getSpace(int i, int j){
        return this.spaces[i][j];
    }

    public boolean setSpace(int i, int j, int value){
        if ((value == TicTacToeSpace.BLANK || value == TicTacToeSpace.X || value == TicTacToeSpace.O) && i >= 0 && i < 3 && j >= 0 && j < 3){
            this.spaces[i][j].setValue(value);
            return true;
        } else {
            return false;
        }
    }

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
        for(int i = 0; i < this.spaces.length; i++){
            for(int j = 0; j < this.spaces[i].length; j++){
                s += this.spaces[i][j].toString();
            }
            s += "\n";
        }
        return s;
    }


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
