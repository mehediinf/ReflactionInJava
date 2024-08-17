import java.lang.reflect.Method;

public class ReflectionCode1 {
    public static void main(String[] args){
        

        
        try {
            Class<?> cls = Class.forName("Animal");
            Object obj = cls.getDeclaredConstructor().newInstance();

            Method method = cls.getMethod("makeSound");
    
            method.invoke(obj);
        
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       
        
    }
}

class Animal {
    public void makeSound(){
        System.out.println("Animal is a Sounds ....");
    }
}
