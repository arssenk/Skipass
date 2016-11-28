package skipass.enums;

/**
 * Created by arsen on 28.11.16.
 */
public enum RaisesEnum {
    TEN, TWONY, FIFTY, HUNGRED;
    public String toString(){
        switch (this){
            case TEN:
                return "10";
            case TWONY:
                return "20";
            case FIFTY:
                return "50";
            default:
                return "NO DAYS WERE CHOOSEN";
        }
    }
}
