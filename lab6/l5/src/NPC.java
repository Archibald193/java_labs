public class NPC {
    private int x, y;
    private NPCType npcType;

    public NPC(int x, int y, NPCType npcType) {
        this.x = x;
        this.y = y;
        this.npcType = npcType;
    }
    
    public void render() {
        npcType.render(x, y);
    }
}