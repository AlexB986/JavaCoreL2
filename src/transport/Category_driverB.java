package transport;

public class Category_driverB {



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
