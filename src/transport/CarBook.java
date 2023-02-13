package transport;

public class CarBook {
    public static void main(String[] args) {
        Driver driverBus1 = new Driver("Шумахер.Т.Р", true, 20);
        Driver driverBus2 = new Driver("Костин.И.В", true, 25);
        Driver driverBus3 = new Driver("Рашидов.М.В", true, 15);
        Driver driverBus4 = new Driver("Бобров.Г.Ю", true, 10);

//        Category_driverD driverBus1 = new Category_driverD(driver1);
//        Category_driverD driverBus2 = new Category_driverD(driver2);
//        Category_driverD driverBus3 = new Category_driverD(driver3);
//        Category_driverD driverBus4 = new Category_driverD(driver4);


        Driver driverCar1 = new Driver("Толстов.И.Б", true, 5);
        Driver driverCar2 = new Driver("Прохоров.А.С", true, 19);
        Driver driverCar3 = new Driver("Окунев.С.Ю", true, 40);
        Driver driverCar4 = new Driver("Ветров.И.Е", true, 1);

//        Category_driverB driverCar1 = new Category_driverB(driver5);
//        Category_driverB driverCar2 = new Category_driverB(driver6);
//        Category_driverB driverCar3 = new Category_driverB(driver7);
//        Category_driverB driverCar4 = new Category_driverB(driver8);


        Driver driverTracks1 = new Driver("Бабков.А.М", true, 26);
        Driver driverTracks2 = new Driver("Тютчев.А.П", true, 14);
        Driver driverTracks3 = new Driver("Ткачев.Е.В", true, 30);
        Driver driverTracks4 = new Driver("Романов.С.Г", true, 12);

//        Category_driverC driverTracks1 = new Category_driverC(driver9);
//        Category_driverC driverTracks2 = new Category_driverC(driver10);
//        Category_driverC driverTracks3 = new Category_driverC(driver11);
//        Category_driverC driverTracks4 = new Category_driverC(driver12);


        Buses bus1 = new Buses("Паз", "А1", 2.0, driverBus1.getDrivingLicense());
        Buses bus2 = new Buses("Газ", "А2", 3.1, driverBus2.getDrivingLicense());
        Buses bus3 = new Buses("Raf", "А3", 1.9, driverBus3.getDrivingLicense());
        Buses bus4 = new Buses("Fiat", "А4", 2.5, driverBus4.getDrivingLicense());

        Cars car1 = new Cars("Lada", "B1", 2.5, driverCar2.getDrivingLicense());
        Cars car2 = new Cars("Ford", "B2", 1.5, driverCar1.getDrivingLicense());
        Cars car3 = new Cars("VW", "B3", 2.0, driverCar3.getDrivingLicense());
        Cars car4 = new Cars("ЗАЗ", "B4", 1.3, driverCar4.getDrivingLicense());

        Tracks track1 = new Tracks("Kamaz", "С1", 5.0, driverTracks1.getDrivingLicense());
        Tracks track2 = new Tracks("Volvo", "С2", 4.5, driverTracks4.getDrivingLicense());
        Tracks track3 = new Tracks("МАЗ", "С3", 7.1, driverTracks3.getDrivingLicense());
        Tracks track4 = new Tracks("ЗИЛ", "С4", 6.2, driverTracks4.getDrivingLicense());

        car1.pit_stop();
        car2.bestLapTime();
        track2.maxSpeed();
        car2.pit_stop();


    }
}
