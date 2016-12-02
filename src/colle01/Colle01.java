/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colle01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author SandeepS
 */
public class Colle01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // basic code to learn more   abour HashSet, HashTree & HashedLinkedTree.
        ArrayList <String> arrayList = new ArrayList<String>();
        HashSet <String> hashSet = new HashSet <String>();
        hashSet.add("Rubber");
        hashSet.add("Pencil");
        hashSet.add("Pencil");
         System.out.println("Pencil Set box contains" + hashSet);
         
        TreeSet <String> treeSet = new TreeSet <String>();
        treeSet.add("Rubber");
        treeSet.add("Pencil");
        treeSet.add("Pencil");
         System.out.println("Pencil Tree box contains" + treeSet);
         
        LinkedHashSet <String> linkedHashSet = new LinkedHashSet <String>();
        linkedHashSet.add("Rubber");
        linkedHashSet.add("Pencil");
        linkedHashSet.add("Pencil");
         System.out.println("Pencil Linkedhash box contains" + linkedHashSet);
        
        arrayList.add("Orange");
        arrayList.add("Apple");
        arrayList.add("Apple");
  
  
        System.out.println(" Fruit box contains" + arrayList);
       
    }
}
