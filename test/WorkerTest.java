import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1;
    Worker w2;

    @BeforeEach
    void setUp() {
        w1 = new Worker(18.0, "000001", "Bob", "Smith", "Mr.", 2000);
    }

    @Test
    void testConstructorWithAllFields() {

        w2 = new Worker(18.0, "000002","John", "Smith", "Mr.", 1999);

        assertEquals("John", w2.getFirstName());
        assertEquals("Smith", w2.getLastName());
        assertEquals(18.0, w2.getHourlyPayRate());
        assertEquals("000002", w2.getID());
        assertEquals("Mr.", w2.getTitle());
        assertEquals(1999, w2.getYOB());
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(18.0);
        assertEquals(18.0, w1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(855, w1.calculateWeeklyPay(45));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("The worker has 30.0 hours of regular pay totaling $540.0 and has 0 hours of overtime pay " +
                "totaling $0. The worker has a combined total pay of $540.0", w1.displayWeeklyPay(30));
    }

}