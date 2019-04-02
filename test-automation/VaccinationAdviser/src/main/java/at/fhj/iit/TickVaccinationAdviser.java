package at.fhj.iit;


import java.time.DateTimeException;
import java.time.LocalDate;

/*Ü
 * THIS IS JUST A TOY EXAMPLE AND NOT INTENDED AS YOUR PRIMARY SOURCE FOR VACCINATION INFORMATION
 * Gives tips when you need to get your next vaccination against ticks
 */
public class TickVaccinationAdviser {
    /**
     * Age of the person interested in tick vaccination
     */
    private int age;

    /**
     * Creates a TickVaccinationAdviser object with the given age.
     * @param age The age of the person interested in a tick vac.
     */
    public TickVaccinationAdviser(int age)
    {
        this.age = age;
    }

    /**
     * Gives information about possible allergic reactions
     * @param allergyNames The allergies of the person.
     * @return true when allergic reaction possible, false if not.
     */
    public boolean allergicReactionPossible(String [] allergyNames)
    {
        if (allergyNames == null)
        {
            return false;
        }
        for(String allergy : allergyNames)
        {
            if(allergy.contains("egg") || allergy.contains("ovalbumin") || allergy.contains("neomycin")|| allergy.contains("gentamicin")
                    || allergy.contains("sucrose")|| allergy.contains("human serum albumin")|| allergy.contains("latex")
                    || allergy.contains("aluminium hydroxide") || allergy.contains("formaldehyde"))
            {
                return true;
            }

        }

        return false;
    }

    /**
     * Gives information when to get the primary immunization given the planned first vaccination date.
     * @param year year of the first planned vac
     * @param month month of the first planned vac
     * @param day day of the first planned vac
     * @return A LocalDate array with the vaccination dates for primary immunization.
     */
    public LocalDate[] getPrimaryImmunizationDates(int year, int month, int day)
    {
        LocalDate[] d = new LocalDate[3];

        try {
            d[0] = LocalDate.of(year, month, day);
            d[1] = d[0].plusMonths(1);
            d[2] = d[1].plusMonths(12);
            return d;
        }
        catch (DateTimeException dEx)
        {
            return null;
        }


    }

    /**
     * Tells you when to get your next refreshment vac.
     * @param lastVacYear year of the last tick vac.
     * @param firstRefreshmentVac Is this the first refreshment after finished primary immunization.
     * @return year when next refreshment vac necessary.
     */
    public int getNextVaccinationDate(int lastVacYear, boolean firstRefreshmentVac)
    {
        if(firstRefreshmentVac || age >= 60)
        {
            return lastVacYear + 3;
        }
        return lastVacYear + 5;
    }

}
