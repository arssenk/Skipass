package skipass.abonements;

import skipass.enums.DaysEnum;
import skipass.enums.RaisesEnum;
import skipass.enums.WeekendDaysEnum;

/**
 * Created by arsen on 28.11.16.
 */
public abstract class Abonement {
    int days;
    int raises;
    static int id;
    int identificator;
    public int getId() {
        return this.identificator;
    }

    public int getRaises() {
        return raises;
    }

    public void setRaises(RaisesEnum raises) {
        this.raises = Integer.parseInt(String.valueOf(raises));
    }

    public int getDays() {
        return days;
    }

    public void setDays(DaysEnum days) {
        this.days = Integer.parseInt(String.valueOf(days));
    }
    public void setDays(WeekendDaysEnum days){
        this.days = Integer.parseInt(String.valueOf(days));
    }
    public void shrinkRaises(){
        this.raises--;
    }
    public String toString(){
        return "User with id: " + getId() + ", letf raises: " + getRaises();
    }

}
