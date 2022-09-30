package curso;

public class App {
    
    public static void main( String[] args ) {
        System.out.println( sumar(1,2) );
        System.out.println( restar(1,2) );
    }
    
    public static int sumar(int numero1, int numero2){
        return numero1+numero2;
    }
    
    public static int restar(int numero1, int numero2){
        return numero1-numero2;
    }
    
}
