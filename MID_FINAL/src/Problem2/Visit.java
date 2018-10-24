package Problem2;

import java.util.Date;

public class Visit {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;
    public Visit(Customer _customer , String _date){
        customer = _customer;
        date = _date;
    }
    public Customer getCustomer(){
        return customer;
    }
    public  double getServiceExpense(){
        DiscountRate dr = new DiscountRate();
        return  serviceExpense - serviceExpense * dr.getServiceDiscountRate(customer.getMemberType()) ;
    }
    public void setServiceExpense(double ex){
        serviceExpense = ex;
    }
    public double getProductExpense(){
        DiscountRate dr = new DiscountRate();
        return productExpense - productExpense * dr.getProductDiscountRate(customer.getMemberType());
    }
    public void  setProductExpense(double ex){
        productExpense = ex;
    }
    public double getTotalExpense(){
        return getProductExpense() + getServiceExpense();
    }
    public String toString(){
        return "Customer: " + customer.getName() + " TotalExpense: " +getTotalExpense();
    }
}
