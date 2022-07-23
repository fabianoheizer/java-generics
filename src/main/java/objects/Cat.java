package objects;

public class Cat extends Animal{

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printName() {
        System.out.println("I am a mad cat");
    }
}
