package Animals;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    private Animal animal = new Animal("Ugly Duckling", Gender.Male);

    @Test
    public void testConstructor() {
        Assert.assertEquals ("Ugly Duckling", this.animal.AnimalName);
        Assert.assertEquals (Gender.Male, this.animal.Gender);
        Assert.assertNull (this.animal.ReservedBy);
    }

    @Test
    public void testReservation() {
        Assert.assertNull (this.animal.ReservedBy);
        Assert.assertTrue (this.animal.Reserve("John Doe"));
        Assert.assertNotNull(this.animal.ReservedBy);
        Assert.assertEquals("John Doe", this.animal.ReservedBy.Name);
        Assert.assertFalse(this.animal.Reserve("Jane Doe"));
    }
}