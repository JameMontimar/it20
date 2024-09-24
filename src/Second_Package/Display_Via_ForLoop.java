package Second_Package;

public class Display_Via_ForLoop {
    public static void main (String [] args){
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Numbers that are divisible by 10:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
            
        }
    }
}
