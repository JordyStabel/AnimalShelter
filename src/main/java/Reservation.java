import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.List;

import Animals.*;

public class Reservation extends Observable implements Runnable {

    public static ArrayList<Animal> Animals = new ArrayList<Animal>();

    public void NewCat(String name, Gender gender, String badHabits)
    {
        this.Animals.add(new Cat(name, gender, badHabits));
        setChanged();
        notifyObservers(GetAnimals());
    }

    public void NewDog(String name, Gender gender)
    {
        this.Animals.add(new Dog(name, gender));
        setChanged();
        notifyObservers(GetAnimals());
    }

    public ArrayList<Animal> GetAnimals()
    {
        return Animals;
    }

    //Updating the dogs lastwalked time in a thread
    @Override
    public void run() {
        while(true)
        {
            //For each animal of type dog, every 2 seconds deducts 4 hours to the last walked time
            //To simulate the time the dog was last walked passing by
            for (Animal animal : Animals)
            {
                if (animal instanceof Dog)
                {
                    ((Dog) animal).LastWalked.setTime(((Dog) animal).LastWalked.getTime() - 14400000);
                    System.out.println(((Dog) animal).toString());
                }
                else
                {
                    System.out.println("Cat");
                }
            }
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}