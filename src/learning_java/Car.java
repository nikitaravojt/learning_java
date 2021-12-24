package learning_java;

public class Car implements Vehicle {

    private int speed = 0;
    private int gear = 1;

    public void speedUp(int change) {
        // Increase speed by 'change'
        this.speed += change;
    }

    public void slowDown(int change) {
        // Reduce speed by 'change'
        this.speed -= change;
    }

    public void changeGear(int change) {
        this.gear += 1;
    }

    public void status() {
        System.out.println("Speed: "+this.speed+"mph in gear "+this.gear);
    }
}
