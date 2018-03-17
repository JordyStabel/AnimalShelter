package Animals;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    private Cat cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");

    @org.junit.jupiter.api.Test
    void testConstructor() {
        Assert.assertEquals ("Ms. Meow", cat.AnimalName);
        Assert.assertEquals (Gender.Female, cat.Gender);
        Assert.assertNull (cat.ReservedBy);
        Assert.assertEquals("Scratches couch", cat.BadHabits);
    }

    @org.junit.jupiter.api.Test
    void testReservation() {
        Assert.assertNull (cat.ReservedBy);
        Assert.assertTrue (cat.Reserve("John Doe"));
        Assert.assertNotNull(cat.ReservedBy);
        Assert.assertEquals("John Doe", cat.ReservedBy.Name);
        Assert.assertFalse(cat.Reserve("Jane Doe"));
    }
}