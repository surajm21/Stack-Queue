package com.bridglabz;

public class StackOperation {
   public static void addElement(){
       StackAndQueue list= new StackAndQueue();
       list.push(56);
       list.push(30);
       list.push(70);
       list.print();
   }
    public static void popElement(){
        System.out.println("Before Pop:");
        StackAndQueue list= new StackAndQueue();
        list.push(56);
        list.push(30);
        list.push(70);
        list.print();

        list.pop();
        System.out.println("\nAfter Pop:");
        list.print();
    }
    public static void queueElement() {
        StackAndQueue list =new StackAndQueue();
        list.queue(56);
        list.queue(30);
        list.queue(70);
        list.print();
    }
}
