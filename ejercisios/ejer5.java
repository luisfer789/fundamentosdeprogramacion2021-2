import java.util.Scanner;

public class ejer5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bono, puntos, salario_minimo;
        System.out.print("Ingresa el valor de puntos: ");
        puntos = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de salario minimo: ");
        salario_minimo = in.nextDouble();
        in.nextLine();
        bono=0;
        if(puntos>=100 && puntos<=150)
            bono=salario_minimo*0.10;
        if(puntos>=151 && puntos<=200)
            bono=salario_minimo*0.40;
        if(puntos>=201 && puntos<=250)
            bono=salario_minimo*0.70;
        System.out.println("Valor de bono: " + bono);
    }

}