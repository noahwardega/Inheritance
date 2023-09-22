import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1;
    SalaryWorker s2;

    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker(52000.0, "000001", "John", "Doe", "Mr.", 1999);
    }

    @Test
    void testConstructorWithAllFields() {

        s2 = new SalaryWorker(80000.0,"000002", "Jo", "Smith", "Mr.", 2000);

        assertEquals("Jo", s2.getFirstName());
        assertEquals("Smith", s2.getLastName());
        assertEquals("000002", s2.getID());
        assertEquals("Mr.", s2.getTitle());
        assertEquals(2000, s2.getYOB());
        assertEquals(80000.0, s2.getAnnualSalary());
    }

    @Test
    void setAnnualSalary() {
        s1.setAnnualSalary(52000.0);
        assertEquals(52000.0, s1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000.0, s1.calculateWeeklyPay(0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("The workers weekly pay is $1000.0 which is 1/52 of the annual salary.", s1.displayWeeklyPay(0));
    }
}