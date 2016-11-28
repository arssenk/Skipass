package skipass.abonements;

import skipass.enums.DaysEnum;
import skipass.enums.RaisesEnum;

/**
 * Created by arsen on 28.11.16.
 */
public class WorkDayAb extends Abonement {

    public void setDay(DaysEnum days) {
        this.identificator = id++;
        this.setDays(days);
    }
    public void setRaises(RaisesEnum raises){
        this.identificator = id++;
        this.setRaises(raises);
    }

    public static void main(String[] args) {
        WorkDayAb w1 = new WorkDayAb();
        w1.setDay(DaysEnum.FIVE);
        WorkDayAb w2 = new WorkDayAb();
        w2.setDay(DaysEnum.FIVE);
        WorkDayAb w3 = new WorkDayAb();
        System.out.println(w1.getId());
        System.out.println(w2.getId());


    }
}
