public class Main {
    public static void main(String[] args) {
        Tower tower = new Tower();
        TowerController controller = new TowerController();

        Command attack = new ActivateTurretsCommand(tower);
        Command defense = new DeployShieldCommand(tower);
        controller.setCommand(attack);
        controller.pressButton();
        System.out.println();

        controller.setCommand(defense);
        controller.pressButton();
    }
}