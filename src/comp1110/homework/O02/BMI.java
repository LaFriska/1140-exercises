package comp1110.homework.O02;

public class BMI {

    public String name;
    private double height;
    private double weight;

    BMI(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }


    public double getBMI(){
        return weight/(height * height);
    }

    @Override
    public String toString() {
        return name + " is " + height + "m tall and is " + weight + "Kg and has a BMI of " + getBMI() + "Kg" + "/m^2";
    }
}
