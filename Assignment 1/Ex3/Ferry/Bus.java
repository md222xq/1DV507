package Ex3.Ferry;

public class Bus extends Vehicle{

    private boolean embarked;

    public Bus (int numOfPass) throws Exception{

        if (numOfPass > 0 && numOfPass <= 20)
            setNumOfPass(numOfPass);

        else
            throw new Exception("Bus must have minimum 1 passenger, and maximum 20 passengers");
    }

    public void setEmbarked(boolean embarked) {
        this.embarked = embarked;
    }

    public boolean isEmbarked() {
        return embarked;
    }

    public void setNumOfPassBus (int numOfPass) throws Exception{

        if (numOfPass > 0 && numOfPass <= 20)
            setNumOfPass(numOfPass);

        else
            throw new Exception("Bus must have minimum 1 passenger, and maximum 20 passengers");


    }
}
