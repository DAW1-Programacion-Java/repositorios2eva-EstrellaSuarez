package Ejercicio5;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Alumno2 alumno1= new Alumno2(25467,"Daniel","Lopez Real"
                , LocalDate.of(2002,6,1),2020,9.0,5.0);
        Alumno2 alumno4=new Alumno2(58742,"Lucia","Galea Tejada",
                LocalDate.of(2003,10,2),2023,6.0,7.14);

        System.out.println(alumno1);
        System.out.println(alumno4);
        System.out.println(alumno1.mediaNotas());
        System.out.println(alumno4.devuelveString());
    }
}


