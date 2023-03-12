package seminar2.implementations;

import seminar2.interfaces.Swimable;
import seminar2.parentClasses.Animal;
import seminar2.interfaces.Speakable;
import seminar2.interfaces.Runnable;

import java.io.Serializable;


public class Dog extends Animal implements Speakable, Runnable, Swimable {

    public Dog(String name, String color) {
        super(name, color, 4);

        //скорость бега собаки по умолчанию
        super.setRunSpeed(12);
        //скорость плавания собаки по умолчанию
        super.setSwimSpeed(5);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Гав!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        toPlay();
        findFood();
        eat();
        toPlay();
        goToSleep();
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
    public int getRunSpeed() {
        return super.getRunSpeed();
    }

    @Override
    public void setRunSpeed(int runSpeed) {
        super.setRunSpeed(runSpeed);
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s,%nСКОРОСТЬ БЕГА: %s,%nСКОРОСТЬ ПЛАВАНИЯ: %s;%n}", getType(),
                getName(), getColor(), getLegsCount(), getRunSpeed(), getSwimSpeed()
        );
    }
}
