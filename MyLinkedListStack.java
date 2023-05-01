public class MyLinkedListStack<E> {
    private class Node<E>{
        E el;
        Node<E> next;
        Node<E> prev;
        Node (E el, Node next, Node prev){
            this.el = el;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node<E> head;
    private Node<E> tail;
}
