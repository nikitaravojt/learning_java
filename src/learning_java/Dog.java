package learning_java;

public class Dog {

    // Attributes
    protected String name;
    protected int age;
    protected static int count = 0; // static, so dont need an obj to access this

    // Constructor method
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1; // adds 1 to count after an object is created
    }

    public void speak() {
        System.out.println("I am "+this.name+" and I'm "+this.age);
    }

    // When you don't care about any objects/instances of a class and just want a method to do something, use static.
    // Static methods don't need to have an instance reference it - you can access this method using Dog.animalSpeak()
    public static void animalSpeak() {
        System.out.println("I am an animal!");
    }
}
