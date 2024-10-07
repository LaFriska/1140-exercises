package comp1110.homework.O02;

public class Coordinate {

    private int x;
    private int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(int v){
        this(v,v);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void swap(){
        int temp = x;
        x = y;
        y = temp;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y +")";
    }
}
