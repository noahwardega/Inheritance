public class Worker extends Person{
    private double hourlyPayRate;

    //constructors

    public Worker(double hourlyPayRate, String ID, String firstName, String lastName, String title, int YOB) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(String ID, String firstName, String lastName, String title, int YOB) {
        super(ID, firstName, lastName, title, YOB);
    }

    //getters

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    //setters

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    //additional methods

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return getHourlyPayRate() * hoursWorked;
        }
        else {
            return ( getHourlyPayRate() * 40 ) + ( getHourlyPayRate() * 1.5 * (hoursWorked - 40) );
        }
    }
    public String displayWeeklyPay(double hoursWorked) {
        if(hoursWorked <= 40) {
            return ("The worker has " + hoursWorked + " hours of regular pay totaling $" +
                    calculateWeeklyPay(hoursWorked) + " and has 0 hours of overtime pay totaling $0. " +
                    "The worker has a combined total pay of $" + calculateWeeklyPay(hoursWorked));
        }
        else {
            double overtimeHours = hoursWorked - 40;
            return ("The worker has 40 hours of regular pay totaling $" +
                    hoursWorked * getHourlyPayRate() + " and has " + overtimeHours + " hours of overtime pay totaling $ " +
                    overtimeHours * getHourlyPayRate() * 1.5 + ". The worker has a combined total pay of $" + calculateWeeklyPay(hoursWorked));
        }
    }

}
