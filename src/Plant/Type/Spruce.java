package Plant.Type;

import Plant.Plant;

public class Spruce extends Plant implements Shroom {

    private final int CHANCE_TO_SHROOM = 5;
    private final int CHANCE_TO_ROT = 4;

    public Spruce(String name) {
        super.name = name;
        super.produce = StarterProduce.SPRUCE.getValue();
    }

    @Override
    public void growNewShroom() {

    }

    @Override
    public void rot() {

    }
}
