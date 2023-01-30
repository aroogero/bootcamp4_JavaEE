package bitlab.bootcamp.chapter5.db;

public class Lesson2task4List {
    private int id;
    private String name;
    private String deadline;
    private String yesNo;
    private String opisanie;

    public Lesson2task4List () {

    }
    public Lesson2task4List(int id, String name, String deadline, String yesNo, String opisanie) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.yesNo = yesNo;
        this.opisanie = opisanie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getYesNo() {
        return yesNo;
    }

    public void setYesNo(String yesNo) {
        this.yesNo = yesNo;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

}
