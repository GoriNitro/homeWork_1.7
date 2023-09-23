import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(100);
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Hero[] abilites = {magic, medic, warrior};
        for (int i = 0; i < abilites.length; i++) {
            abilites[i].applySuperAbility();
            if (abilites[i] instanceof Medic){
                ((Medic) abilites[i]).increaseExperience();
            }
        }
    }
}
