package Plant.Type;

import Plant.Plant;

public abstract class Evergreen extends Plant {

    protected int week;

    public int getWeek() {
        return week;
    }

    public void increaseWeek() {
        this.week++;
    }

    public void fifthWeekProduce() {
        if (week % 5 == 0) {
            setProduce(getProduce() + 5);
        }
    }
}

