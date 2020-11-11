package notebook.test;

import notebook.src.controller.RegexContainer;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    @Test
    public void testFirstNameEng(){
        String firstName1 = "Ben"; //true
        String firstName2 = "Adam"; //true
        String firstName3 = "adam"; //false
        String firstName4 = "Adam2"; //false
        String firstName5 = "ADam"; //false

        Pattern pattern = Pattern.compile(RegexContainer.FIRST_NAME_REGEX_EN);
        Matcher matcher1 = pattern.matcher(firstName1);
        Matcher matcher2 = pattern.matcher(firstName2);
        Matcher matcher3 = pattern.matcher(firstName3);
        Matcher matcher4 = pattern.matcher(firstName4);
        Matcher matcher5 = pattern.matcher(firstName5);

        boolean isMatch1 = matcher1.matches();
        boolean isMatch2 = matcher2.matches();
        boolean notMatch3 = matcher3.matches();
        boolean notMatch4 = matcher4.matches();
        boolean notMatch5 = matcher5.matches();

        assert(isMatch1);
        assert(isMatch2);
        assert(notMatch3);
        assert(notMatch4);
        assert(notMatch5);
    }

    @Test
    public void testLastNameEng(){
        String lastName1 = "Phillips";  //true
        String lastName2 = "Jobs"; //true
        String lastName3 = "jobs"; //false
        String lastName4 = "Jobs2"; //false
        String lastName5 = "JOBS"; //false

        Pattern pattern = Pattern.compile(RegexContainer.LAST_NAME_REGEX_EN);
        Matcher matcher1 = pattern.matcher(lastName1);
        Matcher matcher2 = pattern.matcher(lastName2);
        Matcher matcher3 = pattern.matcher(lastName3);
        Matcher matcher4 = pattern.matcher(lastName4);
        Matcher matcher5 = pattern.matcher(lastName5);

        boolean isMatch1 = matcher1.matches();
        boolean isMatch2 = matcher2.matches();
        boolean notMatch3 = matcher3.matches();
        boolean notMatch4 = matcher4.matches();
        boolean notMatch5 = matcher5.matches();

        assert(isMatch1);
        assert(isMatch2);
        assert(notMatch3);
        assert(notMatch4);
        assert(notMatch5);
    }

    @Test
    public void testFirstNameUa(){
        String firstName1 = "Василь"; //true
        String firstName2 = "Петро"; //true
        String firstName3 = "петро"; //false
        String firstName4 = "Василь2"; //false
        String firstName5 = "ВАСИль"; //false

        Pattern pattern = Pattern.compile(RegexContainer.FIRST_NAME_REGEX_UA);
        Matcher matcher1 = pattern.matcher(firstName1);
        Matcher matcher2 = pattern.matcher(firstName2);
        Matcher matcher3 = pattern.matcher(firstName3);
        Matcher matcher4 = pattern.matcher(firstName4);
        Matcher matcher5 = pattern.matcher(firstName5);

        boolean isMatch1 = matcher1.matches();
        boolean isMatch2 = matcher2.matches();
        boolean notMatch3 = matcher3.matches();
        boolean notMatch4 = matcher4.matches();
        boolean notMatch5 = matcher5.matches();

        assert(isMatch1);
        assert(isMatch2);
        assert(notMatch3);
        assert(notMatch4);
        assert(notMatch5);
    }

    @Test
    public void testLastNameUa(){
        String lastName1 = "Петренко";  //true
        String lastName2 = "Кококонь"; //true
        String lastName3 = "конь"; //false
        String lastName4 = "Слонь2"; //false
        String lastName5 = "ЯСно"; //false

        Pattern pattern = Pattern.compile(RegexContainer.LAST_NAME_REGEX_UA);
        Matcher matcher1 = pattern.matcher(lastName1);
        Matcher matcher2 = pattern.matcher(lastName2);
        Matcher matcher3 = pattern.matcher(lastName3);
        Matcher matcher4 = pattern.matcher(lastName4);
        Matcher matcher5 = pattern.matcher(lastName5);

        boolean isMatch1 = matcher1.matches();
        boolean isMatch2 = matcher2.matches();
        boolean notMatch3 = matcher3.matches();
        boolean notMatch4 = matcher4.matches();
        boolean notMatch5 = matcher5.matches();

        assert(isMatch1);
        assert(isMatch2);
        assert(notMatch3);
        assert(notMatch4);
        assert(notMatch5);
    }

    @Test
    public void testMobileNumber(){
        String number1 = "+380679081431"; //false
        String number2 = "+38067-908-14-31"; //false
        String number3 = "+38(067)-908-14-31"; //true
        String number4 = "067-908-14-31"; //false

        Pattern pattern = Pattern.compile(RegexContainer.MOBILE_NUMBER_REGEX);

        Matcher matcher1 = pattern.matcher(number1);
        Matcher matcher2 = pattern.matcher(number2);
        Matcher matcher3 = pattern.matcher(number3);
        Matcher matcher4 = pattern.matcher(number4);

        boolean notMatch1 = matcher1.matches();
        boolean notMatch2 = matcher2.matches();
        boolean isMatch3 = matcher3.matches();
        boolean notMatch4 = matcher4.matches();

        assert(notMatch1);
        assert(notMatch2);
        assert(isMatch3);
        assert(notMatch4);
    }
}
