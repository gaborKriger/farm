package Plant;

public abstract class Plant {

    protected String name;
    protected int produce;

    public String getName() {
        return name;
    }

    public double getProduce() {
        return produce;
    }

    public void setProduce(int produce) {
        this.produce = produce;
    }

    public void growProduce() {
        setProduce((int) (getProduce() + 4));
    }
}
