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
    public E dequeue(){
        checkEmpty();
        return (E) arrayList.remove(0);
    }
    public boolean isEmpty(){
        return arrayList.size() == 0;
    }
    public void checkEmpty(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
    }
    public int size(){
        return arrayList.size();
    }
    public E peek(){
        checkEmpty();
        return (E) arrayList.get(0);
    }
}
