import java.util.Scanner; 

public class cunco {

static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    
    //Definir variables
    int k;

    //Datos de entrada
    System.out.println("Ingrese un numero entero positivo");
    k=sc.nextInt();
    
    //Proceso
    if (k>0){

        for(int i = 2;i <= 24;i++){

          //Datos de salida

          System.out.println(k+"  por  " +i+  "  es igual a: "+k*i);
        }

    }
    
    else{
      System.out.println("El numero ingresado no es correcto"+"\nintentalo nuevamente");

    }

    }

}