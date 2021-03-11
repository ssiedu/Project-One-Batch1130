
import java.util.Scanner;


public class IfElseExamle {

    public static void main(String[] args) {

        //this program will take some percentage from student will print division.
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Enter Your Roll Number : ");
        int rno=sc.nextInt();
        System.out.println("Enter Your Name : ");
        String name=sc.next();
        System.out.println("Enter Your Percentage : ");
        double per=sc.nextDouble();
        
        System.out.println("Your Result : ");
        System.out.println("______________________________");
        System.out.println("Roll Number : "+rno);
        System.out.println("Stud   Name : "+name);
        System.out.println("Percentage  : "+per);
        
        
        String div="";
        
        if(per>=60){
            div="I";
        }else if(per>=45){
            div="II";
        }else if(per>=33){
            div="III";
        }else{
            div="FAIL";
        }
        System.out.println("Division    : "+div);
        System.out.println("______________________________");
    }
}
