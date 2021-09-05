import java.util.*;

 class TestGenerics4 {
    public static  void main(String[] args){
        new TestGenerics4().go();
    }

    public void go(){

        //ArrayList<Dog> dogs1 = new ArrayList<Animal>();
        //ArrayList<Animal> animals1 = new ArrayList<Dog>();
        //List<Animal> list = new ArrayList<Animal>();
        //ArrayList<Dog> dogs = new ArrayList<Dog>();
        //ArrayList<Animal> animals=dogs;
        //List<Dog> dogList =dogs;        
        ArrayList<Object> objects = new ArrayList<Object>();
        List<Object> objList = objects;
        //ArrayList<Object> objs = new ArrayList<Dog>();

        //takeAnimals(objects);

        
    }

    public void takeAnimals(ArrayList<? extends Animal> animals){ // with Wildcards <?>  OR other syntax i.e. declaring type parameter once i.e public <T extends Animal> void takeAnimals(ArrayList<T> animals)

        for(Animal a: animals){
            a.eat();
        }
    }

    abstract class Animal {
        void eat(){
            System.out.println("animal eating");
        }
    }

    class Dog extends Animal{
        void bark() { }
    }

    class Cat extends Animal{
        void meow() { }
    }
}