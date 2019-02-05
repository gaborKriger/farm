package Plant.Type;

import Util.MyRandom;

public class Spruce extends Evergreen implements Shroom {

    private final int CHANCE_TO_SHROOM = 5;
    private final int CHANCE_TO_ROT = 4;
    private boolean rotted;

    public Spruce(String name) {
        super.name = name;
        super.produce = StarterProduce.SPRUCE.getValue();
        super.week = 0;
        this.rotted = false;
    }

    public boolean isRotted() {
        return rotted;
    }

    public void setRotted(boolean rotted) {
        this.rotted = rotted;
    }

    @Override
    public void growNewShroom() {
        if (MyRandom.eventWithChance(CHANCE_TO_SHROOM)) {
            setProduce((int) (getProduce() + 15));
        }
    }

    @Override
    public void rot() {
        if (MyRandom.eventWithChance(CHANCE_TO_ROT)) {
            setProduce((int) (getProduce() - 20));
            setRotted(true);
        }
    }
}
