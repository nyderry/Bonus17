import java.util.ArrayList;

/**
 * Created by Ny Derry on 7/17/2017.
 */
public class GameApp {


    public static void main(String[] args) {

        GameCharacter warrior1 = new GameCharacter("Blue Warrior", 10, 100);
        GameCharacter warrior2 = new GameCharacter("Red Warrior",  100,50);
        GameCharacter wizard1 = new GameCharacter("Great Wizard", 1050, 100);
        GameCharacter wizard2 = new GameCharacter("Majestic Wizard", 56, 815);
        GameCharacter wizard3 = new GameCharacter("Oz Wizard", 500, 800);

        ArrayList<GameCharacter> gameCharacters = new ArrayList<GameCharacter>();
        gameCharacters.add(warrior1);
        gameCharacters.add(warrior2);
        gameCharacters.add(wizard1);
        gameCharacters.add(wizard2);
        gameCharacters.add(wizard3);
        // Print the list
        for (GameCharacter GameCharacter : gameCharacters) {
           // System.out.println(GameCharacter.play()); --> sout in GameCharacter no need here
            GameCharacter.play();
        }

    }
    }

