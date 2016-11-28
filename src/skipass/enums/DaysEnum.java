package skipass.enums;

/**
 * Created by arsen on 28.11.16.
 */
public enum DaysEnum {
    ONE, TWO, FIVE;
    public String toString(){
        switch (this){
            case ONE:
                return "1";
            case TWO:
                return "2";
            case FIVE:
                return "5";
            default:
                return "NO DAYS WERE CHOOSEN";
        }
    }
}
