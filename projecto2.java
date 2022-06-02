public class projecto2 {

    public static void main(String[] args) {

        var numero = -1;
        System.out.println("este es el numero elegido:" + numero);
        if (numero < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es positivo");
        }

        while (numero < 3) {
            numero++;
            System.out.println(numero);
        }

        if (numero != 3) {//para que no se ejecute dos veces
            do {
                numero++;
                System.out.println(numero);
            } while (numero < 3);
        }
        var numeroFor = 0;
        for (int i=0; i<=3; i++){System.out.println("numeroFor es "+ numeroFor++);}

    var estacion="asd";
        switch (estacion){
            case "verano": {System.out.println("es verano");
                                break;}
            case "otoño":{System.out.println("es otoño");
                break;}
            case "invierno":{System.out.println("es invierno");
                break;}
            case "primavera": {System.out.println("es primavera");
                break;}
            default:System.out.println("no es una estacion");}


        }


    }




    /* Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:

        Incrementar el valor de la variable en uno cada vez que se ejecute.

        Mostrarlo por pantalla cada vez que se ejecute.

        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un  para cuando el valor de la variable no sea una estación.*/