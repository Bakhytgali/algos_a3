# Assignment 3
Here you can read about the assignment 3
## MyArrayListQueue
### 1. `public void enqueue()` function
**Desctiption:** This method adds an element to the back of the queue.
<br><br>
**Solution:** 
``` java
public void enqueue(E el){
        arrayList.add(el);
    }
```
### 2. `public E dequeue()` function
**Desctiption:** This method removes and returns the front element of the queue. 
<br><br>
**Solution:** 
``` java
public E dequeue(){
        checkEmpty();
        return (E) arrayList.remove(0);
    }
```
### 3. `public boolean isEmpty()` function
**Desctiption:** This method returns true if the stack is empty or false if it is not. 
<br><br>
**Solution:** 
``` java
public boolean isEmpty(){
        return arrayList.size() == 0;
    }
```
### 4. `public E peek()` function
**Desctiption:** This method returns the front element of the queue without removing it. 
<br><br>
**Solution:** 
``` java
public E peek(){
        checkEmpty();
        return (E) arrayList.get(0);
    }
```
### 5. `public void checkEmpty()` function
**Desctiption:** This method throw exception if the queue is empty. 
<br><br>
**Solution:** 
``` java
public void checkEmpty(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
    }
```
