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

        // Configurazione di una finestra invisibile per catturare gli eventi della tastiera
        JFrame frame = new JFrame();
        frame.setSize(1, 1); // Finestra molto piccola (quasi invisibile)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this); // Aggiungi il KeyListener alla finestra
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
            case KeyEvent.VK_Q:
                System.out.println("Hai scelto di uscire dal gioco.");
                System.exit(0); // Esci dal gioco
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
        // Non necessario per questo esempio
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Non necessario per questo esempio
    }

    public static void main(String[] args) {
        // Avvia il gioco
        new Game();
    }
}
