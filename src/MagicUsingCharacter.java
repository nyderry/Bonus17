/**
 * Created by Ny Derry on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter {

    private int magicalEnergy;

    public MagicUsingCharacter(String name, int strength, int intelligence) {
        super(name, strength, intelligence);
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }

    @Override
    public String toString() {
        return "MagicUsingCharacter{" +
                "magicalEnergy=" + magicalEnergy +
                '}';
    }
}

