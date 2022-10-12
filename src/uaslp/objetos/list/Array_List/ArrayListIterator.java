package uaslp.objetos.list.Array_List;

import uaslp.objetos.list.Iterator;

public class ArrayListIterator implements Iterator {

    private Arraylist arraylist;
    private int currentIndex = 0;

    public ArrayListIterator(Arraylist arraylist){
        this.arraylist = arraylist;
    }

    public boolean hasNext(){
        return currentIndex < arraylist.getSize();
    }

    public String next(){
        return arraylist.getAt(currentIndex++);
    }
}
