package Ex3.Ferry;

public abstract class Vehicle {
    protected int numOfPass;

    public Vehicle(){

    }

    protected void setNumOfPass(int passengers){
        numOfPass = passengers;
    }

    protected int getNumOfPass(){
        return numOfPass;
    }

}
