/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.Student;
import problem3.myqueue.MyPriorityQueue;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {


        MyPriorityQueue queue = new MyPriorityQueue();
        Scanner sc = new Scanner(System.in);
        System.out.println("How manydo you wnat to add");
        int ch = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= ch; i++) {
            System.out.println("Enter the Student name");
            String n = sc.nextLine();
            System.out.println("Enter the Roll Number for the student");
            int r = sc.nextInt();
            Student student = new Student(n, r);
            queue.enqueue(student);
            sc.nextLine();
        }
        queue.show();
    }
}
