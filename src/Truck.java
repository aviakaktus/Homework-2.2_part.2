public class Truck  extends Transport {

    private String modelName;
    //public int wheelsCount;


    public Truck(String modelName, int wheelsCountNew) {
        super(wheelsCountNew);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkTransport(Bicycle o1) {

    }

    @Override
    public void checkTransport(Car o1) {

    }

    @Override
    public void checkTransport(Truck o1){
        System.out.println("Обслуживаем " + o1.getModelName());
        for (int i = 0; i < o1.getWheelsCountNew(); i++) {
            o1.updateTyre();
        }
        o1.checkEngine();
        o1.checkTrailer();
        System.out.println();
    }
}