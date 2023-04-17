public class LinkedListDeque<T> implements Deque<T> {

    class Tnode {
        private Tnode first;
        private T item;
        private Tnode next;

        private Tnode(Tnode f, T i, Tnode n) {
            first = f;
            item = i;
            next = n;
        }
    }

    private Tnode front;
    private Tnode last;
    private int size = 0;

    public LinkedListDeque() {
        front = new Tnode(null, null, null);
        last = new Tnode(front.next, null, null);
        front.next = last;
        last.first = front;
        size = 0;
    }

    @Override
    public void addFirst(T item) {
        size += 1;
        Tnode itemp = front.next;
        Tnode i = new Tnode(null, item, null);
        i.next = itemp;
        itemp.first = i;
        front.next = i;
        i.first = front;
    }

    @Override
    public void addLast(T item) {
        size += 1;
        Tnode jtemp = last.first;
        Tnode j = new Tnode(null, item, null);
        j.next = last;
        last.first = j;
        jtemp.next = j;
        j.first = jtemp;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {
        Tnode ktemp = front.next;
        while (ktemp.next != null) {
            if (ktemp.next.next != null) {
                System.out.print(ktemp.item + " ");
            } else {
                System.out.print(ktemp.item);
            }
            ktemp = ktemp.next;
        }
    }

    @Override
    public T removeFirst() {
        Tnode fdel = front.next;
        if (fdel.next != null) {
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

    @Override
    public T removeLast() {
        Tnode fnode = front.next;
        Tnode ldel = last.first;
        if (fnode.next != null) {
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

    @Override
    public T get(int index) {
        int ipos = 0;
        Tnode xpos = front.next;
        while (ipos != index) {
            ++ipos;
            xpos = xpos.next;
            if (xpos == null) {
                return null;
            }
        }
        return xpos.item;
    }

    public T getRecursive(int index) {
        Tnode ypos = front.next;
        if (ypos.next == null || index + 1 > size) {
            return null;
        }
        ypos = getRecursiveHelper(index, ypos);
        return ypos.item;
    }

    private Tnode getRecursiveHelper(int index, Tnode ypos) {
        if (index == 0) {
            return ypos;
        }
        ypos = ypos.next;
        ypos = getRecursiveHelper(index - 1, ypos);
        return ypos;
    }
}
