
package com.mycompany.arraylinklist;
import java.util.*;
public class Arraylinklist {

    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        List<Integer>linkedList=new LinkedList<>();
        //add elements in the arraylist..
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        //add elements in the linkedlist...
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        
        int arrayListsize = arrayList.size();
        int linkedListsize=linkedList.size();
        //set 25 at index 1 in the arraylist
        arrayList.set(1,25);
        //set 55 at index 2 in the linkedlist...
        linkedList.set(2,55);
        
        //access elements at specifies indices..
        arrayList.remove(0);
        linkedList.remove(1);
        //sorting the arraylist & linkedlist..
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Arraylis: ");
        for(int num : arrayList){
            System.out.println(num);
        }
        
        System.out.println("LinkedList :");
        for(int num : linkedList){
            System.out.println(num);
        }
        
        
        
    }
}
