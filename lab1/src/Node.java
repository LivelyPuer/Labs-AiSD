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

    public Boolean greatThen(Node node) {
        if (node == null){
            return true;
        }
        if (name.compareTo(node.name) > 0) {
            return true;
        } else if (name.compareTo(node.name) < 0) {
            return false;
        }

        if (group.compareTo(node.group) > 0) {
            return true;
        } else if (group.compareTo(node.group) < 0) {
            return false;
        }
        if (age > node.age) {
            return true;
        } else if (age < node.age) {
            return false;
        }
        return false;
    }

    public Boolean equal(Node node) {
        return name.compareTo(node.name) == 0 &&
                group.compareTo(node.group) == 0 &&
                Objects.equals(age, node.age);

    }

}
