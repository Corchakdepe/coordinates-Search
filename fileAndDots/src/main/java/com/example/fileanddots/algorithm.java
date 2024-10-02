package com.example.fileanddots;

import static java.lang.Math.sqrt;

public class algorithm {


    public static double distanciaxy(Punto a, Punto b)
    {
        double d = sqrt(Math.pow((b.getX()-a.getY()),2)+Math.pow(b.getY()-a.getY(),2));
        return d;
    };


    public static  Punto[] exaustivo(Punto[] t, int i,int d)
    {

        Punto[] sol = new Punto[2];
        sol[0] = t[i];  // First point
        sol[1] = t[i + 1];  // Second point

        // Initialize the minimum distance as the distance between the first two points
        double dmin = distanciaxy(sol[0], sol[1]);

        // Iterate over each pair of points
        for (int a = i; a <= d; a++) {
            for (int b = a + 1; b <= d; b++) {  // Start from a + 1 to avoid comparing the same point
                // Calculate the distance between t[a] and t[b]
                double dis = distanciaxy(t[a], t[b]);
                // Update the minimum distance and the solution points if a closer pair is found
                if (dis < dmin) {
                    dmin = dis;
                    sol[0] = t[a];
                    sol[1] = t[b];
                }
            }
        }

        // Return the closest pair of points
        return sol;
    }

    public static Punto[] exaustivoPoda(Punto[] t, int i, int d)
    {
        //distancia minima (p1,p2)
        //todos tienen que estar ordenados en el eje (x o y);

        Punto[] sol = new Punto[2];
        return sol;
    }

    public static Punto[] DivAndConquest(Punto[] t, int i, int d)
    {
        //Separar en Izquierda Derecha igual que con poda, se basa en distancia en el Eje X y luego decir cual
        //entre Izq y Der es mas pequeno

        Punto[] sol = new Punto[2];
        return sol;
    }

}
