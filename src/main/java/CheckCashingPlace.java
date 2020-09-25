import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckCashingPlace {
    public static void main(String[] args) {

        Entrepenuer entrepenuer = new Entrepenuer("John", 2000);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Ray", new HireDate(3,6,1999), 52000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Rey", new HireDate(2,5,2000), 35.0, 20.0);

        IPayable[] people = new IPayable[3];
        people[0] = salariedEmployee;
        people[1] = hourlyEmployee;
        people[2] = entrepenuer;
        Employee[] employees = new Employee[2];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        HumanResources hr = new HumanResources();

        hr.issueBadge(employees);
        System.out.println("Prior to sorting by ...");
        hr.payPerson(people);

        ArrayList<IPayable>unSortedPayable = new ArrayList<>();
        unSortedPayable.add(entrepenuer);
        unSortedPayable.add(salariedEmployee);
        unSortedPayable.add(hourlyEmployee);
        System.out.println("\n");
        System.out.println("After sorting by pay...");
        hr.sortPeopleByIncome(unSortedPayable);

    }
}
