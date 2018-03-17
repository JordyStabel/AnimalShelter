import java.util.ArrayList;
import java.util.Observable;

import Animals.*;

public class Reservation extends Observable{

    public ArrayList<Animal> Animals = new ArrayList<Animal>();

    public void NewCat(String name, Gender gender, String badHabits)
    {
        this.Animals.add(new Cat(name, gender, badHabits));
        setChanged();
        notifyObservers();
    }

    public void NewDog(String name, Gender gender)
    {
        this.Animals.add(new Dog(name, gender));
        setChanged();
        notifyObservers();
    }

    public ArrayList<Animal> GetAnimals()
    {
        return Animals;
    }
}