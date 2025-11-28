import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AchievementTracker {
    private static AchievementTracker instance;

    private List<String> achievements;
    private final String LOG_FILE = "achievements_log.txt";

    private AchievementTracker() {
        achievements = new ArrayList<>();
    }

    public static synchronized AchievementTracker getInstance() {
        if (instance == null) {
            instance = new AchievementTracker();
        }
        return instance;
    }

    public void addAchievement(String achievement) {
        achievements.add(achievement);
        System.out.println("Player has made the advancement [" + achievement + "]");
        logToFile(achievement);
    }

    public List<String> getAchievements() {
        return achievements;
    }
    
    private void logToFile(String achievement) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
             
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            printWriter.println("[" + timestamp + "] " + achievement);
            
        } catch (IOException e) {
            System.err.println("Ошибка записи " + e.getMessage());
        }
    }
}