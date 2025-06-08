public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck1 = new Truck("truck1");
        Truck truck2 = new Truck("truck2");

        Bicycle bicycle1 = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");

        ServiceStantion station = new ServiceStantion();
        station.check(car1);
        station.check(car2);
        station.check(bicycle1);
        station.check(bicycle2);
        station.check(truck1);
        station.check(truck2);
    }
}