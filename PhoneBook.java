import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private  HashMap<String , String> contact = new HashMap<String , String>();

    public void addName(String name , String contact){
            this.contact.put(name , contact);
    }
    public String searchName(String name){
        return this.contact.get(name);
    }

    public boolean isConsistance(String name){
        HashMap<String , Integer> consist = new HashMap<>();
        for (Map.Entry<String , String> set : contact.entrySet()){
            String values = set.getValue();
            if(consist.containsKey(values)){
                return false;
            }
            else {
                consist.put(values , 1);
            }

        }

        return true;
    }
}
