public interface Deque<T> {
    void addFirst(T item);

    void addLast(T item);

    boolean isEmpty();

    int size();

    T removeFirst();

    T removeLast();

    void printDeque();

    T get(int index);

    T getRecursive(int index);

    LinkedListDeque<T>.tNode getRecursiveHelper(int index, LinkedListDeque.tNode ypos);
}

