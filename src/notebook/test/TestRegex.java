package notebook.test;

import notebook.src.model.Note;
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

        Pattern pattern = Pattern.compile(Note.FIRST_NAME_REGEX);
        Matcher matcher1 = pattern.matcher(firstName1);
        Matcher matcher2 = pattern.matcher(firstName2);
        Matcher matcher3 = pattern.matcher(firstName3);
        Matcher matcher4 = pattern.matcher(firstName4);
        Matcher matcher5 = pattern.matcher(firstName5);

        assert(matcher1.matches());
        assert(matcher2.matches());
        assert(!matcher3.matches());
        assert(!matcher4.matches());
        assert(!matcher5.matches());
    }

    @Test
    public void testLastNameEng(){
        String lastName1 = "Phillips";  //true
        String lastName2 = "Jobs"; //true
        String lastName3 = "jobs"; //false
        String lastName4 = "Jobs2"; //false
        String lastName5 = "JOBS"; //false

        Pattern pattern = Pattern.compile(Note.LAST_NAME_REGEX);
        Matcher matcher1 = pattern.matcher(lastName1);
        Matcher matcher2 = pattern.matcher(lastName2);
        Matcher matcher3 = pattern.matcher(lastName3);
        Matcher matcher4 = pattern.matcher(lastName4);
        Matcher matcher5 = pattern.matcher(lastName5);

        assert(matcher1.matches());
        assert(matcher2.matches());
        assert(!matcher3.matches());
        assert(!matcher4.matches());
        assert(!matcher5.matches());
    }

    @Test
    public void testMobileNumber(){
        String number1 = "+380679081431"; //false
        String number2 = "+38067-908-14-31"; //false
        String number3 = "+38(067)-908-14-31"; //true
        String number4 = "067-908-14-31"; //false

        Pattern pattern = Pattern.compile(Note.MOBILE_NUMBER_REGEX);

        Matcher matcher1 = pattern.matcher(number1);
        Matcher matcher2 = pattern.matcher(number2);
        Matcher matcher3 = pattern.matcher(number3);
        Matcher matcher4 = pattern.matcher(number4);

        assert (!matcher1.matches());
        assert (!matcher2.matches());
        assert (matcher3.matches());
        assert (!matcher4.matches());

    }
}
