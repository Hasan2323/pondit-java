package customException;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/1/20 11:42 PM
 */

public class Age {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new InvalidAgeException("Age can't be negative: " + age);
        }
        this.age = age;
    }

    public static void main(String[] args) {
        Age obj = new Age();
        obj.setAge(-25);
        System.out.println("Age is = " + obj.getAge());
    }

}
