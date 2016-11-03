package geqo.vviv;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * Created by valen on 21/10/2016.
 *
 * Commentaire pour l'exigence #3
 */
public class MyStackTest {

    private MyStack stack;
    private Item i;

    @Before
    public void setUp() throws Exception {
        stack = new MyStack();
    }

    @Test
    public void isNotEmpty(){
        stack.push(i);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void isEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void getSizeEmpty() throws Exception {
        assertEquals(stack.getSize(), 0);
    }

    @Test
    public void getSize() throws Exception {
        for (int i=0; i<5; i++){
            stack.push(this.i);
        }
        assertEquals(stack.getSize(), 5);
    }

    @Test
    public void push() throws Exception {
        stack.push(i);
        assertEquals(stack.getSize(), 1);
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmpty() throws Exception {
        stack.peek();
    }

    @Test
    public void peek() throws Exception {
        stack.push(i);
        assertEquals(i, stack.peek());
    }

    @Test
    public void pop() throws Exception {
        stack.push(i);
        assertEquals(i, stack.pop());
    }

    @Test(expected = EmptyStackException.class)
    public void popEmpty() throws Exception {
        stack.pop();
    }

}