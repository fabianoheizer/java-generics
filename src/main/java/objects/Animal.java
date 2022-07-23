package objects;

public abstract class Animal {

    public String name;
    public Integer age;

    public void eat(){
        System.out.println("All animals eats");
    }

    public abstract void printName();
}
