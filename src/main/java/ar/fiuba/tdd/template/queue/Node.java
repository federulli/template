package ar.fiuba.tdd.template.queue;

public interface Node<T> {

    Node getNext();

    T getData();

    boolean empty();

    Node addAtTheEnd(T data);
}
