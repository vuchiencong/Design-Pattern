package creationalPattern.singleton;

/**
 * DoubleCheckLockingSingleton là cải tiến của ThreadSafeSingleton
 *  Phải khai báo volatile cho instance để
 *  tránh lớp làm việc không chính xác do quá trình tối ưu hóa của trình biên dịch.
 */
public class DoubleCheckLockingSingleton {

//    private static volatile DoubleCheckLockingSingleton instance;
//
//    private DoubleCheckLockingSingleton() {
//    }
//
//    public static DoubleCheckLockingSingleton getInstance() {
//
//        if (instance == null) {
//
//            synchronized (DoubleCheckLockingSingleton.class) {
//
//                if (instance == null) {
//                    instance = new DoubleCheckLockingSingleton();
//                }
//            }
//        }
//
//        return instance;
//    }
}
