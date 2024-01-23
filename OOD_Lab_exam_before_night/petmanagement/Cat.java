// package petmanagement;

// public class Cat implements IAnimal {
//     String name;
//     int age;

//     public Cat(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void eat(){
//         System.out.println("It is cat. it's name is" + name + ". it is eating");
//     }

//     public void makeSound(){
//         System.out.println("it makes sound: mew mew");
//     }
// }
//.................................
package petmanagement;

public class Cat implements IAnimal{
    String name;
    int age;
    public Cat(String name, int age){
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
        System.out.println("It is Cat. " + name + " is eating");
    }
    public void makeSound(){
        System.out.println("mew mew");
    }
    
}
