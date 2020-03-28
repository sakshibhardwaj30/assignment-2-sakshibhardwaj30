package problem2.main;

import problem1.node.TreeNode;

public class Traversal {

    public void printPostorder(TreeNode node) {

        if (node == null)

            return;

        printPostorder(node.getLeft());

        printPostorder(node.getRight());

        System.out.print(node.getData() + " ");

    }

    public void printPreorder(TreeNode node) {

        if (node == null)

            return;

        System.out.print(node.getData() + " ");

        printPreorder(node.getLeft());

        printPreorder(node.getRight());

    }

}
