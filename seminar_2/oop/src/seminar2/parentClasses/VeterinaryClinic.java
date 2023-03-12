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
     * —писок животных - клиентов клиники.
     */
    private final List<Animal> ANIMALS;
    // доктора в клинике тоже должны быть)
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
        //об€зательно обновл€ем список всех сущностей
        setAllEntities();
        return this;
    }

    public VeterinaryClinic addDoctor(Doctor doctor) {
        DOCTORS.add(doctor);
        //об€зательно обновл€ем список всех сущностей
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

    // ѕ–»ћ≈–џ »—ѕќЋ№«ќ¬јЌ»я »Ќ“≈–‘≈…—ј Serializable:
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
    // суть в том, чтобы получить пользователь получил
    // копию списка всех сущностей,
    // а не исходник, на который можно повли€ть
    public List<Serializable> getAll() {
        return new ArrayList<>(this.ALLENTITIES);
    }
}
