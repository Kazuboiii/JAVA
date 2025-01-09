package thru;

public class Student {
    public static void main(String[]args){
        Std std=new Std();
        std.setName("Kazuha");
        std.setAddress("Kathmandu");
        std.setRoll_num("1");
        System.out.println("Name:"+std.getName());
        System.out.println("Address:"+ std.getAddress());
        System.out.println("Roll no:"+ std.getRoll_num());

    }
}
class Std{
    private String name;
    private String address;
    private String roll_num;

    String getName() {
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }
    String getRoll_num(){
        return roll_num;
    }
    void setRoll_num(String roll_num){
        this.roll_num=roll_num;
    }
}
