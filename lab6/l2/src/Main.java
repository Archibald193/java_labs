public class Main {
    public static void main(String[] args) {
        SpellFactory factory = new SpellFactory();

        Spell fireSpell = factory.createSpell("fire");
        fireSpell.cast();

        Spell iceSpell = factory.createSpell("ice");
        iceSpell.cast();
    }
}