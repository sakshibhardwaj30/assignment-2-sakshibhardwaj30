/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.Scanner;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Traversal t = new Traversal();
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        TreeNode root = new TreeNode(10);
        System.out.println("How many element do you want to add....");
        for (int i = 0; i < Integer.parseInt(scanner.nextLine()); i++) {
            tree.insert(root, scanner.nextInt());
        }
        t.printPreorder(root);
        System.out.println();
        t.printPostorder(root);
    }
}
