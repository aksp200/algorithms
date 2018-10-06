package org.aks.algo;

import org.aks.util.IoUtil;

import java.util.Objects;

import static org.aks.util.IoUtil.print;

public class BinaryTree {

    private BinaryTree left;
    private BinaryTree right;
    private int value;

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryTree)) return false;
        BinaryTree that = (BinaryTree) o;
        return getValue() == that.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }

    public static void main(String args[]) {
        BinaryTree rootNode = new  BinaryTree();
        rootNode.setValue(0);

        BinaryTree node1 = new  BinaryTree();
        node1.setValue(1);

        rootNode.setLeft(node1);

        BinaryTree node2 = new  BinaryTree();
        node2.setValue(2);

        rootNode.setLeft(node2);

        print(rootNode);
    }
}
