package Ex3.Ferry;

public class Bicycle extends Vehicle {

    private boolean embarked;

    public Bicycle() {
        setNumOfPass(1);
    }

    public void setEmbarked(boolean e){
        embarked = e;
    }

    public boolean isEmbarked(){
        return embarked;
    }

}
