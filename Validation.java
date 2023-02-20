import java.util.ArrayList;
import java.util.Scanner;
public class Validation {
    private final static Scanner in=new Scanner(System.in);
    public static String checkInputString(){
        while(true){
            String result=in.nextLine().trim();
            if(result.isEmpty()){
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            }else{
                return result;
            }
        }
    }
    public static double checkInputDouble(){
        double result=Double.parseDouble(in.nextLine());
        return result;
    }
}
