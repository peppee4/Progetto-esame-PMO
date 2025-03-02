import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;

public class MazePanel extends JPanel{
    private Maze maze;
    private Player player;

    public MazePanel (Maze m, Player p){
        this.maze = m;
        this.player = p;
    }

    

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);

        // Disegnare il labirinto
        for(int i = 0; i < maze.getMaze().length; i++ ){
            for(int j = 0; j > maze.getMaze().length; j++){
                if(maze.getMaze()[i][j] == 1){
                    g.setColor(Color.BLACK);
                    g.fillRect(i, j, 5, 5);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(i, j, 5, 5);
                }
            }
        }
    }


}
