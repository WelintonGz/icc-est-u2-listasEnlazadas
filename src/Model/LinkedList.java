package Model;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public void appendToTail(T value){
        Node<T> newNode = new Node<>(value);
        if (head == null){
            head = newNode;
        }else{
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;

    }
    
    public T findByValue(T value){
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public T deleteByValue(T value){
        Node<T> current = head;
        Node<T> previos = null;

        while (current !=null) {
            if (current.getValue().equals(value)) {
                if (previos == null) {
                    head = current.getNext();
                }else{
                    previos.setNext(current.getNext());
                }
                size--;
                return current.getValue();
            }
            previos = current;
            current = current.getNext();

        }
    }

    public void print(){
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    
}
