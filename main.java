package uaslp.ingenieria.labs;


import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.Node;

public class main {

    public static void main(String[] args){
        LinkedList lista1 = new LinkedList();
        Node node = new Node();

        lista1.add(1);
        lista1.add(1);
        lista1.add(1);
        lista1.add(1);
		
		lista1.add(2);


        lista1.delete(1);

        int dato = lista1.get(4);
    }
}
