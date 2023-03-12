package seminar2.parentClasses;

import seminar2.interfaces.Diseaseable;

import java.io.Serializable;

public abstract class Animal implements Diseaseable, Serializable {
    private String name;
    private final String color;
    private int legsCount;

    // ��� ��������� ���� � ������ ������ ���������� �������������,
    // ��� � ���� ������� ������������� ����������
    // ���������������� ������
    private int flySpeed;
    private int swimSpeed;
    private int runSpeed;

    public Animal(String name, String color, int legsCount) {
        this.name = name;
        this.color = color;
        this.legsCount = legsCount;

        this.flySpeed = 0;
        this.swimSpeed = 0;
        this.runSpeed = 0;
    }

    public Animal(String color, int legsCount) {
        this("����������", color, legsCount);
    }

    public Animal() {
        this("����������", "������", 4);
    }

//    public abstract void speak();

    public abstract void hunt();

    @Override
    public void getIll() {
        System.out.printf("%s %s �����.%n", getType(), getName());
    }

    // todo: ���� ������, ���������� �� ��������� �������.
    //  !!!�������� �������� �� ������ ������� ������ ����� � sysout java

    protected void wakeUp() {
        System.out.println(getType() + ": ���������");
    }

    protected void findFood() {
        String out = String.format("%s: ����� ���%n", getType());
        System.out.println(out);
    }

    protected void eat() {
        System.out.printf("%s: ����%n", getType());
    }

    protected void toPlay() {
        System.out.printf("%s: �������%n", getType());
    }

    protected void goToSleep() {
        System.out.printf("%s: �����%n", getType());
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getLegsCount()
        );
    }

    //todo: ���� ������� � �������. !!! �������� ��������, �� � ������� ���� ���� ������(���� �� ����� ������������)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    protected int getFlySpeed() {
        return flySpeed;
    }

    protected void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    protected int getSwimSpeed() {
        return swimSpeed;
    }

    protected void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    protected int getRunSpeed() {
        return runSpeed;
    }

    protected void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }
}
