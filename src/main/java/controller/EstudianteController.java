package controller;

import modelo.Carrera;
import modelo.Estudiante;
import modelo.data.dao.CarreraDAO;
import modelo.data.DBConnector;
import modelo.data.DBGenerator;
import modelo.data.dao.EstudianteDAO;
import org.jooq.DSLContext;

public class EstudianteController {
    public static boolean registrarEstudiante(String nombre, String rut, String matricula, String codigoCarrera) throws ClassNotFoundException{
        DSLContext query = DBGenerator.conectarBD("Intranet");
        if(!EstudianteDAO.validarExistenciaEstudiante(query,"rut",rut)){
            Carrera carrera =CarreraDAO.buscarCarrera(query,codigoCarrera);
            Estudiante estudiante= new Estudiante(rut,nombre,matricula,carrera);
            EstudianteDAO.agregarEstudiante(query,estudiante);
            DBConnector.closeConnection();
            return true;
        }
        else{
            DBConnector.closeConnection();
            return false;
        }
    }

    public static String[][] mostrarEstudiantesPorCarrera(String codigo) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Intranet");
        String[][] datosEstudiantes= EstudianteDAO.obtenerEstudiantesCursoCodigo(query,codigo);
        DBConnector.closeConnection();
        return datosEstudiantes;
    }

    public static String[][] mostrarEstudiantesPorNombre(String codigo, String nombre) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Intranet");
        String[][] datosEstudiantes = EstudianteDAO.obtenerEstudiantesCursoNombre(query,nombre,codigo);
        DBConnector.closeConnection();
        return datosEstudiantes;
    }


}
