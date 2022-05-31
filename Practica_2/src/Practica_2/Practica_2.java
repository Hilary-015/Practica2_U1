
package Practica_2;

import java.util.ArrayList;
import java.util.List;
import org.github.jamm.MemoryMeter;

/**
 *
 * @author Hilary Madeley Calva Camacho
 */
public class Practica_2 {    
    
    public static void main(String[] args) {
        
        MemoryMeter medir = MemoryMeter.builder().build();
        
        /**
         * String sin datos
         */
        String hc = "";
        Titulo("MEMORIA QUE OCUPA UN STRING VACIO");
        System.out.println(medir.measureDeep(hc)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * String con dato
         */
        
        hc="Perry el ornitorrinco";
        Titulo("MEMORIA QUE OCUPA UN STRING CON DATO");
        System.out.println(medir.measureDeep(hc)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo Byte vacio
         */
        
        byte bt=0;
        Titulo("MEMORIA QUE OCUPA UN BYTE VACIO");
        System.out.println(medir.measureDeep(bt)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo Byte con dato
         */
        
        bt=100;
        Titulo("MEMORIA QUE OCUPA UN BYTE CON DATO");
        System.out.println(medir.measureDeep(bt)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo char vacio
         */
        
        char ch= ' ';
        Titulo("MEMORIA QUE OCUPA UN CHAR VACIO");
        System.out.println(medir.measureDeep(ch)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo char vacio
         */
        
        ch='m';
        Titulo("MEMORIA QUE OCUPA UN CHAR CON DATO");
        System.out.println(medir.measureDeep(ch)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo short vacio
         */
        short sh=0;
        Titulo("MEMORIA QUE OCUPA UN SHORT VACIO");
        System.out.println(medir.measureDeep(sh)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo short con dato
         */
        
        sh=15902;
        Titulo("MEMORIA QUE OCUPA UN SHORT CON DATO");
        System.out.println(medir.measureDeep(sh)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo int vacio
         */
        
        int i=0;
        Titulo("MEMORIA QUE OCUPA UN INT VACIO");
        System.out.println(medir.measureDeep(i)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo int lleno
         */
        i=195222;
        Titulo("MEMORIA QUE OCUPA UN INT CON DATO");
        System.out.println(medir.measureDeep(i)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo long vacio
         */
        
        long lg=0;
        Titulo("MEMORIA QUE OCUPA UN LONG VACIO");
        System.out.println(medir.measureDeep(lg)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo long con dato
         */
        lg = 465669556;
        Titulo("MEMORIA QUE OCUPA UN LONG CON DATO");
        System.out.println(medir.measureDeep(lg)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo float vacio
         */
        
        float flt=0.0f;
        Titulo("MEMORIA QUE OCUPA UN FLOAT VACIO");
        System.out.println(medir.measureDeep(flt)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo float con dato
         */
        
        flt=9.8f;
        Titulo("MEMORIA QUE OCUPA UN FLOAT CON DATO");
        System.out.println(medir.measureDeep(flt)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo double vacio
         */
        double db=0.0;
        Titulo("MEMORIA QUE OCUPA UN DOUBLE VACIO");
        System.out.println(medir.measureDeep(db)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo double con dato
         */
        db=2.8;
        Titulo("MEMORIA QUE OCUPA UN DOUBLE CON DATO");
        System.out.println(medir.measureDeep(db)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo boolean con false
         */
        
        boolean boo= false;
        Titulo("MEMORIA QUE OCUPA UN BOOLEAN CON FALSE");
        System.out.println(medir.measureDeep(boo)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Dato primitivo boolean con true
         */
        boo=true;
        Titulo("MEMORIA QUE OCUPA UN BOOLEAN CON TRUE");
        System.out.println(medir.measureDeep(boo)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Arreglo de String vacío
         */      
//        String  [] stV = new String [4];
//        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE STRING VACIO");
//        System.out.println(medir.measureDeep(stV)+" bits");        
//        System.out.println("==============================================================");
        
        /**
         * Arreglo de String lleno
         */
        String stV [] = {"Anthony", "Kate", "Elizabeth", "Darcy"};
        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE STRING LLENO");
        System.out.println(medir.measureDeep(stV)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Arreglo de int Vacio
         */
        
//        int [] itV = new int [5];
//        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE INT VACIO");
//        System.out.println(medir.measureDeep(itV)+" bits");        
//        System.out.println("==============================================================");

        /**
        * Arreglo de int lleno
        */
        int [] itV = {16, 8, 4, 2, 0};
        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE INT LLENO");
        System.out.println(medir.measureDeep(itV)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Arreglo de double vacio
         */
        
//        double [] dbV = new double[6];
//        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE DOUBLE VACIO");
//        System.out.println(medir.measureDeep(dbV)+" bits");        
//        System.out.println("==============================================================");

        /**
         * Arreglo de double lleno
         */
        double [] dbV = {4.5, 7.5, 8.2, 1.9, 9.1, 4.2};
        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE DOUBLE LLENO");
        System.out.println(medir.measureDeep(dbV)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Arreglo de char vacío
         */
        
//        char [] chV = new char[5];
//        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE CHAR VACIO");
//        System.out.println(medir.measureDeep(chV)+" bits");        
//        System.out.println("==============================================================");

        /**
         * Arreglo de char lleno
         */
        
        char [] chV = {'b', 't', 'v', 'd', 'l'};
        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE CHAR LLENO");
        System.out.println(medir.measureDeep(chV)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Arreglo de short vacío
         */
        
//        short [] shV = new short [3];
//        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE SHORT VACIO");
//        System.out.println(medir.measureDeep(shV)+" bits");        
//        System.out.println("==============================================================");

        /**
         * Arreglo de short lleno
         */
        short [] shV = {1, 2, 3};
        Titulo("MEMORIA QUE OCUPA UN ARREGLO DE SHORT LLENO");
        System.out.println(medir.measureDeep(shV)+" bits");        
        System.out.println("==============================================================");
    
        /**
         * List vacio
         */
     
        List<String> lista = new ArrayList<>();
        Titulo("MEMORIA QUE OCUPA UN LIST VACIO");
        System.out.println("Elementos agregados: "+ lista.size());
        System.out.println(medir.measureDeep(lista)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * List lleno con 25 elementos
         */
        
        lista.add("Jane");lista.add("Nikki");lista.add("Lucy");lista.add("Josh");lista.add("Mark");lista.add("Rachel");lista.add("Daphne");
        lista.add("Simon");lista.add("Aria");lista.add("Julieth");lista.add("Madelein");lista.add("Dominique");lista.add("Collin");
        lista.add("Lourdes");lista.add("Mercedes");lista.add("Gilberth"); lista.add("Anne");lista.add("Jerry");lista.add("FitzWilliam");
        lista.add("Gregory");lista.add("Benedict");lista.add("Katherina");lista.add("Stefan");lista.add("Elena");lista.add("Scarleth");
        
        Titulo("MEMORIA QUE OCUPA UN LIST LLENO");
        System.out.println("Elementos agregados: "+ lista.size());
        System.out.println(medir.measureDeep(lista)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Lista enlazada vacia
         */
        
        ListaEnlazada<String> listaLazo = new ListaEnlazada<>();
        Titulo("MEMORIA QUE OCUPA UNA LISTA ENLAZADA VACIA");
        System.out.println("Elementos agregados: " + listaLazo.getSize());
        System.out.println(medir.measureDeep(listaLazo)+" bits");        
        System.out.println("==============================================================");
        
        /**
         * Lista enlazada llena
         */
        listaLazo.insertar("Jane");listaLazo.insertar("Nikki");listaLazo.insertar("Lucy");listaLazo.insertar("Josh");listaLazo.insertar("Mark");
        listaLazo.insertar("Rachel");listaLazo.insertar("Daphne"); listaLazo.insertar("Simon");listaLazo.insertar("Aria");listaLazo.insertar("Julieth");
        listaLazo.insertar("Madelein");listaLazo.insertar("Dominique");listaLazo.insertar("Collin"); listaLazo.insertar("Lourdes");
        listaLazo.insertar("Mercedes");listaLazo.insertar("Gilberth"); listaLazo.insertar("Anne");listaLazo.insertar("Jerry");listaLazo.insertar("FitzWilliam");
        listaLazo.insertar("Gregory");listaLazo.insertar("Benedict");listaLazo.insertar("Katherina");listaLazo.insertar("Stefan");listaLazo.insertar("Elena");
        listaLazo.insertar("Scarleth");
        
        Titulo("MEMORIA QUE OCUPA UNA LISTA ENLAZADA LLENA");
        System.out.println("Elementos agregados: " + listaLazo.getSize());
        System.out.println(medir.measureDeep(listaLazo)+" bits");        
        System.out.println("==============================================================");
    }
    
    public static void Titulo(String titulo) {
        System.out.println("==============================================================");
        System.out.println("\t" + titulo + "\t");
        System.out.println("==============================================================");
    }
    
}
