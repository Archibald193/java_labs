public class Main {
    public static void main(String[] args) throws InterruptedException {
        AchievementTracker tracker1 = AchievementTracker.getInstance();
        tracker1.addAchievement("Stone Age");
        Thread.sleep(10000); 
        tracker1.addAchievement("Голос из-за грани");
        tracker1.addAchievement("Getting an Upgrate");
        tracker1.addAchievement("Acquire Hardware");
        Thread.sleep(5000); 
        tracker1.addAchievement("Hot Stuff");
        Thread.sleep(10000); 
        tracker1.addAchievement("Ice Bucket Challenge");
        Thread.sleep(20000); 
        tracker1.addAchievement("We Need to Go Deeper");
        tracker1.addAchievement("Закаленный Жаром");
        Thread.sleep(5000); 
        tracker1.addAchievement("Симбиоз");
        Thread.sleep(5000);

        AchievementTracker tracker2 = AchievementTracker.getInstance();
        tracker2.addAchievement("Monster Hunter");
        tracker2.addAchievement("Первый Сбой");
        Thread.sleep(2000); 
        tracker2.addAchievement("Кислотные Ожоги");

        if (tracker1 == tracker2) {
            System.out.println("\nTracker1 и Tracker2 - это один и тот же объект.");
        }

        System.out.println("\nВсе полученные достижения:");
        for (String ach : tracker1.getAchievements()) {
            System.out.println("- " + ach);
        }
    }
}