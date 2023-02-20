public abstract class Person {
    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    public String toString(){
        return;
    }
    public abstract void display();
    public abstract double getSalary();
}
