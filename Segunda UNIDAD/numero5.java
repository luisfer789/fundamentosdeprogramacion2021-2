class  recursi {
    estático  int [] vec = { 312 , 614 , 88 , 22 , 54 };

    anular  ordenar ( int [] v , int  cant ) {
        si (no puedo >  1 ) {
            para ( int f =  0 ; f < cant -  1 ; f ++ )
                si (v [f] > v [f +  1 ]) {
                    int aux = v [f];
                    v [f] = v [f +  1 ];
                    v [f +  1 ] = aux;
                }
            ordenar (v, cant -  1 );
        }
    }

    void  imprimir () {
        para ( int f =  0 ; f < vec . longitud; f ++ )
            Sistema . fuera . imprimir (vec [f] +  "   " );
        Sistema . fuera . println ( " \ n " );
    }


    public  static  void  main ( String [] ar ) {
        Recursivdad r =  new  Recursivdad ();
        r . imprimir ();
        r . ordenar (vec, vec . longitud);
        r . imprimir ();
    }
}