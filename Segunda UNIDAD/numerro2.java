import  java.util.Scanner ;
public  class  Numeros {
    public  static  void  main ( String [] args ) {
        int i, suma =  0 , n;
        Escáner sc =  nuevo  escáner ( System . In);
        Sistema . fuera . println ( " Introduce un número: " );
        n = sc . nextInt ();
        for (i =  1 ; i < n; i ++ ) {   // i son los divisores. Se divide desde 1 hasta n-1                            
            si (n % i ==  0 ) {
                suma = suma + i;   // si es divisor se suma
            }
        }
        if (suma == n) {            // si el numero es igual a la suma de sus divisores es perfecto                
            Sistema . fuera . println ( " Perfecto " );
        } más {
          Sistema . fuera . println ( " No es perfecto " );
          

        }
    }
}