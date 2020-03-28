/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Rohan", 50));
        queue.enqueue(new Student("phoebe", 65));
        queue.enqueue(new Student("jon", 69));
        queue.enqueue(new Student("putin", 1));
        queue.enqueue(new Student("chandler", 10));
        queue.enqueue(new Student("joey", 76));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}
