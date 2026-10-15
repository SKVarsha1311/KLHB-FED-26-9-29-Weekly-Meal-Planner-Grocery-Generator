import java.util.LinkedHashMap;
import java.util.Scanner;

public class WeeklyMealPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Arrays for days, meals, and ingredients input
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] meals = new String[7];
        String[] ingredientsInput = new String[7];
        
        // HashMap to store ingredient counts for the grocery list
        LinkedHashMap<String, Integer> groceryMap = new LinkedHashMap<>();

        // 2. Loop to get input for each day step-by-step
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + ": Enter food name: ");
            meals[i] = scanner.nextLine();
            
            System.out.print(days[i] + ": Enter ingredients: ");
            ingredientsInput[i] = scanner.nextLine();
        }

        // 3. Print Weekly Meal Planner
        System.out.println("\n===== Weekly Meal Planner =====");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + ": " + meals[i]);
            System.out.println("Ingredients: " + ingredientsInput[i]);
            
            // Split and count ingredients for the grocery list
            String[] items = ingredientsInput[i].split(",");
            for (int j = 0; j < items.length; j++) {
                String item = items[j].trim().toLowerCase();
                if (!item.isEmpty()) {
                    if (groceryMap.containsKey(item)) {
                        groceryMap.put(item, groceryMap.get(item) + 1);
                    } else {
                        groceryMap.put(item, 1);
                    }
                }
            }
        }

        // 4. Print Weekly Grocery List
        System.out.println("\n===== Weekly Grocery List =====");
        for (String item : groceryMap.keySet()) {
            int count = groceryMap.get(item);
            if (count > 1) {
                System.out.println("- " + item + " (x" + count + ")");
            } else {
                System.out.println("- " + item);
            }
        }

        scanner.close();
    }
}