package notebook.src.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
                    //new Locale("en"));        // English

    //Utilities methods
    /**
     *
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printStringInput(String message){
        printMessage(bundle.getString(Strings.INPUT_STRING) + message);
    }

    public void printWrongStringInput(String message){
        printMessage(bundle.getString(Strings.INPUT_WRONG_DATA) + bundle.getString(Strings.INPUT_STRING) + message);
    }
}
