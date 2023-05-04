public class Main {
    public static void  main(String[] args){
        Group group = new Group("0001", "Oleg", "Alexovich");
        group.addTaskList();
        group.addStudent("0002","Ivan","Ivanov");
        group.makeTaskDone("0001");
        group.getStudentData();
        group.renameStudent("0002", "", "Popov");
        group.getStudentData();
    }
}
