package gui;
import javax.swing.*;
import java.awt.event.*;

public class VentanaBienvenida extends Ventana{

    private JLabel textoMenu;
    private JButton botonRegistrarCarrera;
    private JButton botonRegistrarEstudiante;
    private JButton botonBuscarEstudiante;
    private JButton botonSalida;

    public VentanaBienvenida(){
        super("Menu Intranet", 655, 540);
        inicializarBotonesVentana();
    }

    public void inicializarBotonesVentana(){
        generarMensajeMenu();
        generarBotonRegistrarCarrera();
        generarBotonRegistrarEstudiante();
        generarBotonBuscarEstudiante();
        generarBotonSalir();
    }

    public void generarMensajeMenu(){
        String mensajeBienvenida = "Bienvenid@ al Menu Intranet";
        super.generarJLabelEncabezado(this.textoMenu, mensajeBienvenida, 200,50,700,40);
    }

    private void generarBotonRegistrarCarrera() {
        String textoBoton = "Registrar Carrera";
        this.botonRegistrarCarrera = super.generarBoton(textoBoton, 230, 100, 175, 40);
        this.add(this.botonRegistrarCarrera);
        this.botonRegistrarCarrera.addActionListener(this);
    }

    private void generarBotonRegistrarEstudiante() {
        String textoBoton = "Registrar Estudiante";
        this.botonRegistrarEstudiante = super.generarBoton(textoBoton, 230, 180, 175, 40);
        this.add(this.botonRegistrarEstudiante);
        this.botonRegistrarEstudiante.addActionListener(this);
    }
    private void generarBotonBuscarEstudiante(){
        String textoBoton = "Buscar estudiante";
        this.botonBuscarEstudiante=super.generarBoton(textoBoton, 230, 260, 175, 40);
        this.add(this.botonBuscarEstudiante);
        this.botonBuscarEstudiante.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 230, 420, 175, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }

    // ACCIONES DE LOS BOTONES
    public void actionPerformed(ActionEvent e) {
        //ACCION BOTON REGISTRAR CARRERA
        if (e.getSource() == this.botonRegistrarCarrera) {
            VentanaRegistrarCarrera ventanaRegistrarCarrera = new VentanaRegistrarCarrera();
            //Cierra la ventana actual
            this.dispose();
        }

        //ACCION BOTON REGISTRAR ESTUDIANTE

        //ACCION BOTON BUSCAR ESTUDIANTE

        //ACCION BOTON SALIR
        if(e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }
    }
}
