/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico;

class Alumno {
    private int codigo;
    private String nombre;
    private String apellido;
    private String genero;
    private String semestre;

    public Alumno(int codigo, String nombre, String apellido, String genero, String semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.semestre = semestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getSemestre() {
        return semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }
}
