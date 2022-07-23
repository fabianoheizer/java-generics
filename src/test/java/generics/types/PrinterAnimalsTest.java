package generics.types;

import objects.Cat;
import objects.Dog;
import org.junit.jupiter.api.Test;

class PrinterAnimalsTest {

    @Test
    void printAnimals(){
        PrinterAnimals pa = new PrinterAnimals();

        Dog dog = new Dog("Toto", 1);
        Cat cat = new Cat("Gato", 2);

        pa.printAnimalName(dog.name);
        pa.printAnimalName(dog.age);
        pa.printAnimalName(cat.name);
        pa.printAnimalName(cat.age);
    }
}