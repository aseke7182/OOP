class Animal{
    private int age;
    public Animal(){
        age = 0;
    }
    public Animal( int b){
        age = b;
    }
    public String AnimalAge(){
        return "Animal age: " + age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age1) {
        age = age1;
    }
}

class  Cat extends Animal{
    private  String name;
    public Cat(){
        super();
        name = "";
    }
    public Cat(String name, int b){
        super( b );
        this.name = name;
    }
    public String AnimalAge(){
        int age = getAge();
        return "CatAge: " + age + "CatName: " + name;
    }
    public String AnimalAge(int future){
        int age = getAge();
        age += future;
        return "New CatAge: " + age;
    }
    public String getName(){
        return name;
    }
    public void setName(String NewName){
        name = NewName;
    }
}

public class one{
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal animal1 = new Animal(5);
        Animal cat = new Cat();
        String s = "Washington";
        Cat cat1 = new Cat(s,7);
        System.out.println(animal1.AnimalAge());
        System.out.println(cat1.AnimalAge());
        System.out.println(cat1.AnimalAge(3));
    }
}