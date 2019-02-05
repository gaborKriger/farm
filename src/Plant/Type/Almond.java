package Plant.Type;

import Plant.Plant;
import Util.MyRandom;

public class Almond extends Plant implements Shroom, AlmondSpecialSkill {

    private final int CHANCE_TO_SHROOM = 8;
    private final int CHANCE_TO_ROT = 13;
    private boolean rotted;


    public Almond(String name) {
        super.name = name;
        super.produce = StarterProduce.ALMOND.getValue();
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
            setProduce(getProduce() + 10);
        }
    }

    @Override
    public void rot() {
        if (MyRandom.eventWithChance(CHANCE_TO_ROT)) {
            setProduce(getProduce() - 18);
            setRotted(true);
        }

    }

    @Override
    public void produceDouble() {
        setProduce(getProduce() * 2);
    }
}
