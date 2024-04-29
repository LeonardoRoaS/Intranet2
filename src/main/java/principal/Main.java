package principal;

import gui.VentanaBienvenida;
import modelo.data.DBConnector;
import modelo.data.DBGenerator;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        DBGenerator.iniciarBD("Intranet");
        VentanaBienvenida test = new VentanaBienvenida();
    }
}
