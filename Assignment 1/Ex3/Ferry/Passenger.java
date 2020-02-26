package Ex3.Ferry;

public class Passenger {

    private int numOfPass;



    public Passenger(){
        numOfPass = 0;
    }

    public Passenger(int numOfPass) throws Exception{
        if (numOfPass > 0 && numOfPass < 201)
            this.numOfPass = numOfPass;

        else
            throw new Exception("Number of passengers allowed 1-200");

    }

    public void setNumOfPass(int numOfPass) {
        if (numOfPass > 0)
        this.numOfPass = numOfPass;
    }

    public int getNumOfPass() {
        return numOfPass;
    }
}
