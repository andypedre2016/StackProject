import java.util.*;

public class MyStackDD {

    /*
    list<> .......
    //is full
    //is empty
    void push (object obj){
        try{
            if ! isFull(){
                st.push(obj);
            }
        }
    }

    //exceptions
    // fullStackException
    // emptyStackException
*/
    private Node first;

    public MyStackDD(){
        first = null;
    }
    /**
     * Add an element on top of stack
     */
    public void push(Object element){
        MyStackDD.Node newNode = new MyStackDD.Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }

    /**
     * Removes element from top of the stack
     */
    public Object pop(){
        if(first == null) {
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        return element;
    }

    /**
     * Checks if stack is empty
     * @return true if stack empty
     */
    public boolean empty(){
        return first == null;
    }

    class Node {
        public Object data;
        public MyStackDD.Node next;
    }

}
