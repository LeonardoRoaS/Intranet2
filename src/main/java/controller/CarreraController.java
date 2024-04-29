package controller;

import modelo.Carrera;
import modelo.data.dao.CarreraDAO;
import modelo.data.DBConnector;
import modelo.data.DBGenerator;
import org.jooq.DSLContext;
public class CarreraController {

    public static boolean agregarCarrera(String nombreCarrera, String codigoCarrera, int nSemestres) throws ClassNotFoundException{
        DSLContext query = DBGenerator.conectarBD("Intranet");
        if(!CarreraDAO.validarExistenciaCarrera(query,"codigo",codigoCarrera)){
            Carrera carrera = new Carrera(nombreCarrera,codigoCarrera,nSemestres);
            CarreraDAO.agregarCarrera(query,carrera);
            DBConnector.closeConnection();
            return true;
        }
        else{
            return false;
        }

        public static Object[] getCodigoCarreras() throws ClassNotFoundException {
            DSLContext query = DBGenerator.conectarBD("Intranet");
            Object[] carreras = CarreraDAO.getCodigoCarreras(query);
            DBConnector.closeConnection();
            return carreras;
        }
    }
}
