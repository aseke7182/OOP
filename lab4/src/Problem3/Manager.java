package Problem3;

import java.util.ArrayList;
import java.util.Date;

class Manager extends Employee implements Comparable {
    private ArrayList<Employee> team = new ArrayList();
    private int bonus = 0;

    public Manager() {
    }

    public Manager(String var1) {
        super(var1);
    }

    public Manager(String var1, ArrayList<Employee> var2) {
        super(var1);
        this.team = var2;
    }

    public Manager(String var1, double var2, Date var4, String var5, ArrayList<Employee> var6) {
        super(var1, var2, var4, var5);
        this.team = var6;
    }

    public ArrayList<Employee> getTeam() {
        return this.team;
    }

    public void setTeam(ArrayList<Employee> var1) {
        this.team = var1;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void addEmployee(Employee var1) {
        this.team.add(var1);
    }

    public void addBonus(int var1) {
        this.bonus += var1;
    }

    public String toString() {
        String var1 = "Team: [";

        for(int var2 = 0; var2 < this.team.size(); ++var2) {
            var1 = var1 + ((Employee)this.team.get(var2)).getName();
            if (var2 == this.team.size() - 1) {
                break;
            }

            var1 = var1 + ", ";
        }

        var1 = var1 + "], ";
        String var4 = "Bonus: " + String.valueOf(this.bonus);
        String var3 = super.toString();
        return var1 + " " + var4 + " " + var3;
    }

    public boolean equals(Object var1) {
        Manager var2 = (Manager)var1;
        boolean var3 = this.team.equals(var2.getTeam());
        boolean var4 = this.bonus == var2.bonus;
        return var3 & var4 & super.equals(var2);
    }

    @Override
    public int compareTo(Object o) {
        Manager m = (Manager) o ;
        if( getSalary() > m.getSalary()) return 1;
        if( getSalary() < m.getSalary()) return  -1;
        if( getBonus() > m.getBonus()) return 1;
        if(getBonus() < m .getBonus()) return -1;
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
