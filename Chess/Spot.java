package Chess;

public class Spot {
    private int row;
    private int col;

    public Spot(int row, int col) {
        if (row >= 0 && row <= 9 && col >= 0 && col <= 9) {
            this.row = row;
            this.col = col;
        } else {
            throw new IllegalArgumentException("Invalid row or column");
        }
    }
    
}
