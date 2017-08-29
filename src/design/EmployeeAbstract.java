package design;

public abstract class EmployeeAbstract {

    int rate;
    //abstract
    public abstract void empHistory();

    //noon-abstract
    public void empRating(int rate){
        this.rate = rate;
    }
}
