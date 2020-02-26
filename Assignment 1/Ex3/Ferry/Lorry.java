package Ex3.Ferry;

public class Lorry extends Vehicle {
    private boolean embarked;

    public Lorry (int numOfPass) throws Exception{

        if (numOfPass > 0 && numOfPass <= 2)
            setNumOfPass(numOfPass);

        else
            throw new Exception("Lorry must have minimum 1 passenger, and maximum 2 passengers");
    }

    public void setEmbarked(boolean embarked) {
        this.embarked = embarked;
    }

    public boolean isEmbarked() {
        return embarked;
    }

    public void setNumOfPassLorry (int numOfPass)throws Exception{
        if (numOfPass > 0 && numOfPass <= 2)
            setNumOfPass(numOfPass);

        else
            throw new Exception("Lorry must have minimum 1 passenger, and maximum 2 passengers");
    }



}
