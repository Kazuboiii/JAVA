package thru;

public class baam {
    public static void main(String[]args){
        Perimeter perimeter=new Perimeter(4,2,3);
        perimeter.display();
    }
}
class Perimeter{
    Perimeter(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    int length;
    int breadth;
    int height;
    public void display(){
        int result= calculatePerimeter();
        int Result= calculatevolume();
        System.out.println("The perimeter is:"+result);
        System.out.println("The volume is:"+Result);
    }
    public int calculatePerimeter(){
        return  4 * (length+breadth+height);
    }
    public int calculatevolume(){
        return (length+breadth+height);
    }   

}
