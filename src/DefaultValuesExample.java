
public class DefaultValuesExample {

    static int v1;
    static double v2;
    static boolean v3;
    static String v4;
    
    void show(){
        int v5=0;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
    
    public static void main(String[] args) {
        System.out.println("Default-Values");
        
        DefaultValuesExample ob=new DefaultValuesExample();
        ob.show();
        
        
    }
}
