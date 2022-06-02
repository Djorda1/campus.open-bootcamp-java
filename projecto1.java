public class projecto1 {
    static class coche {
        int puertas=4;

        public void agregarPuertas(){this.puertas++;}


        public static void main(String[]args){
            var resultado= suma(1,2,3);
            coche miCoche= new coche();
            miCoche.agregarPuertas();
            System.out.println(miCoche.puertas);
        }
        public static int suma(int aNum, int bNum, int cNum){return aNum+bNum+cNum;}


    }




}
