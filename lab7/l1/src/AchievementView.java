import java.util.List;

public class AchievementView {
    public void printAchievements(List<Achievement> achievements) {
        System.out.println("Список достижений");
        for (Achievement ach : achievements) {
            String status = ach.isUnlocked() ? "[открыто]" : "[заблокировано]";
            System.out.println(status + " " + ach.getName());
        }
        System.out.println("-----------------");
    }
}