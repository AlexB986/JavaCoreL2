package transport;

public class Cars extends Transport <Category_driverB> {

    public Cars(String brend, String model, double engineValue, Category_driverB driver) {
        super(brend, model, engineValue, driver);
    }

    @Override
    public void pit_stop() {
        System.out.println("PIT-STOP "+getBrend());

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг "+getBrend());

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 200");

    }

    @Override
    public void start() {
        System.out.println("Начал движение "+getBrend());

    }

    @Override
    public void stop() {
        System.out.println("Остановилься "+getBrend());

    }
}
