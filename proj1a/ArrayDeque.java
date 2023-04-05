public class ArrayDeque<T> {

    private T[] arr;
    private int size;

    public ArrayDeque() {
        size = 0;
        arr = (T[]) new Object[8];
    }

    public void addFirst(T item) {
        T[] crr = (T[]) new Object[size*2];
        System.arraycopy(arr,0,crr,1,size);
        arr = crr;
        arr[0] = item;
        size += 1;
    }

    public void addLast(T item) {
        if(size == arr.length) {
            T[] brr = (T[]) new Object[size*2];
            System.arraycopy(arr,0,brr,0,size);
            arr = brr;
        }
        arr[size] = item;
        size += 1;
    }

    public boolean isEmpty() {
        return size==0;
//        if(size == 0) {
//            return true;
//        } else {
//            return false;
//        }
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
        if(size == 0) {
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
        if(size == 0) {
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
