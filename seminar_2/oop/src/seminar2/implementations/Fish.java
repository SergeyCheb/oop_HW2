package seminar2.implementations;

import seminar2.interfaces.Swimable;
import seminar2.parentClasses.Animal;

public class Fish extends Animal implements Swimable {
    public Fish(String name, String color){
        super(name, color, 2);
        // скорость плавания рыбы по умолчанию
        super.setSwimSpeed(15);
    }

    @Override
    public void hunt() {
        findFood();
        eat();
    }

    @Override
    public int getSwimSpeed() {
        return super.getSwimSpeed();
    }

    @Override
    public void setSwimSpeed(int swimSpeed) {
        super.setSwimSpeed(swimSpeed);
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nСКОРОСТЬ ПЛАВАНИЯ: %s;%n}", getType(), getName(), getColor(),
                getSwimSpeed()
        );
    }
}
