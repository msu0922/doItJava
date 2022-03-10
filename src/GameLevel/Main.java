package GameLevel;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player();
        p1.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        p1.upgradeLevel(aLevel);
        p1.play(2);

        SuperLevel sLevel = new SuperLevel();
        p1.upgradeLevel(sLevel);
        p1.play(3);

    }
}
