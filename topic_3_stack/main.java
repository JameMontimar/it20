package topic_3_stack;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stack stack = new stack(5);
        
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    value = stack.pop();
                    if (value != -1) {
                        System.out.println("Popped element: " + value);
                    }
                    break;
                case 3:
                    value = stack.peek();
                    if (value != -1) {
                        System.out.println("Top element is: " + value);
                    }
                    break;
                case 4:
                    System.out.println("Stack size is: " + stack.size());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
