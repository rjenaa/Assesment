
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class HumanResources {
    public void issueBadge(Employee[] employee){
        for (Employee a : employee){
            a.printBadge();
            System.out.println();

        }
    }

    public void printPaymentInfo(IPayable payable){
        System.out.println(payable.toString() + "should be paid: " + payable.payment());
    }

    public void payPerson(IPayable[] payables){

        for(IPayable a : payables){
            System.out.println(a.toString() + "should be paid: $" + a.payment());
        }

    }
    public class SortbyIncome implements Comparator<IPayable> {
        public int compare(IPayable a, IPayable b){
            return  (int)(a.payment() - b.payment());
        }

    }


    public void sortPeopleByIncome(List<IPayable> payable){
        Collections.sort(payable, new SortbyIncome());
        for (IPayable a: payable){
            System.out.println(a.toString() + " should be paid $" + a.payment());
        }
    }
}
