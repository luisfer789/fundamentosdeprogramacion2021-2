import java.util.Scanner;

public class ejer4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int año_actual, año_de_nacimiento, dia_actual, dia_de_nacimiento, edad;
        int mes_actual, mes_de_nacimiento;
        System.out.print("Ingresa el valor de año actual: ");
        año_actual = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de año de nacimiento: ");
        año_de_nacimiento = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de dia actual: ");
        dia_actual = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de dia de nacimiento: ");
        dia_de_nacimiento = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de mes actual: ");
        mes_actual = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de mes de nacimiento: ");
        mes_de_nacimiento = in.nextInt();
        in.nextLine();
        edad=año_actual-año_de_nacimiento;
        if(mes_de_nacimiento>mes_actual||(mes_de_nacimiento==mes_actual&&dia_de_nacimiento>dia_actual))
            edad=edad-1;
        System.out.println("Valor de edad: " + edad);
    }

}