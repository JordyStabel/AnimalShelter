import Animals.Gender;
import Animals.Reservor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.TestMethod;
import org.junit.jupiter.api.TestInstance;

import java.util.Date;

import static org.junit.Assert.*;

public class ReservationTest {

    private Reservation reservation = new Reservation();

    @org.junit.jupiter.api.Test
    public void TestInitialize()
    {
        this.reservation = new Reservation();
    }

    @org.junit.jupiter.api.Test
    public void newCat() {
        Assert.assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewCat("Ms. Meow", Gender.Female, "Scratches couch");
        Assert.assertEquals(1, this.reservation.Animals.size());
        this.reservation.Animals.clear();
    }

    @org.junit.jupiter.api.Test
    public void newDog() {
        Assert.assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewDog("Sgt. Woof", Gender.Male);
        Assert.assertEquals(1, this.reservation.Animals.size());
    }
}