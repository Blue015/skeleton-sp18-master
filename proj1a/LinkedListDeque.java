public class LinkedListDeque<T> {

    private class tNode {
        private tNode first;
        private T item;
        private tNode next;

        private tNode(tNode f,T i,tNode n) {
            first = f ;
            item = i ;
            next = n;
        }
    }

    private tNode front;
    private tNode last;
    private int size = 0;

    public LinkedListDeque() {
        front = new tNode(null,null,null);
        last = new tNode(front.next,null,null);
        front.next = last;
        last.first = front;
        size = 0;
    }

    public void addFirst(T item) {
        size += 1;
        tNode itemp = front.next;
        tNode i = new tNode(null,item,null);
        i.next = itemp;
        itemp.first = i;
        front.next = i;
        i.first = front;
    }

    public void addLast(T item) {
        size += 1;
        tNode jtemp = last.first;
        tNode j = new tNode(null,item,null);
        j.next = last;
        last.first = j;
        jtemp.next = j;
        j.first = jtemp;
    }

    public boolean isEmpty() {
        return size == 0;
//        tNode xtemp = front.next;
//        if(xtemp.next == null) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        tNode ktemp = front.next;
        while(ktemp.next != null) {
            if(ktemp.next.next != null) {
                System.out.print(ktemp.item + " ");
            } else {
                System.out.print(ktemp.item);
            }
            ktemp = ktemp.next;
        }
    }

    public T removeFirst() {
        tNode fdel = front.next;
        if(fdel.next != null) {
            T fobj;
            size -= 1;
            fobj = fdel.item;
            front.next = fdel.next;
            fdel.next.first = front;
            fdel = null;
            return fobj;
        } else {
            return null;
        }
    }

    public T removeLast() {
        tNode fnode = front.next;
        tNode ldel = last.first;
        if(fnode.next != null) {
            T lobj;
            size -= 1;
            lobj = ldel.item;
            ldel.first.next = last;
            last.first = ldel.first;
            ldel = null;
            return lobj;
        } else {
            return null;
        }


    }

    public T get(int index) {
        int ipos = 0;
        tNode xpos = front.next;
        while(ipos != index) {
            ++ipos;
            xpos = xpos.next;
            if(xpos == null) {
                return null;
            }
        }
        return xpos.item;
    }

    public T getRecursive(int index) {
       tNode ypos = front.next;
       if(ypos.next == null || index+1 > size) {
            return null;
        }
       ypos = getRecursiveHelper(index,ypos);
       return ypos.item;
    }

    private tNode getRecursiveHelper(int index,tNode ypos) {
        if (index == 0) {
            return ypos;
        }
        ypos = ypos.next;
        ypos = getRecursiveHelper(index - 1, ypos);
        return ypos;

    }
}
