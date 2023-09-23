public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Medic just applied his super ability");
    }

    private int healPoints;

    public Medic(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints = healPoints + healPoints / 10;
        System.out.println("Medic just increased his experience "+ getHealPoints());
    }
}
