package transport;

public class Category_driverD extends Driver{
    private  String license="D";

    public Category_driverD(String fullName, boolean drivingLicense, int experience) {
        super(fullName, drivingLicense, experience);
        this.license="D";
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
