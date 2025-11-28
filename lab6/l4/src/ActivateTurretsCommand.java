public class ActivateTurretsCommand implements Command {
    private Tower tower;
    public ActivateTurretsCommand(Tower tower) {
        this.tower = tower;
    }

    @Override
    public void execute() {
        tower.activateTurrets();
    }
}