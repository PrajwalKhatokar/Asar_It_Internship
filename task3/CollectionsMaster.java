package task3;

import java.util.*;

public class CollectionsMaster {
    public static void main(String[] args) {

        System.out.println("=== LIST (ArrayList) ===");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After adding: " + fruits);

        fruits.add(1, "Orange");
        System.out.println("After adding at index 1: " + fruits);

        System.out.println("Element at index 2: " + fruits.get(2));


        fruits.set(0, "Mango");
        System.out.println("After setting index 0: " + fruits);

        fruits.remove(2);
        System.out.println("After removing index 2: " + fruits);

        // Remove by value
        fruits.remove("Orange");
        System.out.println("After removing 'Orange': " + fruits);

        // Contains check
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Size
        System.out.println("Size of list: " + fruits.size());

        // Clear
        fruits.clear();
        System.out.println("After clearing: " + fruits);

        // ===== 2. SET (HashSet) =====
        System.out.println("\n=== SET (HashSet) ===");
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicate (ignored)
        System.out.println("After adding: " + numbers);

        // Remove
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);

        // Contains
        System.out.println("Contains 30? " + numbers.contains(30));

        // Size
        System.out.println("Size: " + numbers.size());

        // Clear
        numbers.clear();
        System.out.println("After clearing: " + numbers);

        // ===== 3. QUEUE (LinkedList) =====
        System.out.println("\n=== QUEUE (LinkedList) ===");
        Queue<String> queue = new LinkedList<>();

        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        System.out.println("Queue: " + queue);

        // Peek (see first element)
        System.out.println("Peek: " + queue.peek());

        // Poll (remove first element)
        System.out.println("Polled: " + queue.poll());
        System.out.println("After poll: " + queue);

        // Offer (add at end)
        queue.offer("Task4");
        System.out.println("After offer: " + queue);

        // Size
        System.out.println("Size: " + queue.size());

        // Clear
        queue.clear();
        System.out.println("After clearing: " + queue);

        // ===== 4. MAP (HashMap) =====
        System.out.println("\n=== MAP (HashMap) ===");
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("Map: " + map);

        // Get value
        System.out.println("Value for key 2: " + map.get(2));

        // Remove by key
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Contains Key
        System.out.println("Contains key 1? " + map.containsKey(1));

        // Contains Value
        System.out.println("Contains value 'Two'? " + map.containsValue("Two"));

        // Size
        System.out.println("Size: " + map.size());

        // Clear
        map.clear();
        System.out.println("After clearing: " + map);
    }
}

//Output:

//=== LIST (ArrayList) ===
//After adding: [Apple, Banana, Cherry]
//After adding at index 1: [Apple, Orange, Banana, Cherry]
//Element at index 2: Banana
//After setting index 0: [Mango, Orange, Banana, Cherry]
//After removing index 2: [Mango, Orange, Cherry]
//After removing 'Orange': [Mango, Cherry]
//Contains Banana? false
//Size of list: 2
//After clearing: []


//        === SET (HashSet) ===
//After adding: [20, 10, 30]
//After removing 10: [20, 30]
//Contains 30? true
//Size: 2
//After clearing: []

//        === QUEUE (LinkedList) ===
//Queue: [Task1, Task2, Task3]
//Peek: Task1
//Polled: Task1
//After poll: [Task2, Task3]
//After offer: [Task2, Task3, Task4]
//Size: 3
//After clearing: []
//

//        === MAP (HashMap) ===
//Map: {1=One, 2=Two, 3=Three}
//Value for key 2: Two
//After removing key 3: {1=One, 2=Two}
//Contains key 1? true
//Contains value 'Two'? true
//Size: 2
//After clearing: {}
//

