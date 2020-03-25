package at.fhj.iit;

import java.util.Random;

public class NumberGeneratorService {

    // TODO implement min to generate Random number between min and max limits
    public static int random(int min, int max){
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to max value
        return rand.nextInt(max);
    }
}
