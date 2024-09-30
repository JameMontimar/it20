/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LO3;

import java.util.ArrayList;
public class ItemManager {
    private ArrayList<String> items;

    // Constructor to initialize the ArrayList
    public ItemManager() {
        items = new ArrayList<>();
    }

    // Display items
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }

    // Insert item
    public void insertItem(String item) {
        items.add(item);
        System.out.println("Inserted: " + item);
    }

    // Update the data via index
    public void updateItem(int index, String newItem) {
        if (index >= 0 && index < items.size()) {
            String oldItem = items.set(index, newItem);
            System.out.println("Updated: " + oldItem + " to " + newItem);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Find item
    public int findItem(String item) {
        int index = items.indexOf(item);
        if (index != -1) {
            System.out.println("Found: " + item + " at index " + index);
        } else {
            System.out.println(item + " not found.");
        }
        return index;
    }

    // Delete item
    public void deleteItem(int index) {
        if (index >= 0 && index < items.size()) {
            String removedItem = items.remove(index);
            System.out.println("Deleted: " + removedItem);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}
   

