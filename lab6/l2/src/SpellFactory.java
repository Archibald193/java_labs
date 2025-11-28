public class SpellFactory {
    public Spell createSpell(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        if ("fire".equalsIgnoreCase(type)) {
            return new FireSpell();
        } else if ("ice".equalsIgnoreCase(type)) {
            return new IceSpell();
        }
        return null;
    }
}