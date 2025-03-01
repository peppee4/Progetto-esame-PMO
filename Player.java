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
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getNumberOfLifes() {
        return this.numberOfLifes;
    }

    public void loseOneLife() {
        this.numberOfLifes--;
    }

    public void move(int dx, int dy, Maze maze) {
        int newX = this.x + dx;
        int newY = this.y + dy;

        if (maze.isValidPosition(newX, newY)) {
            this.x = newX;
            this.y = newY;
        } else {
            System.out.println("Movimento non valido!");
        }
    }
}