package transport;

public class Tracks<T> extends Transport implements Competing {

    private String brend;
    private String model;
    private double engineValue;
    private T  categoryDriverC;


    public Tracks(String brend, String model, double engineValue,T categoryDriverC) {
        this.brend = brend;
        this.model = model;
        this.engineValue = engineValue;
        this.categoryDriverC=categoryDriverC;

    }

    public String getBrend() {
        return this.brend;
    }

    public void setBrend(String brend) {
        if (brend == null || brend.isEmpty()) {
            brend = "default";
        }
        this.brend = brend;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
    }

    public double getEngineValue() {
        return this.engineValue;
    }

    public void setEngineValue(double engineValue) {
        if (engineValue <= 0) {
            engineValue = 1.5;
        }
        this.engineValue = engineValue;
    }


    @Override
    public String toString() {
        return "Tracks{" +
                ", brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue +
                '}';
    }

    @Override
    public void pit_stop() {
        System.out.println("PIT-STOP ");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость ");
    }

    @Override
    public void start() {
        System.out.println("Начал движение");

    }

    @Override
    public void stop() {
        System.out.println("Остановилься");

    }
}
