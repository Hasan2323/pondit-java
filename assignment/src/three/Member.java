package three;

public class Member {
    public String name;
    private int age;
    private String phone;
    private String address;
    private int salary;

    public Member(String name, int age, String phone, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int printSalary() {
        return salary;
    }
}

class Employee extends Member {

    private String specialization;
    private String department;

    public Employee(String name, int age, String phone, String address, int salary) {
        super(name, age, phone, address, salary);
    }
}

class Manager extends Member {

    private String specialization;
    private String department;

    public Manager(String name, int age, String phone, String address, int salary) {
        super(name, age, phone, address, salary);
    }
}

class Main {
    public static void main(String[] args) {

        Member employee = new Employee("Hasnat", 23, "01800000", "Halishahar", 30000);
        System.out.println("Employee name = " + employee.getName()
            + "\nEmployee age = " + employee.getAge()
            + "\nEmployee phone no = " + employee.getPhone()
            + "\nEmployee Address = " + employee.getAddress()
            + "\nEmployee Salary = " + employee.printSalary() + "\n");

        Member manager = new Manager("Sayem", 28, "01700000", "Nasirabad", 50000);
        System.out.println("Manager name = " + manager.getName()
                + "\nManager age = " + manager.getAge()
                + "\nManager phone no = " + manager.getPhone()
                + "\nManager Address = " + manager.getAddress()
                + "\nManager Salary = " + manager.printSalary());
    }
}
