package manager.HistoryManager;

import enums.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task.Task;

import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {
    private CustomLinkedList list;

    @BeforeEach
    void beforeEach() {
        list = new CustomLinkedList();
    }

    @Test
    void linkLast() {
        int z = 0;
        for (int i = 0; i < 10; i++) {
            list.linkLast(
                    new Task("Name " + (i+1), "Description " + (i+1)));
        }

        list.linkLast(
                new Task(1, "Name 1", "Description 1", Status.NEW));
        z = 0;
    }

    @Test
    void removeNode() {
    }
}