import java.util.*;

class stackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        // push the elements inside the stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        // print the top most element in the stack.
        System.out.println("The topmost element in the stack is:" + stack1.peek());

        // Delete the top most element in the stack
        System.out.println("Delete the top most element of a stack:" + stack1.pop());

        // print the top most element in the stack.
        System.out.println("The topmost element in the stack is:" + stack1.peek());

        // Search the element in the stack

        System.out.println("Element 4 is present at the position :" + stack1.search(4));

        // Search function return -1 whenthe element is not present in the stack
        System.out.println("Element at the the position of 3 is:" + stack1.search(1));

        // Check weather the stack is empty or not
        // Empty function return the boolean result value
        System.out.println("Is the stack is empty or not:" + stack1.empty());
        
    }
}
