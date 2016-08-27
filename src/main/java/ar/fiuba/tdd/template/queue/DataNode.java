package ar.fiuba.tdd.template.queue;


public class DataNode<T> implements Node<T> {

    private T data;
    private Node<T> next;

    public DataNode(T data) {
        this.data = data;
        this.next = new NullNode<>();
    }

    public Node addAtTheEnd(T data) {
        next = next.addAtTheEnd(data);
        return this;
    }

    public Node getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }

    public boolean empty() {
        return false;
    }
}