package Farm;

import Plant.Plant;

import java.util.List;

public class Farm {

    private String name;
    private String location;
    private List<Plant> plants;

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void monthlyReport() {

    }


}
