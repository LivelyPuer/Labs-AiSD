import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTests {
    @Test
    void setPrevNodeTest() {
        Node node1 = new Node("Петя", "ИпКа-31", 18);
        Node node2 = new Node("Петя", "ИпКа-31", 18);
        node1.setPrevNode(node2);
        assertEquals(node1.getPrevNode(), node2);
    }
    @Test
    void checkGreatNodeTest() {
        Node node1 = new Node("Петя", "ИпКа-31", 18);
        Node node2 = new Node("Ваня", "ИпКа-31", 18);
        assertTrue(node1.greatThen(node2));
    }
    @Test
    void checkGreatNullTest() {
        Node node1 = new Node("Петя", "ИпКа-31", 18);
        assertTrue(node1.greatThen(null));
    }
}
