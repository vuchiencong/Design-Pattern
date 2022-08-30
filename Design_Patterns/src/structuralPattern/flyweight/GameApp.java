package structuralPattern.flyweight;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Một ứng dụng game bao gồm rất nhiều Solider (lính), được chia thành các loại: Yuri, Spy, Doctor, …
 * Mỗi Solider sẽ có id và cấp độ khác nhau. Thời gian để tạo một loại Solider là 3 giây.
 */
public class GameApp {
    private static List<ISoldier> soldiers = new ArrayList<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        createSoldier(5, "Yuri", 1);
        createSoldier(5, "Spy", 1);
        createSoldier(3, "Spy", 3);
        createSoldier(2, "Yuri", 2);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
    }

    private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
        for (int i = 1; i <= numberOfSoldier; i++) {
            Context star = new Context("Soldier" + (soldiers.size() + 1), numberOfStar);
            ISoldier soldier = SoldierFactory.createSoldier(soldierName);
            soldier.promote(star);
            soldiers.add(soldier);
        }
    }
}
