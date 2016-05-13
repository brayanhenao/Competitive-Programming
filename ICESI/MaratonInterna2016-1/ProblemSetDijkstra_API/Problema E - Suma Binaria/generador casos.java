import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Felipe on 5/4/2016.
 */
public class GeneradorCasosSTN {

    public static void main(String[] args) throws IOException {

        Random rand = new Random();

        int numcasos = rand.nextInt(197)+4;

        for (int i = 0; i < numcasos; i++) {

            int M = rand.nextInt(100) + 1;
            int N = rand.nextInt(M) + 1;

            String bin1 = GenerarBinario(M);
            String bin2 = GenerarBinario(N);

            System.out.println(bin1);
            System.out.println(bin2);

        }

    }

    private static String GenerarBinario(int m) {

        String bin = "";

        Random rand = new Random();

        for (int i = 0; i < m; i++) {

            int r = rand.nextInt(2);

            bin += r;

        }

        return bin;

    }

}
