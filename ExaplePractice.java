import java.lang.reflect.Field;

public class ExaplePractice {
    public static void main(String[] args) {

        Animale animale = new Animale("Meo", 2);
        try {
            
            Field fieldName = Animale.class.getDeclaredField("name");
            fieldName.setAccessible(true);
            String name = (String) fieldName.get(animale);


            Field fieldAge = Animale.class.getField("age");
            int age = fieldAge.getInt(animale);
            

            System.out.println("Name: "+name+" Age: "+age);
        
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

        
        
    }

    
}

class Animale{

    private String name;
    public int age;

    Animale(String name,int age){
        this.name=name;
        this.age=age;
    }

}


