package seminars.seminar_004;

public class Task005 {
    //Реализовать стэк с помощью массива.
    //Нужно реализовать методы:
    //size(), empty(), push(), peek(), pop().
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.empty());
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}
