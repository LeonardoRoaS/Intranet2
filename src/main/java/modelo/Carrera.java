package modelo;

public class Carrera {
    private String nombreCarrera, codigoCarrera;
    private int nSemestres;

    public Carrera(String nombreCarrera, String codigoCarrera, int nSemestres) {
        this.nombreCarrera = nombreCarrera;
        this.codigoCarrera = codigoCarrera;
        this.nSemestres = nSemestres;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getnSemestres() {
        return nSemestres;
    }

    public void setnSemestres(int nSemestres) {
        this.nSemestres = nSemestres;
    }
}
