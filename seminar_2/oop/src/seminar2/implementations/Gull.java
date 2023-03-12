package seminar2.implementations;

import seminar2.interfaces.Flyable;
import seminar2.interfaces.Speakable;
import seminar2.interfaces.Swimable;
import seminar2.interfaces.Runnable;
import seminar2.parentClasses.Animal;

import java.io.Serializable;

public class Gull extends Animal implements Runnable, Swimable, Flyable, Speakable {
    public Gull(String name, String color) {
        super(name, color, 2);
        super.setSwimSpeed(11);
        super.setRunSpeed(2);
        super.setFlySpeed(17);
    }

    @Override
    public void speak() {
        System.out.printf("%s ÒÍ‡Á‡Î: Ì„‡-„‡-„‡!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    @Override
    public int getFlySpeed() {
        return super.getFlySpeed();
    }

    @Override
    public void setFlySpeed(int flySpeed) {
        super.setFlySpeed(flySpeed);
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
                "%s {name: %s,%ncolor: %s,%nlegs: %s,%n— Œ–Œ—“‹ ¡≈√¿: %s,%n— Œ–Œ—“‹ œÀ¿¬¿Õ»ﬂ: %s,%n— Œ–Œ—“‹ œŒÀ≈“¿: %s;%n}",
                getType(), getName(), getColor(), getLegsCount(), getRunSpeed(), getSwimSpeed(), getFlySpeed()
        );
    }
}
