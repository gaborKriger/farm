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

            } else if (plant instanceof Juniper) {

            } else if (plant instanceof Spruce) {

            }
        }
        printMonthyReport();
    }

    private void printMonthyReport() {

    }


}
