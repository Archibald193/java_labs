import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Achievement> achievements = new ArrayList<>();
        achievements.add(new Achievement("Stone Age"));
        achievements.add(new Achievement("Getting an Upgrate"));
        achievements.add(new Achievement("Acquire Hardware"));
        achievements.add(new Achievement("Ice Bucket Challenge"));
        AchievementView view = new AchievementView();
        AchievementController controller = new AchievementController(achievements, view);
        controller.updateView();
        controller.unlockAchievement("Stone Age");
        controller.unlockAchievement("Getting an Upgrate");
        controller.unlockAchievement("Hot Stuff");
    }
}