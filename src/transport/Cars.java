package transport;

public class Cars<T extends  Category_driverB> extends Transport implements Competing {

    private String brend;
    private String model;
    private double engineValue;
    private T categoryDriverB;


    public Cars(String brend, String model, double engineValue,T categoryDriverB) {
        this.brend = brend;
        this.model = model;
        this.engineValue = engineValue;
        this.categoryDriverB=categoryDriverB;

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
        return "Cars{" +
                ", brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue +
                '}';
    }

    @Override
    public void pit_stop() {
        System.out.println("PIT-STOP "+brend);

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг "+brend);

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 200");

    }

    @Override
    public void start() {
        System.out.println("Начал движение "+brend);

    }

    @Override
    public void stop() {
        System.out.println("Остановилься "+brend);

    }
}
