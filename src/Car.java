public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на машине " + modelName);
    }

    @Override
    public void performService() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на машине " + modelName);
    }
}