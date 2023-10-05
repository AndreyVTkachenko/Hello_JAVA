package homeworks.homework_004.task_002;

// В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
//
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

// queue.enqueue(1);
// queue.enqueue(10);
// queue.enqueue(15);
// queue.enqueue(5);
// System.out.println(queue.getElements());
// [1, 10, 15, 5]
//
// queue.dequeue();
// queue.dequeue();
// System.out.println(queue.getElements());
// [15, 5]
//
// System.out.println(queue.first());
// 15


import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    LinkedList<T> queueElements;

    public MyQueue() {
        queueElements = new LinkedList<>();
    }

    public void enqueue(T element){
        // Напишите свое решение ниже
        queueElements.addLast(element);
    }

    public T dequeue(){
        // Напишите свое решение ниже
        return queueElements.removeFirst();
    }

    public T first(){
        // Напишите свое решение ниже
        return queueElements.getFirst();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return queueElements;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
