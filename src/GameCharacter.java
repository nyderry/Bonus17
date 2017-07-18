import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ny Derry on 7/17/2017.
 * BONUS 17
 */
//Add a method "played" to prints the name of the characters and shows the strength and the intelligence.

public class GameCharacter {

    private String name;
    private int strength;
    private int intelligence;



    public GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;

    }


    public void play() {
        System.out.println("Name of character: " + name);
        System.out.println("Strength of character: " + strength);
        System.out.println("Intelligence of the character: " + intelligence);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }



    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", intelligence=" + intelligence +
                '}';
    }
}


