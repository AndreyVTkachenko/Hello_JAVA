package seminars.seminar_004;

public class MyStack {
    private String [] array = new String[10];
    private int size = 0;


    public int suze() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(String s) {
        if (size >= array.length) {
            String[] array2 = new String[array.length * 2];
            System.arraycopy(array, 0, array2, 0, array.length);
        }
        array[size++] = s;
    }

    public String peek() {
        return array[size - 1];
    }

    public String pop() {
        return array[--size];
    }
}
