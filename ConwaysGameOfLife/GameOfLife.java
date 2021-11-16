package ConwaysGameOfLife;

import java.awt.Graphics;

import java.awt.Color;

public class GameOfLife {

    private boolean[][] grid;

    public GameOfLife(int width, int height) {
        grid = new boolean[width][height];
    }

    public void setCell(int x, int y) {
        grid[x][y] = true;
    }

    public void clearCell(int x, int y) {
        grid[x][y] = false;
    }

    public boolean getCell(int x, int y) {
        return grid[x][y];
    }

    public void toggleCell(int x, int y) {
        grid[x][y] = !grid[x][y];
    }

    public void display(Graphics g){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) {
                    g.setColor(Color.WHITE);
                    g.fillRect(i * 10, j * 10, 10, 10);
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(i * 10, j * 10, 10, 10);
                }
                g.setColor(Color.GRAY);
                g.drawRect(i * 10, j * 10, 10, 10);
            }
        }
    }

    public void update() {
        boolean[][] newGrid = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int neighbors = 0;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < grid.length && y >= 0 && y < grid[i].length) {
                            if (x != i || y != j) {
                                neighbors += grid[x][y] ? 1 : 0;
                            }
                        }
                    }
                }
                if (grid[i][j]) {
                    if (neighbors < 2 || neighbors > 3) {
                        newGrid[i][j] = false;
                    } else {
                        newGrid[i][j] = true;
                    }
                } else {
                    if (neighbors == 3) {
                        newGrid[i][j] = true;
                    } else {
                        newGrid[i][j] = false;
                    }
                }
            }
        }
        grid = newGrid;
    }
}
