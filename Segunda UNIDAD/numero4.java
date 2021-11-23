import  java.util.Scanner ;
 
public class  tablaMultiplicar {
{
    public  static  void  main ( String [] ARGS )
    {
        Scanner obtenerNumero =  nuevo  Scanner ( System . In );
        int numero, i, j;
 
        Sistema . fuera . print ( " indica la tabla de multiplicar: " );
        numero = obtenerNumero . nextInt ();
 
        para (i =  1 ; i <= numero; i ++ )
        {
            para (j =  1 ; j <=  20 ; j ++ )
            {
                Sistema . fuera . println (i +  " X "  + j +  " = "  + i * j);
            }
            Sistema . fuera . println ();
        }
    }
}
}