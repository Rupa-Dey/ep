package petmanagement;

public class Bird implements IAnimal{
    String name;
    int age;
    public Bird(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void eat() {
        System.out.println("It is Bird. " + name + " is eating");
    }
    public void makeSound(){
        System.out.println("it's chirping");
    }
    
}
