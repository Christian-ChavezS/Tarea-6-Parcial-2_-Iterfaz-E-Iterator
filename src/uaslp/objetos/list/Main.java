package uaslp.objetos.list;


import uaslp.objetos.list.Linked_List.LinkedList;

public class Main {

    public static void main(String[] args) {
        List datos = new LinkedList();

        datos.addAtTail("Juan");
        datos.addAtTail("Christian");
        datos.addAtTail("Abigail");

        datos.addAtFront("Luis");
        datos.addAtFront("Jeff");
        datos.addAtFront("Sasha");

        datos.addAtFront("Lucas");
        datos.addAtTail("Lola");
        datos.addAtTail("Ronald");

        Iterator iterator = datos.getIterator();

        while (iterator.hasNext()){
            String data = iterator.next();
            System.out.println(data);
        }

        datos.removeAll();

        System.out.println("Ultima Parte\n\n");
        datos.addAtTail("Juan");
        datos.addAtTail("Christian");
        datos.addAtTail("Abigail");


        iterator = datos.getIterator();
        while (iterator.hasNext()){
            String data = iterator.next();
            System.out.println(data);
        }


    }
}