// Инициатор команд
public class TowerController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        System.out.println("Кнопка нажата");
        command.execute();
    }
}