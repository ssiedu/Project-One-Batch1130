
import java.util.Scanner;


public class SwitchCaseExampleOne {

    public static void main(String[] args) {

        //here we will take day-no as input 1,2,3 will show dayname 1-Monday,2-Tue,3-Web...
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Day Number : ");
        int day=sc.nextInt();
        String dname="";
        switch(day){
            case 1:
                dname="Mon";
            break;
            case 2:
                dname="Tue";
            break;
            case 3:
                dname="Wed";
            break;
            case 4:
                dname="Thu";
            break;
             case 5:
                dname="Fri";
            break;
            case 6:
                dname="Sat";
            break;
             case 7:
                dname="Sun";
            break;
            default:
                dname="Invalid-Day";
            break;
        }
        
        System.out.println("Day Name : "+dname);
        
        
        
    }
}
