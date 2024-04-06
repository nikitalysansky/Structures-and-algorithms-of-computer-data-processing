public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    // Внутренний класс для представления элемента очереди
    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Конструктор
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Проверка, пуста ли очередь
    public boolean isEmpty() {
        return size == 0;
    }

    // Возвращает размер очереди
    public int size() {
        return size;
    }

    // Добавление элемента в конец очереди
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Удаление элемента из начала очереди
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        T data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    // Получение элемента из начала очереди без его удаления
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return front.data;
    }
}