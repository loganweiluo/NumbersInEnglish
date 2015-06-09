package converter;

/**
 * Created by weiluo on 09/06/15.
 */
public class NumberToEnglishConverter {
    public String convert(int i) {
        if(i==1){
            return "one";
        }
        if(i==2){
            return "two";
        }
        return null;
    }
}
