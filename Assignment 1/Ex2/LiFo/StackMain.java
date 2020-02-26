package Ex2.LiFo;

public class StackMain  {
    public static void main(String[] args) {

        ArrayStack one = new ArrayStack();

        try {

            one.push("0");
            one.pop();
            one.push("hello");
            one.push("hell");
            System.out.println(one.peek());
            System.out.println("is empty?  -" + one.isEmpty());

            System.out.println("Size is " + one.size());

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
