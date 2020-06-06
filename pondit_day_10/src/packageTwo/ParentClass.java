package packageTwo;

// class with default modifier.
// No-one can extends it outside of this package. PonditDayTen class is trying :D
class ParentClass {
    // default modifier
    String name = "Parent";

    void play() {
        System.out.println("Parent Playing");
    }
}
