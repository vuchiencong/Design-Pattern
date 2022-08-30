package creationalPattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Phá vỡ cấu trúc Singleton Pattern bằng Reflection
 *
 */
public class SingletonPatternReflection {

//    public static void main(String[] args)
//            throws InstantiationException, IllegalAccessException, InvocationTargetException {
//
//        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton instanceTwo = null;
//
//        Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : constructors) {
//            constructor.setAccessible(true);
//            instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
//        }
//
//        System.out.println(instanceOne.hashCode());
//        System.out.println(instanceTwo.hashCode());
//    }
}
