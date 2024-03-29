public class Persona {
    private String nombre;
    private double altura;
    private int edad;
    private String genero;

    public Persona(){}
    public Persona(String nombre, double altura, int edad, String genero) {
        this.setNombre(nombre);
        this.setAltura(altura);
        this.setEdad(edad);
        this.setGenero(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
