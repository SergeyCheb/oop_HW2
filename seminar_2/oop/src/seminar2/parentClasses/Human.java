package seminar2.parentClasses;

import seminar2.interfaces.Diseaseable;
import seminar2.interfaces.Speakable;
import seminar2.interfaces.Swimable;
import seminar2.interfaces.Runnable;

import java.io.Serializable;

public abstract class Human implements Diseaseable, Speakable, Runnable, Swimable, Serializable {
    private final String name;
    // любой человек по природе может и бегать и плавать.
    // если по каким-то причинам человек не может плавать или бегать,
    // то эти поля всегда можно занулить
    private int runSpeed;
    private int swimSpeed;

    public Human(String name) {
        this(name, 10, 5);
    }
    public Human(String name, int runSpeed, int swimSpeed) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s заболел простудой", getType(), getName());
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Привет!%n", getType());
    }

    @Override
    public int getRunSpeed() {
        return runSpeed;
    }

    @Override
    public int getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    @Override
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%nСКОРОСТЬ БЕГА: %s,%nСКОРОСТЬ ПЛАВАНИЯ: %s;%n}", getType(), getName(), getRunSpeed(), getSwimSpeed()
        );
    }
}
