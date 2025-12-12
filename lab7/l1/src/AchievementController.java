import java.util.List;

public class AchievementController {
    private List<Achievement> modelList;
    private AchievementView view;

    public AchievementController(List<Achievement> modelList, AchievementView view) {
        this.modelList = modelList;
        this.view = view;
    }

    public void unlockAchievement(String name) {
        for (Achievement ach : modelList) {
            if (ach.getName().equalsIgnoreCase(name)) {
                ach.unlock();
                System.out.println("\nДостижение '" + name + "' разблокировано!");
                updateView();
                return;
            }
        }
        System.out.println("\nДостижение '" + name + "' не найдено.");
    }

    public void updateView() {
        view.printAchievements(modelList);
    }
}