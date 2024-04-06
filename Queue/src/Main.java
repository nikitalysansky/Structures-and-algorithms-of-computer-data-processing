public class Main {
    public static void main(String[] args) {
        // Создание экземпляра очереди
        Queue<Integer> queue = new Queue<>();

        // Добавление элементов в очередь
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Вывод размера очереди
        System.out.println("Размер очереди: " + queue.size());

        // Получение и удаление элементов из очереди
        System.out.println("Первый элемент очереди: " + queue.dequeue());
        System.out.println("Второй элемент очереди: " + queue.dequeue());

        // Вывод размера очереди после удаления элементов
        System.out.println("Размер очереди после удаления: " + queue.size());

        // Проверка наличия элементов в очереди
        if (!queue.isEmpty()) {
            // Получение элемента из начала очереди без его удаления
            System.out.println("Первый элемент очереди: " + queue.peek());
        } else {
            System.out.println("Очередь пуста");
        }
    }
}