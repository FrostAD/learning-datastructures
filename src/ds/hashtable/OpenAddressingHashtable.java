package ds.hashtable;

public class OpenAddressingHashtable {
    private StoredEmployee[] hashtable;

    public OpenAddressingHashtable() {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        int stopIndex = hashedKey;
        boolean wrap = false;
        while (isOccupied(hashedKey)) {
            if (wrap && hashedKey == stopIndex) {
                System.out.println("Cannot add!");
                return;
            }
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
                wrap = true;
                continue;
            }
            hashedKey++;
        }

        hashtable[hashedKey] = new StoredEmployee(key, employee);
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        int index = getRealHashKey(key,hashedKey);
        if (index == -1)
            return null;
        else
            return hashtable[index].getEmployee();
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        int index = getRealHashKey(key, hashedKey);
        if (index == -1)
            return null;
        else {
            StoredEmployee removed = hashtable[index];
            hashtable[index] = null;
            StoredEmployee[] oldHashtable = hashtable;
            hashtable = new StoredEmployee[oldHashtable.length];
            for (int i = 0; i < hashtable.length; i++) {
                if (oldHashtable[i] != null){
                    put(oldHashtable[i].getKey(),oldHashtable[i].getEmployee());
                }
            }

            return removed.getEmployee();
        }
    }

    private int getRealHashKey(String key, int hashedKey) {
        int stopIndex = hashedKey;
        boolean wrap = false;
        if (hashtable[hashedKey] == null)
            System.out.println("Empty");
        while (hashtable[hashedKey] != null && !hashtable[hashedKey].getKey().equals(key)) {
            if (wrap && stopIndex == hashedKey) {
                System.out.println("Not found!");
                return -1;
            }
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
                wrap = true;
                continue;
            }
            hashedKey++;
        }
        if (hashtable[hashedKey] != null)
            return hashedKey;
        else
            return -1;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean isOccupied(int index) {
        return hashtable[index] != null;
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] != null)
                System.out.println(i + " : " + hashtable[i]);
        }
    }
}
