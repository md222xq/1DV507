package Ex3.Ferry;

public class FerryMain {
    public static void main(String[] args) throws Exception {
        Ferry ship = new Ferry();

        Passenger guy = new Passenger(50);
        Bicycle bmx = new Bicycle();
        Car volvo = new Car(4);
        Bus school = new Bus(15);
        Lorry truck = new Lorry(2);

        ship.embark(guy);
        ship.embark(bmx);
        ship.embark(school);
        ship.embark(truck);

        System.out.println("XXXXX"+ship.getVehCounter());
        System.out.println(ship.getAllVehicles().toString());

//        System.out.println(ship);
    }
}
