public class Truck extends Vehicle {

    public Truck(String modelName) {
        super(modelName, 6);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике " + modelName);
    }

    @Override
    public void performService() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на грузовике " + modelName);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп на грузовике " + modelName);
    }
}