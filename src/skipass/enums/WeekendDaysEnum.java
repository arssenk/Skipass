package skipass.enums;

/**
 * Created by arsen on 28.11.16.
 */
public enum  WeekendDaysEnum {
        ONE, TWO;
        public String toString(){
            switch (this){
                case ONE:
                    return "1";
                case TWO:
                    return "2";
                default:
                    return "NO DAYS WERE CHOOSEN";
            }
        }
    }

