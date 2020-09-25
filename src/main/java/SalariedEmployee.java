public class SalariedEmployee extends Employee implements IPayable{
    private double salary;

    public SalariedEmployee(String name, HireDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printBadge(){
        System.out.println("Name:" + getName() +
                "\nType of Employee: Salaried Employee \nHireDate: " + hireDate);
    }

    @Override
    public double calculatePay(){
        return salary / 52;
    }

    @Override
    public String toString() {
        return "SalariedEmployee ";
    }

    @Override
    public double payment() {
        return calculatePay();
    }
}
