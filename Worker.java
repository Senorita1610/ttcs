import java.text.DecimalFormat;
public class Worker extends Person{
    double bSalary;
    double rate;

    public Worker() {
    }
    public Worker(String name){
        super(name);
    }
    public Worker(String name,double bSalary,double rate){
        super(name);
        this.bSalary=bSalary;
    }
    public Worker(double bSalary,double rate){
        
    }
    public void display(){
        System.out.println("-------------------------------------");
        System.out.println("Name = "+name);
        DecimalFormat df=new DecimalFormat("#.000");
        System.out.println("Salary = "+df.format(getSalary()));
    }
    public double getSalary(){
        return (double)bSalary*rate;
    }
    public Worker input(){
        String name;
        double salaryBasic,rate;
        Worker wk=new Worker();
        System.out.print("Enter name: ");
        name=Validation.checkInputString();
        System.out.print("Enter salary basic: ");
        salaryBasic=;
        System.out.print("Enter rate: ");
        rate=Validation.checkInputDouble();
        wk=new Worker(name,salaryBasic,rate);
        return;
    }
}
