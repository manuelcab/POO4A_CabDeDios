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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormularioEstudiante extends JFrame {

    private JButton botonRegistrar;
    private JButton botonCerrar;
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoEdad;
    private JTextField campoGenero;
    private JTextField campoDireccion;
    private JTextField campoTelefono;
    private JTextField campoCorreo;
    private JTextField campoMatricula;
    private JTextField campoFacultad;
    private JTextField campoCarrera;
    private JTextField campoSemestre;
    private JTextField campoPromedio;
    private JTextField campoGrupo;
    private JTextArea datos;

    public FormularioEstudiante() {

        configurarVentana();
        JPanel panel = crearPanel();
        this.setContentPane(panel);
        this.pack();

    }

    private void configurarVentana() {

        this.setUndecorated(true);
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));

    }

    private JPanel crearPanel() {

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

        JLabel titulo = crearTitulo("Registro de Estudiantes");
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        panel.add(titulo, constraints);

        constraints.insets = new Insets(5, 10, 5, 10);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridwidth = 1;

        JLabel nombre = crearLabel("Nombre:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(nombre, constraints);

        campoNombre = crearCampoTexto();
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(campoNombre, constraints);

        JLabel apellido = crearLabel("Apellido:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(apellido, constraints);

        campoApellido = crearCampoTexto();
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(campoApellido, constraints);

        JLabel edad = crearLabel("Edad:");
        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(edad, constraints);

        campoEdad = crearCampoTexto();
        constraints.gridx = 0;
        constraints.gridy = 6;
        panel.add(campoEdad, constraints);

        JLabel genero = crearLabel("Género:");
        constraints.gridx = 0;
        constraints.gridy = 7;
        panel.add(genero, constraints);

        campoGenero = crearCampoTexto();
        constraints.gridx = 0;
        constraints.gridy = 8;
        panel.add(campoGenero, constraints);

        JLabel direccion = crearLabel("Dirección:");
        constraints.gridx = 0;
        constraints.gridy = 9;
        panel.add(direccion, constraints);

        campoDireccion = crearCampoTexto();
        constraints.gridx = 0;
        constraints.gridy = 10;
        panel.add(campoDireccion, constraints);

        JLabel telefono = crearLabel("Teléfono:");
        constraints.gridx = 0;
        constraints.gridy = 11;
        panel.add(telefono, constraints);

        campoTelefono = crearCampoTexto();
        constraints.gridx = 0;
        constraints.gridy = 12;
        panel.add(campoTelefono, constraints);

        JLabel correo = crearLabel("Correo:");
        constraints.gridx = 0;
        constraints.gridy = 13;
        panel.add(correo, constraints);

        campoCorreo = crearCampoTexto();
        constraints.insets = new Insets(5, 10, 30, 10);
        constraints.gridx = 0;
        constraints.gridy = 14;
        panel.add(campoCorreo, constraints);

        JLabel matricula = crearLabel("Matrícula:");
        constraints.insets = new Insets(5, 10, 5, 10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(matricula, constraints);

        campoMatricula = crearCampoTexto();
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(campoMatricula, constraints);

        JLabel facultad = crearLabel("Facultad:");
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(facultad, constraints);

        campoFacultad = crearCampoTexto();
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(campoFacultad, constraints);

        JLabel carrera = crearLabel("Carrera:");
        constraints.gridx = 1;
        constraints.gridy = 5;
        panel.add(carrera, constraints);
        
        campoCarrera = crearCampoTexto();
        constraints.gridx = 1;
        constraints.gridy = 6;
        panel.add(campoCarrera, constraints);

        JLabel semestre = crearLabel("Semestre:");
        constraints.gridx = 1;
        constraints.gridy = 7;
        panel.add(semestre, constraints);

        campoSemestre = crearCampoTexto();
        constraints.gridx = 1;
        constraints.gridy = 8;
        panel.add(campoSemestre, constraints);

        JLabel promedio = crearLabel("Promedio:");
        constraints.gridx = 1;
        constraints.gridy = 9;
        panel.add(promedio, constraints);

        campoPromedio = crearCampoTexto();
        constraints.gridx = 1;
        constraints.gridy = 10;
        panel.add(campoPromedio, constraints);

        JLabel grupo = crearLabel("Grupo:");
        constraints.gridx = 1;
        constraints.gridy = 11;
        panel.add(grupo, constraints);

        campoGrupo = crearCampoTexto();
        constraints.gridx = 1;
        constraints.gridy = 12;
        panel.add(campoGrupo, constraints);

        datos = crearTextArea();
        constraints.insets = new Insets(5, 10, 30, 10);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridheight = 13;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(datos, constraints);
        
        constraints.insets = new Insets(5, 10, 30, 10);

        botonRegistrar = crearBoton("Registrar");
        constraints.gridx = 1;
        constraints.gridy = 13;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.NONE;
        panel.add(botonRegistrar, constraints);

        botonCerrar = crearBotonCerrar();
        constraints.insets = new Insets(10, 1, 1, 10);
        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTHEAST;
        panel.add(botonCerrar, constraints);

        return panel;

    }

    private JLabel crearTitulo(String texto) {

        JLabel etiqueta = new JLabel(texto);
        etiqueta.setFont(new Font("Poppins", Font.PLAIN, 14));
        etiqueta.setForeground(new Color(0, 173, 181));
        etiqueta.setFont(etiqueta.getFont().deriveFont(35f));
        etiqueta.setPreferredSize(new Dimension(420, 40));

        return etiqueta;

    }

    private JLabel crearLabel(String texto) {

        JLabel etiqueta = new JLabel(texto);
        etiqueta.setFont(new Font("Poppins", Font.PLAIN, 18));
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setPreferredSize(new Dimension(150, 20));

        return etiqueta;

    }

    private JTextField crearCampoTexto() {

        JTextField campo = new JTextField() {

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
                Insets insets = getInsets();
                g2.drawString(getText(), insets.left, getHeight() / 2 + getFont().getSize() / 2 - insets.bottom);
            }

            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(getForeground());
                g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
        };

        campo.setFont(new Font("Poppins", Font.PLAIN, 18));
        campo.setPreferredSize(new Dimension(300, 30));
        campo.setOpaque(true);
        campo.setBackground(new Color(197, 197, 197));
        campo.setEditable(true);
        campo.setCaretColor(Color.WHITE);;

        return campo;

    }

    private JTextArea crearTextArea(){

        JTextArea area = new JTextArea() {

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
                Insets insets = getInsets();
                g2.drawString(getText(), insets.left, getHeight() / 2 + getFont().getSize() / 2 - insets.bottom);
            }

            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(getForeground());
                g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
        };

        area.setFont(new Font("Poppins", Font.PLAIN, 18));
        area.setPreferredSize(new Dimension(200, 30));
        area.setOpaque(true);
        area.setBackground(new Color(197, 197, 197));

        return area;

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

    private JButton crearBotonCerrar(){

        JButton boton = new JButton("X"){

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
                Rectangle stringBounds = fontMetrics.getStringBounds("X", g2).getBounds();
                int textX = (getWidth() - stringBounds.width) / 2;
                int textY = (getHeight() - stringBounds.height) / 2 + fontMetrics.getAscent();
                g2.drawString("X", textX, textY);
            }

            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(getForeground());
                g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
        };

        boton.setFont(new Font("Poppins", Font.PLAIN, 18));
        boton.setPreferredSize(new Dimension(35, 30));
        boton.setBackground(new Color(231, 29, 54));
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(true);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(new Color(217, 4, 41));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBackground(new Color(231, 29, 54));
            }
        });

        return boton;

    }

    public JButton getBotonRegistrar() {
        return botonRegistrar;
    }

    public JButton getBotonCerrar() {
        return botonCerrar;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JTextField getCampoApellido() {
        return campoApellido;
    }

    public JTextField getCampoEdad() {
        return campoEdad;
    }

    public JTextField getCampoGenero() {
        return campoGenero;
    }

    public JTextField getCampoDireccion() {
        return campoDireccion;
    }

    public JTextField getCampoTelefono() {
        return campoTelefono;
    }

    public JTextField getCampoCorreo() {
        return campoCorreo;
    }

    public JTextField getCampoMatricula() {
        return campoMatricula;
    }

    public JTextField getCampoFacultad() {
        return campoFacultad;
    }

    public JTextField getCampoCarrera() {
        return campoCarrera;
    }

    public JTextField getCampoSemestre() {
        return campoSemestre;
    }

    public JTextField getCampoPromedio() {
        return campoPromedio;
    }

    public JTextField getCampoGrupo() {
        return campoGrupo;
    }

    public JTextArea getDatos() {
        return datos;
    }

    public void setDatos(JTextArea datos) {
        this.datos = datos;
    }

}