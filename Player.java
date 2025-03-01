public class Player extends Character{

    private int numberOfLifes;

    public Player(int x, int y, int lifes) {
            super(x, y);
            this.numberOfLifes = lifes;
        }

    // Metodo per ottenere la coordinata x del player
    public int getX(){
        return this.x;
    }

    // Metodo per ottenere la coordinata y del player
    public int getY(){
        return this.y;
    }

    // METODO PER OTTENERE IL NUMERO DI VITE DEL PLAYER
    public int getNumberOfLifes(){
        return this.numberOfLifes;
    }

    // METODO PER DIMINUIRE IL NUMERO DI VITA DI UNA UNITA' IN CASO DI CONTATTO CON ENTITA' MOB
    public void loseOneLife(){
        this.numberOfLifes--;
    }
    
        @Override
    public void move(int dx, int dy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }
    
}