public abstract class Vehicle {
    protected String modelName;
    protected int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTyre();
    public abstract void performService(); // Новый абстрактный метод
}
