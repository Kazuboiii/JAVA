//write a java program to create class student with name,age,address,email,father's name, mother's name. contact number, assign value to class using constructor and print them//
public class Std{
    public static void main(String[]args){
        student student=new student("Sudin Bhattarai",19,"bhattaraisudin211@gmail.com","Gothatar","Yagya Prasad Bhattarai","Saraswoti Bhattarai","9861366712");
    student.display();
    }
}

class student {
    student(String name, int age, String address, String email, String fathers_name, String mothers_name,String contact_number){
        this.name=name;
        this.age=age;
        this.email=email;
        this.address=address;
        this.contact_number=contact_number;
        this.fathers_name=fathers_name;
        this.mothers_name=mothers_name;
}
String name;
int age;
String email;
String address;
String fathers_name;
String mothers_name;
String contact_number;
public void display() {
    System.out.println("Name:" + name);
    System.out.println("Age:"+age);
    System.out.println("Address:"+address);
    System.out.println("Fathers name:" +fathers_name);
    System.out.println("Mothers_name:"+mothers_name);
    System.out.println("Contact number:"+contact_number);
}
}
