package Animals;

import org.junit.Assert;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    private Dog dog = new Dog("Sgt. Woof", Gender.Male);

    @org.junit.jupiter.api.Test
    void testConstructor() {
        Assert.assertEquals ("Sgt. Woof", dog.AnimalName);
        Assert.assertEquals (Gender.Male, dog.Gender);
        Assert.assertNull (dog.ReservedBy);
        Assert.assertEquals(new Date(), dog.LastWalked);
        Assert.assertFalse(dog.NeedsWalk);
    }

    @org.junit.jupiter.api.Test
    void testReservation() {
        Assert.assertNull (dog.ReservedBy);
        Assert.assertTrue (dog.Reserve("John Doe"));
        Assert.assertNotNull(dog.ReservedBy);
        Assert.assertEquals("John Doe", dog.ReservedBy.Name);
        Assert.assertFalse(dog.Reserve("Jane Doe"));
    }
}