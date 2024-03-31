/**
 *
 * @author Никита
 */
public class Stack<T> {
    // Внутренний класс для представления узла стека
    private static class Node<T> {
        private final T data; // Данные в узле
        private Node<T> next; // Ссылка на следующий узел

        // Конструктор узла, инициализирует данные
        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top; // Верхушка стека

    // Проверка, пустой ли стек
    public boolean isEmpty() {
        return top == null;
    }

    // Добавление элемента в стек
    public void push(T data) {
        Node<T> newNode = new Node<>(data); // Создаем новый узел с данными
        newNode.next = top; // Новый узел теперь указывает на текущую верхушку стека
        top = newNode; // Обновляем верхушку стека
    }

    // Извлечение элемента из стека
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст"); // Если стек пуст, бросаем исключение
        }
        T data = top.data; // Получаем данные с верхушки
        top = top.next; // Обновляем верхушку на следующий узел
        return data; // Возвращаем извлеченные данные
    }

    // Получение верхнего элемента без извлечения
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст"); // Если стек пуст, бросаем исключение
        }
        return top.data; // Возвращаем данные с верхушки
    }
}
