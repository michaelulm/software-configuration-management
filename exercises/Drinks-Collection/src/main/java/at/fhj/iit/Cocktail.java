package at.fhj.iit;

import java.util.List;

/**
 * represents a Cocktail which consists more than one liquid
 */
public class Cocktail extends Drink {

    /**
     * contains all liquids of cocktail
     */
    protected List<Liquid> ingredients;

    /**
     * Creates a Cocktail object with given name and ingredients
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    /**
     * Returns volume of cocktail
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid liquid : ingredients) {
            volume += liquid.getVolume();
        }
        return volume;
    }
    /**
     * Returns alcohol volume percent of cocktail by calculating mean of the percentages of the liquid
     */
    @Override
    public double getAlcoholPercent() {
        double percentMix = 0;
        for (Liquid liquid : ingredients) {
            percentMix += liquid.getAlcoholPercent() * liquid.getVolume();
        }
        return percentMix / getVolume();
    }

    /**
     * Gives information if drink is alcoholic or not
     */
    @Override
    public boolean isAlcoholic() {
        if(getAlcoholPercent() > 0)
            return true;
        return false;
    }

    public String getName(){
        return this.name;
    }
}
