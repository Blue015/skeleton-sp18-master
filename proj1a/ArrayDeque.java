public class ArrayDeque<T> {
    private T[] arr ;
    private int size;
    public ArrayDeque(){
        size = 0;
        arr = (T[]) new Object[8];
    }
    public void addFirst(T item){
        T[] crr = (T[]) new Object[size+1];
        System.arraycopy(arr,0,crr,1,size);
        arr = crr;
        arr[0] = item;
        size += 1;
    }

    public void addLast(T item){
        if(size == arr.length){
            T[] brr = (T[]) new Object[size*2];
            System.arraycopy(arr,0,brr,0,size);
            arr = brr;
        }
        arr[size] = item;
        size += 1;
    }

    public boolean isEmpty(){
        for(T is : arr){
            if(is != null){
                return false;
            }
        }
        return true;
    }

    public int size(){
        return size;
    }

    public void printDeque(){
        for(int i = 0;i < size;i++){
            if(i == size-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + "*");
            }
        }
    }

    public T removeFirst(){
        if(size == 0){
            return null;
        }
        T fpos = arr[0];
        T[] drr = (T[]) new Object[size-1] ;
        System.arraycopy(arr,1,drr,0,size-1);
        arr = drr;
        size -= 1;
        return fpos;
    }

    public T removeLast(){
        if(size == 0){
            return null;
        }
        T lpos = arr[size-1];
        arr[size-1] = null;
        size -= 1;
        return lpos;
    }

    public T get(int index){
        if(index+1 > size){
            return null;
        }else{
            return arr[index];
        }
    }

//    public static void main(String[] args){
//        ArrayDeque<Integer> l = new ArrayDeque<Integer>();
////        l.addFirst(1);
//        l.addFirst(2);
////        l.addFirst(3);
////        l.addFirst(4);
////        l.addFirst(5);
////        l.addFirst(6);
////        System.out.println(l.size);
////        l.addFirst(7);
////        l.addFirst(8);
////        l.addFirst(9);
////        l.addLast(0);
////        l.addLast(-1);
////        l.addLast(10);
////        l.addLast(11);
////        l.removeLast();
//        l.removeLast();
//        l.removeLast();
////        l.removeFirst();
////        System.out.println(l.get(1));
////        System.out.println(l.get(7));
//        l.printDeque();
////        l.removeFirst();
////        l.printDeque();
//    }

}
