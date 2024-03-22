package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 *         ¡Esta clase necesita tu ayuda!
 */
public class Triangulo extends FiguraGrafica {

    private int[] x = { 50, 15, 85 };
    private int[] y = { 15, 65, 65 };

    public Triangulo (int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar(Graphics g) {
        g.fillPolygon(x, y, 3);
    }

    @Override
    public void encojer(Graphics g) {
        x[1] += 5;
        y[1] -= 5;
        x[2] -= 5;
        y[2] -= 5;
        this.dibujar(g);
    }

    @Override
    public void agrandar(Graphics g) {
        x[1] -= 5;
        y[1] += 5;
        x[2] += 5;
        y[2] += 5;
        this.dibujar(g);
    }

    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }

    @Override
    public void mover(Graphics g, String direccion) {
        switch (direccion) {
            case "arriba":
                y[0] -= 5;
                y[1] -= 5;
                y[2] -= 5;
                break;
            case "abajo":
                y[0] += 5;
                y[1] += 5;
                y[2] += 5;
                break;
            case "izquierda":
                x[0] -= 5;
                x[1] -= 5;
                x[2] -= 5;
                break;
            case "derecha":
                x[0] += 5;
                x[1] += 5;
                x[2] += 5;
                break;
        }
        this.dibujar(g);
    }

}
