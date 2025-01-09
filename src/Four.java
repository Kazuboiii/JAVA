public class Four
{
    public static void main(String[]args)
    {
        Bike bike1= new Bike();
        bike1.Name="Yamaha";
        bike1.Model="R15";
        bike1.year=2015;
        System.out.println("Bike 1:" +bike1.Name);
        System.out.println("Bike 1:" +bike1.Model);
        System.out.println("Bike 1:" +bike1.year);
    }

}
class Bike{
    String Name;
    String Model;
    int year;
}
