public class Dogs {
    public static void main(String[]args)
    {
        Dog dog1=new Dog();


        dog1.name="Bulldog";
        Dog dog2= new Dog();
        dog2.name="Poodle";

        System.out.println("Dog 1:"+dog1.name);
        System.out.println("Dog 2:"+dog2.name);

    }
}
class Dog{
    String name;
    //int age;
    //  String breed;
    // String color;
    // String size;
}
