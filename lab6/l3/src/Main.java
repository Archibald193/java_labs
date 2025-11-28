public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();

        DigitalDisplay display1 = new DigitalDisplay("Дисплей на кухне");
        DigitalDisplay display2 = new DigitalDisplay("Дисплей в спальне");

        clock.addObserver(display1);
        clock.addObserver(display2);

        while(true) {
            clock.tick();
            Thread.sleep(1000);
        }
    }
}