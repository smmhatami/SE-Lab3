package Model;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int computeArea() {
        return side*side;
    }
}
