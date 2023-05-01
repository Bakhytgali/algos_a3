import java.util.LinkedList;
import java.util.EmptyStackException;
public class MyLinkedListStack<E> {
    LinkedList<E> linkedList = new LinkedList<>();
    public void push(E el){
        linkedList.push(el);
    }
    public boolean isEmpty(){
        return linkedList.size() == 0;
    }
    public void checkEmpty(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
    }
    public int size(){
        return linkedList.size();
    }
    public E pop(){
        checkEmpty();
        return (E) linkedList.remove(linkedList.size() - 1);
    }
}
