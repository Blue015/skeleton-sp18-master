public class ArrayDeque<T> {

    private T[] arr;
    private int size;

    public ArrayDeque() {
        size = 0;
        arr = (T[]) new Object[8];
    }

    public void addFirst(T item) {
        T[] crr = (T[]) new Object[size+1];
        if(size != 0) {
            System.arraycopy(arr,0,crr,1,size);
        }
        crr[0] = item;
        arr = crr;
        size += 1;
    }

    public void addLast(T item) {
        T[] brr;
        if(size == arr.length) {
            brr = (T[]) new Object[size*2];
            System.arraycopy(arr,0,brr,0,size);
            arr = brr;
        } else if(size == 0) {
            brr = (T[]) new Object[1];
            arr = brr;
        }
        arr[size] = item;
        size += 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        for(int i = 0;i < size;i++) {
            if(i == size-1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public T removeFirst() {
        if(isEmpty()) {
            return null;
        }
        T fpos = arr[0];
        T[] drr = (T[]) new Object[size-1] ;
        System.arraycopy(arr,1,drr,0,size-1);
        arr = drr;
        size -= 1;
        return fpos;
    }

    public T removeLast() {
        if(isEmpty()) {
            return null;
        }
        T lpos = arr[size-1];
        arr[size-1] = null;
        size -= 1;
        return lpos;
    }

    public T get(int index) {
        if(index+1 > size) {
            return null;
        } else {
            return arr[index];
        }
    }
}
