package Problem3;
import java.util.Date;
class Employee extends Person implements Comparable{
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee() {
    }

    public Employee(String var1) {
        super(var1);
    }

    public Employee(String var1, double var2, Date var4, String var5) {
        super(var1);
        this.salary = var2;
        this.hireDate = var4;
        this.insuranceNumber = var5;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double var1) {
        this.salary = var1;
    }

    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public void setInsuranceNumber(String var1) {
        this.insuranceNumber = var1;
    }

    public Date getYear() {
        return this.hireDate;
    }

    public void setYear(Date var1) {
        this.hireDate = var1;
    }

    public String toString() {
        String var1 = super.toString();
        String var2 = "salary: " + String.valueOf(this.salary);
        String var3 = "insurance number: " + this.insuranceNumber;
        String var4 = "hire Date : " + this.hireDate;
        return var1 + ", " + var2 + ", " + var3 + ", " + var4;
    }

    public boolean equals(Object var1) {
        Employee var2 = (Employee)var1;
        boolean var3 = this.insuranceNumber.equals(var2.getInsuranceNumber());
        boolean var4 = this.salary == var2.getSalary();
        boolean var5 = this.hireDate == var2.getYear();
        return var3 && var4 && var5 && super.equals(var2);
    }

    @Override
    public int compareTo(Object o) {
        Employee one = (Employee) o;
        if( salary > one.salary) return 1;
        if( salary < one.salary) return -1;
        return 0;
    }
}
