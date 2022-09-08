public abstract class Transport {
    private int wheelsCountNew;

    public Transport ( int wheelsCountNew) {
        this.wheelsCountNew = wheelsCountNew;

    }

    public int getWheelsCountNew() {
        return wheelsCountNew;
    }

    public void setWheelsCountNew(int wheelsCountNew) {
        this.wheelsCountNew = wheelsCountNew;
    }

    public abstract void checkTransport(Bicycle o1);

    public abstract void checkTransport(Car o1);

    public abstract void checkTransport(Truck o1);
}
