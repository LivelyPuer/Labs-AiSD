import java.util.Objects;

/**
 * <strong>Линейный однонаправленный список</strong> — это структура данных,
 * состоящая из элементов одного типа, связанных между собой
 * последовательно посредством указателей.
 */
public class Node {
    private final String name;
    private final String group;
    private final Integer age;


    private Node prevNode;

    public Node(String name, String group, Integer age) {
        this.name = name;
        this.group = group;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Integer getAge() {
        return age;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

}
