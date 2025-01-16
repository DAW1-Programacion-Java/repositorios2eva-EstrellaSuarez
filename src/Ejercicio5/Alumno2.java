package Ejercicio5;

import java.time.LocalDate;

public class Alumno2 {
    private int numeroexpediente;
    private String nombre;
    private String apellidos;
    private LocalDate fechanacimiento;
    private int curso;
    private double notas1;
    private double notas2;
    // metodo constructor//
    public Alumno2(int numeroexpediente,String nombre,String apellidos,
                   LocalDate fechanacimiento,int curso,double notas1,double notas2){
        this.numeroexpediente= numeroexpediente;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechanacimiento= fechanacimiento;
        this.curso=curso;
        this.notas1=notas1;
        this.notas2=notas2;
    }

//metodo set y get se utilizan cuando los atributos son privados para leer y editar//

    public int getNumeroexpediente(){          //leer
        return numeroexpediente;
    }

    public void setNumeroexpediente(int numeroexpediente) {
        this.numeroexpediente = numeroexpediente;     //editar
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public double getNotas1() {
        return notas1;
    }

    public void setNotas1(double notas1) {
        this.notas1 = notas1;
    }

    public double getNotas2() {
        return notas2;
    }

    public void setNotas2(double notas2) {
        this.notas2 = notas2;
    }
    public double mediaNotas(){
        return (notas1 + notas2) / 2;
    }
    public String devuelveString(){
        return " numero expediente " + numeroexpediente + " nota" + notas1 + " nota" + notas2
                + " nombre" + nombre;
    }

    //metodo toString para ver todas las caracteristicas//

    @Override
    public String toString() {
        return "Alumno2{" +
                "numeroexpediente=" + numeroexpediente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechanacimiento=" + fechanacimiento +
                ", curso=" + curso +
                ", notas1=" + notas1 +
                ", notas2=" + notas2 +
                '}';
    }
}




