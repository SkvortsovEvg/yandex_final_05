package manager.HistoryManager;

import task.Task;

import java.util.*;

public class InMemoryHistoryManager implements HistoryManager {
    private final CustomLinkedList list = new CustomLinkedList();

    @Override
    public void add(Task task) {
        list.linkLast(task);
    }

    @Override
    public void remove(int id) {
        list.removeNode(list.getNode(id));
    }

    @Override
    public List<Task> getHistory() {
        return list.getTasks();
    }
}


