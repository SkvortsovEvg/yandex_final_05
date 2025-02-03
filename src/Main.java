import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task cleanFloor = new Task("Пропылесосить полы", "Попробовать робота-пылесоса");
        Task createdCleanFloor = taskManager.addTask(cleanFloor);
        System.out.println(createdCleanFloor);

        Task washFloor = new Task(cleanFloor.getId(),
                            "Помыть полы",
                        "Используем СУПЕР-средство",
                                  Status.IN_PROGRESS);
        Task updatedWashFloor = taskManager.updateTask(washFloor);
        System.out.println(updatedWashFloor);

        Epic roomRenovation = new Epic("Сделать ремонт в комнате", "Управиться за 10 дней");
        taskManager.addEpic(roomRenovation);
        System.out.println(roomRenovation);

        Subtask roomRenovationSubtask1 =
                new Subtask("Покрасить стены",
                        "Что-то светлое или немного желтое",
                                  roomRenovation.getId());
        Subtask roomRenovationSubtask2 =
                new Subtask("Собрать комод",
                        "Лучше слева от входа",
                                  roomRenovation.getId());

        taskManager.addSubtask(roomRenovationSubtask1);
        taskManager.addSubtask(roomRenovationSubtask2);

        System.out.println(roomRenovation);

        roomRenovationSubtask1.setStatus(Status.DONE);
        taskManager.updateSubtask(roomRenovationSubtask1);
        System.out.println(roomRenovation);

        roomRenovationSubtask2.setStatus(Status.DONE);
        taskManager.updateSubtask(roomRenovationSubtask2);
        System.out.println(roomRenovation);

        ArrayList<Subtask> arrayRoomRenovation = roomRenovation.getSubtaskList();

        for (Subtask subtask : arrayRoomRenovation) {
            System.out.println(subtask);
        }
    }
}