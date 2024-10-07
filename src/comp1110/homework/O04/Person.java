package comp1110.homework.O04;

public class Person {

    //FIELDS

    public String name = "Mary";
    private float height;

    String variable = new String();

    public Person(String name, float height){
        this.name = name;
        this.height = height;
    }

    //METHODS

    public void talk(String name){
        String variable = new String();
        this.variable = "hi";
        System.out.println(this.name + " says hello to " + name);
    }

    public static void main(String[] args) {
        Person john = new Person("John", 1.82f);
        Person mary = new Person("Mary", 1.62f);
        System.out.println(john.name);
        john.talk("Jack");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
