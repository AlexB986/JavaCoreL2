package transport;

public class CarBook {
    public static void main(String[] args){

        Car auto3 = new Car("BMW", "x1","black" ,150, "usa", 2000,2.2d,"Atm","sedan", "q111qq111",4,true) ;

        Bus auto = new Bus("gaz", "a1","blie", 150,"usa",1000);
        Car auto1=new Car( "taz","a2","red",600,"chi",1990,1.6d,"Atm","sedan","q111qq123",4,true);
        Transport auto2 = new Transport("vaz", "a3","white", 170,"usa",2010);
        System.out.println(auto3);
        System.out.println(auto.toString());
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
    }
}
