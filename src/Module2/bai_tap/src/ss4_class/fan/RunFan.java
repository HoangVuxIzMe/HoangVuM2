package ss4_class.fan;

public class RunFan {
    public static void main(String[] args) {
        // Đối tượng có sẵn
        BuildFan fan1 = new BuildFan(3,true,10,"Yellow");
        BuildFan fan2 = new BuildFan(2,false,5,"Blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        // Đối tượng mặc định
        BuildFan fanDefault = new BuildFan();
        System.out.println(fanDefault.toString());
    }
}
