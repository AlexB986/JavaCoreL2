package transport;

//        https://github.com/AlexB986/JavaCoreL2/pull/3
public class CarBook {
    public static void main(String[] args) {
        Category_driverB driverCar1 = new Category_driverB("Толстов.И.Б", true, 5);
        Category_driverB driverCar2 = new Category_driverB("Прохоров.А.С", true, 19);
        Category_driverB driverCar3 = new Category_driverB("Окунев.С.Ю", true, 40);
        Category_driverB driverCar4 = new Category_driverB("Ветров.И.Е", true, 1);

        Category_driverC driverTracks1 = new Category_driverC("Бабков.А.М", true, 26);
        Category_driverC driverTracks2 = new Category_driverC("Тютчев.А.П", true, 14);
        Category_driverC driverTracks3 = new Category_driverC("Ткачев.Е.В", true, 30);
        Category_driverC driverTracks4 = new Category_driverC("Романов.С.Г", true, 12);

        Category_driverD driverBus1 = new Category_driverD("Шумахер.Т.Р", true, 21);
        Category_driverD driverBus2 = new Category_driverD("Костин.И.В", true, 25);
        Category_driverD driverBus3 = new Category_driverD("Рашидов.М.В", true, 15);
        Category_driverD driverBus4 = new Category_driverD("Бобров.Г.Ю", true, 10);


        Cars car1 = new Cars("Lada", "B1", 2.5, driverCar1);
        Cars car2 = new Cars("Ford", "B2", 1.5, driverCar2);
        Cars car3 = new Cars("VW", "B3", 2.0, driverCar3);
        Cars car4 = new Cars("ЗАЗ", "B4", 1.3, driverCar4);

        Tracks track1 = new Tracks("Kamaz", "С1", 5.0, driverTracks1);
        Tracks track2 = new Tracks("Volvo", "С2", 4.5, driverTracks2);
        Tracks track3 = new Tracks("МАЗ", "С3", 7.1, driverTracks3);
        Tracks track4 = new Tracks("ЗИЛ", "С4", 6.2, driverTracks4);

        Buses bus1 = new Buses("Паз", "А1", 2.0, driverBus1);
        Buses bus2 = new Buses("Газ", "А2", 3.1, driverBus2);
        Buses bus3 = new Buses("Raf", "А3", 1.9, driverBus3);
        Buses bus4 = new Buses("Fiat", "А4", 2.5, driverBus4);


        car1.pit_stop();
        car2.bestLapTime();
        track2.maxSpeed();
        car2.pit_stop();
        allRacer(car1);
        allRacer(bus1);
        allRacer(track1);

    }
    public static void  allRacer(Transport<?> transport){
        System.out.println("водитель "+ transport.getDriver().getFullName()+ " управляет автомобилем "+transport.getBrend()+ " "+ transport.getModel()+" и будет участвовать в заезде");

    }
}
