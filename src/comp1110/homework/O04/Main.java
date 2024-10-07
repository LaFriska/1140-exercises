package comp1110.homework.O04;

import comp1110.homework.O02.Coordinate;

public class Main {

    public static void main(String[] args) {

    }

    public void swap(Coordinate coordinate){
        int temp = coordinate.getX();
        coordinate.setX(coordinate.getY());
        coordinate.setY(temp);
    }

}
