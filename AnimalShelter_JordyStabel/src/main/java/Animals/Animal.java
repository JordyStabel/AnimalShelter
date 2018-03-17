package Animals;
import java.util.Date;

public class Animal {

    public String AnimalName;
    public Gender Gender;
    public Reservor ReservedBy;

    public String getName()
    { return AnimalName; }

    private void setName(String value)
    { AnimalName = value; }

    public Gender getGender()
    {return Gender; }

    private void setGender(Gender value)
    { Gender = value; }

    public Animal(String name, Gender gender)
    {
        this.AnimalName = name;
        this.Gender = gender;
    }

    public boolean Reserve(String reservedBy)
    {
        if (this.ReservedBy == null)
        {
            this.ReservedBy = new Reservor(reservedBy, getDate());
            return true;
        }
        return false;
    }

    public String ToString()
    {
        String reserved = "not reserved";
        if (this.ReservedBy != null)
        {
            reserved = String.format("reserved by $s", this.ReservedBy.Name);
        }
        return String.format("%s, %Gender, %s", this.AnimalName, this.Gender, reserved);
    }

    public Date getDate()
    {
        return new Date();
    }
}