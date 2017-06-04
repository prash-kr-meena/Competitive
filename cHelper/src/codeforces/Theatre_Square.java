package codeforces;

import java.util.Scanner;
import java.io.PrintWriter;

public class Theatre_Square {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        double n = in.nextDouble();
        double m = in.nextDouble();
        double a = in.nextDouble();


        long number_of_tiles_m = (long) Math.ceil(m / a);


        long number_of_tiles_n = (long) Math.ceil(n / a);


        out.print(number_of_tiles_m * number_of_tiles_n);
    }
}
