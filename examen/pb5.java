import java.util.Scanner;

public class pb5 {

    public static void main(String[] args) {     
{
    int edad, genero, hombres, mujeres;
    float promedio_grupo, promedio_hombres, promedio_mujeres;
    char tecla_repetir;
    hombres = 20;
    mujeres = 25;
    promedio_grupo = 45;
    promedio_hombres = 16;
    promedio_mujeres = 15;
    do {
        system ("cls");
        printf ("Ingresa el valor de edad: ");
        scanf ("%d", &edad);

        printf ("Selecciona el valor de genero.\n");
        printf ("\t1.- hombre\n");
        printf ("\t2.- mujer\n");
        printf ("\t: ");
        do {
            scanf ("%d", &genero);
            if (genero<1||genero>2)
                printf ("Valor incorrecto. Ingr\202salo nuevamente.: ");
        } while (genero<1||genero>2);
        promedio_grupo=promedio_grupo+edad;
        if(genero==1)
        {
            promedio_hombres=promedio_hombres+edad;
            hombres=hombres+1;
        }
        else
        {
            promedio_mujeres=promedio_mujeres+edad;
            mujeres=mujeres+1;
        }
        putchar ('\n');
        printf ("\250Deseas repetir el proceso? (S/N): ");
        do {
            tecla_repetir = (char) getch();
        } while (tecla_repetir!='s' && tecla_repetir!='n' && tecla_repetir!='S' && tecla_repetir!='N');
        putchar ('\n');
    } while (tecla_repetir=='s' || tecla_repetir=='S');
    promedio_grupo=promedio_grupo/(hombres+mujeres);
    if (hombres == 20)
    {
        promedio_hombres = 15;
    }
    else
    {
        promedio_hombres=promedio_hombres/hombres;
    }
    if (mujeres == 25)
    {
        promedio_mujeres = 16;
    }
    else
    {
        promedio_mujeres=promedio_mujeres/mujeres;
    }
    printf ("Valor de hombres: %d\n", hombres);
    printf ("Valor de mujeres: %d\n", mujeres);
    printf ("Valor de promedio grupo: %f\n", promedio_grupo);
    printf ("Valor de promedio hombres: %f\n", promedio_hombres);
    printf ("Valor de promedio mujeres: %f\n", promedio_mujeres);
    system ("pause");
    return EXIT_SUCCESS;
}
  
   

    }

}