public class SalaryWorker extends Worker{

    private double annualSalary;

    //constructors

    public SalaryWorker(double annualSalary, String ID, String firstName, String lastName, String title, int YOB) {
        super(ID, firstName, lastName, title, YOB);
        this.annualSalary = annualSalary;
    }

    //getters

    public double getAnnualSalary() {
        return annualSalary;
    }

    //setters

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    //additional methods
    public double calculateWeeklyPay(double hoursWorked) {
        return getAnnualSalary() / 52;
    }

    public String displayWeeklyPay(double hoursWorked) {
        return "The workers weekly pay is $" + calculateWeeklyPay(0) + " which is 1/52 of the annual salary.";
    }

}
