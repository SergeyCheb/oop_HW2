package seminar2;

import com.sun.source.doctree.DocCommentTree;
import seminar2.implementations.*;
import seminar2.parentClasses.Animal;
import seminar2.interfaces.Speakable;
import seminar2.parentClasses.VeterinaryClinic;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic
                .addAnimal(new Cat("������", "�����"))
                .addAnimal(new Duck("�������", "������"))
                .addAnimal(new Dog("������", "�����"))
                .addAnimal(new HumanExtendsAnimal("����", 2))
                // ������� ����� �������
                .addDoctor(new Doctor("�������", "��������"))
                .addDoctor(new Doctor("������", "�����������"))
                .addAnimal(new Gull("����� ��������", "�����"))
                .addAnimal(new Fish("������� �����", "������"));
        for (Animal animal : clinic.getANIMALS()) {
            animal.getIll();
        }
        System.out.println("--------------------------��� ��������� ��������:");
        System.out.println(clinic.getSpeakableAnimals());
        System.out.println("--------------------------\n");
        System.out.println("--------------------------��� ��������� ��������:");
        System.out.println(clinic.getAllSpeakable());
        System.out.println("--------------------------\n\t������� ��������:");
        clinic.getSpeakableAnimals().forEach(Speakable::speak);
        System.out.println("--------------------------\n\t������� ���:");
        clinic.getAllSpeakable().forEach(Speakable::speak);

        System.out.println("--------------------------��� �������� ��������:");
        System.out.println(clinic.getRunnableAnimals());
        System.out.println("--------------------------\n");
        System.out.println("--------------------------��� �������� ��������:");
        System.out.println(clinic.getAllRunnable());

        System.out.println("--------------------------��� ��������� ��������:");
        System.out.println(clinic.getSwimableAnimals());
        System.out.println("--------------------------\n");
        System.out.println("--------------------------��� ��������� ��������:");
        System.out.println(clinic.getAllSwimable());

        System.out.println("--------------------------��� �������� ��������:");
        System.out.println(clinic.getFlyableAnimals());
        System.out.println("--------------------------\n");
        // ���������� ��� �� ������, ��������� ������� �� ����� ������
        System.out.println("--------------------------��� �������� ��������:");
        System.out.println(clinic.getAllFlyable());
        System.out.println("--------------------------��� ��������:");
        System.out.println(clinic.getAll());
    }
}
