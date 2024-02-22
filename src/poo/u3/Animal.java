package poo.u3;

public class Animal {
    private String raza;
    private String nombre;

    public boolean equals(Animal animal) {
        return this.raza.equals(animal.raza) && this.nombre.equals(animal.nombre);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
