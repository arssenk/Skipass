package skipass.abonements;

import skipass.enums.DaysEnum;
import skipass.enums.RaisesEnum;
import skipass.enums.WeekendDaysEnum;

/**
 * Created by arsen on 28.11.16.
 */
public class WeekendDayAb extends Abonement {

    public void setRaises(RaisesEnum raises){
        this.identificator = id++;
        this.setRaises(raises);
    }
    public void setDays(DaysEnum days){
        this.identificator = id++;
        this.setDays(days);
    }
}