package creationalPattern.singleton;

/**
 * ThreadSafeSingleton là cải tiến của LazyInitialization
 *
 * Cách đơn giản nhất là chúng ta gọi phương thức synchronized của hàm getInstance()
 * như vậy hệ thống đảm bảo rằng tại cùng một thời điểm chỉ có thể có 1 luồng có thể truy cập vào hàm getInstance()
 * đảm bảo rằng chỉ có duy nhất 1 thể hiện của class.
 *
 * chạy rất chậm và tốn hiệu năng, bất kỳ Thread nào gọi đến đều phải chờ nếu có một Thread khác đang sử dụng
 */
public class ThreadSafeSingleton {

//    private static volatile ThreadSafeLazyInitializedSingleton instance;
//
//    private ThreadSafeLazyInitializedSingleton() {
//    }
//
//    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
//        if (instance == null) {
//            instance = new ThreadSafeLazyInitializedSingleton();
//        }
//        return instance;
//    }
}
