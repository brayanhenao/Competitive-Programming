import java.io.*;
import java.math.BigInteger;

/**
 * Created by Felipe on 5/10/2016.
 */
public class binarios {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String linea = "";

        while ((linea = in.readLine()) != null) {

            String bin1 = linea;
            String bin2 = in.readLine();

            //System.out.println(bin1);
            //System.out.println(bin2);

            //BigInteger bi1 = new BigInteger(bin1, 2);
            //BigInteger bi2 = new BigInteger(bin2, 2);

            //System.out.println(bi1.toString());
            //System.out.println(bi2.toString());

            char[] suma = new char[bin1.length() + 1];

            for (int i = 0; i < suma.length; i++) {
                suma[i] = '0';
            }

            int i = bin1.length()-1;
            int j = bin2.length()-1;

            int k = suma.length - 1;

            boolean carry = false;

            while(j >= 0){

                char b1 = bin1.charAt(i);
                char b2 = bin2.charAt(j);

                if (carry){

                    if (b1 == '0' && b2 == '0'){
                        suma[k] = '1';
                        carry = false;
                    }
                    else if ((b1 == '0' && b2 == '1') || (b1 == '1' && b2 == '0')){
                        suma[k] = '0';
                    }
                    else{
                        suma[k] = '1';
                    }

                }
                else{

                    if (b1 == '0' && b2 == '0'){
                        suma[k] = '0';
                    }
                    else if ((b1 == '0' && b2 == '1') || (b1 == '1' && b2 == '0')){
                        suma[k] = '1';
                    }
                    else{
                        suma[k] = '0';
                        carry = true;
                    }

                }

                i--;
                j--;
                k--;

            }

            for (int l = i; l >= 0; l--) {

                char cb1 = bin1.charAt(l);

                if (carry){

                    if(cb1 == '0'){
                        suma[k] = '1';
                        carry = false;
                    }
                    else{
                        suma[k] = '0';
                    }

                }
                else{
                    suma[k] = cb1;
                }

                k--;

            }

            StringBuilder sb = new StringBuilder();
            sb.append(suma);

            if(carry){
                sb.setCharAt(0, '1');
            }
            else{
                sb.deleteCharAt(0);
            }

            //BigInteger bi = new BigInteger(sb.toString(), 2);
            //System.out.println(bi.toString());

            //if (bi1.add(bi2).subtract(bi).intValue() == 0){
            //    System.out.println("True");
            //}
            //else{
            //    System.out.println("False");
            //}

            System.out.println(sb.toString());
            //System.out.println("___________");

        }

	System.out.println("");

        out.flush();
        out.close();
        in.close();

    }


}