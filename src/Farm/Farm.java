package Farm;

import Plant.Plant;
import Plant.Type.Almond;
import Plant.Type.Juniper;
import Plant.Type.Spruce;

import java.util.LinkedList;
import java.util.List;

public class Farm {

    private int week;
    private List<Plant> plants = new LinkedList<>();

    public int getWeek() {
        return week;
    }

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
        week++;
    }

    private void prepareAlmond(Almond almond) {
        almond.setRotted(false);
        if (almond.getProduce() < 40) {
            almond.produceDouble();
        }
        almond.growNewShroom();
        almond.rot();
        if (!almond.isRotted()) {
            almond.growProduce();
        }
    }

    private void prepareJuniper(Juniper juniper) {
        if (juniper.getWeek() % 5 == 0) {
            juniper.fifthWeekProduce();
        }
        juniper.growProduce();
        if (juniper.getProduce() >= 70) {
            juniper.setProduce(70);
        }
        juniper.increaseWeek();
    }

    private void prepareSpruce(Spruce spruce) {
        spruce.setRotted(false);
        if (spruce.getWeek() % 5 == 0) {
            spruce.fifthWeekProduce();
        }
        spruce.growNewShroom();
        spruce.rot();
        if (!spruce.isRotted()) {
            spruce.growProduce();
        }
        spruce.increaseWeek();
        if (spruce.getProduce() >= 70) {
            spruce.setProduce(70);
        }
        spruce.increaseWeek();
    }

    public void printMonthlyReport() {
        System.out.println(getWeek());
        for (Plant plant : plants) {
            System.out.print(plant.getName() + ": ");
            System.out.println(plant.getProduce());
        }
        System.out.println();
    }
}
