public class DigitalDisplay implements Observer {
    private String name;
    
    public DigitalDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(String time) {
        System.out.println(name + " показывает: " + time);
    }
}