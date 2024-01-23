package petmanagement;

public class Main {
    public static void main(String[] args) {

        IAnimal bird = new Bird("tiya", 5);
        IAnimal cat = (IAnimal) new Cat("ricko", 2);

        petshop n1 = new petshop("Rupa ");
        petshop n2 = new petshop("arghya");
        n1.sellPet(bird);
         n2.sellPet(cat);
        // Use the makeSound method for Cat
        // c.makeSound();

        // n2.sellPet((IAnimal)c);


    }
}
