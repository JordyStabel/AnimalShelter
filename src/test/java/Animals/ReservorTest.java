package Animals;

import org.junit.Assert;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReservorTest {

    @org.junit.jupiter.api.Test
    void testConstructor() {
        Date reservedAt = new Date();
        Reservor reservor = new Reservor("John Doe", reservedAt);
        Assert.assertEquals("John Doe", reservor.Name);
        Assert.assertEquals(reservedAt, reservor.ReservedAt);
    }
}