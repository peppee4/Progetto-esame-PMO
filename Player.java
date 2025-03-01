public class Player {
    private int x;
    private int y;
    private int numberOfLifes;

    public Player(int x, int y, int numberOfLifes) {
        this.x = x;
        this.y = y;
        this.numberOfLifes = numberOfLifes;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNumberOfLifes() {
        return numberOfLifes;
    }

    public void loseOneLife() {
        numberOfLifes--;
    }

    public void move(int dx, int dy, Maze maze) {
        int newX = x + dx;
        int newY = y + dy;

        if (maze.isValidPosition(newX, newY)) {
            x = newX;
            y = newY;
        } else {
            System.out.println("Movimento non valido!");
        }
    }
}