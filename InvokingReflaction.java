
import java.lang.reflect.Method;

public class InvokingReflaction {
    public static void main(String[] args) {

        

        try {
            Sample sample = new Sample();
            Method method = Sample.class.getMethod("printMessage", String.class);

            method.invoke(sample, "Hello, Reflection");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

 class Sample {
    public void printMessage(String message){
        System.out.println("Message: "+message);
    }

    
}
