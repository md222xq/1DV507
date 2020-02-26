package Ex3.Ferry;

public class Car extends Vehicle {

    private boolean embarked;

    public Car (int numOfPass) throws Exception{

        if (numOfPass > 0 && numOfPass <= 4)
            setNumOfPass(numOfPass);

        else
            throw new Exception("Car must have minimum 1 passenger, and maximum 4 passengers");
    }

    public void setEmbarked(boolean embarked) {
        this.embarked = embarked;
    }

    public boolean isEmbarked() {
        return embarked;
    }

    public void setNumOfPassCar (int numOfPass) throws Exception{

        if (numOfPass > 0 && numOfPass <= 4)
            setNumOfPass(numOfPass);

        else
            throw new Exception("Car must have minimum 1 passenger, and maximum 4 passengers");


    }
}
