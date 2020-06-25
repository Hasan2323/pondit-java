package interfaceExample;

public class Bike implements Vehicle {

    private String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The Bike is speeding up";
    }

    @Override
    public String slowDown() {
        return "The Bike is slowing down";
    }
}

class Cycle implements Vehicle {

    private String brand;

    Cycle(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "This Cycle is speeding up";
    }

    @Override
    public String slowDown() {
        return "The Cycle is slowing down";
    }

}

class Runner {
    public static void main(String[] args) {

        Runner run = new Runner();


        run.startVehicle(new Bike("Pulsar"));
        System.out.println();
        run.startVehicle(new Cycle("Veloce"));

    }

    // jekono Vehicle er object pathanu jabe ekhane
    public void startVehicle(Vehicle vehicle) {
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());
    }

    // ekhane jekono object pathale hobe na. exact Bike er object pathate hobe. This isn't efficient
    public void startVehicle2(Bike bike) {
        System.out.println(bike.getBrand());
        System.out.println(bike.speedUp());
        System.out.println(bike.slowDown());
    }
}
