class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}
public class Main{
    public static void main(String[]args){
        Animal a=new Animal();
        a.sound();
        System.out.println("Dog barks");
        Animal b=new Cat();
        a.sound();
        System.out.println("Cat meows");
    }
}
