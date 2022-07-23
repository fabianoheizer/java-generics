package generics.types;

import objects.Animal;

public class PrinterAnimals <T extends Animal> {

    public <T> void printAnimalName(T animal){
        System.out.println(animal);
    }

}
