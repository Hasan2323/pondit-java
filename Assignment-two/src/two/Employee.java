package two;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/18/20 1:14 PM
 */

public class Employee {

    private String name;
    private String grade;
    private String address;
    private String phone;
    private long salary;
    private long bankAcc;

    public Employee(String name, String grade, String address, String phone, long salary, long bankAcc) {
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.bankAcc = bankAcc;
    }

    public Employee() {
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(long bankAcc) {
        this.bankAcc = bankAcc;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", bankAcc=" + bankAcc +
                '}';
    }
}
