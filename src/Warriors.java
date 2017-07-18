/**
 * Created by Ny Derry on 7/17/2017.
 */
public class Warriors extends GameCharacter {

    private String weaponType;


    public Warriors(String name, int strength, int intelligence) {
        super(name, strength, intelligence);
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(strength);
    }

    @Override
    public int getIntelligence() {
        return super.getIntelligence();
    }

    @Override
    public void setIntelligence(int intelligence) {
        super.setIntelligence(intelligence);
    }

    @Override
    public String toString() {
        return "Warriors{" +
                "weaponType='" + weaponType + '\'' +
                '}';
    }
}
