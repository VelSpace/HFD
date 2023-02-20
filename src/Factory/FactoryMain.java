package Factory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory obj = new OperatingSystemFactory();
        obj.getOS("Android");
    }
}
