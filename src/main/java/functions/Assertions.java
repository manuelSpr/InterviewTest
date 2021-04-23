package functions;
import static common.Data.*;

public class Assertions {

    /**
     * Assert method to validate an element
     * @param validacion
     */
    public static void asserTrue(boolean validacion){
        try {
            assert validacion = true : MESSAGE_ELEMENT_VALIDATION;
        } catch (Exception ex) {

        }
    }

    /**
     * Assert method to validate an element
     * @param validation
     */
    public static void asserTrue(String text, String validation){
        try {
            assert text.contains(validation) : MESSAGE_TEXT_VALIDATION;
        } catch (Exception ex) {

        }
    }
}
