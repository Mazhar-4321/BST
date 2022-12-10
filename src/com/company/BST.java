package com.company;

public class BST<T extends Comparable<T>> {
    private Node<T> root;

    public BST() {
        root = null;
    }

    public void add(T key) {
        insert(root, key);
    }

    private void insert(Node<T> root, T key) {

        if (root.getKey().compareTo(key) >= 0) {
            if (root.getRight() == null) {
                root.setRight(new Node<>(key));
                return;
            }
            insert(root.getRight(), key);
        }
        if (root.getKey().compareTo(key) < 0) {
            if (root.getLeft() == null) {
                root.setLeft(new Node<>(key));
                return;
            }
            insert(root.getLeft(), key);
        }
    }

}
