package Plant.Type;

public class Almond extends Evergreen implements Shroom, AlmondSpecialSkill {

    private final int CHANCE_TO_SHROOM = 8;
    private final int CHANCE_TO_ROT = 13;

    public Almond(String name) {
        super.name = name;
        super.produce = StarterProduce.ALMOND.getValue();
        super.week = 0;
    }

    @Override
    public void growNewShroom() {

    }

    @Override
    public void rot() {

    }

    @Override
    public void produceDouble() {

    }
}
