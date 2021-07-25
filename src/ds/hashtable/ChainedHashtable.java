package ds.hashtable;

import java.util.LinkedList;

public class ChainedHashtable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];

        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }


    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].addLast(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        Employee employee = null;
        for (int j = 0; j < hashtable[hashedKey].size(); j++) {
            if (key.equals(hashtable[hashedKey].get(j).getKey()))
                employee = hashtable[hashedKey].get(j).getEmployee();
        }
        return employee;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        Employee removed = null;
        for (int j = 0; j < hashtable[hashedKey].size(); j++) {
            if (key.equals(hashtable[hashedKey].get(j).getKey())){
                removed = hashtable[hashedKey].get(j).getEmployee();
                hashtable[hashedKey].remove(j);
                return removed;
            }
        }

        return removed;
    }

    private int hashKey(String key) {
        return Math.abs(key.hashCode()) % hashtable.length;
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            for (int j = 0; j < hashtable[i].size(); j++) {
                System.out.println(hashtable[i].get(j).getEmployee());
            }
        }
    }
}
