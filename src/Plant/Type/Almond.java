package Plant.Type;

import Util.MyRandom;

public class Almond extends Evergreen implements Shroom, AlmondSpecialSkill {

    private final int CHANCE_TO_SHROOM = 8;
    private final int CHANCE_TO_ROT = 13;
    private boolean rotted;
    private int growAgainCounter;

    public Almond(String name) {
        super.name = name;
        super.produce = StarterProduce.ALMOND.getValue();
        super.week = 0;
        this.rotted = false;
        this.growAgainCounter = 0;
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
        }
    }

    @Override
    public void produceDouble() {
        setProduce(getProduce() * 2);
    }
}
