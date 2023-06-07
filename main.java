/*
// Encapsulación
public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

// Herencia
public class Empleado extends Persona {
    private String empresa;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

// Polimorfismo
public class Main {
    public static void main(String[] args) {
        Persona persona = new Empleado();
        persona.setNombre("Juan");
        persona.setEdad(30);

        Empleado empleado = (Empleado) persona;
        empleado.setEmpresa("ABC Corp");
    }
}

// Abstracción
public interface Vehiculo {
    void acelerar();
    void frenar();
}

public class Coche implements */

// Abstracción: definimos una clase abstracta "Animal" que representa el concepto general de un animal
abstract class Animal {
    // Encapsulamiento: ocultamos los detalles internos del objeto (nombre) y proporcionamos una interfaz pública para interactuar con él (getNombre)
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Abstracción: definimos un método abstracto "hacerSonido" que representa el comportamiento común de hacer un sonido
    public abstract void hacerSonido();
}

// Herencia: la clase "Perro" hereda las propiedades y métodos de la clase "Animal"
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    // Polimorfismo: sobrescribimos el método "hacerSonido" para proporcionar una implementación específica para la clase "Perro"
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

// Herencia: la clase "Gato" hereda las propiedades y métodos de la clase "Animal"
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    // Polimorfismo: sobrescribimos el método "hacerSonido" para proporcionar una implementación específica para la clase "Gato"
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }
}

public class Ejemplo {
    public static void main(String[] args) {
        // Polimorfismo: podemos tratar a los objetos "perro" y "gato" como si fueran del tipo "Animal"
        Animal perro = new Perro("Firulais");
        Animal gato = new Gato("Misifu");

        perro.hacerSonido(); // Guau guau
        gato.hacerSonido(); // Miau miau
    }
}
