package ds.hashtable;

public class SimpleHashtable {
    private Employee[] hashtable;

    public SimpleHashtable(){
        hashtable = new Employee[10];
    }
    public void put(String key,Employee employee){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null)
            System.out.println("Sorry! Collisions are not supported.");
        else{
            hashtable[hashedKey] = employee;
        }
    }
    public Employee get(String key){
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] == null)
            System.out.println("Empty");
        return hashtable[hashedKey];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void print(){
        for (int i = 0; i < hashtable.length; i++) {
            if(hashtable[i] != null)
                System.out.println(i + " : " + hashtable[i]);
        }
    }
}
