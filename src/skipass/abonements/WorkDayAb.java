package skipass.abonements;

import skipass.enums.DaysEnum;
import skipass.enums.RaisesEnum;

/**
 * Created by arsen on 28.11.16.
 */
public class WorkDayAb extends Abonement {

    public void setday(DaysEnum days) {
        this.setDays(days);
    }

    public void setraises(RaisesEnum raises) {
        this.setRaises(raises);
    }

}
