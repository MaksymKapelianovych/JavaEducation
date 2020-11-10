package game.test;

import game.src.Model;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TestGuessNumber {

    @Test
    public void testSecretNumber(){
        Model model = new Model();
        int minValue = 0;
        int maxValue = 100;
        model.setRange(minValue, maxValue);

        for(int i = 0; i < 1000; i++){
            model.setSecretNumber();
            assert(0 <= model.getSecretNumber() && model.getSecretNumber() <= 100);
        }
    }

    @Test
    public void testAttempts(){
        Model model = new Model();
        int minValue = 0;
        int maxValue = 100;
        model.setRange(minValue, maxValue);
        model.setSecretNumber();

        List<Integer> attempts = new ArrayList() {{
            add(-6);
            add(-6);
            add(-6);
            add(-6);
            add(-6);
            add(-6);
        }};

        for (Integer attemp :
                attempts) {
            model.checkNumber(attemp);
        }

        assert (model.getAttempts().size() == attempts.size());

    }
}
