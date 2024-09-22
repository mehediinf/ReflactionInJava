import java.lang.reflect.Field;

public class FieldExample {
    public static void main(String[] args) {
        
        Person person = new Person("Mehedi", 24);

        try {
            
            Field namField = Person.class.getDeclaredField("name");
            namField.setAccessible(true);
            String name = (String) namField.get(person);
            System.out.println("Name: "+name);

            Field ageField = Person.class.getField("age");
            int age = ageField.getInt(person);
            System.out.println("Age: "+age );

        } catch (Exception e) {
            
        }


    }
}

class Person{
    private String name;
    public int age;

    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }
}
