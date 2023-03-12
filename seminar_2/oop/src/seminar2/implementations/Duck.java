package seminar2.implementations;

import seminar2.interfaces.Flyable;
import seminar2.interfaces.Swimable;
import seminar2.parentClasses.Animal;
import seminar2.interfaces.Speakable;
import seminar2.interfaces.Runnable;

import java.io.Serializable;

public class Duck extends Animal implements Speakable, Swimable, Flyable, Runnable {

    public Duck(String name, String color) {
        super(name, color, 2);
        // ������� ������ ���� �� ���������
        super.setFlySpeed(15);
        // �������� �������� ���� �� ���������
        super.setSwimSpeed(10);
        // �������� ���� ���� �� ���������
        super.setRunSpeed(7);
    }

    public Duck(String color) {
        super(color, 2);
        // ������� ������ ���� �� ���������
        super.setFlySpeed(15);
        // �������� �������� ���� �� ���������
        super.setSwimSpeed(10);
        // �������� ���� ���� �� ���������
        super.setRunSpeed(7);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: ���!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    public void fly() {
        System.out.printf("%s �������!%n", getType());
    }

    @Override
    public int getLegsCount() {
        return super.getLegsCount();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public int getFlySpeed() {
        return super.getFlySpeed();
    }

    @Override
    public void setFlySpeed(int flySpeed) {
        super.setFlySpeed(flySpeed);
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
    public void setRunSpeed(int runSpeed) {
        super.setRunSpeed(runSpeed);
    }

    @Override
    public int getRunSpeed() {
        return super.getRunSpeed();
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s,%n�������� ����: %s,%n�������� ��������: %s,%n�������� ������: %s;%n}",
                getType(), getName(), getColor(), getLegsCount(), getRunSpeed(), getSwimSpeed(), getFlySpeed()
        );
    }
}
