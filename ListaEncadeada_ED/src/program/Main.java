package program;

import entities.LinkedList2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    LinkedList2<Integer> list = new LinkedList2<>();
	    
	    list.addLast(10);
	    list.addLast(20);
	    list.addLast(30);
	    
	    
	    System.out.println("Lista após adicionar elementos no final da lista:");
	    for (var s : list) {
            System.out.println(s);
        }

        System.out.println("Size of list = " + list.size());
	}

}