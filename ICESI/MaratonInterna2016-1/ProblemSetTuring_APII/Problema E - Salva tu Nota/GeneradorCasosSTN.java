import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Felipe on 5/4/2016.
 */
public class GeneradorCasosSTN {

    public static void main(String[] args) throws IOException {

        Random rnd = new Random();

        int numCasos = rnd.nextInt(200) + 1;

        for (int i = 0; i < numCasos; i++) {

            int longExt = rnd.nextInt(17) + 4;

            String sExtendida = GenerarExtendida(longExt);

            ArrayList<Integer> indicesMayusculas = GenerarIndices(sExtendida);

            String clave = "";

            for (int j = 0; j < indicesMayusculas.size(); j++) {
                clave += indicesMayusculas.get(j) + " ";
            }

            if (indicesMayusculas.size() >= 3){

                int numPruebas = (rnd.nextInt( (int) Math.pow(2, indicesMayusculas.size()) - 3 ) + 2)/2;

                int numPruebasReal = 0;

                String pruebas = "";

                for (int j = 0; j < numPruebas; j++) {

                    int indice = rnd.nextInt( (int) Math.pow(2, indicesMayusculas.size()) - 2 );

                    int si = (int) Math.round(Math.random());

                    if (si == 1){
                        pruebas += indice + "\n";
                        numPruebasReal++;
                    }

                }

                if (numPruebasReal > 0){
                    String caso = sExtendida + "," + clave.trim() + "," + numPruebasReal + "\n";
                    System.out.println(caso + pruebas.trim());
                }

            }

        }

    }

    private static ArrayList<Integer> GenerarIndices(String sExtendida) {

        ArrayList<Integer> indices = new ArrayList<Integer>();

        for (int i = 0; i < sExtendida.length(); i++) {

            char c = sExtendida.charAt(i);

            if (Character.isUpperCase(c)){
                indices.add(i);
            }

        }

        return indices;

    }

    public static String GenerarExtendida(int longExt){

        String ext = "";

        for (int i = 0; i < longExt; i++) {

            int mayuscula = (int) Math.round(Math.random());

            if (mayuscula == 0){
                ext += "z";
            }
            else {
                ext += "A";
            }

        }

        return ext;

    }

}
