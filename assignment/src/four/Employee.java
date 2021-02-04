package four;

public class Employee {

    private int baseSalary;
    private double hourlyRate;
    private double extraRate;

    public Employee(int baseSalary, double hourlyRate, double extraRate) {
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
        this.extraRate = extraRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getExtraRate() {
        return extraRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

} // end of Employee class

class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(500, 20, 5); // salary in $ :p

        if (emp.getBaseSalary() > 0 && emp.getHourlyRate() > 0 && emp.getExtraRate() > 0) {
            double totalSalary = emp.getBaseSalary() + (emp.getHourlyRate() * emp.getExtraRate());
            System.out.println("Total Salary : " + totalSalary);
        } else {
            System.out.println("Salary or rate should be larger than 0.");
        }

    }

}
