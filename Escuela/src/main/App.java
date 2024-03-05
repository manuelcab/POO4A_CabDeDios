package main;

import javax.swing.SwingUtilities;

import componentes.FormularioEstudiante;

public class App {
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            
            FormularioEstudiante formulario = new FormularioEstudiante();
            formulario.setVisible(true);

        });

    }

}