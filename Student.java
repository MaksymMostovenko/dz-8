public class Student {
    private String studentId;
    private String firstName;
    private String secondName;
    private boolean isStarosta;
    private boolean taskDone;

    public Student(String id, String fName, String sName){
        this.studentId = id;
        this.firstName = fName;
        this.secondName = sName;
        this.isStarosta = false;
        this.taskDone = false;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getStudentId() {
        return studentId;
    }

    public boolean getStrostaStatus(){
        return isStarosta;
    }

    public boolean getTaskStatus(){
        return taskDone;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSecondName(String secondName){
        this.firstName = secondName;
    }

    public void setTaskDone(){
        this.taskDone = true;
    }

    public void setStarosta(){
        this.isStarosta = true;
    }
}