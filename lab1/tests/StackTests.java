import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests {
    @Test
    void createStackTest() {
        Stack stack = new Stack();

        assertTrue(stack.isEmpty());
        assertNull(stack.peek());
    }

    @Test
    void pushElementStackTest() {
        Stack stack = new Stack();
        Node node = new Node("Вася", "ПИбд-15", 18);
        stack.push(node);

        assertFalse(stack.isEmpty());
        assertEquals(stack.peek(), node);
    }

    @Test
    void popElementStackTest() {
        Stack stack = new Stack();
        Node node1 = new Node("Вася", "ПИбд-15", 18);
        Node node2 = new Node("Петя", "ПИбд-15", 18);
        stack.push(node1);
        stack.push(node2);

        Node popedNode = stack.pop();

        assertEquals(popedNode, node2);
    }

    @Test
    void peekElementStackTest() {
        Stack stack = new Stack();
        Node node1 = new Node("Вася", "ПИбд-15", 18);
        Node node2 = new Node("Петя", "ПИбд-15", 18);
        stack.push(node1);
        stack.push(node2);

        stack.pop();

        assertEquals(stack.peek(), node1);
    }

    @Test
    void sizeAfterPushElementTest() {
        Stack stack = new Stack();
        Node node1 = new Node("Вася", "ПИбд-15", 18);
        Node node2 = new Node("Петя", "ПИбд-15", 18);
        stack.push(node1);
        stack.push(node2);

        assertEquals(stack.size(), 2);
    }

    @Test
    void sizeAfterPopElementTest() {
        Stack stack = new Stack();
        Node node1 = new Node("Вася", "ПИбд-15", 18);
        Node node2 = new Node("Петя", "ПИбд-15", 18);
        stack.push(node1);
        stack.push(node2);

        stack.pop();

        assertEquals(stack.size(), 1);
    }

    @Test
    void checkIsEmptyTest() {
        Stack stack = new Stack();
        Node node1 = new Node("Вася", "ПИбд-15", 18);
        Node node2 = new Node("Петя", "ПИбд-15", 18);
        stack.push(node1);
        stack.push(node2);

        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void overPopTest() {
        Stack stack = new Stack();
        Node node1 = new Node("Вася", "ПИбд-15", 18);
        Node node2 = new Node("Петя", "ПИбд-15", 18);
        stack.push(node1);
        stack.push(node2);

        stack.pop();
        stack.pop();
        Node empty = stack.pop();

        assertNull(empty);
        assertEquals(stack.size(), 0);
    }
}
