import java.util.*;

public class GroceryList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String meals = new String[7];
        String ingredients = new String[7];

        // Input meals + ingredients
        for(int i = 0; i < 7; i++){
            System.out.print("Meal for " + days[i] + ": ");
            meals[i] = sc.nextLine();

            System.out.print("Ingredients for " + days[i] + ": ");
            ingredients[i] = sc.nextLine();
       
