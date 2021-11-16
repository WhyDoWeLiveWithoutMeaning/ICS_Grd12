package ConwaysGameOfLife;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class Main extends JPanel implements MouseInputListener, KeyListener {

    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;

    static JFrame frame = new JFrame("Conways Game of Life");

    private GameOfLife gol = new GameOfLife(WIDTH/10, HEIGHT/10);

    public void paint(Graphics g) {
        super.paint(g);
        gol.display(g);
    }

    public static void main(String[] args) {
        // GameOfLife game = new GameOfLife(WIDTH, HEIGHT);
        Main main = new Main();
        frame.getContentPane().add(main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(main);
        frame.addKeyListener(main);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

        gol.toggleCell((e.getX()-10)/10, (e.getY()-30)/10);

        frame.repaint();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'r') {
            gol.update();
            frame.repaint();
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
