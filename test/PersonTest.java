import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    Person p1;
    Person p2;
    Person p3;
    Person p4;
    Person p5;

    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "Bob", "Smith", "Mr.", 2000);
    }

    @Test
    void testConstructorWithAllFields() {

        p2 = new Person("000002", "John", "Doe", "Mr.", 1990);

        assertEquals("000002", p2.getID());
        assertEquals("John", p2.getFirstName());
        assertEquals("Doe", p2.getLastName());
        assertEquals("Mr.", p2.getTitle());
        assertEquals(1990, p2.getYOB());
    }

    @Test
    void testConstructorWithFirstNameAndLastName() {
        p3 = new Person("Jane", "Smith");

        assertEquals("", p3.getID());
        assertEquals("Jane", p3.getFirstName());
        assertEquals("Smith", p3.getLastName());
        assertEquals("", p3.getTitle());
        assertEquals(0, p3.getYOB());
    }

    @Test
    void testConstructorWithFirstNameLastNameAndTitle() {
        p4 = new Person("Jane", "Smith", "Ms.");

        assertEquals("", p4.getID());
        assertEquals("Jane", p4.getFirstName());
        assertEquals("Smith", p4.getLastName());
        assertEquals("Ms.", p4.getTitle());
        assertEquals(0, p4.getYOB());
    }

    @Test
    void testConstructorWithYOB() {
        p5 = new Person(1995);

        assertEquals("", p5.getID());
        assertEquals("", p5.getFirstName());
        assertEquals("", p5.getLastName());
        assertEquals("", p5.getTitle());
        assertEquals(1995, p5.getYOB());
    }

    @Test
    void setID() {
        p1.setID("000001");
        assertEquals("000001", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Bob");
        assertEquals("Bob", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Smith");
        assertEquals("Smith", p1.getLastName());
    }

    @Test
    void setTitle() {
        p1.setTitle("Mr.");
        assertEquals("Mr.", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(2000);
        assertEquals(2000, p1.getYOB());
    }

    @Test
    void fullName() {
        assertEquals("Bob Smith", p1.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Mr. Bob Smith", p1.formalName());
    }

    @Test
    void getAge() {
        String age = p1.getAge();
        assertEquals("23", age);
    }

    @Test
    void testGetAge() {
        assertEquals("10", p1.getAge(2010));
    }

    @Test
    void toCSVDataRecord() {
        assertEquals("000001, Bob, Smith, Mr., " + 2000, p1.toCSVDataRecord());
    }


}