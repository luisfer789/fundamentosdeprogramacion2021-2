import java.util.Scanner; 

public class unodeluis{

static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    
    
    int n=365;

    
    for(int i = 1;i <=n;i++){

      double resultado = (double)(Math.pow(3, i));
          
          
          
      System.out.println("El ahorro del dia  "+i+"  es:  "+resultado+"  soles");
    }
    System.out.println("El ahorro de un anho  es:  "+(double)(Math.pow(3, n))+"  soles");
    
  }
    
    

}