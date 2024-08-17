import java.lang.reflect.Method;

public class ReflectionDemo {
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {



        try {
            // ক্লাস অবজেক্ট পেতে
            Class<?> cls = Class.forName("ReflectionDemo");
            
            // অবজেক্ট তৈরি করতে
            Object obj = cls.getDeclaredConstructor().newInstance();
            
            // মেথড পেতে
            Method method = cls.getMethod("sayHello");
            
            // মেথড চালাতে
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
