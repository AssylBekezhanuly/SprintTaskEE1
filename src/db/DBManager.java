package db;

import model.Task;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Task> tasksList  = new ArrayList<>();

    static {
        tasksList.add(new Task(1L, "Создать Web приложение на JAVAEE", "Cделать с ссылками", "10.02.2024", true));
        tasksList.add(new Task(2L, "Убраться дома и закупить продукты", "Продукты лучше заказать", "12.04.2024",false));
        tasksList.add(new Task(3L, "Сделать ремонт срочно", "Ремонтировать машину", "2.04.2024", false));
        tasksList.add(new Task(3L, "Прочитать не менее сто книг", "Романы,детективы,фантастику", "2.04.2025", false));
        tasksList.add(new Task(3L, "Записаться на курсы языка", "Изучить англииский язык", "2.04.2025", false));
    }
    private static Long id = 6L;

    public static ArrayList<Task> getAllTasks() {

        return tasksList;
    }

    public static Task getItemById(Long id) {
        for(Task tasks: tasksList){
            if(tasks.getId() == id){
                return tasks;
            }
        }
        return null;
    }
    public static void addTasks(Task tasks){
        tasks.setId(id);
        tasksList.add(tasks);
        id++;
    }
    public static void deleteTasks(Long id){
        for (int i = 0; i < tasksList.size(); i++) {
            if(tasksList.get(i).getId()==id){
                tasksList.remove(i);
                break;
            }
        }
    }


}

