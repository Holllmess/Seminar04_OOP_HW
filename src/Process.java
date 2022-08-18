public class Process {
    public static void main(String[] args) {
        Tasker task1 = new Tasker("Reading", Priority.MEDIUM, "20.03.22", "Mark S");
        Tasker tasl2 = new Tasker("Coding",Priority.HIGH, "17.08.22", "Helly R");
        Tasker tasl3 = new Tasker("Sleeping",Priority.HIGH, "17.08.22", "Erving H");

        Repository<Tasker> first = new Repository<>("Important today");
        first.addTask(task1);
        first.addTask(tasl2);
        first.addTask(tasl3);
        System.out.println(first.getTaskByPriority(Priority.HIGH));

        first.exportData();
        first.importData();
    }
}
