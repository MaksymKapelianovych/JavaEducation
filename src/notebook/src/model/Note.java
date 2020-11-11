package notebook.src.model;

public class Note {
    public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]*$";
    public static final String LAST_NAME_REGEX = "^[A-Z][a-z]*$";
    public static final String MOBILE_NUMBER_REGEX = "(\\+\\d{2})\\((\\d{3})\\)-(\\d{3})-(\\d{2})-(\\d{2})";  //+38(067)-900-14-31

    private String firstName;
    private String lastName;
    private String mobileNumber;


}
