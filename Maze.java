public class Maze {
    private int maze[][] = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    private Player player;

    public Maze(Player player) {
        this.player = player;
    }

    public int[][] getMaze() {
        return maze;
    }

    public void printMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (i == player.getX() && j == player.getY()) {
                    System.out.print("P "); // Giocatore
                } else if (maze[i][j] == 1) {
                    System.out.print("# "); // Muro
                } else {
                    System.out.print(". "); // Spazio vuoto
                }
            }
            System.out.println();
        }
    }

    public boolean isValidPosition(int x, int y) {
        return maze[x][y] == 0;
    }
}