package singleton;

public class EasySingleton {

    private static final EasySingleton instance = new EasySingleton();

    private EasySingleton() {

    }

    public static EasySingleton getInstance() {
        return instance;
    }
}
