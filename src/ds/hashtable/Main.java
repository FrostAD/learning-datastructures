package ds.hashtable;

public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee("George",1);
        Employee employee2 = new Employee("Mike",2);
        Employee employee3 = new Employee("Alexandra",3);
        Employee employee4 = new Employee("Andrea",4);
        Employee employee5 = new Employee("Blexandra",5);
//
//        SimpleHashtable simpleHashtable = new SimpleHashtable();
//        simpleHashtable.put("George",employee1);
//        simpleHashtable.put("Mike",employee2);
//        simpleHashtable.put("Alexandra",employee3);
//        simpleHashtable.put("Andrea",employee4);

//        simpleHashtable.print();

        // Hashtable using Open Addressing
//        OpenAddressingHashtable openAddressingHashtable = new OpenAddressingHashtable();
//        openAddressingHashtable.put("George",employee1);
//        openAddressingHashtable.put("Mike",employee2);
//        openAddressingHashtable.put("Alexandra",employee3);
//        openAddressingHashtable.put("Andrea",employee4);
//        openAddressingHashtable.put("Blexandra",employee5);
//        openAddressingHashtable.print();
//        System.out.println("Search:");
//        System.out.println(openAddressingHashtable.get("Blexandra"));
//        System.out.println("Deleted:");
//        System.out.println(openAddressingHashtable.remove("Alexandra"));
//        System.out.println("Search:");
//        System.out.println(openAddressingHashtable.get("Blexandra"));
//        System.out.println();
//        openAddressingHashtable.print();

        //Hashtable using chaining(linked list)
        ChainedHashtable chainedHashtable = new ChainedHashtable();
        chainedHashtable.put("George",employee1);
        chainedHashtable.put("Mike",employee2);
        chainedHashtable.put("Alexandra",employee3);
        chainedHashtable.put("Andrea",employee4);
        chainedHashtable.put("Blexandra",employee5);
        chainedHashtable.remove("Alexandra");
        System.out.println(chainedHashtable.get("Blexandra"));
        chainedHashtable.print();
    }
}
