package skipass.enums;

import com.sun.org.apache.regexp.internal.RE;
import skipass.abonements.Abonement;
import skipass.abonements.SeasonAb;
import skipass.abonements.WeekendDayAb;
import skipass.abonements.WorkDayAb;

/**
 * Created by arsen on 28.11.16.
 */
public enum  Abonements {
    SEASON, WEEKENDRAISES, WEEKENDDAYS, WORKDAYSRAISES, WORKDAYDAYS;
    public Abonement setAbonement(){
        switch (this){
            case SEASON:
                return new SeasonAb();
            case WEEKENDRAISES:
                return new WeekendDayAb();
            case WEEKENDDAYS:
                return new WeekendDayAb();
            case  WORKDAYSRAISES:
                return new WorkDayAb();
            case WORKDAYDAYS:
                return new WorkDayAb();
            default:
                return null;
        }
    }
}
