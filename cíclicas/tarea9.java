import java.util.Scanner; 

public class nine {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    float salario;
    
    //Datos de entrada
    System.out.println("Ingrese el salario inicial");
    salario=sc.nextInt();
    
    //Proceso
    if (salario>=2000){

        for(int i = 1;i <= 6;i++){

         salario+=(salario*10);

          //Datos de salida

          System.out.println("  el salario en " +i+  " año es  : "+salario);
          
        }
        System.out.println("  el salario al cabo de 6 años es "+salario);

      }
    else{
      System.out.println("el numero ingresado no es correcto");
    }
  }
    
}