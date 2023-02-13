package transport;

public class Category_driverB  extends Driver{

    private static String license="B";

    public Category_driverB(String fullName, boolean drivingLicense, int experience) {
        super(fullName, drivingLicense, experience);
    }

    public void start() {
        System.out.println("Начал движение");
    }


    public void stop() {
        System.out.println("Остановлся");
    }


    public void refuel() {
        System.out.println("Заправляюсь");
    }

    @Override
    public String toString() {
        return "Category_driverB{" +
                '}';
    }
}
