package notebook.src.controller;

public interface RegexContainer {
    public static final String FIRST_NAME_REGEX_EN = "^[A-Z][a-z]*$";
    public static final String LAST_NAME_REGEX_EN = "^[A-Z][a-z]*$";
    public static final String FIRST_NAME_REGEX_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']*$";
    public static final String LAST_NAME_REGEX_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']*$";
    public static final String MOBILE_NUMBER_REGEX = "^(\\+\\d{2})\\((\\d{3})\\)-(\\d{3})-(\\d{2})-(\\d{2})$";  //+38(067)-900-14-31

}
