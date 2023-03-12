package seminar2.implementations;

import seminar2.parentClasses.Animal;
import seminar2.interfaces.Speakable;
import seminar2.interfaces.Runnable;

import java.io.Serializable;


public class Cat extends Animal implements Speakable, Runnable {
    public Cat(String name, String color) {
        super(name, color, 4);
        // скорость бега кошки по умолчанию
        super.setRunSpeed(10);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Meow!%n", getType());
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%nСКОРОСТЬ БЕГА: %s;%n}", getType(), getName(), getColor(),
                getLegsCount(), getRunSpeed()
        );
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        toPlay();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public int getRunSpeed() {
        return super.getRunSpeed();
    }


    public void setRunSpeed(int runSpeed) {
        super.setRunSpeed(runSpeed);
    }

}
