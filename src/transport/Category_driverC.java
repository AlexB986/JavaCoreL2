package transport;

public class Category_driverC extends Driver {
    private static String license="C";


    public Category_driverC(String fullName, boolean drivingLicense, int experience) {
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





}
