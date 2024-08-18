import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

 class Person {
    private String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ReflactionExample {
    public static void main(String[] args) {
        try {
            // কনস্ট্রাক্টর খুঁজে বের করে একটি নতুন Person অবজেক্ট তৈরি করা
            Constructor<?> constructor = Person.class.getConstructor(String.class, int.class);
            Person person = (Person) constructor.newInstance("Mehedi", 25);

            // Reflection API ব্যবহার করে প্রাইভেট ফিল্ড name অ্যাক্সেস করা
            Field nameField = Person.class.getDeclaredField("name");
            nameField.setAccessible(true); // প্রাইভেট ফিল্ড অ্যাক্সেসের অনুমতি দেয়া
            String nameValue = (String) nameField.get(person); // name ফিল্ডের মান পড়া

            // আউটপুট প্রদর্শন করা
            System.out.println("Created Person: " + nameValue + ", Age: " + person.age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


