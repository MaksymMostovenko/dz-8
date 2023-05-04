import java.util.ArrayList;
import java.util.List;

public class Group {
    private List <String> groupTask;
    private List <Student> studentList;
    private Student starostaGroup;


    public Group(String starostaId, String starostaFName, String starostaSName) {
        this.groupTask = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.starostaGroup = new Student(starostaId, starostaFName, starostaSName);
        this.starostaGroup.setStarosta();
        studentList.add(starostaGroup);
    }

    public void getStudentData(){
            for (Student student : this.studentList)
                System.out.printf("This is the student ID: %s. Name %s %s. Task status %s \n",
                        student.getStudentId(),
                        student.getFirstName(),
                        student.getSecondName(),
                        student.getTaskStatus() ? "DONE" : "NOT DONE");
    }

    public void addStudent(String sId, String fName, String SName){
        studentList.add( new Student(sId, fName, SName) );
    }

    public void removeStudent(String sId, String fName, String SName){
        for (Student student : this.studentList)
            if (student.getStudentId().equals(sId) || student.getFirstName().equals(fName) || student.getSecondName().equals(SName)) {
                this.studentList.remove(student);
                break;
            }
    }

    public void renameStudent( String id, String firstName, String secondName ){
        for (Student student : this.studentList) {
            if(student.getStudentId().equals(id)){
                if( !firstName.isEmpty() ) student.setFirstName(firstName);
                if( !secondName.isEmpty() ) student.setSecondName(secondName);
            }
        }
    }

    public void addTaskList(){
        this.groupTask.add("get the meter of life.");
    }

    public void makeTaskDone(String studentID){
        for (Student student : this.studentList) {
            if (student.getStudentId().equals(studentID)) student.setTaskDone();
        }
    }
}
