package Ejercicio3;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4]; // Define an array of four Animal objects
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Lion();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getScientificName());
            System.out.println("Sonido: " + animals[i].getSound());
            System.out.println("Animales: " + animals[i].getFood());
            System.out.println("Habitat: " + animals[i].getHabitat());
            System.out.println();
        }
    }
}

