
public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;


   //constructors
    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public Person(String firstName, String lastName) {
        this("", firstName, lastName, "", 0);
    }

    public Person(String firstName, String lastName, String title) {
        this("", firstName, lastName, title, 0);
    }

    public Person(int YOB) {
        this("", "", "","", YOB);
    }

    //getters
    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public int getYOB() {
        return YOB;
    }

    //setters
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    //additional methods
    public String fullName() {
        return getFirstName() + " " + getLastName();
    }

    public String formalName() {
        return getTitle() + " " + fullName();
    }

    public String getAge() { return String.valueOf(2023 - getYOB()); }

    public String getAge(int year) {
        return String.valueOf(year - getYOB());
    }

    public String toCSVDataRecord() {
        return getID() + ", " + getFirstName() + ", " + getLastName() + ", " + getTitle() + ", " + getYOB();
    }


}
