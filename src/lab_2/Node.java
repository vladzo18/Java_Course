package lab_2;

public class Node<T> {
    private Node _prev;
    private Node _next;
    private T _element;

    public Node(T element) {
        _next = null;
        _prev = null;
        _element = element;
    }

    public Node getNext() {
        return _next;
    }

    public void setNext(Node node) {
        _next = node;
    }

    public Node getPrevious() {
        return _prev;
    }

    public void setPrevious(Node node) {
        _prev = node;
    }

    public T getElement() {
        return _element;
    }
}
