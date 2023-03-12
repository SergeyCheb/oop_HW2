package seminar2.implementations;

import seminar2.parentClasses.Animal;
import seminar2.interfaces.Speakable;

import java.io.Serializable;

/**
 * �������� �����, � ������� ����� "�������"  ��������� �� ��������� ��� ��������� � ���������.
 * ����� ������ � ������� ����� � �� ���� � ���� ������� ������� � ����������� :)
 */
public class HumanExtendsAnimal extends Animal implements Speakable {
    private final String name;
    private final int legsCount;

    public HumanExtendsAnimal(String name, int legsCount) {
        super("", legsCount);
        this.name = name;
        this.legsCount = legsCount;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s ���-�� �������.%n", getType(), getName());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }
}
