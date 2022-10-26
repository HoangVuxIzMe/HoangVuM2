package ss16_java_io.read_file;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<National> nationals = new ArrayList<>();

        nationals.add(new National(1,"AU","Australia"));
        nationals.add(new National(2,"CN","China"));
        nationals.add(new National(3,"AU","Australia"));
        nationals.add(new National(4,"CN","China"));

        ReadFile.writeFileOptimize(nationals, "nationals.csv");

        List<National> nationalList = ReadFile.readFile("nationals.csv");
        nationalList.forEach(System.out::println);
    }
}
