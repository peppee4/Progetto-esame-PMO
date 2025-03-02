
import java.awt.Graphics;
import javax.swing.*;

public class MazePanel extends JPanel{
    
    private Maze maze;
    private Player player;

    public MazePanel (Maze m, Player p){
        this.maze = m;
        this.player = p;
        
    }

    @Override
    protected void paintComponent(Graphics g){
        
    }
}
