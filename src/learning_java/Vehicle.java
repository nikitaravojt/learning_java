package learning_java;

/*
Interfaces are essentially classes that do nothing apart from be inherited from by child classes.

* */
public interface Vehicle {

    final int gears = 5; // final makes gears variable a CONSTANT

    // Interface methods - no need to assign public/private keywords
    void speedUp(int a);
    void slowDown(int a);
    void changeGear(int a);

}
