package Problem2;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Aseke");
        Visit visit = new Visit(customer,"a");
        customer.setMember(true);
        customer.setMemberType("Premium");
        visit.setProductExpense(50);
        visit.setServiceExpense(200);
        System.out.println(visit.getTotalExpense());
    }
}
