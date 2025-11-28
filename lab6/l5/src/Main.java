import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NPC> npcs = new ArrayList<>();
        NPCType goblinType = NPCFactory.getNpcType("Goblin", "green_skin.png");
        NPCType orcType = NPCFactory.getNpcType("Orc", "brutal_skin.png");

        npcs.add(new NPC(10, 20, goblinType));
        npcs.add(new NPC(15, 25, goblinType));
        npcs.add(new NPC(50, 60, orcType));
        NPCType sameGoblinType = NPCFactory.getNpcType("Goblin", "green_skin.png");

        for (NPC npc : npcs) {
            npc.render();
        }
    }
}