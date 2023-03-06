import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader in;
        PrintStream out ;
        out= new PrintStream(new FileOutputStream("octal.txt"));
        System.setOut(out);
        ArrayList<Integer> decimals = new ArrayList<>();
        in = new BufferedReader(new FileReader(args[0]));
        String dec;
        while ((dec = in.readLine()) != null) {
            int decimal = Integer.parseInt(dec);
            Stack octal_stack = new Stack(decimal);
            decimals.add(decimal);
               octal_stack.calculate_octal();
            System.out.println(octal_stack.toString());
        }

    }
}
