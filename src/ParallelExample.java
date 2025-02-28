class ParallelExample {
    public static void main(String[] args) {
        Thread task1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task 1: " + i);
            }
        });
        Thread task2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task 2: " + i);
            }
        });
        task1.start(); // Run tasks in parallel
        task2.start();
    }
}
