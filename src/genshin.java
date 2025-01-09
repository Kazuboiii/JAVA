public class genshin {
    public static void main(String[]args){
        character character=new character("Kazuha","Inazuma","Anemo","Sword");
        character.display();
    }
}
class character{
    character(String name, String location, String vision,String weapon_type){
        this.name=name;
        this.location=location;
        this. vision=vision;
        this.weapon_type=weapon_type;
    }
    String name;
    String location;
    String vision;
    String weapon_type;
    public void display(){
        System.out.println("Name:" +name);
        System.out.println("Location:"+location);
        System.out.println("Vision:"+vision);
        System.out.println("Weapon Type:"+weapon_type);
    }
}
