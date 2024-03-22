package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * Esta clase necesita de tu ayuda!
 */
public class Rectangulo extends FiguraGrafica {

    protected int x;
    protected int y;
    protected int lado1;
    protected int lado2;

    public Rectangulo(int x, int y, int lado1, int lado2){
        this.x = x;
        this.y = y;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public void dibujar(Graphics g) {
        g.fillRect(x, y, lado1, lado2);
    }

    @Override
    public void encojer(Graphics g) {
        lado1 -= 5;
        lado2 -= 5;
        if (lado1 < 5) lado1 = 5;
        if (lado2 < 8) lado2 = 8;
        this.dibujar(g);
    }

    @Override
    public void agrandar(Graphics g) {
        lado1 += 5;
        lado2 += 5;
        if (lado1 > 180) lado1 = 180;
        if (lado2 > 288) lado2 = 288;
        this.dibujar(g);
    }

    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }

    @Override
    public void mover(Graphics g, String direccion) {
        switch(direccion){
            case "arriba"    : y-=5; break;
            case "abajo"     : y+=5; break;
            case "izquierda" : x-=5; break;
            case "derecha"   : x+=5; break;
        }
        this.dibujar(g);
    }
    
}
