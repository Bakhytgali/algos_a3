import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListQueue<E> {
    ArrayList<E> arrayList;
    public MyArrayListQueue(){
        arrayList = new ArrayList<E>();
    }
    public void enqueue(E el){
        arrayList.add(el);
    }
    public boolean isEmpty(){
        return arrayList.size() == 0;
    }
}
