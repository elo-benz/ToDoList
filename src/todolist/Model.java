/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.util.Date;

/**
 *
 * @author lorenzobengzon
 */
public class Model {

    int taskCount = 0;
    Task[] tasks = new Task[100];
    FileHelper helper = new FileHelper();

    Model() {
        String lines[] = helper.readTasks();
        taskCount = lines.length;
        for (int i = 0; i < taskCount; i++)
        {
            tasks[i] = new Task();
            String taskLine[] = lines[i].split("#");
            tasks[i].setTitle(taskLine[0]);
            tasks[i].setDescription(taskLine[1]);
        }
        
    }

    void add(String title, String description) {
        Task task = new Task();
        task.setDescription(description);
        task.setTitle(title);
        tasks[taskCount] = task;
        taskCount = taskCount + 1;
        helper.writeTasks(getTasks());
        
    }

    void remove(int index) {
        tasks[index].setDescription("");
        tasks[index].setTitle("");
        for (int i = index; i < taskCount; i = i + 1) {
            tasks[i] = tasks[i + 1];
        }
    }

    void edit(int index, String title, String description) {
        tasks[index].setDescription(description);
        tasks[index].setTitle(title);

    }

    String[] getTasks() {
        //create a new string array
        String[] tmpTasks = new String[taskCount];
        //loop through the tasks and add a string reprersentation
        //of each one to the new array
        for (int i = 0; i < taskCount; i++) {
            //assign a string representation if the ith tassk
            // to the ith element of th tmpTask
            tmpTasks[i] = tasks[i].toString();
        }

        //return the array
        return tmpTasks;

    }

    String[] getTaskValues(int index) {
        String[] values = new String[2];
        values[0] = tasks[index].getTitle();
        values[1] = tasks[index].getDescription();
        return values;
    }

}
