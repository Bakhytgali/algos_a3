import java.util.LinkedList;
public class MyLinkedListStack<E> {
    LinkedList<E> linkedList = new LinkedList<>();
    public int size(){
        return linkedList.size();
    }
    public void add(Object el){
        linkedList.add((E) el);
    }
    public void add(Object el, int index){
        linkedList.add(index, (E) el);
    }
}
