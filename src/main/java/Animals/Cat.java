package Animals;

public class Cat extends Animal{

    public String BadHabits;

    public String getBadHabits()
    { return AnimalName; }

    private void setBadHabits(String value)
    { AnimalName = value; }

    public Cat(String name, Gender gender, String badHabits)
    {
        super(name, gender);
        this.BadHabits = badHabits;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format(" Bad habits: %s", BadHabits.toLowerCase());
    }
}