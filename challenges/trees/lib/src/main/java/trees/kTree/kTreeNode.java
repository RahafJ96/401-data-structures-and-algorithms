package trees.kTree;

import java.util.ArrayList;
import java.util.List;

public class kTreeNode<T> {
    public T value;
    public List<kTreeNode> children = new ArrayList<>();

    public kTreeNode(T value) {
        this.value = value;
    }


    public void addNode(kTreeNode child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{ value = ");
        result.append(value);
        result.append(" Children: [");
        for (kTreeNode ch : children) {
            result.append("\n child: ");
            result.append(ch);
        }
        result.append("]");
        return result.toString();
    }
}
