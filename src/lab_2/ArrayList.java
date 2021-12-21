package lab_2;

public class ArrayList<T> {
    private T[] _array;
    private int _capacity;
    private int _currentEndElementIndex;

    public ArrayList() {
        _capacity = 10;
        _array = (T[]) new Object[_capacity];
        _currentEndElementIndex = 0;
    }

    public void add(T element) {
        if (_currentEndElementIndex + 1 == _capacity) {
            increseArray();
        }
        _array[_currentEndElementIndex] = element;
        _currentEndElementIndex++;
    }

    public int size() {
       return _currentEndElementIndex + 1;
    }

    public int capacity() {
        return _capacity;
    }

    public void remove(T element) {
        int indexOfRemovingElement = indexOf(element);

        while (indexOfRemovingElement != -1) {
            for (int i = indexOfRemovingElement; i < _currentEndElementIndex - 1; i++) {
                _array[i] = _array[i + 1];
            }
            _currentEndElementIndex--;

            indexOfRemovingElement = indexOf(element);
        }
    }

    public boolean contains(T element) {
        if (indexOf(element) != -1) {
            return true;
        }
        return false;
    }

    public Object[] toArray() {
        Object[] array =  new Object[_currentEndElementIndex];

        for (int i = 0; i < _currentEndElementIndex; i++) {
            array[i] = _array[i];
        }

        return array;
    }

    private int indexOf(T element) {
        for (int i = 0; i < _currentEndElementIndex; i++) {
            if (_array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    private void increseArray() {
        int capasity = _capacity * 2;
        T[] array = (T[]) new Object[capasity];

        for (int i = 0; i < _currentEndElementIndex; i++) {
            array[i] = _array[i];
        }

        _array = array;
        _capacity = capasity;
    }
}
