package Animals;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


public class ReservorTest {

    @Test
    public void testConstructor() {
        Date reservedAt = new Date();
        Reservor reservor = new Reservor("John Doe", reservedAt);
        Assert.assertEquals("John Doe", reservor.Name);
        Assert.assertEquals(reservedAt, reservor.ReservedAt);
    }
}