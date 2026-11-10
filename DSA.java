import java.util.*;

public class DSA {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    HashSet<Integer> uniqueIDs = new HashSet<>();
    HashMap<Integer, String> students = new HashMap<>();
    
    for(int i = 1; i <= 5; i++){
        System.out.print("\nEnter Student ID: ");
        int id = sc.nextInt();

    if (uniqueIDs.contains(id)){
        System.out.println("\nDuplicate ID! Please enter new ID!");
        i--;
    }else{
        uniqueIDs.add(id);
        
        System.out.print("Enter Student Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        
        students.put(id, name);
        System.out.println("Student Register Successfully!");
    }
    }
        System.out.println("\nTotal Unique Students: " + uniqueIDs.size());
        
        TreeMap<Integer, String> sortedStudents = new TreeMap<>(students);

        System.out.println("\nStudent Registration List (Ascending Order):");

        for (Map.Entry<Integer, String> entry : sortedStudents.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + " - Name: " + entry.getValue());
    }
        sc.close();
}
}
