package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CocktailTest {

    private Cocktail cocktail;
    private List<Liquid> ingriedents;

    @BeforeEach
    public void setup(){
        ingriedents = new ArrayList<Liquid>();
        ingriedents.add(new Liquid("AppleJuice", 0.1, 0.0));
        ingriedents.add(new Liquid("Vodka", 0.1, 50.0));

        cocktail = new Cocktail("Vodka Apple", ingriedents);
    }

    @Test
    @DisplayName("Testing constructor")
    public void testConstructor(){
        assertEquals("Vodka Apple", cocktail.getName());
    }

    @Test
    @DisplayName("Testing alcohol percent")
    public void testAlcoholPercent(){
        assertEquals(25, cocktail.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing volume of drink")
    public void testVolume(){
        assertEquals(0.2, cocktail.getVolume());
    }


}
