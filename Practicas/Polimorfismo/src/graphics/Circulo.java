package graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends FiguraGrafica{

    protected int x;
    protected int y;
    protected int radio;

    public Circulo(int x, int y, int radio){
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        g.fillOval(x - radio, y - radio, radio * 2, radio * 2);
    }

    @Override
    public void encojer(Graphics g) {
        radio -= 5;
        if (radio < 5) radio = 5;
        this.dibujar(g);
    }

    @Override
    public void agrandar(Graphics g) {
        radio += 5;
        if (radio > 200) radio = 200;
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
