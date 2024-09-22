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


public class Constructor_Object {
    public static void main(String[] args) {
        try {
            // কনস্ট্রাক্টর খুঁজে বের করে একটি নতুন Person অবজেক্ট তৈরি করা
            /*
             * * Person.class.getDeclaredConstructor(String.class, int.class) লাইনটি ব্যবহার করে Person ক্লাসের কনস্ট্রাক্টর খুঁজে বের করা হয়, যা String এবং
                int টাইপের আর্গুমেন্ট নেয়।
            **  constructor.newInstance("Mehedi", 24) লাইনটি ব্যবহার করে কনস্ট্রাক্টরের মাধ্যমে একটি নতুন Person অবজেক্ট তৈরি করা হয়। এখানে "Mehedi" name এবং 
                24 age হিসাবে পাস করা হয়েছে।
             */

            Constructor<?> constructor = Person.class.getDeclaredConstructor(String.class,int.class);
            Person person = (Person) constructor.newInstance("Mehedi",24);

            //.......................................................................................................
            //Person person = new Person("Mehedi", 25); //sudo ai line babohar kore o constructor declear kora jai
            //...............................................................................................................

            // Reflection API ব্যবহার করে প্রাইভেট ফিল্ড name অ্যাক্সেস করা :
            /*
             * * Person.class.getDeclaredField("name") লাইনটি ব্যবহার করে Person ক্লাসের প্রাইভেট ফিল্ড name খুঁজে বের করা হয়।
             * nameField.setAccessible(true) লাইনটি ব্যবহার করে প্রাইভেট ফিল্ডটি অ্যাক্সেসযোগ্য করা হয়, কারণ ডিফল্টভাবে প্রাইভেট ফিল্ড সরাসরি অ্যাক্সেসযোগ্য নয়।
             * String nameValue = (String) nameField.get(person) লাইনটি ব্যবহার করে person অবজেক্ট থেকে name ফিল্ডের মান পাওয়া যায়।
             */
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


