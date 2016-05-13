import java.io.*;
import java.util.*;

public class stn {

    static ArrayList<String[]> combinaciones = new ArrayList<String[]>();

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String linea = "";

        while ((linea = in.readLine()) != null){

            String[] partes = linea.split(",");

            String expandida = partes[0];
            String[] codigo = partes[1].split(" ");
            int pruebas = Integer.parseInt(partes[2]);

            combinaciones = new ArrayList<String[]>();

            for (int i = 1; i <= codigo.length; i++) {
                AgregarCombinaciones(codigo, i, 0, new String[i]);
            }

            for (int i = 0; i < pruebas; i++) {

                linea = in.readLine();
                int N = Integer.parseInt(linea);

                String[] combinacion = combinaciones.get(N);

                StringBuilder sbFinal = new StringBuilder(expandida);

                for (int j = 0; j < combinacion.length; j++) {

                    String s = combinacion[j].trim();

                    int n = Integer.parseInt(s+"");

                    sbFinal.deleteCharAt(n-j);

                }

                System.out.println(sbFinal.toString());

            }

        }

        out.flush();
        out.close();
        in.close();

    }

    static void AgregarCombinaciones(String[] palabra, int tamano, int posicionInicial, String[] resultado){
        if (tamano == 0){

            StringBuilder sb = new StringBuilder(Arrays.toString(resultado));
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(0);

            combinaciones.add(sb.toString().split(","));
            return;

        }
        for (int i = posicionInicial; i <= palabra.length-tamano; i++){
            resultado[resultado.length - tamano] = palabra[i];
            AgregarCombinaciones(palabra, tamano-1, i+1, resultado);
        }
    }

}
