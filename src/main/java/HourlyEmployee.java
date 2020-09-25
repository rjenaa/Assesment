public class HourlyEmployee extends Employee implements IPayable{
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, HireDate hireDate, double hourlyRate, double hoursWorked) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay(){
        return getHourlyRate() * getHoursWorked();
    }

    public void printBadge(){
        System.out.println("Name:" + getName() +
                "\nType of Employee: Hourly Employee \n" + hireDate);
    }

    @Override
    public String toString() {
        return "HourlyEmployee ";
    }

    @Override
    public double payment() {
        return calculatePay();
    }
}
