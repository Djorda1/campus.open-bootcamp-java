public class projecto3 {
   static class persona {
        private int edad;
        private String nombre;
        private String telefono;

            public void setEdad(int edad){this.edad=edad;}
            public void setNombre(String nombre){this.nombre=nombre;}
            public void setTelefono(String telefono){this.telefono=telefono;}
            public int getEdad(){return this.edad;}
            public String getNombre(){return this.nombre;}
            public String getTelefono(){return this.telefono;}

        }

    public static void main(String[] args) {

        persona persona1 = new persona();
        persona1.setNombre("carlos");
        persona1.setEdad(11);
        persona1.setTelefono("12345");
        System.out.println( "nombre: "+ persona1.getNombre()+" edad: "+persona1.getEdad()+" telefono "+persona1.getTelefono());


    }
}
