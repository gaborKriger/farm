package Plant.Type;

import Plant.Plant;

public class Spruce extends Plant implements Shroom {

    private final int CHANCE_TO_SHROOM = 5;
    private final int CHANCE_TO_ROT = 4;

    @Override
    public void growNewShroom() {

    }

    @Override
    public void rot() {

    }
}
