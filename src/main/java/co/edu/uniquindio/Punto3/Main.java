package co.edu.uniquindio.Punto3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

//Dado el siguiente código escribir que imprime la ejecución del programa
//
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.*;
//public class Main {
//
//	public static void main(String[] args) {
//		Set set = new LinkedHashSet();
//		set.add(new String("Chicago"));
//		set.add(new String("Boston"));
//		set.add(new String("Alabama"));
//		set.add(new String("Chicago"));
//		System.out.println(set);
//	}
//}

public class Main {

    public static void main(String[] args) {
        Set set = new LinkedHashSet();//al ser linked el orden de los elementos será el orden en el que se insertan
        set.add(new String("Chicago"));//Se agrega normal
        set.add(new String("Boston"));//Se agrega
        set.add(new String("Alabama"));//Se agrega
        set.add(new String("Chicago"));//No se agrega ya que al ser un set no admite duplicados
        System.out.println(set);// debe ser Chicago Boston y Alabama
    }
}
