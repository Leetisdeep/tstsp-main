public class ServiceStantion {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.performService(); // Вызываем метод performService у каждого транспортного средства
        }
    }
}