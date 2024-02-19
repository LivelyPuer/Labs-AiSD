import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NodeTests {
    @Test
    void setPrevNodeTest() {
        Node node1 = new Node("Петя", "ИпКа-31", 18);
        Node node2 = new Node("Петя", "ИпКа-31", 18);
        node1.setPrevNode(node2);
        assertEquals(node1.getPrevNode(), node2);
    }
}
