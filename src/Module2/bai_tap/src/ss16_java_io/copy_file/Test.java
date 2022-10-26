package ss16_java_io.copy_file;

public class Test{
    public static void main(String[] args) throws Exception{
        CopyFile.copyFiles("copyfile.txt","tstcp.txt");
        CopyFile.countCharacter("copyfile.txt");
    }
}
