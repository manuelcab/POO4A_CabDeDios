package componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal extends JFrame{

    private JButton boton1;
    private JButton boton2;
    
    public Principal() {
        
        configurarVentana();
        JPanel panel = crearPanel();
        this.setContentPane(panel);
        this.pack();


    }

    private void configurarVentana() {

        this.setUndecorated(true);
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));

    }

    private JButton crearBoton(String texto) {

        JButton boton = new JButton(texto) {

            @Override
            protected void paintComponent(Graphics g) {

                if (!(g instanceof Graphics2D)) {
                    super.paintComponent(g);
                    return;
                }

                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

                g2.setColor(getForeground());
                g2.setFont(getFont());
                FontMetrics fontMetrics = g2.getFontMetrics();
                Rectangle stringBounds = fontMetrics.getStringBounds(texto, g2).getBounds();
                int textX = (getWidth() - stringBounds.width) / 2;
                int textY = (getHeight() - stringBounds.height) / 2 + fontMetrics.getAscent();
                g2.drawString(texto, textX, textY);
            }

            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(getForeground());
                g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
        };

        boton.setFont(new Font("Poppins", Font.PLAIN, 18));
        boton.setPreferredSize(new Dimension(300, 50));
        boton.setBackground(new Color(172, 125, 210));
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(true);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(new Color(141, 77, 193));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBackground(new Color(172, 125, 210));
            }
        });

        return boton;

    }

    private JLabel crearLabel(String texto) {

        JLabel etiqueta = new JLabel(texto);
        etiqueta.setFont(new Font("Poppins", Font.PLAIN, 24));
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setPreferredSize(new Dimension(300, 20));

        return etiqueta;

    }

    private JLabel crearTitulo(String texto) {

        JLabel etiqueta = new JLabel(texto);
        etiqueta.setFont(new Font("Poppins", Font.PLAIN, 14));
        etiqueta.setForeground(new Color(0, 173, 181));
        etiqueta.setFont(etiqueta.getFont().deriveFont(35f));
        etiqueta.setPreferredSize(new Dimension(420, 40));

        return etiqueta;

    }

    private JPanel crearPanel(){

        JPanel panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2d.setColor(getBackground());
                    g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
                }
            }
        };

        panel.setOpaque(false);
        panel.setBackground(new Color(34, 40, 49));
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(20, 250, 20, 10);

        JLabel titulo = crearTitulo("BIEVENIDO");
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        panel.add(titulo, constraints);

        constraints.insets = new Insets(5, 55, 20, 10);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridwidth = 1;

        JLabel texto = crearLabel("Seleccione una opción");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 3;
        panel.add(texto, constraints);
        
        constraints.insets = new Insets(10, 10, 20, 10);

        boton1 = crearBoton("Estudiantes");
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(boton1, constraints);

        boton2 = crearBoton("Docentes");
        constraints.anchor = GridBagConstraints.EAST;
        constraints.gridx = 2;
        constraints.gridy = 2;
        panel.add(boton2, constraints);

        return panel;
    }

    public JButton getBoton1() {
        return boton1;
    }

    public JButton getBoton2() {
        return boton2;
    }
}
