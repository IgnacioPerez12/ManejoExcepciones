package test;

public class Test {
    
    public static void main(String[] args) {
        
        int res = 0;
        
        try {
            res = 10/0;
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("\nNo se puede divir entre " + res);
        }
        
    }
    
}
