package singleton;

public class LazySingleton {
    private LazySingleton() { }

    private static class SingletonHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
