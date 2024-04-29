package modelo;

public class Estudiante {
    private String nombre, rut, matricula;
    private Carrera carrera;

    public Estudiante (String nombre, String rut, String matricula, Carrera carrera){
        this.nombre = nombre;
        this.rut = rut;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getMatricula() {
        return matricula;
    }

    public Carrera getCarrera() {
        return carrera;
    }
}
