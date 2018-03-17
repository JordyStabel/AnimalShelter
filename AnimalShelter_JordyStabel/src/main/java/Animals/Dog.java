package Animals;

import java.util.Date;

public class Dog extends Animal{

    public Date LastWalked;
    public boolean NeedsWalk = isNeedsWalk();

    public Date getDate()
    { return LastWalked; }

    private void setDate(Date value)
    { LastWalked = value; }

    public boolean isNeedsWalk()
    {
        //86400000 should be the amount of miliseconds in a day..
        return (currentDate().getTime() - this.LastWalked.getTime() > 86400000);
    }

    public Dog(String name, Gender gender)
    {
        super(name, gender);
        this.LastWalked = currentDate();
    }

    public String ToString()
    {
        return super.ToString() + String.format("Last walk: %s", this.LastWalked.toString());
    }

    public Date currentDate()
    {
        return new Date();
    }
}