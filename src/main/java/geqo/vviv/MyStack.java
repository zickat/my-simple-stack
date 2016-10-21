package geqo.vviv;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by valen on 21/10/2016.
 */
public class MyStack implements SimpleStack{

    private Stack<Item> stack = new Stack<>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return stack.pop();
    }
}
