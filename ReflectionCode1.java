public class ReflectionCode1{
    public static void main(String[] args) {
        System.out.println("\n");
        
        try {
            Class <?> cls =Class.forName("java.lang.String");

            System.out.println(cls.getName());

            System.out.println("Super Class : "+cls.getSuperclass().getName());

            Class <?>[] interfa = cls.getInterfaces();
            System.out.println("Interfaces: ");

            for(Class<?> iface : interfa){
                System.out.println(" "+iface.getName());
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




        System.out.println("\n");

    }
}