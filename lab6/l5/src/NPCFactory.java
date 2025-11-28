import java.util.HashMap;
import java.util.Map;

public class NPCFactory {
    private static final Map<String, NPCType> npcTypes = new HashMap<>();

    public static NPCType getNpcType(String model, String texture) {
        String key = model + "_" + texture;
        NPCType type = npcTypes.get(key);

        if (type == null) {
            type = new NPCType(model, texture);
            npcTypes.put(key, type);
        }
        return type;
    }
}