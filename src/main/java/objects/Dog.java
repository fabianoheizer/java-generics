package objects;

public class Dog extends Animal {

    @Override
    public void printName() {
        System.out.println("I am a mad dog");
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
