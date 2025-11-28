public class DeployShieldCommand implements Command {
    private Tower tower;

    public DeployShieldCommand(Tower tower) {
        this.tower = tower;
    }

    @Override
    public void execute() {
        tower.deployShield();
    }
}