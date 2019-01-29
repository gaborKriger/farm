package Plant.Type;

public class Almond extends Evergreen implements Shroom, AlmondSpecialSkill {

    private final int CHANCE_TO_SHROOM = 8;
    private final int CHANCE_TO_ROT = 13;
    private final int STARTER_PRODUCE = 50;

    public Almond(String name, String type) {
        super.name = name;
        super.type = type;
        super.produce = STARTER_PRODUCE;
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
