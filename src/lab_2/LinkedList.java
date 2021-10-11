package lab_2;

public class LinkedList<T> {
    private Node<T> _head;
    private Node<T> _root;
    private int _size;

    public LinkedList() {
      _head = null;
      _root = null;
      _size = 0;
    }

    public void add(T element) {
        if (_head == null) {
            _head = new Node<T>(element);
            _root = _head;
            _size++;
        } else {
            Node<T> node = new Node<T>(element);
            _root.setNext(node);
            node.setPrevious(_root);

            if (_root.getNext() != null) {
                _root = node;
            }

            _size++;
        }
    }

    public void remove(T element) {
       Node removingElement = findElement(element);
       removingElement.getPrevious().setNext(removingElement.getNext());
       removingElement.getNext().setPrevious(removingElement.getPrevious());
       removingElement = null;
       _size--;
    }

    public boolean contains(T element) {
        Node<T> currentElement = _head;

        for (int i = 0; i < _size; i++) {
            if (currentElement.getElement() == element) {
                return true;
            }
            if (currentElement.getNext() != null){
                currentElement = currentElement.getNext();
            }
        }

        return false;
    }

    public int size() {
        return _size;
    }

    public Object[] toArray() {
        Object[] array = new Object[_size];

        Node<T> currentElement = _head;

        for (int i = 0; i < _size; i++) {
            array[i] = currentElement.getElement();
            if (currentElement.getNext() != null){
                currentElement = currentElement.getNext();
            }
        }

        return  array;
    }

    public Object[] toRevertedArray() {
        Object[] array = new Object[_size];

        Node<T> currentElement = _root;

        for (int i = 0; i < _size; i++) {
            array[i] = currentElement.getElement();
            if (currentElement.getPrevious() != null){
                currentElement = currentElement.getPrevious();
            }
        }

        return array;
    }

    private Node findElement(T element) {
        Node<T> currentElement = _head;

        for (int i = 0; i < _size; i++) {
            if (currentElement.getElement() == element) {
                return currentElement;
            }
            if (currentElement.getNext() != null){
                currentElement = currentElement.getNext();
            }
        }

        return null;
    }
}
