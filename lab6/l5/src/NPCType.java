public class NPCType {
    private final String model;
    private final String texture;

    public NPCType(String model, String texture) {
        this.model = model;
        this.texture = texture;
        System.out.println("Создан новый NPC: " + model);
    }

    public void render(int x, int y) {
        System.out.println("Отрисовка NPC типа '" + model + "' в координатах (" + x + ", " + y + ")");
    }
}