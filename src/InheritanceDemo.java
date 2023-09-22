import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker w1;
        Worker w2;
        Worker w3;
        SalaryWorker w4;
        SalaryWorker w5;
        SalaryWorker w6;

        w1 = new Worker(15.0, "001", "Jim", "Davis", "Mr.", 2001);
        w2 = new Worker(25.0, "002", "Jane", "Smith", "Mrs.", 1990);
        w3 = new Worker(20.0, "003", "John", "Doe", "Mr.", 1999);

        w4 = new SalaryWorker(50000.0, "004", "Joe", "Taylor", "Mr.", 1985);
        w5 = new SalaryWorker(60000.0, "005", "Jimmy", "Wilson", "Mr.", 1992);
        w6 = new SalaryWorker(40000.0, "006", "Jack", "Miller", "Mr.", 2002);

        ArrayList<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);
        list.add(w6);


        int numWeeks = 3;
        int[] hoursWorked = {40, 50, 40};

        // Display the header
        System.out.println(String.format("%-10s %-10s %-10s %-10s", "Worker", "Week 1", "Week 2", "Week 3"));
        System.out.println("===========================================");

        // Loop through each worker and calculate their weekly pay
        for (Worker worker : list) {
            String workerName = worker.fullName();

            // Calculate
            for (int i = 0; i < numWeeks; i++) {
                double weeklyPay = 0.0;

                if (worker instanceof SalaryWorker) {

                    weeklyPay = (((SalaryWorker) worker).getAnnualSalary() / 52);
                } else {
                    double hourlyWage = worker.getHourlyPayRate();
                    double hoursWorkedInWeek = hoursWorked[i];

                    if (hoursWorkedInWeek > 40) {
                        double regularPay = 40 * hourlyWage;
                        double overtimePay = (hoursWorkedInWeek - 40) * (1.5 * hourlyWage);
                        weeklyPay = regularPay + overtimePay;
                    } else {
                        weeklyPay = hoursWorkedInWeek * hourlyWage;
                    }
                }

                // Display
                if (i == 0) {
                    System.out.printf("%-10s $%-10.2f ", workerName, weeklyPay);
                } else {
                    System.out.printf("$%-10.2f ", weeklyPay);
                }
            }

            System.out.println();
        }
    }
}