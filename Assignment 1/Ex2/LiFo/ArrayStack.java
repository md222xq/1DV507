package Ex2.LiFo;

public class ArrayStack implements StringStack{


    String[] stack = new String[5];
    int top = 0;


    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {

        return stack[0] ==null || stack[0].isEmpty();
    }


    @Override
    public void push(String element) {

        stack[top] = element;
        top++;
    }

    @Override
    public String pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Error stack empty");
        }

        else {
            top--;
            String data;
            data = stack[top];
            stack[top] = "";
            return data;
        }
    }

    @Override
    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("peek error");
        } else {
            return stack[top - 1];
        }
    }



    public void show() {
        for (int i = 0; i < stack.length; i++){
            System.out.print(stack[i] + " ");
        }
    }
}