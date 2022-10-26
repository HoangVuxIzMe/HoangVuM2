package ss16_java_io.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void WriteFile(List<National> nationals, String filename) {
        BufferedWriter buffered = null;
        try {
            buffered = new BufferedWriter(new FileWriter(filename));
            for (National national : nationals) {
                buffered.write(national.getInfor());
                buffered.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buffered != null) {
                try {
                    buffered.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeFileOptimize(List<National> nationals, String filename) {
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
            for (National national : nationals) {
                buffered.write(national.getInfor());
                buffered.newLine();
            }
//            buffered.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<National> readFile(String filename) {
        List<National> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new National(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
