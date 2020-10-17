package typeCasting;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/16/20 10:31 PM
 */

public class JavaTypeCasting {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // This is possible and known as polymorphism. because all characteristics of Animal is available in Dog by default.
        // and dog2 object can only access those properties of Dog class which is available in Animal.
        // Ex: dog2.canFly(); and dog2.sound(); is accessible by dog2 object. but dog2.tailLength(); is not accessible by dog2 object. Because this is not available in Animal.
        // tailLength(); is Dog class property only. So it is only accessible by this {Dog dog = new Dog();}
        Animal dog2 = new Dog();
        dog2.canFly();
        dog2.sound();
        //dog2.tailLength(); showing error
        String tail = dog.tailLength();
        System.out.println(tail);

        // TODO: TypeCasting
        // dog2 object a tailLength() ta toh ashole ache taina jehetu new Dog() er ekta instance. but Type Animal howate tailLength() k pacchilona.
        // akhon jodi tailLength() ta k o pete hoi tahole TypeCasting korte hobe.
//        Dog d = (Dog) dog2;
//        String tail2 = d.tailLength(); // short cut code below
        String tail2 = ((Dog) dog2).tailLength();
        System.out.println("After typeCasting: " + tail2);


        // but Dog animal = new Animal(); is not possible. Because all characteristics of Dog is not available in Animal. as simple as that.

        System.out.println("#########################");
        Animal bird = new Bird();
        bird.sound();
        bird.canFly();


    }
}
