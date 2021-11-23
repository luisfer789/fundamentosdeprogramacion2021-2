import  java.util.Scanner ;

public  class automovilinpust {

  public  static  void  main ( String [] args ) {
    Escáner en =  nuevo  escáner ( Sistema . En);
     doble descuento, monto_de_pago, monto_del_descuento, precio_del_producto;
     String nombre_del_producto;
     String tecla_repetir;
     hacer {
       Sistema . fuera . print ( " Ingresa la categoria del vehiculo: " );
        nombre_del_producto = en . línea siguiente();
        Sistema . fuera . print ( " Ingresa la cantidad de impuesto: " );
        descuento = in . nextDouble ();
        en . línea siguiente();
        Sistema . fuera . print ( " Ingresa el valor del vehiculo: " );
          precio_del_producto = en . nextDouble ();
          en . línea siguiente();
          en . línea siguiente();
          monto_del_descuento = descuento * precio_del_producto / 100 ;
          monto_de_pago = precio_del_producto - monto_del_descuento;
          Sistema . fuera . println ( " categoria del vehiculo: "  + nombre_del_producto);
          Sistema . fuera . println ( " Valor de monto de pago: "  + monto_de_pago);
          Sistema . fuera . println ( " Valor de monto del descuento: "  + monto_del_descuento);
          Sistema . fuera . println ();
          hacer {
            Sistema . fuera . print ( " \ u 00BFDeseas repetir el proceso? (S / N): " );
             tecla_repetir = en . línea siguiente();
            } while ( ! tecla_repetir . equalsIgnoreCase ( " s " ) &&  ! tecla_repetir . equalsIgnoreCase ( " n " ));
        } while (tecla_repetir . equalsIgnoreCase ( " s " ));
    }

}