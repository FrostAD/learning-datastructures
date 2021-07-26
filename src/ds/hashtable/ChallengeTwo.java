package ds.hashtable;

import java.util.*;

public class ChallengeTwo {
    public static void main(String[] args) {

        LinkedList<EmployeeTwo> employees = new LinkedList<>();
        employees.add(new EmployeeTwo("Jane", "Jones", 123));
        employees.add(new EmployeeTwo("John", "Doe", 5678));
        employees.add(new EmployeeTwo("Mike", "Wilson", 45));
        employees.add(new EmployeeTwo("Mary", "Smith", 5555));
        employees.add(new EmployeeTwo("John", "Doe", 5678));
        employees.add(new EmployeeTwo("Bill", "End", 3948));
        employees.add(new EmployeeTwo("Jane", "Jones", 123));

        Map<Integer,EmployeeTwo> hashMap = new HashMap<>();
        List<EmployeeTwo> toRemove = new ArrayList<>();
        for (EmployeeTwo employee:employees) {
            if (!hashMap.containsKey(employee.getId()))
                hashMap.put(employee.getId(),employee);
            else
                toRemove.add(employee);
        }
        hashMap.forEach((k,v) -> System.out.println("Key: " + k + " = " + v));
        for(EmployeeTwo employee: toRemove){
            employees.remove(employee);
        }

        employees.forEach(e -> System.out.println(e));



//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
