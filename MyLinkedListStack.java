import java.util.LinkedList;
public class MyLinkedListStack<E> {
    LinkedList<E> linkedList = new LinkedList<>();
    public int size(){
        return linkedList.size();
    }
    public void add(Object el){
        linkedList.add((E) el);
    }
}
