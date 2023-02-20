import java.util.Scanner;
public class PersonDriver {
    public static void main(String[] args) {
        Worker[] wkArray=new Worker[20];
        Scanner sc=new Scanner(System.in);
        int tc=Integer.parseInt(sc.nextLine());
        sc.close();
        Worker wktemp=new Worker();
        for(int i=0;i<tc;i++){
            wkArray[i]=wktemp.input();
        }
        for(int i=0;i<tc;i++){
            wkArray[i].display();
        }
        wktemp.bSalary;
        wktemp.bSalary;
    }
}
