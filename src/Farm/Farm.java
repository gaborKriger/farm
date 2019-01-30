package Farm;

import Plant.Plant;
import Plant.Type.Almond;
import Plant.Type.Juniper;
import Plant.Type.Spruce;

import java.util.LinkedList;
import java.util.List;

public class Farm {

    private String name;
    private String location;
    private List<Plant> plants = new LinkedList<>();

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void monthlyReport() {
        for (Plant plant : plants) {
            if (plant instanceof Almond) {
                prepareAlmond((Almond) plant);
            } else if (plant instanceof Juniper) {
                prepareJuniper((Juniper) plant);
            } else if (plant instanceof Spruce) {
                prepareSpruce((Spruce) plant);
            }
        }
    }

    private void prepareAlmond(Almond almond) {

    }

    private void prepareJuniper(Juniper juniper) {

    }

    private void prepareSpruce(Spruce spruce) {

    }

    public void printMonthyReport() {

    }


}
