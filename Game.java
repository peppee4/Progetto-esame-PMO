public class Game {
    public static void main(String[] args) {
        Maze m = new Maze();
        Player p = new Player(1, 1, 3);
        m.printMaze(p);

    }
}
