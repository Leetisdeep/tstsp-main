public class Bicycle extends Vehicle {

    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде " + modelName);
    }

    @Override
    public void performService() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}