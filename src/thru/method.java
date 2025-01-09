package thru;

public class method {
    public static void main(String[]args){
        StudentByFefVa.college="texas";
        System.out.println(StudentByFefVa.college);
        StudentByFefVa studentByFefVa = new StudentByFefVa();
        studentByFefVa.address="Kathmandu";
        studentByFefVa.name="Ashish";
        System.out.println(studentByFefVa.name);
        System.out.println(studentByFefVa.address);
    }
}

class StudentByFefVa{

    String name;
    String address;
    static String college;
}
