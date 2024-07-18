package program;

import entities.LinkedList2;

public class Main1 {
	public static void main(String[] args) {
	    LinkedList2<String> lista = new LinkedList2<>();
	    
	    lista.addLast("Engenharia");
	    lista.addLast("Sistemas");
	    lista.addLast("Informação");
	   
	    lista.removeFirst();
	    
	    System.out.println("Lista após remover o primeiro"
	    		         + " elemento da lista:");
	    for (var s : lista) {
            System.out.println(s);
        }

        System.out.println("Size of list = " + lista.size());
	}


}
