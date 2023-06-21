import java.io.*;
import java.util.*;

public class Main {
  public static String fp = "./cycle0Practice.txt";
  public static String rdf(String filePath, int lineNumber) {
    String line = null;

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      for (int i = 1; i <= lineNumber; i++) {
        line = reader.readLine();
        if (line == null) {
          break;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return line;
  }
  public static void main(String[] args) {
    int cycle = Integer.parseInt(rdf(fp, 1));
    int pkgs = Integer.parseInt(rdf(fp, 2));
    System.out.println(pkgs);
  }
}

