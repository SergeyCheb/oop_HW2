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
                .addAnimal(new Cat("Барсик", "серый"))
                .addAnimal(new Duck("Дональд", "пёстрый"))
                .addAnimal(new Dog("Барбос", "белый"))
                .addAnimal(new HumanExtendsAnimal("Брэд", 2))
                // добавим новых существ
                .addDoctor(new Doctor("Айболит", "терапевт"))
                .addDoctor(new Doctor("Дулитл", "Прививочник"))
                .addAnimal(new Gull("Чайка поморник", "серая"))
                .addAnimal(new Fish("Золотая рыбка", "желтая"));
        for (Animal animal : clinic.getANIMALS()) {
            animal.getIll();
        }
        System.out.println("--------------------------Все говорящие животные:");
        System.out.println(clinic.getSpeakableAnimals());
        System.out.println("--------------------------\n");
        System.out.println("--------------------------Все говорящие сущности:");
        System.out.println(clinic.getAllSpeakable());
        System.out.println("--------------------------\n\tГОВОРЯТ ЖИВОТНЫЕ:");
        clinic.getSpeakableAnimals().forEach(Speakable::speak);
        System.out.println("--------------------------\n\tГОВОРЯТ ВСЕ:");
        clinic.getAllSpeakable().forEach(Speakable::speak);

        System.out.println("--------------------------Все бегающие животные:");
        System.out.println(clinic.getRunnableAnimals());
        System.out.println("--------------------------\n");
        System.out.println("--------------------------Все бегающие сущности:");
        System.out.println(clinic.getAllRunnable());

        System.out.println("--------------------------Все плавающие животные:");
        System.out.println(clinic.getSwimableAnimals());
        System.out.println("--------------------------\n");
        System.out.println("--------------------------Все плавающие сущности:");
        System.out.println(clinic.getAllSwimable());

        System.out.println("--------------------------Все летающие животные:");
        System.out.println(clinic.getFlyableAnimals());
        System.out.println("--------------------------\n");
        // фактически тот же список, поскольку доктора не умеют летать
        System.out.println("--------------------------Все летающие сущности:");
        System.out.println(clinic.getAllFlyable());
        System.out.println("--------------------------Все сущности:");
        System.out.println(clinic.getAll());
    }
}
