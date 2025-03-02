import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class MazePanel extends JPanel {
    private Maze maze;
    private Player player;
    private Image wallImage;    // Immagine per il muro
    private Image playerImage;  // Immagine per il player

    public MazePanel(Maze m, Player p) {
        this.maze = m;
        this.player = p;

        // Caricamento immagine del muro
        ImageIcon wallIcon = new ImageIcon("wall.png");  
        wallImage = wallIcon.getImage(); 

        // Caricamento immagine player
        ImageIcon playerIcon = new ImageIcon("Player.png");
        playerImage = playerIcon.getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Disegnare il labirinto
        for (int i = 0; i < maze.getMaze().length; i++) {
            for (int j = 0; j < maze.getMaze()[i].length; j++) {
                if (maze.getMaze()[i][j] == 1) {
                    // Se è un muro, disegna l'immagine del muro
                    g.drawImage(wallImage, j * 50, i * 50, 50, 50, this);  
                } else {
                    // Se è uno spazio vuoto, disegna il colore di sfondo
                    g.setColor(Color.WHITE);
                    g.fillRect(j * 50, i * 50, 50, 50);
                }
            }
        }

        g.drawImage(playerImage, player.getX() * 50, player.getY() * 50, 50, 50, this);
    }
}

