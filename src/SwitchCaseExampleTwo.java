
import java.util.Scanner;


public class SwitchCaseExampleTwo {

    public static void main(String[] args) {

        //to show the capital of a state, user will input state name
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter State Name : ");
        String state=sc.next();
        System.out.println("STATE NAME : "+state);
        String capital="";
        
        //MP->Bhopal, MH->Mumbai, RJ->Jaipur
        
        switch(state){
            case "MP":
            case "mp":
                capital="Bhopal";
            break;
            case "MH":
            case "mh":
                capital="Mumbai";
            break;
            case "RJ":
            case "rj":
                capital="Jaipur";
            break;
            default:
                capital="State-Not-Defined";
            break;
        }
        
        System.out.println("CAP   NAME : "+capital);
        
        
        
        
        
        
        
    }
}
