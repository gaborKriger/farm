package Plant;

public abstract class Plant {

    protected String name;
    protected double produce;

    public double getProduce() {
        return produce;
    }

    public void setProduce(double produce) {
        this.produce = produce;
    }

    public void changeProduce() {
        setProduce(getProduce() + 4);
    }

}
