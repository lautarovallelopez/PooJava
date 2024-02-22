package poo.u3;

public class Futbolista {
    private String nombre;
    private int numero;
    private Posicion pos;
    public Futbolista(String nombre, int numero, Posicion pos) {
        this.setNombre(nombre);
        this.setNumero(numero);
        this.setPos(pos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }
}
