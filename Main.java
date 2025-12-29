public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Ali", "KZ12345");
        Driver driver2 = new Driver("Arman", "KZ67890");

        Vehicle car = new Car("Toyota", 2020, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2019, false);
        Vehicle truck = new Truck("Volvo", 2018, 12.5, 6);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            System.out.println("------------------");
        }
    }
}

