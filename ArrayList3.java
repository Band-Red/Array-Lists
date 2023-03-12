import java.util.ArrayList;
public class ArrayList3{
    public static void main(String[] args){
        ArrayList <String> list =new ArrayList<String>();
        list.add("Ali");
        list.add("Imad");
        list.add("Slah");
        list.add("Mona");
        System.out.println("Ttaversing list through for loop: ");
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}