package learning_java;

public class Cat extends Dog {

    // Attributes that belong to Cat only
    private int food;

    // Constructor for 3 args
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    // Constructor in case only 2 args are passed
    public Cat(String name, int age) {
        super(name, age);
        this.food = 50; // set food=50 by default in case it isnt passed in
    }

    // Constructor in case only name is passed
    public Cat(String name) {
        super(name, 0); // set age=0 by default if it isnt passed in
        this.food = 50;
    }

    public void speak() {
        System.out.println("Meow! I'm "+this.name+", "+this.age+" and I eat "+this.food+"g of food!");
    }
}
