import java.util.Comparator;

public class Pokemon implements Comparable<Pokemon>{
    int att;
    int def;
    int spd;
    String spc;

    public Pokemon(String spc){
        att = spc.length() * 4 + 2;
        def = spc.length() * 2 + 7;
        spd = spc.length() * 3 + 5;
        this.spc = spc;
    }

    public int compareTo(Pokemon other)
    {
        return getSpecies().compareToIgnoreCase(other.getSpecies());
    }
    /*
    * When called, the getAttack method will return the attack
    * variable.
    */
    public int getAttack()
    {
        return att;
    }
    /*
    * When called, the setAttack method will set the attack
    * variable to whatever value is passed to the method.
    */
    public void setAttack(int newAttack){
        newAttack = spc.length() * 4 + 2;
        att = newAttack;
    }
    /*
    * When called, the getDefense method will return the defense
    * variable.
    */
    public int getDefense()
    {
        return def;
    }
    /*
    * When called, the setDefense method will set the defense
    * variable to whatever value is passed to the method.
    */
    public void setDefense(int newDefense)
    {
        newDefense = spc.length() * 2 + 7;
        def = newDefense;
    }
    /*
    * When called, the getSpeed method will return the speed
    * variable.
    */
    public int getSpeed()
    {
        return spd;
    }
    /*
    * When called, the setSpeed method will set the speed variable
    * to whatever value is passed to the method.
    */
    public void setSpeed(int newSpeed)
    {
        newSpeed = spc.length() * 3 + 5;
        spd = newSpeed;
    }
    /*
    * When called, the getSpecies method will return the species
    * variable.
    */
    public String getSpecies()
    {
        return spc;
    }
    /*
    * When called, the setSpecies method will set the species variable
    * to whatever value is passed to the method.
    */
    public void setSpecies(String newSpecies)
    {
        spc = newSpecies;
    }
    /*
    * When called, the evolve method will double the speed stat,
    * triple the attack stat, and multiply the defense stat by 5.
    */
    public void evolve()
    {
        this.spd = spd * 2;
        this.att = att * 3;
        this.def = def * 5;
    }
}
