package ArrgBidimensional;

public class P3ArrBidimensional {

    public static void main(String[] args) {
        int k = 1;
        double sumaFilas, sumaColumnas;
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}

        };

// Imprimendo la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("*********************");

        //Sumar filas
        for (int i = 0; i < calificaciones.length; i++) {
            sumaFilas = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                sumaFilas += calificaciones[i][j];
            }
            System.out.println("El promedio de cada estuduante [" +i+ "] es: " + sumaFilas / 4);

        }
        System.out.println("");

        //Suma Columnas
        for (int j = 0; j < calificaciones.length; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                sumaColumnas += calificaciones[i][j];
            }
            System.out.println("El promedio por materia [" + j + "] es :" + sumaColumnas / 3);
        }
        System.out.println("");
    }

}
