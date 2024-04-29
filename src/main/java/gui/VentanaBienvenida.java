package gui;
import javax.swing.*;
public class VentanaBienvenida extends Ventana{

    private JLabel textoMenu;
    private JButton botonRegistrarEstudiante;
    private JButton botonBuscarEstudiante;
    private JButton botonRegistrarCarrera;
    private JButton botonSalida;

    public VentanaBienvenida(){
        super("Menu Intranet", 760, 700);
        inicializarBotonesVentana();
    }

    public void inicializarBotonesVentana(){
        generarMensajeMenu();
        generarBotonRegistrarCarrera();
        //generarBotonRegistrarEstudiante();
        //generarBotonBuscarEstudiante();
        //generarBotonSalir();
    }

    public void generarMensajeMenu(){
        String mensajeBienvenida = "Bienvenid@ al Menu Intranet";
        super.generarJLabelEncabezado(this.textoMenu, mensajeBienvenida, 20,20,700,40);
    }

    private void generarBotonRegistrarCarrera() {
        String textoBoton = "Registrar Carrera";
        this.botonRegistrarCarrera = super.generarBoton(textoBoton, 150, 100, 175, 40);
        this.add(this.botonRegistrarCarrera);
        this.botonRegistrarCarrera.addActionListener(this);
    }


}
