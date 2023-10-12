package singleton;
public class SingleTon {
    private static volatile SingleTon instance;

    private SingleTon() {
        // Private constructor to prevent direct instantiation
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
