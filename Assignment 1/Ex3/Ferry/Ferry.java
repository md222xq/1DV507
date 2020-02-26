package Ex3.Ferry;

import java.util.ArrayList;

public class Ferry implements InterfaceFerry {

    private int numOfPassengers;
    private int numOfVehicle;
    private int countMoney;
    private Vehicle [] getAllVehicles;
    private int numOfBicycle;
    private int numOfCar;
    private int numOfBus;
    private int numOfLorry;
    private final int maxNumOfPass;
    private final int maxVehSpace;
    private int vehCounter;         //Counts number of vehicles onboard (eg, 1 lorry + 1 car = 2 vehicles)
    private int nextIndex;
    private ArrayList<Vehicle> arrayListVehicle;


    public Ferry() {
    maxNumOfPass     = 200;
    maxVehSpace      = 40;
    numOfPassengers  = 0;
    numOfVehicle     = 0;
    countMoney       = 0;
    numOfBicycle     = 0;
    numOfCar         = 0;
    numOfBus         = 0;
    numOfLorry       = 0;
    arrayListVehicle = new ArrayList<>();

    }



    @Override
    public int countPassengers() {
        return numOfPassengers;
    }

    @Override
    public int countVehicleSpace() {
        return numOfVehicle;
    }

    @Override
    public int countMoney() {
        return countMoney;
    }

    @Override
    public Vehicle[] getAllVehicles() {
        getAllVehicles = new Vehicle[arrayListVehicle.size()];

        for (int i = 0; i < arrayListVehicle.size(); i++){
            getAllVehicles[i] = arrayListVehicle.get(i);
            System.out.println(arrayListVehicle.get(i));
        }
        return getAllVehicles;
    }

    @Override
    public void embark(Vehicle v) {

        if (v instanceof Bicycle){
            if(!((Bicycle) v).isEmbarked()){
                if(hasSpaceFor(v)){
                    int numOfPass = v.getNumOfPass();
                    numOfPassengers = numOfPassengers+ numOfPass;
                    countMoney = countMoney+ 40;
                    numOfVehicle ++;       //Must figure out a way to count each 5 bikes as 1
                    numOfBicycle++;
                    vehCounter++;
                  //  getAllVehicles[nextIndex] = v;
                 //   nextIndex++;
                    arrayListVehicle.add(v);
                }
                else
                    System.out.println("Ferry has reached maximum capacity, try again later.");
            }
            else
                System.out.println("This vehicle has already embarked.");
            }

        else if(v instanceof Car){
            if(!((Car) v).isEmbarked()){
                if (hasSpaceFor(v)){
                    int numOfPass = v.getNumOfPass();
                    numOfPassengers = numOfPassengers+ numOfPass;
                    countMoney = countMoney+ (100) + (numOfPass*20);
                    numOfVehicle ++;
                    ((Car) v).setEmbarked(true);
                    numOfCar++;
                    vehCounter++;
                    getAllVehicles[nextIndex] = v;
                    nextIndex++;
                    arrayListVehicle.add(v);
                }
                else
                    System.out.println("Ferry has reached maximum capacity, try again later.");
            }
            else
                System.out.println("This vehicle has already embarked.");
        }

        else if(v instanceof Bus){
            if(!((Bus) v).isEmbarked()){
                if (hasSpaceFor(v)){
                    int numOfPass = v.getNumOfPass();
                    numOfPassengers = numOfPassengers+ numOfPass;
                    countMoney = countMoney+ (200) + (numOfPass*15);
                    numOfVehicle = numOfVehicle+ 4;
                    ((Bus) v).setEmbarked(true);
                    numOfBus++;
                    vehCounter++;
                    //embarkedVehicles[nextIndex] = v;
                    //nextIndex++;
                    arrayListVehicle.add(v);

                }
                else
                    System.out.println("Ferry has reached maximum capacity, try again later.");
            }
            else
                System.out.println("This vehicle has already embarked.");
        }

        else if(v instanceof Lorry){
            if(!((Lorry) v).isEmbarked()){
                if (hasSpaceFor(v)){
                    int numOfPass = v.getNumOfPass();
                    numOfPassengers = numOfPassengers+ numOfPass;
                    countMoney = countMoney+ (300) + (numOfPass*20);
                    numOfVehicle = numOfVehicle+8;
                    ((Lorry) v).setEmbarked(true);
                    numOfLorry++;
                    vehCounter++;
                    //embarkedVehicles[nextIndex] = v;
                    //nextIndex++;
                    arrayListVehicle.add(v);

                }
                else
                    System.out.println("Ferry has reached maximum capacity, try again later.");
            }
            else
                System.out.println("This vehicle has already embarked.");
        }

    }

    @Override
    public void embark(Passenger p) {
        if (numOfPassengers + p.getNumOfPass() <= maxNumOfPass){
            numOfPassengers =+ p.getNumOfPass();
        }
        else
            System.out.println("Ferry has reached maximum capacity, try again later.");

    }

    @Override
    public void disembark() {
        numOfPassengers = 0;
        numOfVehicle = 0;
        numOfLorry = 0;
        numOfBus = 0;
        numOfCar = 0;
        numOfBicycle = 0;
        //Clear Array
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {

        if (v instanceof Bicycle){
            if (numOfVehicle+1 < maxVehSpace){          //Check if +1 is true
                if (numOfPassengers+1 < maxNumOfPass){
                    return true;
                }
            }
            else
                return false;
        }

        if (v instanceof Car){
            if (numOfVehicle+1 < maxVehSpace){
                if (numOfPassengers+ v.getNumOfPass() < maxNumOfPass){
                    return true;
                }
            }
            else
                return false;
        }

        if (v instanceof Bus){
            if (numOfVehicle+4 < maxVehSpace){
                if (numOfPassengers+ v.getNumOfPass() < maxNumOfPass){
                    return true;
                }
            }
            else
                return false;
        }

        if (v instanceof Lorry){
            if (numOfVehicle+8 < maxVehSpace){
                if (numOfPassengers+ v.getNumOfPass() < maxNumOfPass){
                    return true;
                }
            }
            else
                return false;
        }

        return false;
    }

    @Override
    public boolean hasRoomFor(Passenger p) {
        if (numOfPassengers + p.getNumOfPass() < maxNumOfPass){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder printOut = new StringBuilder();


        printOut.append("\n------------------------------------------");
        printOut.append("\n---------------Ferry Status---------------");
        printOut.append("\n------------------------------------------");

        printOut.append("\nCurrent number of Passengers on-board: "+ numOfPassengers);
        printOut.append("\nCurrent number of Vehicles on-board:   "+ numOfVehicle);
        printOut.append("\nCurrent number of Bicycles on-board:   "+ numOfBicycle);
        printOut.append("\nCurrent number of Cars on-board:       "+ numOfCar);
        printOut.append("\nCurrent number of Buses on-board:      "+ numOfBus);
        printOut.append("\nCurrent number of Lorries on-board:    "+ numOfLorry);
        printOut.append("\nCurrent Money Earned:                  "+ countMoney);
        printOut.append("\nVehicle Space remaining on-board:      "+ (maxVehSpace-numOfVehicle));
        printOut.append("\n-----------------END----------------------");

        return printOut.toString();


    }
    public int getVehCounter(){
        return vehCounter;
    }
}
