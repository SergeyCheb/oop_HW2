package seminar2.parentClasses;

import seminar2.implementations.Doctor;
import seminar2.interfaces.Flyable;
import seminar2.interfaces.Speakable;
import seminar2.interfaces.Swimable;
import seminar2.interfaces.Runnable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic implements Serializable {
    /**
     * ������ �������� - �������� �������.
     */
    private final List<Animal> ANIMALS;
    // ������� � ������� ���� ������ ����)
    private final List<Doctor> DOCTORS;

    private final List<Serializable> ALLENTITIES;

    private void setAllEntities() {
        ALLENTITIES.clear();
        for (Animal animal : getANIMALS())
            ALLENTITIES.add(animal);
        for (Doctor doctor : getDOCTORS()) {
            ALLENTITIES.add(doctor);
        }
    }

    private List<Serializable> getAllEntities() {
        return this.ALLENTITIES;
    }


    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
        this.DOCTORS = new ArrayList<>();
        this.ALLENTITIES = new ArrayList<>();
    }


    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        //����������� ��������� ������ ���� ���������
        setAllEntities();
        return this;
    }

    public VeterinaryClinic addDoctor(Doctor doctor) {
        DOCTORS.add(doctor);
        //����������� ��������� ������ ���� ���������
        getAllEntities();
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }

    public List<Doctor> getDOCTORS() {
        return DOCTORS;
    }

    public List<Speakable> getSpeakableAnimals() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    public List<Swimable> getSwimableAnimals() {
        List<Swimable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Swimable) {
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyableAnimals() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Runnable> getRunnableAnimals() {
        List<Runnable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    // ������� ������������� ���������� Serializable:
    public List<Speakable> getAllSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Serializable entity : getAllEntities()) {
            if (entity instanceof Speakable) {
                result.add((Speakable) entity);
            }
        }
        return result;
    }

    public List<Swimable> getAllSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Serializable entity : getAllEntities()) {
            if (entity instanceof Swimable) {
                result.add((Swimable) entity);
            }
        }
        return result;
    }

    public List<Runnable> getAllRunnable() {
        List<Runnable> result = new ArrayList<>();
        for (Serializable entity : getAllEntities()) {
            if (entity instanceof Runnable) {
                result.add((Runnable) entity);
            }
        }
        return result;
    }

    public List<Flyable> getAllFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Serializable entity : getAllEntities()) {
            if (entity instanceof Flyable) {
                result.add((Flyable) entity);
            }
        }
        return result;
    }
    // ���� � ���, ����� �������� ������������ �������
    // ����� ������ ���� ���������,
    // � �� ��������, �� ������� ����� ��������
    public List<Serializable> getAll() {
        return new ArrayList<>(this.ALLENTITIES);
    }
}
