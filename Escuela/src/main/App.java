package main;

import javax.swing.SwingUtilities;

import componentes.FormularioDocente;

public class App {
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            
            FormularioDocente formulario = new FormularioDocente();
            formulario.setVisible(true);

        });

    }

}