package ar.fiuba.tdd.template.queue;

public class Queue<T> {
    private Node<T> first;
    private int size;

    public Queue() {
        this.size = 0;
        this.first = new NullNode<>();
    }

    public boolean isEmpty() {
        return first.empty();
    }

    public int size() {
        return this.size;
    }

    public T top() {
        return first.getData();
    }

    public void add(T item) {
        this.size += 1;
        this.first = first.addAtTheEnd(item);
    }

    public void remove() {
        first = first.getNext();
        size -= 1;
    }
}
