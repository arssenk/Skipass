package skipass.system;

import skipass.abonements.Abonement;
import skipass.abonements.SeasonAb;
import skipass.enums.Abonements;
import skipass.enums.DaysEnum;
import skipass.enums.RaisesEnum;

/**
 * Created by arsen on 28.11.16.
 */
public class Turniket implements SystemControl {


    public static void main(String[] args) {
        Turniket turniket = new Turniket();
        turniket.produseAbonement(Abonements.WORKDAYDAYS, null, DaysEnum.ONE);
        turniket.produseAbonement(Abonements.SEASON, null, null);
        turniket.produseAbonement(Abonements.WEEKENDRAISES, RaisesEnum.FIFTY, null);
        System.out.println(turniket.getUsers());

    }

    void produseAbonement(Abonements ab, RaisesEnum raises, DaysEnum days) {
        Abonement abonemet = ab.setAbonement();
        if (ab == Abonements.WEEKENDRAISES) {
            abonemet.setRaises(raises);
        } else if (ab == Abonements.WEEKENDDAYS) {
            abonemet.setDays(days);
        } else if (ab == Abonements.WORKDAYSRAISES) {
            abonemet.setRaises(raises);
        } else if (ab == Abonements.WORKDAYDAYS) {
            abonemet.setDays(days);
        }
        abonements.add(abonemet);
    }

    public void blockAbonement(int id) {
        int i = 0;
        for (Abonement a : abonements) {
            if (a.getId() == id) {
                abonements.remove(i);
            }
            i++;
        }
    }

    public void enter(Abonement ab) {
        if (ab instanceof SeasonAb) {
            System.out.println("Customer with id: " + ab.getId() + " is passed");
        } else if (ab.getDays() != 0 || ab.getRaises() != 0) {
            ab.shrinkRaises();
            System.out.println("Customer with id: " + ab.getId() + " is passed");
        }
    }

    public String getUsers() {
        String s = "";
        for (Abonement a : abonements) {
            s += a;
        }
        return s;
    }
}

