package FastIO;

import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.PrintWriter;

public class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }

    public void printLine(Object... objects) {
        print(objects);
        writer.println();
    }

    public void printLine(long i) {
        writer.println(i);
    }

    public void printLine(int i) {
        writer.println(i);
    }

    public void printLine(double i) {
        writer.println(i);
    }

    public void printLine(String s){
        writer.println(s);
    }

    public void printLine(char c){
        writer.println(c);
    }
    public void close() {
        writer.close();
    }

}