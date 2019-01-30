package Plant.Type;

import Plant.Plant;
import Util.MyRandom;

public class Spruce extends Plant implements Shroom {

    private final int CHANCE_TO_SHROOM = 5;
    private final int CHANCE_TO_ROT = 4;
    private boolean rotted;
    private int growAgainCounter;

    public Spruce(String name) {
        super.name = name;
        super.produce = StarterProduce.SPRUCE.getValue();
        this.rotted = false;
        this.growAgainCounter = 0;
    }

    @Override
    public void growNewShroom() {
        if (MyRandom.eventWithChance(CHANCE_TO_SHROOM)) {
            setProduce(getProduce() + 15);
        }
    }

    @Override
    public void rot() {
        if (MyRandom.eventWithChance(CHANCE_TO_ROT)) {
            setProduce(getProduce() - 20);
        }
    }
}
