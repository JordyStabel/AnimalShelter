package Animals;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class DogTest {

    private Dog dog = new Dog("Sgt. Woof", Gender.Male);

    @Test
    public void testConstructor() {
        Assert.assertEquals ("Sgt. Woof", dog.AnimalName);
        Assert.assertEquals (Gender.Male, dog.Gender);
        Assert.assertNull (dog.ReservedBy);
        //+1 Because it takes 1 milisecond to run the test
        Assert.assertEquals(new Date().getDay(), dog.LastWalked.getDay());
        Assert.assertFalse(dog.NeedsWalk);
    }

    @Test
    public void testReservation() {
        Assert.assertNull (dog.ReservedBy);
        Assert.assertTrue (dog.Reserve("John Doe"));
        Assert.assertNotNull(dog.ReservedBy);
        Assert.assertEquals("John Doe", dog.ReservedBy.Name);
        Assert.assertFalse(dog.Reserve("Jane Doe"));
    }
}