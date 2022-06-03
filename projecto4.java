import javax.print.DocFlavor;

public class projecto4 {
    /*Crea una clase Persona con las siguientes variables:
    La edad
    El nombre
    El teléfon
    Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
    esta nueva clase tendrá la variable credito solo para esa clase.
    Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
    el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
    Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
    y con una variable salario que solo tenga la clase Trabajador.
*/
    class persona {
        private int edad;
        private String nombre;
        private String telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getEdad() {
            return this.edad;
        }

        public String getNombre() {
            return this.nombre;
        }

        public String getTelefono() {
            return this.telefono;
        }

    }

    class cliente extends persona {
        private int credito;

        public void setCredito(int credito) {
            this.credito = credito;
        }

        public int getCredito() {
            return this.credito;
        }
    }

    class trabajador extends persona {
        private int salario;

        public void setSalario(int salario) {
            this.salario = salario;
        }

        public int getSalario() {
            return this.salario;
        }

    }

    public void main(String[] args) {
        cliente cliente1 = new cliente();
        trabajador trabajador1 = new trabajador();
        cliente1.setEdad(25);
        cliente1.setNombre("carlos");
        cliente1.setTelefono("12345");
        cliente1.setCredito(1000);
        System.out.println("nombre: " + cliente1.getNombre() + " edad: " + cliente1.getEdad() + " telefono " + cliente1.getTelefono() + " Credito " + cliente1.getCredito());
        trabajador1.setNombre("juan");
        trabajador1.setEdad(26);
        trabajador1.setTelefono("1234");
        trabajador1.setSalario(2000);
        System.out.println(" nombre: " + trabajador1.getNombre() + " edad: " + trabajador1.getEdad() + " telefono " + trabajador1.getTelefono() + " Credito " + trabajador1.getSalario());

    }
}
