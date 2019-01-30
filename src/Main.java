import Farm.Farm;

import Plant.Type.Almond;
import Plant.Type.Juniper;
import Plant.Type.Spruce;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addPlant(new Almond("Alond"));
        farm.addPlant(new Juniper("Juniper"));
        farm.addPlant(new Spruce("Spruce"));

    }
}
