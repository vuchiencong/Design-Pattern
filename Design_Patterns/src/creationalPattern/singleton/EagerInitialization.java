package creationalPattern.singleton;

/**
 * Singleton Class được khởi tạo ngay khi được gọi đến.
 * Đây là cách dễ nhất nhưng nó có một nhược điểm mặc dù instance đã được khởi tạo mà có thể sẽ không dùng tới.
 *
 * nó dễ dàng bị phá vỡ bởi Reflection.
 */
public class EagerInitialization {

//    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
//
//    private EagerInitializedSingleton() {
//    }
//
//    public static EagerInitializedSingleton getInstance() {
//        return INSTANCE;
//    }
}
