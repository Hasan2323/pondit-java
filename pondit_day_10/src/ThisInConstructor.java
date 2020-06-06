/*
* 1. with this(), you can access PRIVATE constructor of class.
* 2. Here, our owner is fixed - "bKash".
* */

public class ThisInConstructor {
    private String projectName;
    private String duration;
    private int employee;
    private String owner;


    public ThisInConstructor() {
        this("Merchant", "6 months", 8, "bKash"); // default
        // this() basically calls another constructor of this class.
    }

    // TODO: MAIN Constructor. This is Private
    private ThisInConstructor(String projectName, String duration, int employee, String owner) {
        this.projectName = projectName;
        this.duration = duration;
        this.employee = employee;
        this.owner = owner;
    }

    public ThisInConstructor(String projectName, String duration) {
        this(projectName, duration, 27, "bKash");
        // This this() calls ThisInConstructor() and set projectName, duration and employee by default.
    }

    public ThisInConstructor(String projectName, String duration, int employee) {
        this(projectName, duration, employee, "bKash");
    }

    public int getEmployee() {
        return employee;
    }
}

class MainHere {
    public static void main(String[] args) {

        System.out.println("Three ways to set values of ThisInConstructor class");

        ThisInConstructor obj1 = new ThisInConstructor("Multibank", "5 months", 15);
        System.out.println(obj1.getEmployee());

        ThisInConstructor obj2 = new ThisInConstructor("Multibank", "5 months");
        System.out.println(obj2.getEmployee());

        ThisInConstructor obj3 = new ThisInConstructor();
        System.out.println(obj3.getEmployee());
    }
}
