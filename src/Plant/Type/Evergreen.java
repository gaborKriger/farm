package Plant.Type;

import Plant.Plant;

public class Evergreen extends Plant {

    protected int week;

    public void fifthWeekProduce() {
        if (week % 5 == 0) {
            setProduce(getProduce() + 5);
        }
    }
}

