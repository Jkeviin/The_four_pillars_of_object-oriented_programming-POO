Los cuatro pilares de la programación orientada a objetos en Java son: abstracción, encapsulamiento, herencia y polimorfismo.

- **Abstracción** se refiere a la capacidad de definir conceptos generales y esenciales que representan las características y comportamientos comunes de un conjunto de objetos.
- **Encapsulamiento** es el proceso de ocultar los detalles internos de un objeto y proporcionar una interfaz pública para interactuar con él.
- **Herencia** permite que una clase adquiera las propiedades y métodos de otra clase, lo que facilita la reutilización de código y la organización del mismo.
- **Polimorfismo** permite que un objeto pueda ser tratado como si fuera de diferentes tipos, lo que permite una mayor flexibilidad en el diseño y la implementación del código.

Aquí hay un ejemplo de código que muestra cómo se pueden implementar estos cuatro pilares en Java:

```java
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
```
