import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prashant
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Theatre_Square solver = new Theatre_Square();
        solver.solve(1, in, out);
        out.close();
    }

    static class Theatre_Square {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            double n = in.nextDouble();
            double m = in.nextDouble();
            double a = in.nextDouble();


            long number_of_tiles_m = (long) Math.ceil(m / a);


            long number_of_tiles_n = (long) Math.ceil(n / a);


            out.print(number_of_tiles_m * number_of_tiles_n);
        }

    }
}

