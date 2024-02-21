/*
* Dado el siguiente diagrama de clases, crear la clase Persona en Java. Declarar sus atributos. Crear el
método constructor por defecto y otro constructor que reciba como parámetros todos los valores
correspondientes a todos los atributos de la clase. Crear también todos los getters y setters.
*Escriba el código para declarar una variable pública y estática llamada CONT en la clase Contador
* */
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setGenero("m");
        System.out.println(persona.getGenero());
        Contador cont1 = new Contador();
        Contador cont2 = new Contador();
        Contador cont3 = new Contador();
        Contador cont4 = new Contador();
        System.out.println(Contador.CONT);
    }
}