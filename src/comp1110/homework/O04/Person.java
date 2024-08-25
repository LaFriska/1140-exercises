package comp1110.homework.O04;

public class Person {

    public static float pi = 3.14f;

    //FIELDS

    public String name;
    private float height;

    public Person(String name, float height){
        this.name = name;
        this.height = height;
    }

    //METHODS

    public void talk(String name){
        System.out.println(this.name + " says hello to " + name);
    }

    public static void main(String[] args) {
        Person john = new Person("John", 1.82f);
        Person mary = new Person("Mary", 1.62f);
        System.out.println(john.name);
        john.talk("Jack");

    }


}
