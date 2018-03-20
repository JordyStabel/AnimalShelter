import Animals.Gender;
import org.junit.Assert;
import org.junit.Test;

public class ReservationTest {

    private Reservation reservation = new Reservation();

    @Test
    public void TestInitialize()
    {
        this.reservation = new Reservation();
    }

    @Test
    public void newCat() {
        Assert.assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewCat("Ms. Meow", Gender.Female, "Scratches couch");
        Assert.assertEquals(1, this.reservation.Animals.size());
        this.reservation.Animals.clear();
    }

    @Test
    public void newDog() {
        Assert.assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewDog("Sgt. Woof", Gender.Male);
        Assert.assertEquals(1, this.reservation.Animals.size());
    }
}