import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class contactos {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String args[]) throws IOException {
        
        StringTokenizer tokens;
        Contact buscado;
        String name, lastName, wholeName, data;
        
        int numList = 0;
        int numContacts;
        while((numContacts = Integer.valueOf(in.readLine())) != 0) {
            
            numList ++;
            TreeMap<String, Contact> lista = new TreeMap<String, Contact>();
            
            while(numContacts > 0) {
                
                tokens = new StringTokenizer(in.readLine());
                name = tokens.nextToken();
                lastName = tokens.nextToken();
                data = tokens.nextToken();
                wholeName = lastName+" "+name;
                
                Collection contact = lista.values();
                buscado = lista.get(wholeName);
                if(buscado == null) {
                    buscado = new Contact(name, lastName);
                    lista.put(wholeName, buscado);
                }
                
                try {
                    Long.valueOf(data);
                    buscado.addPhone(data);
                } catch(NumberFormatException nfe) {
                    buscado.addEmail(data);
                }
                
                numContacts --;
            }
            
            out.write("Lista de contactos #"+numList+":\n");
            Iterator<Contact> it = lista.values().iterator();
            while(it.hasNext()) {
                it.next().print();
            }
            out.write("\n");
        }
        
        out.flush();
        in.close();
        out.close();
    }
    
    public static class Contact {
        
        private String name, lastName;
        private TreeSet<String> phones, emails;

        public Contact(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
            this.phones = new TreeSet<String>();
            this.emails = new TreeSet<String>();
        }
        
        public void addPhone(String phone) {
            this.phones.add("("+phone.substring(0, 3)+")"+phone.substring(3, 6)+"-"+phone.substring(6));
        }
        
        public void addEmail(String email) {
            this.emails.add(email);
        }
        
        public void print() throws IOException {
            out.write(name+" "+lastName+"\nTelefono:\n");
            Iterator<String> it = phones.iterator();
            while(it.hasNext()) {
                out.write(it.next()+"\n");
            }
            out.write("E-Mail:\n");
            it = emails.iterator();
            while(it.hasNext()) {
                out.write(it.next()+"\n");
            }
            out.write("###\n");
        }
        
    }
    
}
