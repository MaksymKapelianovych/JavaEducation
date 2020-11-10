package game.src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private int secretNumber;
    private int minValue;
    private int maxValue;
    private List<Integer> attempts = new ArrayList<>();

    public boolean checkNumber(int number){
        attempts.add(number);
        if(secretNumber == number){
            return false;
        }
        if(secretNumber < number){
            maxValue = number;
        }else{
            minValue = number;
        }
        return true;
    }

    public void setRange(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public void setSecretNumber(){
        secretNumber = (int)Math.ceil(Math.random()*
                (maxValue - minValue - 1) + minValue);
    }

    public  int getSecretNumber(){
        return secretNumber;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public List<Integer> getAttempts(){
        return attempts;
    }

}
