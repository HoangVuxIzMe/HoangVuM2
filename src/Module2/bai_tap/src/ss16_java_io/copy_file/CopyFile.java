package ss16_java_io.copy_file;

import java.io.*;

public class CopyFile {
    public static void copyFiles(String filePath, String fileTargetName) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter buffered = new BufferedWriter(new FileWriter(fileTargetName))) {
            File sourceFile = new File(filePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffered.write(reader.readLine());
                buffered.newLine();
                reader.readLine();
            }
            buffered.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void countCharacter(String sourcePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
        int count = 0;
        while (reader.read() != -1) {
            count++;
        }
        System.out.println(count);
    }
}
