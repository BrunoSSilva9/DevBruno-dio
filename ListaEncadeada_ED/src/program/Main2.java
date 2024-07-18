package program;

import entities.LinkedList2;

public class Main2 {
	public static void main(String[] args) {
	    LinkedList2<String> lista = new LinkedList2<>();
	    
	    lista.addLast("A");
	    lista.addLast("D");
	    lista.addLast("A");
	    lista.addLast("M");
	    lista.addLast("F");
	    
	    lista.removeLast();
	    
	    System.out.println("Lista após remover o último"
	    		         + " elemento da lista:");
	    for (var s : lista) {
            System.out.println(s);
        }

        System.out.println("Size of list = " + lista.size());
	}


}
