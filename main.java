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
