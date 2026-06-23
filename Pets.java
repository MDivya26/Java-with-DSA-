import java.util.*;
abstract class Animal{
   abstract void display();
   }
class Dog extends Animal{
    void display(){
          System.out.println("BOW BOW");
      }
}
class Cat extends Animal{
   void display(){
       System.out.println("MEOW MEOW");
    }
}
class Pets{
   public static void main(String [] args){
            Dog d=new Dog();
            Cat c=new Cat();
            d.display();
            c.display();
       } 
}