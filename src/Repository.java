import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class Repository<T extends Tasker> {
    private String name;
    List<T> list;

    public Repository(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void addTask(T task){
        list.add(task);
    }

    public int getNumberOfTasks(){
        return list.size();
    }

    public List<Tasker> getTaskByPriority(Priority priority){
        List<Tasker> priorityTask = new ArrayList<>();
        for (T item: list) {
            if (item.getPriority() == priority){
                priorityTask.add(item);
            }
        }
        return priorityTask;
    }

    public void exportData(){
        try {
            Date date = new Date();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the exported file: ");
            File file01 = new File(scanner.nextLine());
            if (!file01.exists()){  // если файла не существует, то создаем
                file01.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file01);
            for (int i = 0; i < list.size(); i++) {
                pw.println(date);
                pw.println(list.get(i));
            }
            pw.close();
        } catch (IOException e){
            System.out.println("Error " + e);
        }

    }

    public void importData(){
        try {
            BufferedReader br = null;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the imported file: ");
            br = new BufferedReader(new FileReader(scanner.nextLine()));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
