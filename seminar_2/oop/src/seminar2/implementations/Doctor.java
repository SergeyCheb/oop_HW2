package seminar2.implementations;


import seminar2.parentClasses.Human;

import java.io.Serializable;

public class Doctor extends Human {

    // ����������� �����
    private String discipline;

    public Doctor(String name, String discipline) {
        super(name);
        this.discipline = discipline;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s ������: ������ ��� �������!%n", getType(), getName());
    }

    public Doctor(String name, int runSpeed, int swimSpeed) {
        super(name, runSpeed, swimSpeed);
        this.discipline = "common practice";
    }
}
