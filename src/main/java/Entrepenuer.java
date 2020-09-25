public class Entrepenuer extends Person implements IPayable{

    private double weeklyIncome;


    public Entrepenuer(String name) {
        super(name);
    }
    public Entrepenuer(String name, double income){
        super(name);
        this.weeklyIncome = income;
    }

    public double getIncome() {
        return weeklyIncome;
    }

    public void setIncome(double income) {
        this.weeklyIncome = income;
    }

    @Override
    public double calculatePay(){
        return getIncome();
    }

    @Override
    public double payment() {
        return calculatePay();
    }

    @Override
    public String toString() {
        return "Entrepenuer ";
    }
}
