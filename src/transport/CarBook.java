package transport;

public class CarBook {
    public static void main(String[] args){
        Car auto = new Car("BMW", null, 3.0d, "black", 2021, "germany","automat","sedan","q125er456",4,false,null) ;
        Car auto1 = new Car("Lada", "Granta", 1.7d, "", 2015, "Russian","","hot","",5,true,new Car.Key(true,false));
        Car auto2 = new Car("Kia", "Sportage", -1d, "red", 2018, "South Korea","mechanic","","q211ds3",2,false,new Car.Key(false,false));
        Car auto3 = new Car("Hyundai ", "Avante", 2.6d, "orange", 0, "South Korea",null,"pickap","1232",6,true,new Car.Key(true,true));

        System.out.println(auto.toString());
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
    }
}
