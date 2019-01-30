package Plant.Type;

public enum StarterProduce {

    ALMOND (50),
    JUNIPER (14),
    SPRUCE (26);

    private final int value;

    StarterProduce(int type) {
        value = type;
    }

    public int getValue() {
        return this.value;
    }
}
