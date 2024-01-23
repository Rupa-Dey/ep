package petmanagement;

public class petshop {
    String owner;

    public petshop(String owner){
        this.owner = owner;
    }

    public void sellPet(IAnimal pet){
        System.out.println(owner +"sells this pet " + pet.getName()+". it's age is: "+pet.getAge());
        if(pet instanceof Cat){
            ((Cat)pet).makeSound();
        }
        if(pet instanceof Bird){
            ((Bird)pet).makeSound();
        }
    }

   
}
