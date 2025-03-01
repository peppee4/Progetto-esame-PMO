public class Character {

    protected int x, y; // Posizione dell'entità nel labirinto

    public Character(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { 
        return x; 
    }
    public int getY() { 
        return y; 
    }

    // Metodo per il movimento, implementato nelle sottoclassi in quanto hanno esigenze diverse
    public void move(int dx, int dy){
        
    };
}
