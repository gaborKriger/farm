package Plant.Type;

public class Juniper extends Evergreen {

    public Juniper(String name) {
        super.name = name;
        super.produce = StarterProduce.JUNIPER.getValue();
        super.week = 0;
    }


}
