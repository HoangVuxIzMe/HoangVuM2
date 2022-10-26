package ss16_java_io.read_file;

public class National {
    private int id;
    private String code;
    private String name;

    public National() {
    }

    public National(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public National(String str) {
        String[] data = str.split(",");
        this.id = Integer.parseInt(data[0]);
        this.code = data[1];
        this.name = data[2];
    }

    @Override
    public String toString() {
        return "National = " +
                "Id: " + id +
                ", Code: " + code +
                ", Name: " + name +
                '.';
    }

    public String getInfor() {
        return this.id + ", " + this.code + ", " + this.name + ".";
    }
}
