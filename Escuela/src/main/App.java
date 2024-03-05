package main;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import clases.Estudiante;
import componentes.FormularioDocente;
import componentes.FormularioEstudiante;
import componentes.Principal;
import conexion.Operaciones;

public class App {
    
    public static void main(String[] args) {

        Principal principal = new Principal();
        FormularioEstudiante formularioEstudiante = new FormularioEstudiante();
        FormularioDocente formularioDocente = new FormularioDocente();

        JButton estudiantes = principal.getBoton1();
        JButton docentes = principal.getBoton2();

        JTextField nombreEstudiante = formularioEstudiante.getCampoNombre();
        JTextField apellidoEstudiante = formularioEstudiante.getCampoApellido();
        JTextField edadEstudiante = formularioEstudiante.getCampoEdad();
        JTextField generoEstudiante = formularioEstudiante.getCampoGenero();
        JTextField direccionEstudiante = formularioEstudiante.getCampoDireccion();
        JTextField telefonoEstudiante = formularioEstudiante.getCampoTelefono();
        JTextField correoEstudiante = formularioEstudiante.getCampoCorreo();
        JTextField campoMatriculaEstudiante = formularioEstudiante.getCampoMatricula();
        JTextField campoFacultadEstudiante = formularioEstudiante.getCampoFacultad();
        JTextField campoCarreraEstudiante = formularioEstudiante.getCampoCarrera();
        JTextField campoSemestreEstudiante = formularioEstudiante.getCampoSemestre();
        JTextField campoPromedioEstudiante = formularioEstudiante.getCampoPromedio();
        JTextField campoGrupoEstudiante = formularioEstudiante.getCampoGrupo();
        JTextArea datosEstudiante = formularioEstudiante.getDatos();
        JButton botonRegistrarEstudiante = formularioEstudiante.getBotonRegistrar();
        JButton botonCerrarEstudiante = formularioEstudiante.getBotonCerrar();

        JTextField nombreDocente = formularioDocente.getCampoNombre();
        JTextField apellidoDocente = formularioDocente.getCampoApellido();
        JTextField edadDocente = formularioDocente.getCampoEdad();
        JTextField generoDocente = formularioDocente.getCampoGenero();
        JTextField direccionDocente = formularioDocente.getCampoDireccion();
        JTextField telefonoDocente = formularioDocente.getCampoTelefono();
        JTextField correoDocente = formularioDocente.getCampoCorreo();
        JTextField campoNumeroEmpleado = formularioDocente.getCampoNumeroEmpleado();
        JTextField campoMateria = formularioDocente.getCampoMateria();
        JTextField campoHoras = formularioDocente.getCampoHoras();
        JTextField campoGradoAcademico = formularioDocente.getCampoGradoAcademico();
        JTextField campoCertificaciones = formularioDocente.getCampoCertificaciones();
        JTextField campoSalario = formularioDocente.getCampoSalario();
        JTextArea datos = formularioDocente.getDatos();
        JButton botonRegistrarDocente = formularioDocente.getBotonRegistrar();
        JButton botonCerrarDocente = formularioDocente.getBotonCerrar();
        
        SwingUtilities.invokeLater(() -> {
            
            principal.setVisible(true);

            estudiantes.addActionListener(e -> {
                
                principal.dispose();
                formularioEstudiante.setVisible(true);
                
            });

            docentes.addActionListener(e -> {
                
                principal.dispose();
                formularioDocente.setVisible(true);
                
            });

            botonCerrarEstudiante.addActionListener(e -> {
                
                formularioEstudiante.dispose();
                principal.setVisible(true);
                
            });

            botonCerrarDocente.addActionListener(e -> {
                
                formularioDocente.dispose();
                principal.setVisible(true);
                
            });

            botonRegistrarEstudiante.addActionListener(e -> {

                Estudiante estudiante = new Estudiante();

                estudiante.setNombre(nombreEstudiante.getText());
                estudiante.setApellido(apellidoEstudiante.getText());
                estudiante.setEdad(edadEstudiante.getText());
                estudiante.setGenero(generoEstudiante.getText());
                estudiante.setDireccion(direccionEstudiante.getText());
                estudiante.setTelefono(telefonoEstudiante.getText());
                estudiante.setCorreo(correoEstudiante.getText());
                estudiante.setMatricula(campoMatriculaEstudiante.getText());
                estudiante.setFacultad(campoFacultadEstudiante.getText());
                estudiante.setCarrera(campoCarreraEstudiante.getText());
                estudiante.setSemestre(campoSemestreEstudiante.getText());
                estudiante.setPromedio(campoPromedioEstudiante.getText());
                estudiante.setGrupo(campoGrupoEstudiante.getText());

                Operaciones operacion = new Operaciones();

                String[] valores = {estudiante.getNombre(), estudiante.getApellido(), estudiante.getEdad(), estudiante.getGenero(), estudiante.getDireccion(), estudiante.getTelefono(), estudiante.getCorreo(), estudiante.getMatricula(), estudiante.getFacultad(), estudiante.getCarrera(), estudiante.getSemestre(), estudiante.getPromedio(), estudiante.getGrupo()};

                operacion.insertarEstudiante(valores);

                datosEstudiante.setText("Nombre: " + estudiante.getNombre() + "\nApellido: " + estudiante.getApellido() + "\nEdad: " + estudiante.getEdad() + "\nGénero: " + estudiante.getGenero() + "\nDirección: " + estudiante.getDireccion() + "\nTeléfono: " + estudiante.getTelefono() + "\nCorreo: " + estudiante.getCorreo() + "\nMatrícula: " + estudiante.getMatricula() + "\nFacultad: " + estudiante.getFacultad() + "\nCarrera: " + estudiante.getCarrera() + "\nSemestre: " + estudiante.getSemestre() + "\nPromedio: " + estudiante.getPromedio() + "\nGrupo: " + estudiante.getGrupo());

            });

        });

    }

}