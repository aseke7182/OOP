package Problem3;

class Person implements Cloneable{
    private String name;

    public Person() {
    }

    public Person(String var1) {
        this.name = var1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String toString() {
        return "name: " + this.name;
    }

    public boolean equals(Object var1) {
        Person var2 = (Person)var1;
        return this.name.equals(var2.getName());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
