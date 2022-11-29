import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      FileReader fileReader = new FileReader("text.txt");
      Scanner scanner = new Scanner(fileReader);
      while (scanner.hasNextLine()){
          System.out.println(scanner.nextLine());
      }


    }public static void writer() throws IOException {
        try(FileWriter fileWriter = new FileWriter("text.txt")){
            fileWriter.write("""
                Qq Ww Ee Rr Tt Yy Uu Ii Oo Pp
                Aa Ss Dd Ff Gg Hh Jj Kk Ll
                Zz Xx Cc Vv Bb Nn Mm
                1 2 3 4 5 6 7 8 9 10
                11 12 13 14 15 16 17
                18 19 20 21 22 23 24
                25 26 27
                """);
        }
    }
}