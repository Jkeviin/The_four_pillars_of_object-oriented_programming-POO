Los cuatro pilares de la programación orientada a objetos en Java son: encapsulación, herencia, polimorfismo y abstracción.

1. Encapsulación: La encapsulación es un mecanismo para ocultar los detalles internos de una clase y proporcionar una interfaz para interactuar con ella. Consiste en el uso de modificadores de acceso (como public, private, protected) para controlar el acceso a los miembros de una clase (variables y métodos). La encapsulación ayuda a lograr la seguridad de datos y permite la reutilización de código a través de la ocultación de la implementación interna de una clase.

2. Herencia: La herencia es un mecanismo mediante el cual una clase adquiere las propiedades (variables y métodos) de otra clase. La clase que hereda se conoce como subclase o clase derivada, y la clase de la cual se hereda se conoce como superclase o clase base. La herencia permite la reutilización de código y la creación de jerarquías de clases, donde las subclases pueden heredar comportamiento y características de sus superclases. Las subclases también pueden agregar nuevos miembros o modificar los miembros heredados.

3. Polimorfismo: El polimorfismo es la capacidad de un objeto para tomar muchas formas. En Java, esto se logra mediante el uso de herencia y interfaces. El polimorfismo permite tratar a los objetos de las subclases como objetos de la clase base, lo que facilita la escritura de código más flexible y genérico. Por ejemplo, si una superclase define un método, las subclases pueden proporcionar su propia implementación de ese método. Durante la ejecución, se invocará el método apropiado según el tipo real del objeto.

4. Abstracción: La abstracción es el proceso de identificar las características esenciales de un objeto y definirlas en una clase. Permite enfocarse en los aspectos relevantes de un objeto y ocultar los detalles innecesarios. En Java, esto se logra mediante la creación de clases y el uso de interfaces. La abstracción ayuda a manejar la complejidad al dividir un programa en partes más pequeñas y definir claramente cómo interactúan entre sí.

Aquí tienes un ejemplo de código que muestra la implementación de los cuatro pilares de la programación orientada a objetos en Java:

```java
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

public class Coche implements