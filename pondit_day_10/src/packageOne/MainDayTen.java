package packageOne;

public class MainDayTen {
    public static void main(String[] args) {
        PonditDayTen obj1 = new PonditDayTen("Hasan", 25);

        PonditDayTen.salary = 200;
        PonditDayTen.salary++;
        PonditDayTen.salary++;
        PonditDayTen.salary++;

        obj1.salary = 500;

        System.out.println(PonditDayTen.salary);
        System.out.println(obj1.salary);
    }
}
