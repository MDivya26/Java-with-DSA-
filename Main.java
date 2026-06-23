import java.util.*;
class Main{
     public static void main(String []args){
            Encap e=new Encap();
            e.setName("Divya");
            System.out.println(e.getName());
      }
}
class Encap{
    private String name;
    void setName(String s){
           name=s;
}
    String getName(){
        return name;
    }
}
 