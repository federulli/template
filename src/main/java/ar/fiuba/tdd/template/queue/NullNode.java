package ar.fiuba.tdd.template.queue;


public class NullNode<T> implements Node<T> {

    public Node getNext() {
        throw new AssertionError();
    }

    public T getData() {
        throw new AssertionError();
    }

    public boolean empty() {
        return true;
    }

    public Node addAtTheEnd(T data) {
        return new DataNode<>(data);
    }
}
