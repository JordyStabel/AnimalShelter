package Animals;

import java.util.Date;

public class Dog extends Animal {

    public Date getLastWalked() {
        return LastWalked;
    }

    private void setLastWalked(Date lastWalked) {
        LastWalked = new Date();
    }

    public Date LastWalked = new Date();
    public boolean NeedsWalk = isNeedsWalk();

    public Date getDate()
    { return LastWalked; }

    private void setDate(Date value)
    { LastWalked = value; }

    public boolean isNeedsWalk()
    {
        //Should return true if more than a day has past....doesn't work
        return ((new Date().getTime() - LastWalked.getTime() > 86400000));
        //return true;
    }

    public Dog(String name, Gender gender)
    {
        super(name, gender);
        LastWalked = new Date();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Last walked: %s, Needs walk: %s", LastWalked.toString(), NeedsWalk);
    }
}