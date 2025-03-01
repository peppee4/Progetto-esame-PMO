import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Game implements KeyListener {
    private Maze maze;
    private Player player;

    public Game() {
        // Inizializzazione del giocatore e del labirinto
        player = new Player(1, 1, 3);
        maze = new Maze(player);

        // Creo il frame
        JFrame frame = new JFrame();
        frame.setSize(1280, 720);
        frame.setTitle("Escape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creo il pannello e gli imposto il bordino
        final JPanel panel = new JPanel();

        // Aggiungio il pannello al frame
        frame.getContentPane().add(panel);

        // Aggiungi il KeyListener alla finestra
        frame.addKeyListener(this); 
        frame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int dx = 0, dy = 0;

        // Gestione dei tasti premuti
        switch (keyCode) {
            case KeyEvent.VK_W:
                dx = -1; // Muovi su
                break;
            case KeyEvent.VK_S:
                dx = 1; // Muovi giù
                break;
            case KeyEvent.VK_A:
                dy = -1; // Muovi a sinistra
                break;
            case KeyEvent.VK_D:
                dy = 1; // Muovi a destra
                break;
            default:
                System.out.println("Comando non valido!");
                return;
        }

        // Muovi il giocatore
        player.move(dx, dy, maze);

        // Ridisegna il labirinto
        maze.printMaze();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        // Avvia il gioco
        new Game();
    }
}
