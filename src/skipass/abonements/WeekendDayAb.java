package skipass.abonements;

import skipass.enums.DaysEnum;
import skipass.enums.RaisesEnum;

/**
 * Created by arsen on 28.11.16.
 */
public class WeekendDayAb extends Abonement {

    public void setraises(RaisesEnum raises) {
        this.setRaises(raises);
    }

    public void setdays(DaysEnum days) {
        this.setDays(days);
    }
}